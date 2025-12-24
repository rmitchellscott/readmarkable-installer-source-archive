/*
 * Decompiled with CFR 0.152.
 */
package org.example;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 2, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0019\u001a\u00020\bH\u00c6\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012\u00a8\u0006 "}, d2={"Lorg/example/InstallationConfig;", "", "deviceIP", "", "sshPassword", "deviceModel", "installationType", "enableTripletap", "", "createBackup", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getDeviceIP", "()Ljava/lang/String;", "getSshPassword", "getDeviceModel", "getInstallationType", "getEnableTripletap", "()Z", "getCreateBackup", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "kotlinkoreader18"})
@StabilityInferred(parameters=1)
public final class InstallationConfig {
    @NotNull
    private final String deviceIP;
    @NotNull
    private final String sshPassword;
    @NotNull
    private final String deviceModel;
    @NotNull
    private final String installationType;
    private final boolean enableTripletap;
    private final boolean createBackup;
    public static final int $stable;

    public InstallationConfig(@NotNull String deviceIP, @NotNull String sshPassword, @NotNull String deviceModel, @NotNull String installationType, boolean enableTripletap, boolean createBackup) {
        Intrinsics.checkNotNullParameter(deviceIP, "deviceIP");
        Intrinsics.checkNotNullParameter(sshPassword, "sshPassword");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(installationType, "installationType");
        this.deviceIP = deviceIP;
        this.sshPassword = sshPassword;
        this.deviceModel = deviceModel;
        this.installationType = installationType;
        this.enableTripletap = enableTripletap;
        this.createBackup = createBackup;
    }

    public /* synthetic */ InstallationConfig(String string, String string2, String string3, String string4, boolean bl, boolean bl2, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 1) != 0) {
            string = "10.11.99.1";
        }
        if ((n & 2) != 0) {
            string2 = "";
        }
        if ((n & 4) != 0) {
            string3 = "remarkable-paper-pro-move";
        }
        if ((n & 8) != 0) {
            string4 = "full";
        }
        if ((n & 0x10) != 0) {
            bl = true;
        }
        if ((n & 0x20) != 0) {
            bl2 = true;
        }
        this(string, string2, string3, string4, bl, bl2);
    }

    @NotNull
    public final String getDeviceIP() {
        return this.deviceIP;
    }

    @NotNull
    public final String getSshPassword() {
        return this.sshPassword;
    }

    @NotNull
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @NotNull
    public final String getInstallationType() {
        return this.installationType;
    }

    public final boolean getEnableTripletap() {
        return this.enableTripletap;
    }

    public final boolean getCreateBackup() {
        return this.createBackup;
    }

    @NotNull
    public final String component1() {
        return this.deviceIP;
    }

    @NotNull
    public final String component2() {
        return this.sshPassword;
    }

    @NotNull
    public final String component3() {
        return this.deviceModel;
    }

    @NotNull
    public final String component4() {
        return this.installationType;
    }

    public final boolean component5() {
        return this.enableTripletap;
    }

    public final boolean component6() {
        return this.createBackup;
    }

    @NotNull
    public final InstallationConfig copy(@NotNull String deviceIP, @NotNull String sshPassword, @NotNull String deviceModel, @NotNull String installationType, boolean enableTripletap, boolean createBackup) {
        Intrinsics.checkNotNullParameter(deviceIP, "deviceIP");
        Intrinsics.checkNotNullParameter(sshPassword, "sshPassword");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(installationType, "installationType");
        return new InstallationConfig(deviceIP, sshPassword, deviceModel, installationType, enableTripletap, createBackup);
    }

    public static /* synthetic */ InstallationConfig copy$default(InstallationConfig installationConfig, String string, String string2, String string3, String string4, boolean bl, boolean bl2, int n, Object object) {
        if ((n & 1) != 0) {
            string = installationConfig.deviceIP;
        }
        if ((n & 2) != 0) {
            string2 = installationConfig.sshPassword;
        }
        if ((n & 4) != 0) {
            string3 = installationConfig.deviceModel;
        }
        if ((n & 8) != 0) {
            string4 = installationConfig.installationType;
        }
        if ((n & 0x10) != 0) {
            bl = installationConfig.enableTripletap;
        }
        if ((n & 0x20) != 0) {
            bl2 = installationConfig.createBackup;
        }
        return installationConfig.copy(string, string2, string3, string4, bl, bl2);
    }

    @NotNull
    public String toString() {
        return "InstallationConfig(deviceIP=" + this.deviceIP + ", sshPassword=" + this.sshPassword + ", deviceModel=" + this.deviceModel + ", installationType=" + this.installationType + ", enableTripletap=" + this.enableTripletap + ", createBackup=" + this.createBackup + ")";
    }

    public int hashCode() {
        int result = this.deviceIP.hashCode();
        result = result * 31 + this.sshPassword.hashCode();
        result = result * 31 + this.deviceModel.hashCode();
        result = result * 31 + this.installationType.hashCode();
        result = result * 31 + Boolean.hashCode(this.enableTripletap);
        result = result * 31 + Boolean.hashCode(this.createBackup);
        return result;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallationConfig)) {
            return false;
        }
        InstallationConfig installationConfig = (InstallationConfig)other;
        if (!Intrinsics.areEqual(this.deviceIP, installationConfig.deviceIP)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.sshPassword, installationConfig.sshPassword)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.deviceModel, installationConfig.deviceModel)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.installationType, installationConfig.installationType)) {
            return false;
        }
        if (this.enableTripletap != installationConfig.enableTripletap) {
            return false;
        }
        return this.createBackup == installationConfig.createBackup;
    }

    public InstallationConfig() {
        this(null, null, null, null, false, false, 63, null);
    }
}
