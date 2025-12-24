/*
 * Decompiled with CFR 0.152.
 */
package org.example;

import androidx.compose.runtime.internal.StabilityInferred;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.example.GlobalState;
import org.example.InstallationConfig;
import org.example.InstallationState;
import org.example.InstallationStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 2, 0}, k=1, xi=48, d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u00a2\u0006\u0004\b\b\u0010\tJ\b\u0010!\u001a\u00020\"H\u0002J6\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\rJ\u000e\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\rJ\u000e\u0010,\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\rJ\u0012\u0010-\u001a\u00020\u00072\n\u0010.\u001a\u00060/j\u0002`0J\u0006\u00101\u001a\u00020\u0007J\u0006\u00102\u001a\u00020\u0007J\u0006\u00103\u001a\u00020\u0007J\u0006\u00104\u001a\u00020\u0007J\u0006\u00105\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u001d@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u00066"}, d2={"Lorg/example/InstallationJob;", "", "config", "Lorg/example/InstallationConfig;", "updateCallback", "Lkotlin/Function1;", "Lorg/example/InstallationStatus;", "", "<init>", "(Lorg/example/InstallationConfig;Lkotlin/jvm/functions/Function1;)V", "getConfig", "()Lorg/example/InstallationConfig;", "id", "", "getId", "()Ljava/lang/String;", "startTime", "Ljava/time/LocalDateTime;", "getStartTime", "()Ljava/time/LocalDateTime;", "lock", "value", "Lorg/example/InstallationState;", "state", "getState", "()Lorg/example/InstallationState;", "status", "getStatus", "()Lorg/example/InstallationStatus;", "", "rebootConfirmed", "getRebootConfirmed", "()Z", "calculateTotalSteps", "", "updateStatus", "statusValue", "message", "progress", "stepNumber", "currentStep", "stage", "addLog", "logMessage", "markStageComplete", "setError", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "setComplete", "setNeedsReboot", "setNeedsUserRebootConfirmation", "confirmReboot", "getStatusCopy", "kotlinkoreader18"})
@StabilityInferred(parameters=0)
public final class InstallationJob {
    @NotNull
    private final InstallationConfig config;
    @Nullable
    private final Function1<InstallationStatus, Unit> updateCallback;
    @NotNull
    private final String id;
    @NotNull
    private final LocalDateTime startTime;
    @NotNull
    private final Object lock;
    @NotNull
    private InstallationState state;
    @NotNull
    private InstallationStatus status;
    private volatile boolean rebootConfirmed;
    public static final int $stable = 8;

    public InstallationJob(@NotNull InstallationConfig config, @Nullable Function1<? super InstallationStatus, Unit> updateCallback) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.updateCallback = updateCallback;
        this.id = "install_" + System.currentTimeMillis();
        LocalDateTime localDateTime = LocalDateTime.now();
        Intrinsics.checkNotNullExpressionValue(localDateTime, "now(...)");
        this.startTime = localDateTime;
        this.lock = new Object();
        this.state = new InstallationState("setup", null, null, null, null, this.config.getInstallationType(), null, null, 222, null);
        this.status = new InstallationStatus("starting", "Initializing operation...", null, 0, null, this.calculateTotalSteps(), 0, null, "setup", false, false, false, 3804, null);
    }

    public /* synthetic */ InstallationJob(InstallationConfig installationConfig, Function1 function1, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 2) != 0) {
            function1 = null;
        }
        this(installationConfig, function1);
    }

    @NotNull
    public final InstallationConfig getConfig() {
        return this.config;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final LocalDateTime getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final InstallationState getState() {
        return this.state;
    }

    @NotNull
    public final InstallationStatus getStatus() {
        return this.status;
    }

    public final boolean getRebootConfirmed() {
        return this.rebootConfirmed;
    }

    private final int calculateTotalSteps() {
        int totalSteps = 15;
        switch (this.config.getInstallationType()) {
            case "launcher_only": {
                totalSteps = 12;
                break;
            }
            case "stage1": {
                totalSteps = 8;
                break;
            }
            case "stage2": {
                totalSteps = 7;
                break;
            }
            case "uninstall": {
                totalSteps = 5;
                break;
            }
            case "maintenance": {
                totalSteps = 2;
            }
        }
        return totalSteps;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void updateStatus(@NotNull String statusValue, @NotNull String message, int progress, int stepNumber, @NotNull String currentStep, @NotNull String stage) {
        Intrinsics.checkNotNullParameter(statusValue, "statusValue");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(currentStep, "currentStep");
        Intrinsics.checkNotNullParameter(stage, "stage");
        Object object = this.lock;
        synchronized (object) {
            Unit unit;
            boolean bl = false;
            this.status.setStatus(statusValue);
            this.status.setMessage(message);
            this.status.setProgress(progress);
            this.status.setStepNumber(stepNumber);
            this.status.setCurrentStep(currentStep);
            this.status.setCurrentStage(stage);
            this.state.setCurrentStage(stage);
            LocalDateTime localDateTime = LocalDateTime.now();
            Intrinsics.checkNotNullExpressionValue(localDateTime, "now(...)");
            this.state.setLastUpdate(localDateTime);
            Function1<InstallationStatus, Unit> function1 = this.updateCallback;
            if (function1 != null) {
                function1.invoke(this.status);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Unit unit2 = unit;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void addLog(@NotNull String logMessage) {
        Intrinsics.checkNotNullParameter(logMessage, "logMessage");
        Object object = this.lock;
        synchronized (object) {
            Unit unit;
            boolean bl = false;
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            String logEntry = "[" + timestamp + "] " + logMessage;
            this.status.getDetailedLogs().add(logEntry);
            GlobalState.INSTANCE.addLog("[Job " + this.id + "] " + logMessage);
            Function1<InstallationStatus, Unit> function1 = this.updateCallback;
            if (function1 != null) {
                function1.invoke(this.status);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Unit unit2 = unit;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void markStageComplete(@NotNull String stage) {
        Intrinsics.checkNotNullParameter(stage, "stage");
        Object object = this.lock;
        synchronized (object) {
            boolean bl = false;
            this.state.getCompletedStages().add(stage);
            LocalDateTime localDateTime = LocalDateTime.now();
            Intrinsics.checkNotNullExpressionValue(localDateTime, "now(...)");
            this.state.setLastUpdate(localDateTime);
            Unit unit = Unit.INSTANCE;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void setError(@NotNull Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Object object = this.lock;
        synchronized (object) {
            Unit unit;
            boolean bl = false;
            this.status.setStatus("error");
            String string = error.getMessage();
            if (string == null) {
                string = "Unknown error";
            }
            this.status.setError(string);
            this.status.setMessage("Operation failed");
            Function1<InstallationStatus, Unit> function1 = this.updateCallback;
            if (function1 != null) {
                function1.invoke(this.status);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Unit unit2 = unit;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void setComplete() {
        Object object = this.lock;
        synchronized (object) {
            Unit unit;
            boolean bl = false;
            this.status.setStatus("complete");
            this.status.setMessage("Operation completed successfully!");
            this.status.setProgress(100);
            this.state.setCurrentStage("complete");
            Function1<InstallationStatus, Unit> function1 = this.updateCallback;
            if (function1 != null) {
                function1.invoke(this.status);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Unit unit2 = unit;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void setNeedsReboot() {
        Object object = this.lock;
        synchronized (object) {
            Unit unit;
            boolean bl = false;
            this.status.setNeedsReboot(true);
            this.status.setCanContinue(true);
            this.status.setMessage("Stage 1 complete. Please reboot your device and continue with Stage 2.");
            Function1<InstallationStatus, Unit> function1 = this.updateCallback;
            if (function1 != null) {
                function1.invoke(this.status);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Unit unit2 = unit;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void setNeedsUserRebootConfirmation() {
        Object object = this.lock;
        synchronized (object) {
            Unit unit;
            boolean bl = false;
            this.status.setNeedsRebootConfirmation(true);
            this.rebootConfirmed = false;
            Function1<InstallationStatus, Unit> function1 = this.updateCallback;
            if (function1 != null) {
                function1.invoke(this.status);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Unit unit2 = unit;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void confirmReboot() {
        Object object = this.lock;
        synchronized (object) {
            Unit unit;
            boolean bl = false;
            this.rebootConfirmed = true;
            this.status.setNeedsRebootConfirmation(false);
            Function1<InstallationStatus, Unit> function1 = this.updateCallback;
            if (function1 != null) {
                function1.invoke(this.status);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Unit unit2 = unit;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @NotNull
    public final InstallationStatus getStatusCopy() {
        Object object = this.lock;
        synchronized (object) {
            boolean bl = false;
            InstallationStatus installationStatus = new InstallationStatus(this.status.getStatus(), this.status.getMessage(), this.status.getError(), this.status.getProgress(), this.status.getCurrentStep(), this.status.getTotalSteps(), this.status.getStepNumber(), CollectionsKt.toMutableList((Collection)this.status.getDetailedLogs()), this.status.getCurrentStage(), this.status.getNeedsReboot(), this.status.getCanContinue(), this.status.getNeedsRebootConfirmation());
            return installationStatus;
        }
    }
}
