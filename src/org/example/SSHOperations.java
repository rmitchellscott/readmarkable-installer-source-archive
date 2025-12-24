/*
 * Decompiled with CFR 0.152.
 */
package org.example;

import androidx.compose.runtime.internal.StabilityInferred;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpProgressMonitor;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.example.InstallationJob;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 2, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ4\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\rJ \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\rJ\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0003X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2={"Lorg/example/SSHOperations;", "", "host", "", "password", "job", "Lorg/example/InstallationJob;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/example/InstallationJob;)V", "getJob", "()Lorg/example/InstallationJob;", "username", "port", "", "executeCommand", "Lkotlin/Triple;", "command", "timeout", "maxRetries", "copyFile", "", "localPath", "remotePath", "copyFileViaBase64", "kotlinkoreader18"})
@StabilityInferred(parameters=0)
@SourceDebugExtension(value={"SMAP\nMain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Main.kt\norg/example/SSHOperations\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4900:1\n1761#2,3:4901\n*S KotlinDebug\n*F\n+ 1 Main.kt\norg/example/SSHOperations\n*L\n1377#1:4901,3\n*E\n"})
public final class SSHOperations {
    @NotNull
    private final String host;
    @NotNull
    private final String password;
    @NotNull
    private final InstallationJob job;
    @NotNull
    private final String username;
    private final int port;
    public static final int $stable = 8;

    public SSHOperations(@NotNull String host, @NotNull String password, @NotNull InstallationJob job) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(job, "job");
        this.host = host;
        this.password = password;
        this.job = job;
        this.username = "root";
        this.port = 22;
        this.job.addLog("\u2713 Using JSch for SSH operations and file transfers");
    }

    @NotNull
    public final InstallationJob getJob() {
        return this.job;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final Triple<String, String, Integer> executeCommand(@NotNull String command, int timeout, int maxRetries) {
        Intrinsics.checkNotNullParameter(command, "command");
        this.job.addLog("Executing: " + StringsKt.take(command, 100) + (command.length() > 100 ? "..." : ""));
        for (int attempt = 0; attempt < maxRetries; ++attempt) {
            Object errorMsg;
            Session session = null;
            Channel channel = null;
            try {
                long startTime;
                if (attempt > 0) {
                    this.job.addLog("Connection attempt " + (attempt + 1) + "/" + maxRetries + "...");
                    long waitTime = (long)(1 << attempt) * 1000L;
                    this.job.addLog("Waiting " + waitTime / (long)1000 + "s before retry...");
                    Thread.sleep(waitTime);
                }
                this.job.addLog("Connecting to device...");
                JSch jsch = new JSch();
                session = jsch.getSession(this.username, this.host, this.port);
                session.setPassword(this.password);
                Properties config = new Properties();
                ((Map)config).put("StrictHostKeyChecking", "no");
                ((Map)config).put("PreferredAuthentications", "password");
                ((Map)config).put("kex", "curve25519-sha256,curve25519-sha256@libssh.org,ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521,diffie-hellman-group14-sha256");
                ((Map)config).put("server_host_key", "ssh-ed25519,rsa-sha2-256,ssh-rsa");
                ((Map)config).put("cipher.s2c", "chacha20-poly1305@openssh.com,aes256-ctr,aes128-ctr");
                ((Map)config).put("cipher.c2s", "chacha20-poly1305@openssh.com,aes256-ctr,aes128-ctr");
                ((Map)config).put("mac.s2c", "hmac-sha2-256,hmac-sha1");
                ((Map)config).put("mac.c2s", "hmac-sha2-256,hmac-sha1");
                session.setConfig(config);
                session.setTimeout(30000);
                session.connect(30000);
                this.job.addLog("Connected successfully, executing command...");
                Channel channel2 = session.openChannel("exec");
                Intrinsics.checkNotNull(channel2, "null cannot be cast to non-null type com.jcraft.jsch.ChannelExec");
                channel = (ChannelExec)channel2;
                ((ChannelExec)channel).setCommand(command);
                channel.setInputStream(null);
                InputStream inputStream = channel.getInputStream();
                InputStream errorStream = channel.getExtInputStream();
                channel.connect(timeout * 1000);
                StringBuilder outputBuilder = new StringBuilder();
                StringBuilder errorBuilder = new StringBuilder();
                if (timeout > 60) {
                    this.job.addLog("Command is running (may take several minutes)...");
                }
                long lastLogTime = startTime = System.currentTimeMillis();
                byte[] buffer = new byte[4096];
                while (!channel.isClosed()) {
                    if (timeout > 0 && System.currentTimeMillis() - startTime > (long)timeout * 1000L) {
                        this.job.addLog("Command timeout reached");
                        break;
                    }
                    if (System.currentTimeMillis() - lastLogTime > 30000L) {
                        long elapsed = (System.currentTimeMillis() - startTime) / (long)1000;
                        this.job.addLog("Command still running... (" + elapsed + "s elapsed)");
                        lastLogTime = System.currentTimeMillis();
                    }
                    while (inputStream.available() > 0) {
                        int len = inputStream.read(buffer);
                        if (len <= 0) continue;
                        String chunk = new String(buffer, 0, len, Charsets.UTF_8);
                        outputBuilder.append(chunk);
                        char[] cArray = new char[]{'\n'};
                        for (String line : StringsKt.split$default((CharSequence)((Object)StringsKt.trim((CharSequence)chunk)).toString(), cArray, false, 0, 6, null)) {
                            boolean bl;
                            block26: {
                                void $this$any$iv;
                                if (!(((CharSequence)line).length() > 0)) continue;
                                Object object = new String[]{"error", "failed", "success", "complete", "hashtab"};
                                object = CollectionsKt.listOf(object);
                                boolean $i$f$any = false;
                                if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
                                    bl = false;
                                } else {
                                    for (Object element$iv : $this$any$iv) {
                                        String it = (String)element$iv;
                                        boolean bl2 = false;
                                        String string = line.toLowerCase(Locale.ROOT);
                                        Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
                                        if (!StringsKt.contains$default((CharSequence)string, it, false, 2, null)) continue;
                                        bl = true;
                                        break block26;
                                    }
                                    bl = false;
                                }
                            }
                            if (!bl) continue;
                            this.job.addLog("Output: " + StringsKt.take(line, 200));
                        }
                    }
                    while (errorStream.available() > 0) {
                        int len = errorStream.read(buffer);
                        if (len <= 0) continue;
                        errorBuilder.append(new String(buffer, 0, len, Charsets.UTF_8));
                    }
                    Thread.sleep(100L);
                }
                while (inputStream.available() > 0) {
                    int len = inputStream.read(buffer);
                    if (len <= 0) continue;
                    outputBuilder.append(new String(buffer, 0, len, Charsets.UTF_8));
                }
                while (errorStream.available() > 0) {
                    int len = errorStream.read(buffer);
                    if (len <= 0) continue;
                    errorBuilder.append(new String(buffer, 0, len, Charsets.UTF_8));
                }
                int exitCode = channel.getExitStatus();
                String string = outputBuilder.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                String stdoutText = ((Object)StringsKt.trim((CharSequence)string)).toString();
                String string2 = errorBuilder.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                String stderrText = ((Object)StringsKt.trim((CharSequence)string2)).toString();
                this.job.addLog("Command executed, closing connection...");
                channel.disconnect();
                session.disconnect();
                this.job.addLog("Connection closed");
                if (((CharSequence)stdoutText).length() > 0) {
                    String logText = StringsKt.take(stdoutText, 500) + (stdoutText.length() > 500 ? "..." : "");
                    this.job.addLog("Output: " + logText);
                } else {
                    this.job.addLog("Command completed (no output)");
                }
                if (((CharSequence)stderrText).length() > 0 && exitCode != 0) {
                    this.job.addLog("Error output: " + StringsKt.take(stderrText, 500));
                }
                return new Triple<String, String, Integer>(stdoutText, stderrText, exitCode);
            }
            catch (JSchException e) {
                Channel channel3 = channel;
                if (channel3 != null) {
                    channel3.disconnect();
                }
                Session session2 = session;
                if (session2 != null) {
                    session2.disconnect();
                }
                String string = e.getMessage();
                Object object = errorMsg = (string != null ? StringsKt.contains$default((CharSequence)string, "Auth", false, 2, null) : false) ? "Authentication failed - please check your SSH password" : "SSH connection failed: " + e.getMessage();
                if (attempt == maxRetries - 1) {
                    this.job.addLog((String)errorMsg);
                    throw new Exception((String)errorMsg);
                }
                this.job.addLog((String)errorMsg + " - will retry...");
                continue;
            }
            catch (Exception e) {
                Channel channel4 = channel;
                if (channel4 != null) {
                    channel4.disconnect();
                }
                Session session3 = session;
                if (session3 != null) {
                    session3.disconnect();
                }
                errorMsg = "Command failed: " + e.getMessage();
                if (attempt == maxRetries - 1) {
                    this.job.addLog((String)errorMsg);
                    throw new Exception((String)errorMsg);
                }
                this.job.addLog((String)errorMsg + " - will retry...");
            }
        }
        throw new Exception("Maximum retries exceeded");
    }

    public static /* synthetic */ Triple executeCommand$default(SSHOperations sSHOperations, String string, int n, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n = 300;
        }
        if ((n3 & 4) != 0) {
            n2 = 3;
        }
        return sSHOperations.executeCommand(string, n, n2);
    }

    public final void copyFile(@NotNull String localPath, @NotNull String remotePath, int maxRetries) {
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        Intrinsics.checkNotNullParameter(remotePath, "remotePath");
        File file = new File(localPath);
        long fileSize = file.length();
        double fileSizeMb = (double)fileSize / 1048576.0;
        String string = "%.2f";
        Object[] objectArray = new Object[]{fileSizeMb};
        String string2 = String.format(string, Arrays.copyOf(objectArray, objectArray.length));
        Intrinsics.checkNotNullExpressionValue(string2, "format(...)");
        this.job.addLog("Using SFTP for file transfer (" + string2 + " MB)");
        for (int attempt = 0; attempt < maxRetries; ++attempt) {
            Session session = null;
            ChannelSftp channel = null;
            try {
                String remoteDir;
                this.job.addLog("Transferring via SFTP: " + file.getName());
                if (attempt > 0) {
                    this.job.addLog("SFTP attempt " + (attempt + 1) + "/" + maxRetries + "...");
                    long waitTime = (long)(1 << attempt) * 1000L;
                    this.job.addLog("Waiting " + waitTime / (long)1000 + "s before retry...");
                    Thread.sleep(waitTime);
                }
                if (((CharSequence)(remoteDir = StringsKt.substringBeforeLast$default(remotePath, '/', null, 2, null))).length() > 0) {
                    try {
                        SSHOperations.executeCommand$default(this, "mkdir -p " + remoteDir, 0, 2, 2, null);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                JSch jsch = new JSch();
                session = jsch.getSession(this.username, this.host, this.port);
                session.setPassword(this.password);
                Properties config = new Properties();
                ((Map)config).put("StrictHostKeyChecking", "no");
                ((Map)config).put("PreferredAuthentications", "password");
                ((Map)config).put("kex", "curve25519-sha256,curve25519-sha256@libssh.org,ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521,diffie-hellman-group14-sha256");
                ((Map)config).put("server_host_key", "ssh-ed25519,rsa-sha2-256,ssh-rsa");
                ((Map)config).put("cipher.s2c", "chacha20-poly1305@openssh.com,aes256-ctr,aes128-ctr");
                ((Map)config).put("cipher.c2s", "chacha20-poly1305@openssh.com,aes256-ctr,aes128-ctr");
                ((Map)config).put("mac.s2c", "hmac-sha2-256,hmac-sha1");
                ((Map)config).put("mac.c2s", "hmac-sha2-256,hmac-sha1");
                session.setConfig(config);
                session.setTimeout(30000);
                this.job.addLog("Establishing SFTP connection...");
                session.connect(30000);
                Channel channel2 = session.openChannel("sftp");
                Intrinsics.checkNotNull(channel2, "null cannot be cast to non-null type com.jcraft.jsch.ChannelSftp");
                channel = (ChannelSftp)channel2;
                channel.connect(30000);
                Ref.IntRef lastPercent = new Ref.IntRef();
                SftpProgressMonitor monitor2 = new SftpProgressMonitor(lastPercent, this){
                    private long totalBytes;
                    private long transferredBytes;
                    final /* synthetic */ Ref.IntRef $lastPercent;
                    final /* synthetic */ SSHOperations this$0;
                    {
                        this.$lastPercent = $lastPercent;
                        this.this$0 = $receiver;
                    }

                    public void init(int op, String src, String dest, long max) {
                        this.totalBytes = max;
                        this.transferredBytes = 0L;
                    }

                    public boolean count(long count) {
                        int percent;
                        this.transferredBytes += count;
                        if (this.totalBytes > 0L && ((percent = (int)(this.transferredBytes * (long)100 / this.totalBytes)) >= this.$lastPercent.element + 10 || this.transferredBytes == this.totalBytes)) {
                            double mbSent = (double)this.transferredBytes / 1048576.0;
                            double mbTotal = (double)this.totalBytes / 1048576.0;
                            InstallationJob installationJob = this.this$0.getJob();
                            String string = "%.1f";
                            Object[] objectArray = new Object[]{mbSent};
                            String string2 = String.format(string, Arrays.copyOf(objectArray, objectArray.length));
                            Intrinsics.checkNotNullExpressionValue(string2, "format(...)");
                            string = "%.1f";
                            objectArray = new Object[]{mbTotal};
                            String string3 = String.format(string, Arrays.copyOf(objectArray, objectArray.length));
                            Intrinsics.checkNotNullExpressionValue(string3, "format(...)");
                            installationJob.addLog("Progress: " + string2 + "/" + string3 + " MB (" + percent + "%)");
                            this.$lastPercent.element = percent;
                        }
                        return true;
                    }

                    public void end() {
                    }
                };
                String string3 = "%.2f";
                Object[] objectArray2 = new Object[]{fileSizeMb};
                String string4 = String.format(string3, Arrays.copyOf(objectArray2, objectArray2.length));
                Intrinsics.checkNotNullExpressionValue(string4, "format(...)");
                this.job.addLog("Starting transfer (" + string4 + " MB)...");
                channel.put(localPath, remotePath, monitor2, 0);
                this.job.addLog("\u2713 SFTP transfer completed successfully");
                channel.disconnect();
                session.disconnect();
                Triple verifyOutput = SSHOperations.executeCommand$default(this, "ls -lh " + remotePath, 0, 2, 2, null);
                if (((CharSequence)verifyOutput.getFirst()).length() > 0) {
                    this.job.addLog("Verified: " + ((Object)StringsKt.trim((CharSequence)((String)verifyOutput.getFirst()))).toString());
                }
                return;
            }
            catch (Exception e) {
                ChannelSftp channelSftp = channel;
                if (channelSftp != null) {
                    channelSftp.disconnect();
                }
                Session session2 = session;
                if (session2 != null) {
                    session2.disconnect();
                }
                if (attempt == maxRetries - 1) {
                    this.job.addLog("SFTP transfer failed after " + maxRetries + " attempts: " + e.getMessage());
                    this.job.addLog("\u26a0 SFTP failed, falling back to base64 method");
                    this.copyFileViaBase64(localPath, remotePath);
                    return;
                }
                this.job.addLog("SFTP transfer failed: " + e.getMessage() + " - will retry...");
                continue;
            }
        }
    }

    public static /* synthetic */ void copyFile$default(SSHOperations sSHOperations, String string, String string2, int n, int n2, Object object) {
        if ((n2 & 4) != 0) {
            n = 3;
        }
        sSHOperations.copyFile(string, string2, n);
    }

    private final void copyFileViaBase64(String localPath, String remotePath) {
        this.job.addLog("Transferring via base64 encoding: " + new File(localPath).getName());
        try {
            String remoteDir = StringsKt.substringBeforeLast$default(remotePath, '/', null, 2, null);
            if (((CharSequence)remoteDir).length() > 0) {
                SSHOperations.executeCommand$default(this, "mkdir -p " + remoteDir, 0, 0, 6, null);
            }
            byte[] fileContent = FilesKt.readBytes(new File(localPath));
            int fileSize = fileContent.length;
            double fileSizeMb = (double)fileSize / 1048576.0;
            String string = "%.2f";
            Object[] objectArray = new Object[]{fileSizeMb};
            String string2 = String.format(string, Arrays.copyOf(objectArray, objectArray.length));
            Intrinsics.checkNotNullExpressionValue(string2, "format(...)");
            this.job.addLog("File size: " + string2 + " MB");
            String encodedContent = Base64.getEncoder().encodeToString(fileContent);
            int maxChunkSize = 49152;
            String tempB64File = remotePath + ".b64tmp";
            SSHOperations.executeCommand$default(this, "> " + tempB64File, 0, 0, 6, null);
            int offset = 0;
            int chunkNum = 1;
            int totalChunks = (encodedContent.length() + maxChunkSize - 1) / maxChunkSize;
            this.job.addLog("Transferring in " + totalChunks + " chunk(s)...");
            while (offset < encodedContent.length()) {
                String chunk;
                Intrinsics.checkNotNull(encodedContent);
                Intrinsics.checkNotNullExpressionValue(encodedContent.substring(offset, Math.min(offset + maxChunkSize, encodedContent.length())), "substring(...)");
                String chunkCmd = "printf '%s' '" + StringsKt.replace$default(chunk, "'", "'\\''", false, 4, null) + "' >> " + tempB64File;
                SSHOperations.executeCommand$default(this, chunkCmd, 0, 0, 6, null);
                offset += maxChunkSize;
                if (totalChunks > 1 && chunkNum % 5 == 0) {
                    this.job.addLog("Transferred chunk " + chunkNum + "/" + totalChunks);
                }
                ++chunkNum;
            }
            this.job.addLog("All chunks transferred, decoding...");
            SSHOperations.executeCommand$default(this, "base64 -d " + tempB64File + " > " + remotePath, 0, 0, 6, null);
            SSHOperations.executeCommand$default(this, "rm -f " + tempB64File, 0, 0, 6, null);
            this.job.addLog("\u2713 File copied successfully");
            Triple verifyOutput = SSHOperations.executeCommand$default(this, "ls -lh " + remotePath, 0, 0, 6, null);
            if (((CharSequence)verifyOutput.getFirst()).length() > 0) {
                this.job.addLog("Verified: " + ((Object)StringsKt.trim((CharSequence)((String)verifyOutput.getFirst()))).toString());
            }
        }
        catch (Exception e) {
            this.job.addLog("File copy failed: " + e.getMessage());
            try {
                SSHOperations.executeCommand$default(this, "rm -f " + remotePath + ".b64tmp", 0, 0, 6, null);
            }
            catch (Exception exception) {
                // empty catch block
            }
            throw e;
        }
    }
}
