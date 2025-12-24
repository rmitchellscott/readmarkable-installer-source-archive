/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlinx.coroutines.BuildersKt
 *  kotlinx.coroutines.CoroutineDispatcher
 *  kotlinx.coroutines.CoroutineScope
 *  kotlinx.coroutines.Dispatchers
 */
package org.example;

import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 2, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u00070\tH\u0096@\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2={"Lorg/example/DesktopMonotonicFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "<init>", "()V", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "withFrameNanos", "R", "onFrame", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinkoreader18"})
@StabilityInferred(parameters=0)
public final class DesktopMonotonicFrameClock
implements MonotonicFrameClock {
    @NotNull
    private final CoroutineDispatcher dispatcher = Dispatchers.getDefault();
    public static final int $stable = 8;

    @Override
    @Nullable
    public <R> Object withFrameNanos(@NotNull Function1<? super Long, ? extends R> onFrame, @NotNull Continuation<? super R> $completion) {
        return BuildersKt.withContext((CoroutineContext)((CoroutineContext)this.dispatcher), (Function2)new Function2<CoroutineScope, Continuation<? super R>, Object>(onFrame, null){
            int label;
            final /* synthetic */ Function1<Long, R> $onFrame;
            {
                this.$onFrame = $onFrame;
                super(2, $completion);
            }

            public final Object invokeSuspend(Object $result) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0: {
                        ResultKt.throwOnFailure($result);
                        return this.$onFrame.invoke(Boxing.boxLong(System.nanoTime()));
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                return (Continuation)((Object)new /* invalid duplicate definition of identical inner class */);
            }

            public final Object invoke(CoroutineScope p1, Continuation<? super R> p2) {
                return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
            }
        }, $completion);
    }
}
