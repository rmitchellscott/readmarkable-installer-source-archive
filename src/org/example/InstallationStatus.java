/*
 * Decompiled with CFR 0.152.
 */
package org.example;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 2, 0}, k=1, xi=48, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0012\u0010\u0013J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0007H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0007H\u00c6\u0003J\t\u00108\u001a\u00020\u0007H\u00c6\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u000fH\u00c6\u0003J\t\u0010<\u001a\u00020\u000fH\u00c6\u0003J\t\u0010=\u001a\u00020\u000fH\u00c6\u0003J\u0087\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010?\u001a\u00020\u000f2\b\u0010@\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010A\u001a\u00020\u0007H\u00d6\u0001J\t\u0010B\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\u0010\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-R\u001a\u0010\u0011\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-\u00a8\u0006C"}, d2={"Lorg/example/InstallationStatus;", "", "status", "", "message", "error", "progress", "", "currentStep", "totalSteps", "stepNumber", "detailedLogs", "", "currentStage", "needsReboot", "", "canContinue", "needsRebootConfirmation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/util/List;Ljava/lang/String;ZZZ)V", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "getMessage", "setMessage", "getError", "setError", "getProgress", "()I", "setProgress", "(I)V", "getCurrentStep", "setCurrentStep", "getTotalSteps", "setTotalSteps", "getStepNumber", "setStepNumber", "getDetailedLogs", "()Ljava/util/List;", "getCurrentStage", "setCurrentStage", "getNeedsReboot", "()Z", "setNeedsReboot", "(Z)V", "getCanContinue", "setCanContinue", "getNeedsRebootConfirmation", "setNeedsRebootConfirmation", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "kotlinkoreader18"})
@StabilityInferred(parameters=0)
public final class InstallationStatus {
    @NotNull
    private String status;
    @NotNull
    private String message;
    @NotNull
    private String error;
    private int progress;
    @NotNull
    private String currentStep;
    private int totalSteps;
    private int stepNumber;
    @NotNull
    private final List<String> detailedLogs;
    @NotNull
    private String currentStage;
    private boolean needsReboot;
    private boolean canContinue;
    private boolean needsRebootConfirmation;
    public static final int $stable = 8;

    public InstallationStatus(@NotNull String status, @NotNull String message, @NotNull String error, int progress, @NotNull String currentStep, int totalSteps, int stepNumber, @NotNull List<String> detailedLogs, @NotNull String currentStage, boolean needsReboot, boolean canContinue, boolean needsRebootConfirmation) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(currentStep, "currentStep");
        Intrinsics.checkNotNullParameter(detailedLogs, "detailedLogs");
        Intrinsics.checkNotNullParameter(currentStage, "currentStage");
        this.status = status;
        this.message = message;
        this.error = error;
        this.progress = progress;
        this.currentStep = currentStep;
        this.totalSteps = totalSteps;
        this.stepNumber = stepNumber;
        this.detailedLogs = detailedLogs;
        this.currentStage = currentStage;
        this.needsReboot = needsReboot;
        this.canContinue = canContinue;
        this.needsRebootConfirmation = needsRebootConfirmation;
    }

    public /* synthetic */ InstallationStatus(String string, String string2, String string3, int n, String string4, int n2, int n3, List list, String string5, boolean bl, boolean bl2, boolean bl3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n4 & 1) != 0) {
            string = "starting";
        }
        if ((n4 & 2) != 0) {
            string2 = "Initializing operation...";
        }
        if ((n4 & 4) != 0) {
            string3 = "";
        }
        if ((n4 & 8) != 0) {
            n = 0;
        }
        if ((n4 & 0x10) != 0) {
            string4 = "";
        }
        if ((n4 & 0x20) != 0) {
            n2 = 0;
        }
        if ((n4 & 0x40) != 0) {
            n3 = 0;
        }
        if ((n4 & 0x80) != 0) {
            list = new ArrayList();
        }
        if ((n4 & 0x100) != 0) {
            string5 = "";
        }
        if ((n4 & 0x200) != 0) {
            bl = false;
        }
        if ((n4 & 0x400) != 0) {
            bl2 = false;
        }
        if ((n4 & 0x800) != 0) {
            bl3 = false;
        }
        this(string, string2, string3, n, string4, n2, n3, list, string5, bl, bl2, bl3);
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public final void setStatus(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        this.status = string;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        this.message = string;
    }

    @NotNull
    public final String getError() {
        return this.error;
    }

    public final void setError(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        this.error = string;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final void setProgress(int n) {
        this.progress = n;
    }

    @NotNull
    public final String getCurrentStep() {
        return this.currentStep;
    }

    public final void setCurrentStep(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        this.currentStep = string;
    }

    public final int getTotalSteps() {
        return this.totalSteps;
    }

    public final void setTotalSteps(int n) {
        this.totalSteps = n;
    }

    public final int getStepNumber() {
        return this.stepNumber;
    }

    public final void setStepNumber(int n) {
        this.stepNumber = n;
    }

    @NotNull
    public final List<String> getDetailedLogs() {
        return this.detailedLogs;
    }

    @NotNull
    public final String getCurrentStage() {
        return this.currentStage;
    }

    public final void setCurrentStage(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        this.currentStage = string;
    }

    public final boolean getNeedsReboot() {
        return this.needsReboot;
    }

    public final void setNeedsReboot(boolean bl) {
        this.needsReboot = bl;
    }

    public final boolean getCanContinue() {
        return this.canContinue;
    }

    public final void setCanContinue(boolean bl) {
        this.canContinue = bl;
    }

    public final boolean getNeedsRebootConfirmation() {
        return this.needsRebootConfirmation;
    }

    public final void setNeedsRebootConfirmation(boolean bl) {
        this.needsRebootConfirmation = bl;
    }

    @NotNull
    public final String component1() {
        return this.status;
    }

    @NotNull
    public final String component2() {
        return this.message;
    }

    @NotNull
    public final String component3() {
        return this.error;
    }

    public final int component4() {
        return this.progress;
    }

    @NotNull
    public final String component5() {
        return this.currentStep;
    }

    public final int component6() {
        return this.totalSteps;
    }

    public final int component7() {
        return this.stepNumber;
    }

    @NotNull
    public final List<String> component8() {
        return this.detailedLogs;
    }

    @NotNull
    public final String component9() {
        return this.currentStage;
    }

    public final boolean component10() {
        return this.needsReboot;
    }

    public final boolean component11() {
        return this.canContinue;
    }

    public final boolean component12() {
        return this.needsRebootConfirmation;
    }

    @NotNull
    public final InstallationStatus copy(@NotNull String status, @NotNull String message, @NotNull String error, int progress, @NotNull String currentStep, int totalSteps, int stepNumber, @NotNull List<String> detailedLogs, @NotNull String currentStage, boolean needsReboot, boolean canContinue, boolean needsRebootConfirmation) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(currentStep, "currentStep");
        Intrinsics.checkNotNullParameter(detailedLogs, "detailedLogs");
        Intrinsics.checkNotNullParameter(currentStage, "currentStage");
        return new InstallationStatus(status, message, error, progress, currentStep, totalSteps, stepNumber, detailedLogs, currentStage, needsReboot, canContinue, needsRebootConfirmation);
    }

    public static /* synthetic */ InstallationStatus copy$default(InstallationStatus installationStatus, String string, String string2, String string3, int n, String string4, int n2, int n3, List list, String string5, boolean bl, boolean bl2, boolean bl3, int n4, Object object) {
        if ((n4 & 1) != 0) {
            string = installationStatus.status;
        }
        if ((n4 & 2) != 0) {
            string2 = installationStatus.message;
        }
        if ((n4 & 4) != 0) {
            string3 = installationStatus.error;
        }
        if ((n4 & 8) != 0) {
            n = installationStatus.progress;
        }
        if ((n4 & 0x10) != 0) {
            string4 = installationStatus.currentStep;
        }
        if ((n4 & 0x20) != 0) {
            n2 = installationStatus.totalSteps;
        }
        if ((n4 & 0x40) != 0) {
            n3 = installationStatus.stepNumber;
        }
        if ((n4 & 0x80) != 0) {
            list = installationStatus.detailedLogs;
        }
        if ((n4 & 0x100) != 0) {
            string5 = installationStatus.currentStage;
        }
        if ((n4 & 0x200) != 0) {
            bl = installationStatus.needsReboot;
        }
        if ((n4 & 0x400) != 0) {
            bl2 = installationStatus.canContinue;
        }
        if ((n4 & 0x800) != 0) {
            bl3 = installationStatus.needsRebootConfirmation;
        }
        return installationStatus.copy(string, string2, string3, n, string4, n2, n3, list, string5, bl, bl2, bl3);
    }

    @NotNull
    public String toString() {
        return "InstallationStatus(status=" + this.status + ", message=" + this.message + ", error=" + this.error + ", progress=" + this.progress + ", currentStep=" + this.currentStep + ", totalSteps=" + this.totalSteps + ", stepNumber=" + this.stepNumber + ", detailedLogs=" + this.detailedLogs + ", currentStage=" + this.currentStage + ", needsReboot=" + this.needsReboot + ", canContinue=" + this.canContinue + ", needsRebootConfirmation=" + this.needsRebootConfirmation + ")";
    }

    public int hashCode() {
        int result = this.status.hashCode();
        result = result * 31 + this.message.hashCode();
        result = result * 31 + this.error.hashCode();
        result = result * 31 + Integer.hashCode(this.progress);
        result = result * 31 + this.currentStep.hashCode();
        result = result * 31 + Integer.hashCode(this.totalSteps);
        result = result * 31 + Integer.hashCode(this.stepNumber);
        result = result * 31 + ((Object)this.detailedLogs).hashCode();
        result = result * 31 + this.currentStage.hashCode();
        result = result * 31 + Boolean.hashCode(this.needsReboot);
        result = result * 31 + Boolean.hashCode(this.canContinue);
        result = result * 31 + Boolean.hashCode(this.needsRebootConfirmation);
        return result;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallationStatus)) {
            return false;
        }
        InstallationStatus installationStatus = (InstallationStatus)other;
        if (!Intrinsics.areEqual(this.status, installationStatus.status)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.message, installationStatus.message)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.error, installationStatus.error)) {
            return false;
        }
        if (this.progress != installationStatus.progress) {
            return false;
        }
        if (!Intrinsics.areEqual(this.currentStep, installationStatus.currentStep)) {
            return false;
        }
        if (this.totalSteps != installationStatus.totalSteps) {
            return false;
        }
        if (this.stepNumber != installationStatus.stepNumber) {
            return false;
        }
        if (!Intrinsics.areEqual(this.detailedLogs, installationStatus.detailedLogs)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.currentStage, installationStatus.currentStage)) {
            return false;
        }
        if (this.needsReboot != installationStatus.needsReboot) {
            return false;
        }
        if (this.canContinue != installationStatus.canContinue) {
            return false;
        }
        return this.needsRebootConfirmation == installationStatus.needsRebootConfirmation;
    }

    public InstallationStatus() {
        this(null, null, null, 0, null, 0, 0, null, null, false, false, false, 4095, null);
    }
}
