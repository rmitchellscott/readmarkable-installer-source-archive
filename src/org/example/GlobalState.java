/*
 * Decompiled with CFR 0.152.
 */
package org.example;

import androidx.compose.runtime.internal.StabilityInferred;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.example.InstallationJob;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 2, 0}, k=1, xi=48, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010\u00a8\u0006\u0014"}, d2={"Lorg/example/GlobalState;", "", "<init>", "()V", "currentJob", "Ljava/util/concurrent/atomic/AtomicReference;", "Lorg/example/InstallationJob;", "getCurrentJob", "()Ljava/util/concurrent/atomic/AtomicReference;", "logQueue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "", "getLogQueue", "()Ljava/util/concurrent/ConcurrentLinkedQueue;", "isShuttingDown", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "addLog", "", "message", "kotlinkoreader18"})
@StabilityInferred(parameters=0)
public final class GlobalState {
    @NotNull
    public static final GlobalState INSTANCE = new GlobalState();
    @NotNull
    private static final AtomicReference<InstallationJob> currentJob = new AtomicReference<Object>(null);
    @NotNull
    private static final ConcurrentLinkedQueue<String> logQueue = new ConcurrentLinkedQueue();
    @NotNull
    private static final AtomicBoolean isShuttingDown = new AtomicBoolean(false);
    public static final int $stable = 8;

    private GlobalState() {
    }

    @NotNull
    public final AtomicReference<InstallationJob> getCurrentJob() {
        return currentJob;
    }

    @NotNull
    public final ConcurrentLinkedQueue<String> getLogQueue() {
        return logQueue;
    }

    @NotNull
    public final AtomicBoolean isShuttingDown() {
        return isShuttingDown;
    }

    public final void addLog(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        String logEntry = "[" + timestamp + "] " + message;
        logQueue.add(logEntry);
        System.out.println((Object)logEntry);
    }
}
