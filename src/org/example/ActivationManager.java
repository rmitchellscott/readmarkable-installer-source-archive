/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlinx.serialization.DeserializationStrategy
 *  kotlinx.serialization.SerializationStrategy
 *  kotlinx.serialization.StringFormat
 *  kotlinx.serialization.json.Json
 */
package org.example;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.invoke.LambdaMetafactory;
import java.net.NetworkInterface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.security.Key;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.StringFormat;
import kotlinx.serialization.json.Json;
import org.example.ActivationData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 2, 0}, k=1, xi=48, d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002J\b\u0010\u0011\u001a\u00020\tH\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0006\u0010\u0014\u001a\u00020\tJ\u0016\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tJ\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\tJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\tJ\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u0006\u0010!\u001a\u00020\u001aJ\u0006\u0010\"\u001a\u00020\u001aJ\u0006\u0010#\u001a\u00020\u0018J\u0006\u0010$\u001a\u00020\u001aJ\u0006\u0010%\u001a\u00020\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2={"Lorg/example/ActivationManager;", "", "<init>", "()V", "configDir", "Ljava/nio/file/Path;", "activationPath", "keyPath", "machineId", "", "fernetKey", "", "getOrCreateFernetKey", "fernetEncrypt", "plaintext", "fernetDecrypt", "tokenBase64", "generateMachineId", "getStableMacAddress", "osName", "getMachineId", "generateActivationCode", "targetMachineId", "durationDays", "", "validateActivationCode", "", "activationCode", "getActivationDuration", "saveActivation", "", "loadActivation", "Lorg/example/ActivationData;", "isActivated", "isTrialExpired", "getTrialDaysRemaining", "isUninstallerOnly", "saveUninstallerActivation", "kotlinkoreader18"})
@StabilityInferred(parameters=0)
@SourceDebugExtension(value={"SMAP\nMain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Main.kt\norg/example/ActivationManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 5 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,4900:1\n2746#2,3:4901\n774#2:4904\n865#2:4905\n866#2:4908\n1563#2:4909\n1634#2,3:4910\n12781#3,2:4906\n113#4:4913\n113#4:4915\n96#5:4914\n*S KotlinDebug\n*F\n+ 1 Main.kt\norg/example/ActivationManager\n*L\n685#1:4901,3\n804#1:4904\n804#1:4905\n804#1:4908\n857#1:4909\n857#1:4910,3\n809#1:4906,2\n1014#1:4913\n1099#1:4915\n1033#1:4914\n*E\n"})
public final class ActivationManager {
    @NotNull
    private final Path configDir;
    @NotNull
    private final Path activationPath;
    @NotNull
    private final Path keyPath;
    @NotNull
    private final String machineId;
    @NotNull
    private final byte[] fernetKey;
    public static final int $stable = 8;

    public ActivationManager() {
        Path home = Paths.get(System.getProperty("user.home"), new String[0]);
        Path path = home.resolve(".remarkable_koreader_installer");
        Intrinsics.checkNotNullExpressionValue(path, "resolve(...)");
        this.configDir = path;
        LinkOption[] linkOptionArray = new LinkOption[]{};
        if (!Files.exists(this.configDir, Arrays.copyOf(linkOptionArray, linkOptionArray.length))) {
            Files.createDirectories(this.configDir, new FileAttribute[0]);
        }
        Path path2 = this.configDir.resolve("app_config.dat");
        Intrinsics.checkNotNullExpressionValue(path2, "resolve(...)");
        this.activationPath = path2;
        Path path3 = this.configDir.resolve(".key");
        Intrinsics.checkNotNullExpressionValue(path3, "resolve(...)");
        this.keyPath = path3;
        this.machineId = this.generateMachineId();
        this.fernetKey = this.getOrCreateFernetKey();
    }

    /*
     * WARNING - void declaration
     */
    private final byte[] getOrCreateFernetKey() {
        byte[] byArray;
        LinkOption[] linkOptionArray = new LinkOption[]{};
        if (Files.exists(this.keyPath, Arrays.copyOf(linkOptionArray, linkOptionArray.length))) {
            byte[] byArray2;
            byte[] byArray3 = Files.readAllBytes(this.keyPath);
            Intrinsics.checkNotNullExpressionValue(byArray3, "readAllBytes(...)");
            byte[] keyBase64 = byArray3;
            try {
                byArray2 = Base64.getUrlDecoder().decode(keyBase64);
            }
            catch (Exception e) {
                String keyString = ((Object)StringsKt.trim((CharSequence)new String(keyBase64, Charsets.UTF_8))).toString();
                String paddedKey = keyString + StringsKt.repeat("=", (4 - keyString.length() % 4) % 4);
                byArray2 = Base64.getUrlDecoder().decode(paddedKey);
            }
            byte[] byArray4 = byArray2;
            Intrinsics.checkNotNull(byArray4);
            byArray = byArray4;
        } else {
            void var1_12;
            byte[] key = new byte[32];
            new SecureRandom().nextBytes(key);
            String keyBase64 = Base64.getUrlEncoder().encodeToString(key);
            Path path = this.keyPath;
            Intrinsics.checkNotNull(keyBase64);
            Object object = keyBase64;
            byte[] byArray5 = ((String)object).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(byArray5, "getBytes(...)");
            object = byArray5;
            OpenOption[] openOptionArray = new OpenOption[]{};
            Files.write(path, (byte[])object, Arrays.copyOf(openOptionArray, openOptionArray.length));
            try {
                File file = this.keyPath.toFile();
                file.setReadable(false, false);
                file.setReadable(true, true);
                file.setWritable(false, false);
                file.setWritable(true, true);
            }
            catch (Exception exception) {
                // empty catch block
            }
            byArray = var1_12;
        }
        return byArray;
    }

    private final byte[] fernetEncrypt(byte[] plaintext) {
        byte[] signingKey = ArraysKt.copyOfRange(this.fernetKey, 0, 16);
        byte[] encryptionKey = ArraysKt.copyOfRange(this.fernetKey, 16, 32);
        byte[] byArray = new byte[]{-128};
        byte[] version = byArray;
        long timestamp = System.currentTimeMillis() / (long)1000;
        byte[] timestampBytes = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN).putLong(timestamp).array();
        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec keySpec = new SecretKeySpec(encryptionKey, "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(iv);
        cipher.init(1, (Key)keySpec, ivSpec);
        byte[] ciphertext = cipher.doFinal(plaintext);
        ByteArrayOutputStream basicParts = new ByteArrayOutputStream();
        basicParts.write(version);
        basicParts.write(timestampBytes);
        basicParts.write(iv);
        basicParts.write(ciphertext);
        byte[] basicPartsBytes = basicParts.toByteArray();
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(signingKey, "HmacSHA256"));
        byte[] hmac = mac.doFinal(basicPartsBytes);
        ByteArrayOutputStream token = new ByteArrayOutputStream();
        token.write(basicPartsBytes);
        token.write(hmac);
        String string = Base64.getUrlEncoder().encodeToString(token.toByteArray());
        Intrinsics.checkNotNullExpressionValue(string, "encodeToString(...)");
        String string2 = string;
        byte[] byArray2 = string2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(byArray2, "getBytes(...)");
        return byArray2;
    }

    private final byte[] fernetDecrypt(byte[] tokenBase64) {
        byte[] byArray;
        byte[] signingKey = ArraysKt.copyOfRange(this.fernetKey, 0, 16);
        byte[] encryptionKey = ArraysKt.copyOfRange(this.fernetKey, 16, 32);
        String tokenString = ((Object)StringsKt.trim((CharSequence)new String(tokenBase64, Charsets.UTF_8))).toString();
        try {
            byArray = Base64.getUrlDecoder().decode(tokenString);
        }
        catch (Exception e) {
            String paddedToken = tokenString + StringsKt.repeat("=", (4 - tokenString.length() % 4) % 4);
            byArray = Base64.getUrlDecoder().decode(paddedToken);
        }
        byte[] token = byArray;
        if (token.length < 73) {
            throw new Exception("Invalid Fernet token: too short (" + token.length + " bytes, minimum 73)");
        }
        byte version = token[0];
        if (version != -128) {
            throw new Exception("Invalid Fernet version: expected 0x80 (128), got " + (version & 0xFF));
        }
        Intrinsics.checkNotNull(token);
        byte[] timestampBytes = ArraysKt.copyOfRange(token, 1, 9);
        byte[] iv = ArraysKt.copyOfRange(token, 9, 25);
        byte[] ciphertext = ArraysKt.copyOfRange(token, 25, token.length - 32);
        byte[] hmac = ArraysKt.copyOfRange(token, token.length - 32, token.length);
        byte[] basicParts = ArraysKt.copyOfRange(token, 0, token.length - 32);
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(signingKey, "HmacSHA256"));
        byte[] expectedHmac = mac.doFinal(basicParts);
        if (!MessageDigest.isEqual(hmac, expectedHmac)) {
            throw new Exception("Invalid Fernet token: HMAC verification failed");
        }
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec keySpec = new SecretKeySpec(encryptionKey, "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(iv);
        cipher.init(2, (Key)keySpec, ivSpec);
        byte[] byArray2 = cipher.doFinal(ciphertext);
        Intrinsics.checkNotNullExpressionValue(byArray2, "doFinal(...)");
        return byArray2;
    }

    private final String generateMachineId() {
        String stableMac;
        Iterator uuidPattern;
        List machineInfo = new ArrayList();
        String string = System.getProperty("os.name");
        Intrinsics.checkNotNullExpressionValue(string, "getProperty(...)");
        String string2 = string.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
        String osName = string2;
        if (StringsKt.contains$default((CharSequence)osName, "win", false, 2, null)) {
            Object output;
            int n;
            try {
                String[] stringArray = new String[]{"wmic", "cpu", "get", "ProcessorId"};
                process = new ProcessBuilder(stringArray).redirectErrorStream(true).start();
                InputStream inputStream = process.getInputStream();
                Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                var5_19 = inputStream;
                String[] stringArray2 = Charsets.UTF_8;
                Reader reader = new InputStreamReader((InputStream)((Object)var5_19), (Charset)stringArray2);
                n = 8192;
                output = TextStreamsKt.readText(reader instanceof BufferedReader ? (BufferedReader)reader : new BufferedReader(reader, n));
                process.waitFor();
                stringArray2 = new String[]{"\n"};
                for (Object line : StringsKt.split$default((CharSequence)((Object)StringsKt.trim((CharSequence)output)).toString(), stringArray2, false, 0, 6, null)) {
                    CharSequence charSequence;
                    trimmed = ((Object)StringsKt.trim((CharSequence)line)).toString();
                    if (!(((CharSequence)trimmed).length() > 0) || Intrinsics.areEqual(trimmed, "ProcessorId") || !new Regex("[A-Fa-f0-9]+").matches(charSequence = (CharSequence)trimmed)) continue;
                    machineInfo.add("cpu:" + (String)trimmed);
                    break;
                }
            }
            catch (Exception process) {
                // empty catch block
            }
            if (machineInfo.isEmpty()) {
                try {
                    output = new String[]{"wmic", "baseboard", "get", "SerialNumber"};
                    process = new ProcessBuilder((String)output).redirectErrorStream(true).start();
                    InputStream inputStream = process.getInputStream();
                    Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                    var5_19 = inputStream;
                    line = Charsets.UTF_8;
                    trimmed = new InputStreamReader((InputStream)((Object)var5_19), (Charset)line);
                    n = 8192;
                    output = TextStreamsKt.readText(trimmed instanceof BufferedReader ? (BufferedReader)trimmed : new BufferedReader((Reader)trimmed, n));
                    process.waitFor();
                    line = new String[]{"\n"};
                    for (Object line : StringsKt.split$default((CharSequence)((Object)StringsKt.trim((CharSequence)output)).toString(), line, false, 0, 6, null)) {
                        trimmed = ((Object)StringsKt.trim((CharSequence)line)).toString();
                        if (!(((CharSequence)trimmed).length() > 0) || Intrinsics.areEqual(trimmed, "SerialNumber") || Intrinsics.areEqual(trimmed, "To be filled by O.E.M.")) continue;
                        machineInfo.add("board:" + (String)trimmed);
                        break;
                    }
                }
                catch (Exception process) {
                    // empty catch block
                }
            }
            try {
                output = new String[]{"wmic", "bios", "get", "SerialNumber"};
                process = new ProcessBuilder((String)output).redirectErrorStream(true).start();
                InputStream inputStream = process.getInputStream();
                Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                var5_19 = inputStream;
                line = Charsets.UTF_8;
                trimmed = new InputStreamReader((InputStream)((Object)var5_19), (Charset)line);
                n = 8192;
                output = TextStreamsKt.readText(trimmed instanceof BufferedReader ? (BufferedReader)trimmed : new BufferedReader((Reader)trimmed, n));
                process.waitFor();
                line = new String[]{"\n"};
                for (Object line : StringsKt.split$default((CharSequence)((Object)StringsKt.trim((CharSequence)output)).toString(), line, false, 0, 6, null)) {
                    trimmed = ((Object)StringsKt.trim((CharSequence)line)).toString();
                    if (!(((CharSequence)trimmed).length() > 0) || Intrinsics.areEqual(trimmed, "SerialNumber") || Intrinsics.areEqual(trimmed, "To be filled by O.E.M.")) continue;
                    machineInfo.add("bios:" + (String)trimmed);
                }
            }
            catch (Exception process) {}
        } else if (StringsKt.contains$default((CharSequence)osName, "mac", false, 2, null) || StringsKt.contains$default((CharSequence)osName, "darwin", false, 2, null)) {
            Object parts;
            int n;
            Object it;
            boolean bl;
            block40: {
                try {
                    Object output = new String[]{"ioreg", "-rd1", "-c", "IOPlatformExpertDevice"};
                    process = new ProcessBuilder((String)output).redirectErrorStream(true).start();
                    InputStream inputStream = process.getInputStream();
                    Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                    var5_19 = inputStream;
                    line = Charsets.UTF_8;
                    trimmed = new InputStreamReader((InputStream)((Object)var5_19), (Charset)line);
                    int n2 = 8192;
                    output = TextStreamsKt.readText(trimmed instanceof BufferedReader ? (BufferedReader)trimmed : new BufferedReader((Reader)trimmed, n2));
                    process.waitFor();
                    uuidPattern = new Regex("\"IOPlatformUUID\"\\s*=\\s*\"([A-F0-9-]+)\"");
                    MatchResult match = Regex.find$default((Regex)((Object)uuidPattern), (CharSequence)output, 0, 2, null);
                    if (match != null) {
                        String uuid = match.getGroupValues().get(1);
                        machineInfo.add("hwuuid:" + uuid);
                    }
                }
                catch (Exception process) {
                    // empty catch block
                }
                Iterable $this$none$iv = machineInfo;
                boolean $i$f$none = false;
                if ($this$none$iv instanceof Collection && ((Collection)$this$none$iv).isEmpty()) {
                    bl = true;
                } else {
                    for (Object element$iv : $this$none$iv) {
                        it = (String)element$iv;
                        n = 0;
                        if (!StringsKt.startsWith$default((String)it, "hwuuid:", false, 2, null)) continue;
                        bl = false;
                        break block40;
                    }
                    bl = true;
                }
            }
            if (bl) {
                try {
                    Object element$iv;
                    String[] $i$f$none = new String[]{"system_profiler", "SPHardwareDataType"};
                    process = new ProcessBuilder($i$f$none).redirectErrorStream(true).start();
                    InputStream inputStream = process.getInputStream();
                    Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                    uuidPattern = inputStream;
                    element$iv = Charsets.UTF_8;
                    it = new InputStreamReader((InputStream)((Object)uuidPattern), (Charset)element$iv);
                    n = 8192;
                    String output = TextStreamsKt.readText(it instanceof BufferedReader ? (BufferedReader)it : new BufferedReader((Reader)it, n));
                    process.waitFor();
                    element$iv = new String[]{"\n"};
                    for (Object line : StringsKt.split$default((CharSequence)output, element$iv, false, 0, 6, null)) {
                        String uuid;
                        if (!StringsKt.contains$default((CharSequence)line, "Hardware UUID", false, 2, null) || (parts = StringsKt.split$default((CharSequence)line, n = new String[]{":"}, false, 0, 6, null)).size() <= 1 || !(((CharSequence)(uuid = ((Object)StringsKt.trim((CharSequence)((String)parts.get(1)))).toString())).length() > 0)) continue;
                        machineInfo.add("hwuuid:" + uuid);
                        break;
                    }
                }
                catch (Exception process) {
                    // empty catch block
                }
            }
            try {
                Object output = new String[]{"system_profiler", "SPHardwareDataType"};
                process = new ProcessBuilder((String)output).redirectErrorStream(true).start();
                InputStream inputStream = process.getInputStream();
                Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                uuidPattern = inputStream;
                line = Charsets.UTF_8;
                parts = new InputStreamReader((InputStream)((Object)uuidPattern), (Charset)line);
                int uuid = 8192;
                output = TextStreamsKt.readText(parts instanceof BufferedReader ? (BufferedReader)parts : new BufferedReader((Reader)parts, uuid));
                process.waitFor();
                line = new String[]{"\n"};
                for (Object line : StringsKt.split$default((CharSequence)output, line, false, 0, 6, null)) {
                    String serial;
                    if (!StringsKt.contains$default((CharSequence)line, "Serial Number", false, 2, null) || StringsKt.contains$default((CharSequence)line, "UUID", false, 2, null) || (parts = StringsKt.split$default((CharSequence)line, uuid = new String[]{":"}, false, 0, 6, null)).size() <= 1 || !(((CharSequence)(serial = ((Object)StringsKt.trim((CharSequence)((String)parts.get(1)))).toString())).length() > 0)) continue;
                    machineInfo.add("serial:" + serial);
                }
            }
            catch (Exception process) {}
        } else if (StringsKt.contains$default((CharSequence)osName, "linux", false, 2, null)) {
            try {
                String id;
                File machineIdFile = new File("/etc/machine-id");
                if (machineIdFile.exists() && ((CharSequence)(id = ((Object)StringsKt.trim((CharSequence)FilesKt.readText$default(machineIdFile, null, 1, null))).toString())).length() > 0) {
                    machineInfo.add("machine-id:" + id);
                }
            }
            catch (Exception machineIdFile) {
                // empty catch block
            }
            if (machineInfo.isEmpty()) {
                try {
                    String uuid;
                    File uuidFile = new File("/sys/class/dmi/id/product_uuid");
                    if (uuidFile.exists() && uuidFile.canRead() && ((CharSequence)(uuid = ((Object)StringsKt.trim((CharSequence)FilesKt.readText$default(uuidFile, null, 1, null))).toString())).length() > 0) {
                        machineInfo.add("product-uuid:" + uuid);
                    }
                }
                catch (Exception uuidFile) {
                    // empty catch block
                }
            }
        }
        if ((stableMac = this.getStableMacAddress(osName)) != null) {
            machineInfo.add("mac:" + stableMac);
        }
        machineInfo.add("system:" + System.getProperty("os.name"));
        machineInfo.add("arch:" + System.getProperty("os.arch"));
        String username = System.getProperty("user.name");
        uuidPattern = username;
        if (!(uuidPattern == null || StringsKt.isBlank((CharSequence)((Object)uuidPattern)))) {
            machineInfo.add("user:" + username);
        }
        String machineString = CollectionsKt.joinToString$default(machineInfo, "|", null, null, 0, null, null, 62, null);
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        String string3 = machineString;
        byte[] byArray = string3.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(byArray, "getBytes(...)");
        byte[] hash = digest.digest(byArray);
        Intrinsics.checkNotNull(hash);
        return CollectionsKt.joinToString$default(ArraysKt.take(hash, 8), "", null, null, 0, null, ActivationManager::generateMachineId$lambda$1, 30, null);
    }

    /*
     * Unable to fully structure code
     */
    private final String getStableMacAddress(String osName) {
        try {
            block14: {
                block13: {
                    v0 = NetworkInterface.getNetworkInterfaces();
                    if (v0 == null) break block13;
                    v1 = Collections.list(v0);
                    Intrinsics.checkNotNullExpressionValue(v1, "list(...)");
                    v0 = v1;
                    if (v0 != null) break block14;
                }
                return null;
            }
            interfaces = v0;
            var4_3 = (Iterable)interfaces;
            $i$f$filter = false;
            var6_5 = $this$filter$iv;
            destination$iv$iv = new ArrayList<E>();
            $i$f$filterTo = false;
            for (T element$iv$iv : $this$filterTo$iv$iv) {
                block12: {
                    ni = (NetworkInterface)element$iv$iv;
                    $i$a$-filter-ActivationManager$getStableMacAddress$candidateInterfaces$1 = false;
                    mac = ni.getHardwareAddress();
                    v2 = ni.getName();
                    Intrinsics.checkNotNullExpressionValue(v2, "getName(...)");
                    Intrinsics.checkNotNullExpressionValue(v2.toLowerCase(Locale.ROOT), "toLowerCase(...)");
                    if (mac == null || mac.length == 0) ** GOTO lbl-1000
                    $this$all$iv = mac;
                    $i$f$all = false;
                    var18_18 = $this$all$iv.length;
                    for (var17_17 = 0; var17_17 < var18_18; ++var17_17) {
                        it = element$iv = $this$all$iv[var17_17];
                        $i$a$-all-ActivationManager$getStableMacAddress$candidateInterfaces$1$1 = false;
                        if (it == 0) continue;
                        v3 = false;
                        break block12;
                    }
                    v3 = true;
                }
                if (v3) lbl-1000:
                // 2 sources

                {
                    v4 = false;
                } else {
                    isVirtual = StringsKt.contains$default((CharSequence)osName, "mac", false, 2, null) || StringsKt.contains$default((CharSequence)osName, "darwin", false, 2, null) ? StringsKt.startsWith$default(name, "utun", false, 2, null) || StringsKt.startsWith$default(name, "awdl", false, 2, null) || StringsKt.startsWith$default(name, "llw", false, 2, null) || StringsKt.startsWith$default(name, "bridge", false, 2, null) || StringsKt.startsWith$default(name, "ap", false, 2, null) || StringsKt.startsWith$default(name, "gif", false, 2, null) || StringsKt.startsWith$default(name, "stf", false, 2, null) || StringsKt.startsWith$default(name, "anpi", false, 2, null) || StringsKt.startsWith$default(name, "vmnet", false, 2, null) || StringsKt.startsWith$default(name, "vnic", false, 2, null) || StringsKt.contains$default((CharSequence)name, "virtual", false, 2, null) : (StringsKt.contains$default((CharSequence)osName, "win", false, 2, null) ? StringsKt.contains$default((CharSequence)name, "virtual", false, 2, null) || StringsKt.contains$default((CharSequence)name, "vmware", false, 2, null) || StringsKt.contains$default((CharSequence)name, "vmnet", false, 2, null) || StringsKt.contains$default((CharSequence)name, "vbox", false, 2, null) || StringsKt.contains$default((CharSequence)name, "virtualbox", false, 2, null) || StringsKt.contains$default((CharSequence)name, "hyper-v", false, 2, null) || StringsKt.contains$default((CharSequence)name, "vpn", false, 2, null) || StringsKt.contains$default((CharSequence)name, "tunnel", false, 2, null) || StringsKt.contains$default((CharSequence)name, "loopback", false, 2, null) || ni.isLoopback() || ni.isVirtual() : StringsKt.startsWith$default(name, "veth", false, 2, null) != false || StringsKt.startsWith$default(name, "docker", false, 2, null) != false || StringsKt.startsWith$default(name, "br-", false, 2, null) != false || StringsKt.startsWith$default(name, "virbr", false, 2, null) != false || StringsKt.contains$default((CharSequence)name, "virtual", false, 2, null) != false || ni.isLoopback() != false || ni.isVirtual() != false);
                    v4 = isVirtual == false;
                }
                if (!v4) continue;
                destination$iv$iv.add(element$iv$iv);
            }
            $this$filter$iv = (List)destination$iv$iv;
            $i$f$map = false;
            $this$filterTo$iv$iv = $this$map$iv;
            destination$iv$iv = new ArrayList<E>(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            $i$f$mapTo = false;
            for (T item$iv$iv : $this$mapTo$iv$iv) {
                ni = (NetworkInterface)item$iv$iv;
                var22_22 = destination$iv$iv;
                $i$a$-map-ActivationManager$getStableMacAddress$candidateInterfaces$2 = false;
                mac = ni.getHardwareAddress();
                Intrinsics.checkNotNull(mac);
                macStr = ArraysKt.joinToString$default(mac, (CharSequence)":", null, null, 0, null, (Function1<Byte, CharSequence>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, getStableMacAddress$lambda$1$0(byte ), (Ljava/lang/Byte;)Ljava/lang/CharSequence;)(), 30, null);
                var22_22.add(new Pair<String, String>(ni.getName(), macStr));
            }
            candidateInterfaces = (List)destination$iv$iv;
            if (candidateInterfaces.isEmpty()) {
                return null;
            }
            sortedInterfaces = CollectionsKt.sortedWith(candidateInterfaces, (Comparator)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)I, getStableMacAddress$lambda$3(kotlin.jvm.functions.Function2 java.lang.Object java.lang.Object ), (Ljava/lang/Object;Ljava/lang/Object;)I)((Function2<Pair, Pair, Integer>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, getStableMacAddress$lambda$2(java.lang.String kotlin.Pair kotlin.Pair ), (Lkotlin/Pair;Lkotlin/Pair;)Ljava/lang/Integer;)((String)osName)));
            v5 = (Pair)CollectionsKt.firstOrNull(sortedInterfaces);
            return v5 != null ? (String)v5.getSecond() : null;
        }
        catch (Exception <unused var>) {
            return null;
        }
    }

    @NotNull
    public final String getMachineId() {
        return this.machineId;
    }

    @NotNull
    public final String generateActivationCode(@NotNull String targetMachineId, int durationDays) {
        Intrinsics.checkNotNullParameter(targetMachineId, "targetMachineId");
        long timestamp = System.currentTimeMillis() / (long)1000;
        String message = targetMachineId + ":" + timestamp + ":" + durationDays;
        Mac mac = Mac.getInstance("HmacSHA256");
        String string = "remarkable_koreader_installer_activation_secret_key_ga_v26.01.18";
        byte[] byArray = string.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(byArray, "getBytes(...)");
        SecretKeySpec secretKeySpec = new SecretKeySpec(byArray, "HmacSHA256");
        mac.init(secretKeySpec);
        String string2 = message;
        byte[] byArray2 = string2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(byArray2, "getBytes(...)");
        byte[] signature = mac.doFinal(byArray2);
        String activationData = message + ":" + Base64.getEncoder().encodeToString(signature);
        Base64.Encoder encoder = Base64.getEncoder();
        String string3 = activationData;
        byte[] byArray3 = string3.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(byArray3, "getBytes(...)");
        String string4 = encoder.encodeToString(byArray3);
        Intrinsics.checkNotNullExpressionValue(string4, "encodeToString(...)");
        return string4;
    }

    public final boolean validateActivationCode(@NotNull String activationCode, @NotNull String targetMachineId) {
        boolean bl;
        Intrinsics.checkNotNullParameter(activationCode, "activationCode");
        Intrinsics.checkNotNullParameter(targetMachineId, "targetMachineId");
        try {
            Pair pair;
            byte[] byArray = Base64.getDecoder().decode(activationCode);
            Intrinsics.checkNotNullExpressionValue(byArray, "decode(...)");
            byte[] byArray2 = byArray;
            String data = new String(byArray2, Charsets.UTF_8);
            String[] stringArray = new String[]{":"};
            List parts = StringsKt.split$default((CharSequence)data, stringArray, false, 0, 6, null);
            if (parts.size() < 3) {
                return false;
            }
            String providedMachineId = (String)parts.get(0);
            switch (parts.size()) {
                case 3: {
                    pair = TuplesKt.to(parts.get(2), parts.get(0) + ":" + parts.get(1));
                    break;
                }
                case 4: {
                    pair = TuplesKt.to(parts.get(3), parts.get(0) + ":" + parts.get(1) + ":" + parts.get(2));
                    break;
                }
                default: {
                    return false;
                }
            }
            Pair pair2 = pair;
            String signatureB64 = (String)pair2.component1();
            String messageToVerify = (String)((Object)pair2.component2());
            if (!Intrinsics.areEqual(providedMachineId, targetMachineId)) {
                return false;
            }
            byte[] signature = Base64.getDecoder().decode(signatureB64);
            Mac mac = Mac.getInstance("HmacSHA256");
            String string = "remarkable_koreader_installer_activation_secret_key_ga_v26.01.18";
            byte[] byArray3 = string.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(byArray3, "getBytes(...)");
            SecretKeySpec secretKeySpec = new SecretKeySpec(byArray3, "HmacSHA256");
            mac.init(secretKeySpec);
            String string2 = messageToVerify;
            byte[] byArray4 = string2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(byArray4, "getBytes(...)");
            byte[] expectedSignature = mac.doFinal(byArray4);
            bl = MessageDigest.isEqual(signature, expectedSignature);
        }
        catch (Exception exception) {
            bl = false;
        }
        return bl;
    }

    public final int getActivationDuration(@NotNull String activationCode) {
        int n;
        Intrinsics.checkNotNullParameter(activationCode, "activationCode");
        try {
            byte[] byArray = Base64.getDecoder().decode(activationCode);
            Intrinsics.checkNotNullExpressionValue(byArray, "decode(...)");
            byte[] byArray2 = byArray;
            String data = new String(byArray2, Charsets.UTF_8);
            String[] stringArray = new String[]{":"};
            List parts = StringsKt.split$default((CharSequence)data, stringArray, false, 0, 6, null);
            n = parts.size() >= 4 ? Integer.parseInt((String)parts.get(2)) : 90;
        }
        catch (Exception exception) {
            n = 90;
        }
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public final void saveActivation(@NotNull String activationCode) {
        void $this$encodeToString$iv;
        Intrinsics.checkNotNullParameter(activationCode, "activationCode");
        int durationDays = this.getActivationDuration(activationCode);
        ActivationData activationData = new ActivationData(activationCode, System.currentTimeMillis() / (long)1000, this.machineId, durationDays);
        StringFormat stringFormat = (StringFormat)Json.Default;
        ActivationData value$iv = activationData;
        boolean $i$f$encodeToString = false;
        $this$encodeToString$iv.getSerializersModule();
        String jsonData = $this$encodeToString$iv.encodeToString((SerializationStrategy)ActivationData.Companion.serializer(), (Object)value$iv);
        byte[] byArray = jsonData.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(byArray, "getBytes(...)");
        byte[] encryptedData = this.fernetEncrypt(byArray);
        OpenOption[] openOptionArray = new OpenOption[]{};
        Files.write(this.activationPath, encryptedData, Arrays.copyOf(openOptionArray, openOptionArray.length));
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public final ActivationData loadActivation() {
        ActivationData activationData;
        try {
            void string$iv;
            void this_$iv;
            LinkOption[] linkOptionArray = new LinkOption[]{};
            if (!Files.exists(this.activationPath, Arrays.copyOf(linkOptionArray, linkOptionArray.length))) {
                return null;
            }
            byte[] byArray = Files.readAllBytes(this.activationPath);
            Intrinsics.checkNotNullExpressionValue(byArray, "readAllBytes(...)");
            byte[] encryptedData = byArray;
            byte[] decryptedData = this.fernetDecrypt(encryptedData);
            Json json = (Json)Json.Default;
            String string = new String(decryptedData, Charsets.UTF_8);
            boolean $i$f$decodeFromString = false;
            this_$iv.getSerializersModule();
            activationData = (ActivationData)this_$iv.decodeFromString((DeserializationStrategy)ActivationData.Companion.serializer(), (String)string$iv);
        }
        catch (Exception e) {
            System.out.println((Object)("Failed to load activation: " + e.getMessage()));
            activationData = null;
        }
        return activationData;
    }

    public final boolean isActivated() {
        ActivationData activationData = this.loadActivation();
        if (activationData == null) {
            return false;
        }
        ActivationData activationData2 = activationData;
        if (!Intrinsics.areEqual(activationData2.getMachineId(), this.machineId)) {
            return false;
        }
        return this.validateActivationCode(activationData2.getActivationCode(), this.machineId);
    }

    public final boolean isTrialExpired() {
        long trialEndTime;
        ActivationData activationData = this.loadActivation();
        if (activationData == null) {
            return false;
        }
        ActivationData activationData2 = activationData;
        long currentTime = System.currentTimeMillis() / (long)1000;
        return currentTime > (trialEndTime = activationData2.getActivationTime() + (long)activationData2.getDurationDays() * 24L * 60L * 60L);
    }

    public final int getTrialDaysRemaining() {
        ActivationData activationData = this.loadActivation();
        if (activationData == null) {
            return 0;
        }
        ActivationData activationData2 = activationData;
        long currentTime = System.currentTimeMillis() / (long)1000;
        long trialEndTime = activationData2.getActivationTime() + (long)activationData2.getDurationDays() * 24L * 60L * 60L;
        long secondsRemaining = trialEndTime - currentTime;
        if (secondsRemaining <= 0L) {
            return 0;
        }
        return RangesKt.coerceAtLeast((int)Math.ceil((double)secondsRemaining / 86400.0), 0);
    }

    public final boolean isUninstallerOnly() {
        ActivationData activationData = this.loadActivation();
        if (activationData == null) {
            return false;
        }
        ActivationData activationData2 = activationData;
        return Intrinsics.areEqual(activationData2.getActivationCode(), "UNINSTALLER");
    }

    /*
     * WARNING - void declaration
     */
    public final void saveUninstallerActivation() {
        void $this$encodeToString$iv;
        ActivationData activationData = new ActivationData("UNINSTALLER", System.currentTimeMillis() / (long)1000, this.machineId, 3650);
        StringFormat stringFormat = (StringFormat)Json.Default;
        ActivationData value$iv = activationData;
        boolean $i$f$encodeToString = false;
        $this$encodeToString$iv.getSerializersModule();
        String jsonData = $this$encodeToString$iv.encodeToString((SerializationStrategy)ActivationData.Companion.serializer(), (Object)value$iv);
        byte[] byArray = jsonData.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(byArray, "getBytes(...)");
        byte[] encryptedData = this.fernetEncrypt(byArray);
        OpenOption[] openOptionArray = new OpenOption[]{};
        Files.write(this.activationPath, encryptedData, Arrays.copyOf(openOptionArray, openOptionArray.length));
    }

    private static final CharSequence generateMachineId$lambda$1(byte it) {
        String string = "%02x";
        Object[] objectArray = new Object[]{it};
        String string2 = String.format(string, Arrays.copyOf(objectArray, objectArray.length));
        Intrinsics.checkNotNullExpressionValue(string2, "format(...)");
        return string2;
    }

    private static final CharSequence getStableMacAddress$lambda$1$0(byte it) {
        String string = "%02x";
        Object[] objectArray = new Object[]{it};
        String string2 = String.format(string, Arrays.copyOf(objectArray, objectArray.length));
        Intrinsics.checkNotNullExpressionValue(string2, "format(...)");
        return string2;
    }

    private static final int getStableMacAddress$lambda$2(String $osName, Pair a, Pair b) {
        int n;
        Object a2 = a.getFirst();
        Intrinsics.checkNotNullExpressionValue(a2, "<get-first>(...)");
        String string = ((String)a2).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
        String nameA = string;
        Object a3 = b.getFirst();
        Intrinsics.checkNotNullExpressionValue(a3, "<get-first>(...)");
        String string2 = ((String)a3).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
        String nameB = string2;
        if (StringsKt.contains$default((CharSequence)$osName, "mac", false, 2, null) || StringsKt.contains$default((CharSequence)$osName, "darwin", false, 2, null)) {
            Regex enRegex = new Regex("^en(\\d+)$");
            MatchResult matchA = Regex.find$default(enRegex, nameA, 0, 2, null);
            MatchResult matchB = Regex.find$default(enRegex, nameB, 0, 2, null);
            n = matchA != null && matchB != null ? Integer.parseInt(matchA.getGroupValues().get(1)) - Integer.parseInt(matchB.getGroupValues().get(1)) : (matchA != null ? -1 : (matchB != null ? 1 : nameA.compareTo(nameB)));
        } else if (StringsKt.contains$default((CharSequence)$osName, "win", false, 2, null)) {
            boolean isEthernetA = StringsKt.contains$default((CharSequence)nameA, "ethernet", false, 2, null) || StringsKt.contains$default((CharSequence)nameA, "local area", false, 2, null);
            boolean isEthernetB = StringsKt.contains$default((CharSequence)nameB, "ethernet", false, 2, null) || StringsKt.contains$default((CharSequence)nameB, "local area", false, 2, null);
            boolean isWifiA = StringsKt.contains$default((CharSequence)nameA, "wi-fi", false, 2, null) || StringsKt.contains$default((CharSequence)nameA, "wifi", false, 2, null) || StringsKt.contains$default((CharSequence)nameA, "wireless", false, 2, null);
            boolean isWifiB = StringsKt.contains$default((CharSequence)nameB, "wi-fi", false, 2, null) || StringsKt.contains$default((CharSequence)nameB, "wifi", false, 2, null) || StringsKt.contains$default((CharSequence)nameB, "wireless", false, 2, null);
            n = isEthernetA && !isEthernetB ? -1 : (!isEthernetA && isEthernetB ? 1 : (isWifiA && !isWifiB ? -1 : (!isWifiA && isWifiB ? 1 : nameA.compareTo(nameB))));
        } else {
            Regex ethRegex = new Regex("^eth(\\d+)$");
            MatchResult matchEthA = Regex.find$default(ethRegex, nameA, 0, 2, null);
            MatchResult matchEthB = Regex.find$default(ethRegex, nameB, 0, 2, null);
            n = matchEthA != null && matchEthB != null ? Integer.parseInt(matchEthA.getGroupValues().get(1)) - Integer.parseInt(matchEthB.getGroupValues().get(1)) : (matchEthA != null ? -1 : (matchEthB != null ? 1 : (StringsKt.startsWith$default(nameA, "enp", false, 2, null) && !StringsKt.startsWith$default(nameB, "enp", false, 2, null) ? -1 : (!StringsKt.startsWith$default(nameA, "enp", false, 2, null) && StringsKt.startsWith$default(nameB, "enp", false, 2, null) ? 1 : (StringsKt.startsWith$default(nameA, "wl", false, 2, null) && !StringsKt.startsWith$default(nameB, "wl", false, 2, null) ? -1 : (!StringsKt.startsWith$default(nameA, "wl", false, 2, null) && StringsKt.startsWith$default(nameB, "wl", false, 2, null) ? 1 : nameA.compareTo(nameB)))))));
        }
        return n;
    }

    private static final int getStableMacAddress$lambda$3(Function2 $tmp0, Object p0, Object p1) {
        return ((Number)$tmp0.invoke(p0, p1)).intValue();
    }
}
