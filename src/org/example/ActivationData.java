/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlinx.serialization.KSerializer
 *  kotlinx.serialization.Serializable
 *  kotlinx.serialization.UnknownFieldException
 *  kotlinx.serialization.descriptors.SerialDescriptor
 *  kotlinx.serialization.encoding.CompositeDecoder
 *  kotlinx.serialization.encoding.CompositeEncoder
 *  kotlinx.serialization.encoding.Decoder
 *  kotlinx.serialization.encoding.Encoder
 *  kotlinx.serialization.internal.GeneratedSerializer
 *  kotlinx.serialization.internal.IntSerializer
 *  kotlinx.serialization.internal.LongSerializer
 *  kotlinx.serialization.internal.PluginExceptionsKt
 *  kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
 *  kotlinx.serialization.internal.SerializationConstructorMarker
 *  kotlinx.serialization.internal.StringSerializer
 */
package org.example;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
@Metadata(mv={2, 2, 0}, k=1, xi=48, d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\b\t\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\bH\u00c6\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001\u00a2\u0006\u0002\b'R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006*"}, d2={"Lorg/example/ActivationData;", "", "activationCode", "", "activationTime", "", "machineId", "durationDays", "", "<init>", "(Ljava/lang/String;JLjava/lang/String;I)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;JLjava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getActivationCode", "()Ljava/lang/String;", "getActivationTime", "()J", "getMachineId", "getDurationDays", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$kotlinkoreader18", "$serializer", "Companion", "kotlinkoreader18"})
@StabilityInferred(parameters=1)
public final class ActivationData {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final String activationCode;
    private final long activationTime;
    @NotNull
    private final String machineId;
    private final int durationDays;
    public static final int $stable;

    public ActivationData(@NotNull String activationCode, long activationTime, @NotNull String machineId, int durationDays) {
        Intrinsics.checkNotNullParameter(activationCode, "activationCode");
        Intrinsics.checkNotNullParameter(machineId, "machineId");
        this.activationCode = activationCode;
        this.activationTime = activationTime;
        this.machineId = machineId;
        this.durationDays = durationDays;
    }

    @NotNull
    public final String getActivationCode() {
        return this.activationCode;
    }

    public final long getActivationTime() {
        return this.activationTime;
    }

    @NotNull
    public final String getMachineId() {
        return this.machineId;
    }

    public final int getDurationDays() {
        return this.durationDays;
    }

    @NotNull
    public final String component1() {
        return this.activationCode;
    }

    public final long component2() {
        return this.activationTime;
    }

    @NotNull
    public final String component3() {
        return this.machineId;
    }

    public final int component4() {
        return this.durationDays;
    }

    @NotNull
    public final ActivationData copy(@NotNull String activationCode, long activationTime, @NotNull String machineId, int durationDays) {
        Intrinsics.checkNotNullParameter(activationCode, "activationCode");
        Intrinsics.checkNotNullParameter(machineId, "machineId");
        return new ActivationData(activationCode, activationTime, machineId, durationDays);
    }

    public static /* synthetic */ ActivationData copy$default(ActivationData activationData, String string, long l, String string2, int n, int n2, Object object) {
        if ((n2 & 1) != 0) {
            string = activationData.activationCode;
        }
        if ((n2 & 2) != 0) {
            l = activationData.activationTime;
        }
        if ((n2 & 4) != 0) {
            string2 = activationData.machineId;
        }
        if ((n2 & 8) != 0) {
            n = activationData.durationDays;
        }
        return activationData.copy(string, l, string2, n);
    }

    @NotNull
    public String toString() {
        return "ActivationData(activationCode=" + this.activationCode + ", activationTime=" + this.activationTime + ", machineId=" + this.machineId + ", durationDays=" + this.durationDays + ")";
    }

    public int hashCode() {
        int result = this.activationCode.hashCode();
        result = result * 31 + Long.hashCode(this.activationTime);
        result = result * 31 + this.machineId.hashCode();
        result = result * 31 + Integer.hashCode(this.durationDays);
        return result;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivationData)) {
            return false;
        }
        ActivationData activationData = (ActivationData)other;
        if (!Intrinsics.areEqual(this.activationCode, activationData.activationCode)) {
            return false;
        }
        if (this.activationTime != activationData.activationTime) {
            return false;
        }
        if (!Intrinsics.areEqual(this.machineId, activationData.machineId)) {
            return false;
        }
        return this.durationDays == activationData.durationDays;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$kotlinkoreader18(ActivationData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.activationCode);
        output.encodeLongElement(serialDesc, 1, self.activationTime);
        output.encodeStringElement(serialDesc, 2, self.machineId);
        output.encodeIntElement(serialDesc, 3, self.durationDays);
    }

    public /* synthetic */ ActivationData(int seen0, String activationCode, long activationTime, String machineId, int durationDays, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (0xF & seen0)) {
            PluginExceptionsKt.throwMissingFieldException((int)seen0, (int)15, (SerialDescriptor)$serializer.INSTANCE.getDescriptor());
        }
        this.activationCode = activationCode;
        this.activationTime = activationTime;
        this.machineId = machineId;
        this.durationDays = durationDays;
    }

    @Deprecated(message="This synthesized declaration should not be used directly", level=DeprecationLevel.HIDDEN)
    @Metadata(mv={2, 2, 0}, k=1, xi=48, d1={"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2={"org/example/ActivationData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/example/ActivationData;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinkoreader18"})
    @StabilityInferred(parameters=0)
    public static final class $serializer
    implements GeneratedSerializer<ActivationData> {
        @NotNull
        public static final $serializer INSTANCE = new $serializer();
        @NotNull
        private static final SerialDescriptor descriptor;
        public static final int $stable;

        private $serializer() {
        }

        public final void serialize(@NotNull Encoder encoder, @NotNull ActivationData value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
            ActivationData.write$Self$kotlinkoreader18(value, compositeEncoder, serialDescriptor);
            compositeEncoder.endStructure(serialDescriptor);
        }

        @NotNull
        public final ActivationData deserialize(@NotNull Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            boolean bl = true;
            int n = 0;
            String string = null;
            long l = 0L;
            String string2 = null;
            int n2 = 0;
            CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
            if (compositeDecoder.decodeSequentially()) {
                string = compositeDecoder.decodeStringElement(serialDescriptor, 0);
                n |= 1;
                l = compositeDecoder.decodeLongElement(serialDescriptor, 1);
                n |= 2;
                string2 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
                n |= 4;
                n2 = compositeDecoder.decodeIntElement(serialDescriptor, 3);
                n |= 8;
            } else {
                block7: while (bl) {
                    int n3 = compositeDecoder.decodeElementIndex(serialDescriptor);
                    switch (n3) {
                        case -1: {
                            bl = false;
                            continue block7;
                        }
                        case 0: {
                            string = compositeDecoder.decodeStringElement(serialDescriptor, 0);
                            n |= 1;
                            continue block7;
                        }
                        case 1: {
                            l = compositeDecoder.decodeLongElement(serialDescriptor, 1);
                            n |= 2;
                            continue block7;
                        }
                        case 2: {
                            string2 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
                            n |= 4;
                            continue block7;
                        }
                        case 3: {
                            n2 = compositeDecoder.decodeIntElement(serialDescriptor, 3);
                            n |= 8;
                            continue block7;
                        }
                    }
                    throw new UnknownFieldException(n3);
                }
            }
            compositeDecoder.endStructure(serialDescriptor);
            return new ActivationData(n, string, l, string2, n2, null);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @NotNull
        public final KSerializer<?>[] childSerializers() {
            KSerializer[] kSerializerArray = new KSerializer[]{StringSerializer.INSTANCE, LongSerializer.INSTANCE, StringSerializer.INSTANCE, IntSerializer.INSTANCE};
            return kSerializerArray;
        }

        static {
            $stable = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("org.example.ActivationData", (GeneratedSerializer)INSTANCE, 4);
            pluginGeneratedSerialDescriptor.addElement("activationCode", false);
            pluginGeneratedSerialDescriptor.addElement("activationTime", false);
            pluginGeneratedSerialDescriptor.addElement("machineId", false);
            pluginGeneratedSerialDescriptor.addElement("durationDays", false);
            descriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor;
        }
    }

    @Metadata(mv={2, 2, 0}, k=1, xi=48, d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a8\u0006\u0007"}, d2={"Lorg/example/ActivationData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/example/ActivationData;", "kotlinkoreader18"})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<ActivationData> serializer() {
            return (KSerializer)$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
