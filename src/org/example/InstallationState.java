/*
 * Decompiled with CFR 0.152.
 */
package org.example;

import androidx.compose.runtime.internal.StabilityInferred;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 2, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\r\u0010\u000eJ\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u000bH\u00c6\u0003J\t\u0010*\u001a\u00020\u000bH\u00c6\u0003J_\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u000200H\u00d6\u0001J\t\u00101\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 \u00a8\u00062"}, d2={"Lorg/example/InstallationState;", "", "currentStage", "", "completedStages", "", "deviceType", "architecture", "backupName", "installationType", "startTime", "Ljava/time/LocalDateTime;", "lastUpdate", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)V", "getCurrentStage", "()Ljava/lang/String;", "setCurrentStage", "(Ljava/lang/String;)V", "getCompletedStages", "()Ljava/util/List;", "getDeviceType", "setDeviceType", "getArchitecture", "setArchitecture", "getBackupName", "setBackupName", "getInstallationType", "setInstallationType", "getStartTime", "()Ljava/time/LocalDateTime;", "setStartTime", "(Ljava/time/LocalDateTime;)V", "getLastUpdate", "setLastUpdate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlinkoreader18"})
@StabilityInferred(parameters=0)
public final class InstallationState {
    @NotNull
    private String currentStage;
    @NotNull
    private final List<String> completedStages;
    @NotNull
    private String deviceType;
    @NotNull
    private String architecture;
    @NotNull
    private String backupName;
    @NotNull
    private String installationType;
    @NotNull
    private LocalDateTime startTime;
    @NotNull
    private LocalDateTime lastUpdate;
    public static final int $stable = 8;

    public InstallationState(@NotNull String currentStage, @NotNull List<String> completedStages, @NotNull String deviceType, @NotNull String architecture, @NotNull String backupName, @NotNull String installationType, @NotNull LocalDateTime startTime, @NotNull LocalDateTime lastUpdate) {
        Intrinsics.checkNotNullParameter(currentStage, "currentStage");
        Intrinsics.checkNotNullParameter(completedStages, "completedStages");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(architecture, "architecture");
        Intrinsics.checkNotNullParameter(backupName, "backupName");
        Intrinsics.checkNotNullParameter(installationType, "installationType");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(lastUpdate, "lastUpdate");
        this.currentStage = currentStage;
        this.completedStages = completedStages;
        this.deviceType = deviceType;
        this.architecture = architecture;
        this.backupName = backupName;
        this.installationType = installationType;
        this.startTime = startTime;
        this.lastUpdate = lastUpdate;
    }

    public /* synthetic */ InstallationState(String string, List list, String string2, String string3, String string4, String string5, LocalDateTime localDateTime, LocalDateTime localDateTime2, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 1) != 0) {
            string = "setup";
        }
        if ((n & 2) != 0) {
            list = new ArrayList();
        }
        if ((n & 4) != 0) {
            string2 = "";
        }
        if ((n & 8) != 0) {
            string3 = "";
        }
        if ((n & 0x10) != 0) {
            string4 = "";
        }
        if ((n & 0x20) != 0) {
            string5 = "";
        }
        if ((n & 0x40) != 0) {
            LocalDateTime localDateTime3 = LocalDateTime.now();
            Intrinsics.checkNotNullExpressionValue(localDateTime3, "now(...)");
            localDateTime = localDateTime3;
        }
        if ((n & 0x80) != 0) {
            LocalDateTime localDateTime4 = LocalDateTime.now();
            Intrinsics.checkNotNullExpressionValue(localDateTime4, "now(...)");
            localDateTime2 = localDateTime4;
        }
        this(string, list, string2, string3, string4, string5, localDateTime, localDateTime2);
    }

    @NotNull
    public final String getCurrentStage() {
        return this.currentStage;
    }

    public final void setCurrentStage(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        this.currentStage = string;
    }

    @NotNull
    public final List<String> getCompletedStages() {
        return this.completedStages;
    }

    @NotNull
    public final String getDeviceType() {
        return this.deviceType;
    }

    public final void setDeviceType(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        this.deviceType = string;
    }

    @NotNull
    public final String getArchitecture() {
        return this.architecture;
    }

    public final void setArchitecture(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        this.architecture = string;
    }

    @NotNull
    public final String getBackupName() {
        return this.backupName;
    }

    public final void setBackupName(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        this.backupName = string;
    }

    @NotNull
    public final String getInstallationType() {
        return this.installationType;
    }

    public final void setInstallationType(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        this.installationType = string;
    }

    @NotNull
    public final LocalDateTime getStartTime() {
        return this.startTime;
    }

    public final void setStartTime(@NotNull LocalDateTime localDateTime) {
        Intrinsics.checkNotNullParameter(localDateTime, "<set-?>");
        this.startTime = localDateTime;
    }

    @NotNull
    public final LocalDateTime getLastUpdate() {
        return this.lastUpdate;
    }

    public final void setLastUpdate(@NotNull LocalDateTime localDateTime) {
        Intrinsics.checkNotNullParameter(localDateTime, "<set-?>");
        this.lastUpdate = localDateTime;
    }

    @NotNull
    public final String component1() {
        return this.currentStage;
    }

    @NotNull
    public final List<String> component2() {
        return this.completedStages;
    }

    @NotNull
    public final String component3() {
        return this.deviceType;
    }

    @NotNull
    public final String component4() {
        return this.architecture;
    }

    @NotNull
    public final String component5() {
        return this.backupName;
    }

    @NotNull
    public final String component6() {
        return this.installationType;
    }

    @NotNull
    public final LocalDateTime component7() {
        return this.startTime;
    }

    @NotNull
    public final LocalDateTime component8() {
        return this.lastUpdate;
    }

    @NotNull
    public final InstallationState copy(@NotNull String currentStage, @NotNull List<String> completedStages, @NotNull String deviceType, @NotNull String architecture, @NotNull String backupName, @NotNull String installationType, @NotNull LocalDateTime startTime, @NotNull LocalDateTime lastUpdate) {
        Intrinsics.checkNotNullParameter(currentStage, "currentStage");
        Intrinsics.checkNotNullParameter(completedStages, "completedStages");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(architecture, "architecture");
        Intrinsics.checkNotNullParameter(backupName, "backupName");
        Intrinsics.checkNotNullParameter(installationType, "installationType");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(lastUpdate, "lastUpdate");
        return new InstallationState(currentStage, completedStages, deviceType, architecture, backupName, installationType, startTime, lastUpdate);
    }

    public static /* synthetic */ InstallationState copy$default(InstallationState installationState, String string, List list, String string2, String string3, String string4, String string5, LocalDateTime localDateTime, LocalDateTime localDateTime2, int n, Object object) {
        if ((n & 1) != 0) {
            string = installationState.currentStage;
        }
        if ((n & 2) != 0) {
            list = installationState.completedStages;
        }
        if ((n & 4) != 0) {
            string2 = installationState.deviceType;
        }
        if ((n & 8) != 0) {
            string3 = installationState.architecture;
        }
        if ((n & 0x10) != 0) {
            string4 = installationState.backupName;
        }
        if ((n & 0x20) != 0) {
            string5 = installationState.installationType;
        }
        if ((n & 0x40) != 0) {
            localDateTime = installationState.startTime;
        }
        if ((n & 0x80) != 0) {
            localDateTime2 = installationState.lastUpdate;
        }
        return installationState.copy(string, list, string2, string3, string4, string5, localDateTime, localDateTime2);
    }

    @NotNull
    public String toString() {
        return "InstallationState(currentStage=" + this.currentStage + ", completedStages=" + this.completedStages + ", deviceType=" + this.deviceType + ", architecture=" + this.architecture + ", backupName=" + this.backupName + ", installationType=" + this.installationType + ", startTime=" + this.startTime + ", lastUpdate=" + this.lastUpdate + ")";
    }

    public int hashCode() {
        int result = this.currentStage.hashCode();
        result = result * 31 + ((Object)this.completedStages).hashCode();
        result = result * 31 + this.deviceType.hashCode();
        result = result * 31 + this.architecture.hashCode();
        result = result * 31 + this.backupName.hashCode();
        result = result * 31 + this.installationType.hashCode();
        result = result * 31 + this.startTime.hashCode();
        result = result * 31 + this.lastUpdate.hashCode();
        return result;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallationState)) {
            return false;
        }
        InstallationState installationState = (InstallationState)other;
        if (!Intrinsics.areEqual(this.currentStage, installationState.currentStage)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.completedStages, installationState.completedStages)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.deviceType, installationState.deviceType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.architecture, installationState.architecture)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.backupName, installationState.backupName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.installationType, installationState.installationType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.startTime, installationState.startTime)) {
            return false;
        }
        return Intrinsics.areEqual(this.lastUpdate, installationState.lastUpdate);
    }

    public InstallationState() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
