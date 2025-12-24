/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlinx.coroutines.CoroutineScope
 */
package org.example;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.ApplicationScope;
import androidx.compose.ui.window.FrameWindowScope;
import androidx.compose.ui.window.WindowPlacement;
import androidx.compose.ui.window.WindowPosition;
import androidx.compose.ui.window.WindowPosition_desktopKt;
import androidx.compose.ui.window.WindowState;
import androidx.compose.ui.window.WindowState_desktopKt;
import androidx.compose.ui.window.Window_desktopKt;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import org.example.ColorPalette;
import org.example.DesktopMonotonicFrameClock;
import org.example.MainKt;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={2, 2, 0}, k=3, xi=48)
@SourceDebugExtension(value={"SMAP\nMain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Main.kt\norg/example/ComposableSingletons$MainKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,4900:1\n149#2:4901\n149#2:4938\n149#2:4939\n149#2:4940\n149#2:4987\n149#2:4988\n86#3:4902\n83#3,6:4903\n89#3:4937\n93#3:4944\n79#4,6:4909\n86#4,4:4924\n90#4,2:4934\n94#4:4943\n368#5,9:4915\n377#5:4936\n378#5,2:4941\n4034#6,6:4928\n1225#7,6:4945\n1225#7,6:4951\n1225#7,6:4957\n1225#7,6:4963\n1225#7,6:4969\n1225#7,6:4975\n1225#7,6:4981\n1225#7,6:4989\n1225#7,6:4995\n1225#7,6:5016\n1225#7,6:5022\n1225#7,6:5028\n1225#7,6:5034\n81#8:5001\n107#8,2:5002\n81#8:5004\n107#8,2:5005\n81#8:5007\n107#8,2:5008\n81#8:5010\n107#8,2:5011\n81#8:5013\n107#8,2:5014\n*S KotlinDebug\n*F\n+ 1 Main.kt\norg/example/ComposableSingletons$MainKt\n*L\n4185#1:4901\n4195#1:4938\n4204#1:4939\n4213#1:4940\n4834#1:4987\n4835#1:4988\n4184#1:4902\n4184#1:4903,6\n4184#1:4937\n4184#1:4944\n4184#1:4909,6\n4184#1:4924,4\n4184#1:4934,2\n4184#1:4943\n4184#1:4915,9\n4184#1:4936\n4184#1:4941,2\n4184#1:4928,6\n4794#1:4945,6\n4795#1:4951,6\n4796#1:4957,6\n4797#1:4963,6\n4798#1:4969,6\n4799#1:4975,6\n4802#1:4981,6\n4826#1:4989,6\n4845#1:4995,6\n4840#1:5016,6\n4860#1:5022,6\n4874#1:5028,6\n4890#1:5034,6\n4795#1:5001\n4795#1:5002,2\n4796#1:5004\n4796#1:5005,2\n4797#1:5007\n4797#1:5008,2\n4798#1:5010\n4798#1:5011,2\n4799#1:5013\n4799#1:5014,2\n*E\n"})
public final class ComposableSingletons$MainKt {
    @NotNull
    public static final ComposableSingletons$MainKt INSTANCE = new ComposableSingletons$MainKt();
    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> lambda$-28447613 = ComposableLambdaKt.composableLambdaInstance(-28447613, false, ComposableSingletons$MainKt::lambda__28447613$lambda$0);
    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> lambda$-2037903031 = ComposableLambdaKt.composableLambdaInstance(-2037903031, false, ComposableSingletons$MainKt::lambda__2037903031$lambda$0);
    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$-1483246279 = ComposableLambdaKt.composableLambdaInstance(-1483246279, false, ComposableSingletons$MainKt::lambda__1483246279$lambda$0);
    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> lambda$272377072 = ComposableLambdaKt.composableLambdaInstance(272377072, false, ComposableSingletons$MainKt::lambda_272377072$lambda$0);
    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$1473079419 = ComposableLambdaKt.composableLambdaInstance(1473079419, false, ComposableSingletons$MainKt::lambda_1473079419$lambda$0);
    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$-62673852 = ComposableLambdaKt.composableLambdaInstance(-62673852, false, ComposableSingletons$MainKt::lambda__62673852$lambda$0);
    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$927792379 = ComposableLambdaKt.composableLambdaInstance(927792379, false, ComposableSingletons$MainKt::lambda_927792379$lambda$0);
    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> lambda$-555358685 = ComposableLambdaKt.composableLambdaInstance(-555358685, false, ComposableSingletons$MainKt::lambda__555358685$lambda$0);
    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> lambda$-1577932857 = ComposableLambdaKt.composableLambdaInstance(-1577932857, false, ComposableSingletons$MainKt::lambda__1577932857$lambda$0);
    @NotNull
    private static Function3<ApplicationScope, Composer, Integer, Unit> lambda$-985202011 = ComposableLambdaKt.composableLambdaInstance(-985202011, false, ComposableSingletons$MainKt::lambda__985202011$lambda$0);

    @NotNull
    public final Function3<RowScope, Composer, Integer, Unit> getLambda$-28447613$kotlinkoreader18() {
        return lambda$-28447613;
    }

    @NotNull
    public final Function3<RowScope, Composer, Integer, Unit> getLambda$-2037903031$kotlinkoreader18() {
        return lambda$-2037903031;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$-1483246279$kotlinkoreader18() {
        return lambda$-1483246279;
    }

    @NotNull
    public final Function3<RowScope, Composer, Integer, Unit> getLambda$272377072$kotlinkoreader18() {
        return lambda$272377072;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$1473079419$kotlinkoreader18() {
        return lambda$1473079419;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$-62673852$kotlinkoreader18() {
        return lambda$-62673852;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$927792379$kotlinkoreader18() {
        return lambda$927792379;
    }

    @NotNull
    public final Function3<RowScope, Composer, Integer, Unit> getLambda$-555358685$kotlinkoreader18() {
        return lambda$-555358685;
    }

    @NotNull
    public final Function3<RowScope, Composer, Integer, Unit> getLambda$-1577932857$kotlinkoreader18() {
        return lambda$-1577932857;
    }

    @NotNull
    public final Function3<ApplicationScope, Composer, Integer, Unit> getLambda$-985202011$kotlinkoreader18() {
        return lambda$-985202011;
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit lambda__28447613$lambda$0(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C3914@147050L55:Main.kt#p91eg0");
        if (($changed & 0x11) != 16 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-28447613, $changed, -1, "org.example.ComposableSingletons$MainKt.lambda$-28447613.<anonymous> (Main.kt:3914)");
            }
            TextKt.Text--4IGK_g("Copy Log", null, Color.Companion.getWhite-0d7_KjU(), TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 3462, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit lambda__2037903031$lambda$0(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C4052@152416L44:Main.kt#p91eg0");
        if (($changed & 0x11) != 16 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2037903031, $changed, -1, "org.example.ComposableSingletons$MainKt.lambda$-2037903031.<anonymous> (Main.kt:4052)");
            }
            TextKt.Text--4IGK_g("Copy Machine ID", null, Color.Companion.getWhite-0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 390, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit lambda__1483246279$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C4086@153680L62:Main.kt#p91eg0");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1483246279, $changed, -1, "org.example.ComposableSingletons$MainKt.lambda$-1483246279.<anonymous> (Main.kt:4086)");
            }
            TextKt.Text--4IGK_g("Paste your activation code here (or enter UNINSTALLER)", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit lambda_272377072$lambda$0(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C4124@155383L85:Main.kt#p91eg0");
        if (($changed & 0x11) != 16 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(272377072, $changed, -1, "org.example.ComposableSingletons$MainKt.lambda$272377072.<anonymous> (Main.kt:4124)");
            }
            long l = Color.Companion.getWhite-0d7_KjU();
            FontWeight fontWeight = FontWeight.Companion.getBold();
            long l2 = TextUnitKt.getSp(16);
            TextKt.Text--4IGK_g("Activate", null, l, l2, null, fontWeight, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 200070, 0, 131026);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /*
     * WARNING - void declaration
     */
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit lambda_1473079419$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C4183@157344L1390:Main.kt#p91eg0");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            void $composer2;
            void $changed$iv$iv$iv;
            void $changed$iv$iv;
            void modifier$iv;
            void $changed$iv;
            void horizontalAlignment$iv;
            void $composer$iv;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1473079419, $changed, -1, "org.example.ComposableSingletons$MainKt.lambda$1473079419.<anonymous> (Main.kt:4183)");
            }
            int $this$dp$iv22 = 50;
            boolean $i$f$getDp = false;
            Modifier $this$dp$iv22 = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv22));
            Alignment.Horizontal horizontal = Alignment.Companion.getCenterHorizontally();
            Composer composer = $composer;
            int n = 390;
            boolean $i$f$Column = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, (Alignment.Horizontal)horizontalAlignment$iv, (Composer)$composer$iv, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3);
            int n2 = 0x70 & $changed$iv << 3;
            boolean $i$f$Layout = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv, 0);
            CompositionLocalMap localMap$iv$iv = $composer$iv.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier((Composer)$composer$iv, (Modifier)modifier$iv);
            Function0<ComposeUiNode> function0 = ComposeUiNode.Companion.getConstructor();
            int n3 = 6 | 0x380 & $changed$iv$iv << 6;
            boolean $i$f$ReusableComposeNode = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer$iv.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer$iv.startReusableNode();
            if ($composer$iv.getInserting()) {
                void factory$iv$iv$iv;
                $composer$iv.createNode(factory$iv$iv$iv);
            } else {
                $composer$iv.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl((Composer)$composer$iv);
            boolean bl = false;
            Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash();
            boolean bl2 = false;
            Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv;
            boolean bl3 = false;
            if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), (Object)compositeKeyHash$iv$iv)) {
                $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(compositeKeyHash$iv$iv);
                $this$Layout_u24lambda_u240$iv$iv.apply(compositeKeyHash$iv$iv, block$iv$iv$iv);
            }
            Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
            int n4 = 0xE & $changed$iv$iv$iv >> 6;
            void $composer$iv2 = $composer$iv;
            boolean bl4 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            int n5 = 6 | 0x70 & $changed$iv >> 6;
            void var27_29 = $composer$iv2;
            ColumnScope $this$lambda_1473079419_u24lambda_u240_u240 = ColumnScopeInstance.INSTANCE;
            boolean bl5 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer2, -1890886979, "C4187@157503L204,4194@157725L41,4196@157784L221,4203@158023L41,4205@158082L259,4212@158359L41,4214@158418L302:Main.kt#p91eg0");
            TextKt.Text--4IGK_g("License Expired", null, ColorPalette.INSTANCE.getError-0d7_KjU(), TextUnitKt.getSp(28), null, FontWeight.Companion.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 200070, 0, 131026);
            int $this$dp$iv = 20;
            boolean $i$f$getDp2 = false;
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv)), (Composer)$composer2, 6);
            TextKt.Text--4IGK_g("Your current license has expired.", null, ColorKt.Color(0xFF666666L), TextUnitKt.getSp(16), null, null, null, 0L, null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 3462, 0, 130546);
            $this$dp$iv = 15;
            $i$f$getDp2 = false;
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv)), (Composer)$composer2, 6);
            TextKt.Text--4IGK_g("Thank you for trying the READMarkable\u2122 KOReader Installer v26.01.18.", null, ColorKt.Color(0xFF666666L), TextUnitKt.getSp(16), null, null, null, 0L, null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 3456, 0, 130546);
            $this$dp$iv = 15;
            $i$f$getDp2 = false;
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv)), (Composer)$composer2, 6);
            TextKt.Text--4IGK_g("Please visit readmarkable.org to generate a new Activation Code.", null, ColorKt.Color(0xFF333333L), TextUnitKt.getSp(16), null, FontWeight.Companion.getBold(), null, 0L, null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 200070, 0, 130514);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer2);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv2);
            $composer$iv.endNode();
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit lambda__62673852$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C4340@163163L57:Main.kt#p91eg0");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-62673852, $changed, -1, "org.example.ComposableSingletons$MainKt.lambda$-62673852.<anonymous> (Main.kt:4340)");
            }
            TextKt.Text--4IGK_g("Device IP Address", null, ColorPalette.INSTANCE.getOnSurface-0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 390, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit lambda_927792379$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C4356@164124L52:Main.kt#p91eg0");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(927792379, $changed, -1, "org.example.ComposableSingletons$MainKt.lambda$927792379.<anonymous> (Main.kt:4356)");
            }
            TextKt.Text--4IGK_g("SSH Password", null, ColorPalette.INSTANCE.getOnSurface-0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 390, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit lambda__555358685$lambda$0(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C4539@174613L77:Main.kt#p91eg0");
        if (($changed & 0x11) != 16 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-555358685, $changed, -1, "org.example.ComposableSingletons$MainKt.lambda$-555358685.<anonymous> (Main.kt:4539)");
            }
            TextKt.Text--4IGK_g("Uninstall KOReader", null, Color.Companion.getWhite-0d7_KjU(), 0L, null, FontWeight.Companion.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 196998, 0, 131034);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit lambda__1577932857$lambda$0(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C4587@177857L77:Main.kt#p91eg0");
        if (($changed & 0x11) != 16 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1577932857, $changed, -1, "org.example.ComposableSingletons$MainKt.lambda$-1577932857.<anonymous> (Main.kt:4587)");
            }
            TextKt.Text--4IGK_g("Uninstall KOReader", null, Color.Companion.getWhite-0d7_KjU(), 0L, null, FontWeight.Companion.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 196998, 0, 131034);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /*
     * WARNING - void declaration
     */
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit lambda__985202011$lambda$0(ApplicationScope $this$application, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$application, "$this$application");
        ComposerKt.sourceInformation($composer, "C4793@184228L29,4794@184284L33,4795@184345L34,4796@184405L34,4797@184469L30,4798@184533L34,4801@184652L661,4801@184625L688,4818@185341L137:Main.kt#p91eg0");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed($this$application) ? 4 : 2;
        }
        if (($dirty & 0x13) != 18 || !$composer.getSkipping()) {
            Object object;
            Object object2;
            Composer $this$cache$iv;
            Object object3;
            Object $this$cache$iv2;
            Object object4;
            MutableState $this$cache$iv3;
            Object object5;
            MutableState $this$cache$iv4;
            Object object6;
            MutableState $this$cache$iv5;
            Object object7;
            MutableState $this$cache$iv6;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-985202011, $dirty, -1, "org.example.ComposableSingletons$MainKt.lambda$-985202011.<anonymous> (Main.kt:4793)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1886326558, "CC(remember):Main.kt#9igjgp");
            Composer composer = $composer;
            boolean invalid$iv22 = false;
            boolean $i$f$cache = false;
            Object it$iv = $this$cache$iv6.rememberedValue();
            boolean bl = false;
            if (it$iv == Composer.Companion.getEmpty()) {
                boolean bl2 = false;
                Painter value$iv = MainKt.loadWindowIcon();
                $this$cache$iv6.updateRememberedValue(value$iv);
                object7 = value$iv;
            } else {
                object7 = it$iv;
            }
            Painter painter = (Painter)object7;
            ComposerKt.sourceInformationMarkerEnd($composer);
            Painter windowIcon = painter;
            ComposerKt.sourceInformationMarkerStart($composer, -1886324762, "CC(remember):Main.kt#9igjgp");
            Composer invalid$iv22 = $composer;
            boolean invalid$iv32 = false;
            boolean $i$f$cache2 = false;
            Object it$iv2 = $this$cache$iv5.rememberedValue();
            $i$a$-let-ComposerKt$cache$1$iv = false;
            if (it$iv2 == Composer.Companion.getEmpty()) {
                boolean bl3 = false;
                MutableState value$iv = SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                $this$cache$iv5.updateRememberedValue(value$iv);
                object6 = value$iv;
            } else {
                object6 = it$iv2;
            }
            $this$cache$iv6 = (MutableState)object6;
            ComposerKt.sourceInformationMarkerEnd($composer);
            MutableState showSplash$delegate = $this$cache$iv6;
            ComposerKt.sourceInformationMarkerStart($composer, -1886322809, "CC(remember):Main.kt#9igjgp");
            Composer invalid$iv32 = $composer;
            boolean invalid$iv42 = false;
            boolean $i$f$cache3 = false;
            Object it$iv3 = $this$cache$iv4.rememberedValue();
            $i$a$-let-ComposerKt$cache$1$iv = false;
            if (it$iv3 == Composer.Companion.getEmpty()) {
                boolean bl4 = false;
                MutableState value$iv = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $this$cache$iv4.updateRememberedValue(value$iv);
                object5 = value$iv;
            } else {
                object5 = it$iv3;
            }
            $this$cache$iv5 = (MutableState)object5;
            ComposerKt.sourceInformationMarkerEnd($composer);
            MutableState isActivated$delegate = $this$cache$iv5;
            ComposerKt.sourceInformationMarkerStart($composer, -1886320889, "CC(remember):Main.kt#9igjgp");
            Composer invalid$iv42 = $composer;
            boolean invalid$iv52 = false;
            boolean $i$f$cache4 = false;
            Object it$iv4 = $this$cache$iv3.rememberedValue();
            $i$a$-let-ComposerKt$cache$1$iv = false;
            if (it$iv4 == Composer.Companion.getEmpty()) {
                boolean bl5 = false;
                MutableState value$iv = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $this$cache$iv3.updateRememberedValue(value$iv);
                object4 = value$iv;
            } else {
                object4 = it$iv4;
            }
            $this$cache$iv4 = (MutableState)object4;
            ComposerKt.sourceInformationMarkerEnd($composer);
            MutableState isExpired$delegate = $this$cache$iv4;
            ComposerKt.sourceInformationMarkerStart($composer, -1886318845, "CC(remember):Main.kt#9igjgp");
            Composer invalid$iv52 = $composer;
            boolean invalid$iv62 = false;
            boolean $i$f$cache5 = false;
            Object it$iv5 = $this$cache$iv2.rememberedValue();
            $i$a$-let-ComposerKt$cache$1$iv = false;
            if (it$iv5 == Composer.Companion.getEmpty()) {
                boolean bl6 = false;
                MutableState value$iv = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                $this$cache$iv2.updateRememberedValue(value$iv);
                object3 = value$iv;
            } else {
                object3 = it$iv5;
            }
            $this$cache$iv3 = (MutableState)object3;
            ComposerKt.sourceInformationMarkerEnd($composer);
            MutableState daysRemaining$delegate = $this$cache$iv3;
            ComposerKt.sourceInformationMarkerStart($composer, -1886316793, "CC(remember):Main.kt#9igjgp");
            Composer invalid$iv62 = $composer;
            boolean invalid$iv = false;
            boolean $i$f$cache6 = false;
            Object it$iv6 = $this$cache$iv.rememberedValue();
            $i$a$-let-ComposerKt$cache$1$iv = false;
            if (it$iv6 == Composer.Companion.getEmpty()) {
                boolean bl7 = false;
                MutableState value$iv = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $this$cache$iv.updateRememberedValue(value$iv);
                object2 = value$iv;
            } else {
                object2 = it$iv6;
            }
            $this$cache$iv2 = (MutableState)object2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            MutableState isUninstallerOnly$delegate = $this$cache$iv2;
            Boolean bl8 = ComposableSingletons$MainKt.lambda__985202011$lambda$0$2(showSplash$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -1886312358, "CC(remember):Main.kt#9igjgp");
            $this$cache$iv = $composer;
            invalid$iv = false;
            $i$f$cache6 = false;
            it$iv6 = $this$cache$iv.rememberedValue();
            $i$a$-let-ComposerKt$cache$1$iv = false;
            if (it$iv6 == Composer.Companion.getEmpty()) {
                Boolean bl9 = bl8;
                boolean bl10 = false;
                bl8 = bl9;
                Function2 value$iv = new Function2<CoroutineScope, Continuation<? super Unit>, Object>((MutableState<Boolean>)showSplash$delegate, (MutableState<Boolean>)isActivated$delegate, (MutableState<Boolean>)isExpired$delegate, (MutableState<Integer>)daysRemaining$delegate, (MutableState<Boolean>)isUninstallerOnly$delegate, null){
                    int label;
                    final /* synthetic */ MutableState<Boolean> $showSplash$delegate;
                    final /* synthetic */ MutableState<Boolean> $isActivated$delegate;
                    final /* synthetic */ MutableState<Boolean> $isExpired$delegate;
                    final /* synthetic */ MutableState<Integer> $daysRemaining$delegate;
                    final /* synthetic */ MutableState<Boolean> $isUninstallerOnly$delegate;
                    {
                        this.$showSplash$delegate = $showSplash$delegate;
                        this.$isActivated$delegate = $isActivated$delegate;
                        this.$isExpired$delegate = $isExpired$delegate;
                        this.$daysRemaining$delegate = $daysRemaining$delegate;
                        this.$isUninstallerOnly$delegate = $isUninstallerOnly$delegate;
                        super(2, $completion);
                    }

                    public final Object invokeSuspend(Object $result) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        switch (this.label) {
                            case 0: {
                                ResultKt.throwOnFailure($result);
                                if (!ComposableSingletons$MainKt.access$lambda__985202011$lambda$0$2(this.$showSplash$delegate)) {
                                    ComposableSingletons$MainKt.access$lambda__985202011$lambda$0$6(this.$isActivated$delegate, MainKt.getActivationManager().isActivated());
                                    ComposableSingletons$MainKt.access$lambda__985202011$lambda$0$9(this.$isExpired$delegate, MainKt.getActivationManager().isTrialExpired());
                                    ComposableSingletons$MainKt.access$lambda__985202011$lambda$0$12(this.$daysRemaining$delegate, MainKt.getActivationManager().getTrialDaysRemaining());
                                    ComposableSingletons$MainKt.access$lambda__985202011$lambda$0$15(this.$isUninstallerOnly$delegate, MainKt.getActivationManager().isUninstallerOnly());
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }

                    public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                        return (Continuation)((Object)new /* invalid duplicate definition of identical inner class */);
                    }

                    public final Object invoke(CoroutineScope p1, Continuation<? super Unit> p2) {
                        return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
                    }
                };
                $this$cache$iv.updateRememberedValue(value$iv);
                object = value$iv;
            } else {
                object = it$iv6;
            }
            $this$cache$iv2 = (Function2)object;
            ComposerKt.sourceInformationMarkerEnd($composer);
            EffectsKt.LaunchedEffect(bl8, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>)$this$cache$iv2, $composer, 0);
            WindowState windowState = WindowState_desktopKt.rememberWindowState-Y_qrr4g(WindowPlacement.Maximized, false, WindowPosition_desktopKt.WindowPosition(Alignment.Companion.getCenter()), 0L, $composer, 6, 10);
            if (ComposableSingletons$MainKt.lambda__985202011$lambda$0$2(showSplash$delegate)) {
                Function0<Unit> function0;
                void $this$cache$iv7;
                $composer.startReplaceGroup(1654718554);
                ComposerKt.sourceInformation($composer, "4832@185794L175,4825@185559L2,4837@185984L209,4824@185518L675");
                int $this$dp$iv422 = 640;
                boolean $i$f$getDp = false;
                float f = Dp.constructor-impl($this$dp$iv422);
                int $this$dp$iv32 = 480;
                boolean $i$f$getDp2 = false;
                float $this$dp$iv422 = Dp.constructor-impl($this$dp$iv32);
                WindowPosition.Aligned $this$dp$iv32 = WindowPosition_desktopKt.WindowPosition(Alignment.Companion.getCenter());
                WindowState windowState2 = WindowState_desktopKt.rememberWindowState-6PoWaU8(null, false, $this$dp$iv32, f, $this$dp$iv422, $composer, 27648, 3);
                ComposerKt.sourceInformationMarkerStart($composer, -1886283993, "CC(remember):Main.kt#9igjgp");
                Composer $this$dp$iv422 = $composer;
                boolean invalid$iv7 = false;
                $i$f$cache = false;
                Function0<Unit> it$iv7 = $this$cache$iv7.rememberedValue();
                $i$a$-let-ComposerKt$cache$1$iv = false;
                if (it$iv7 == Composer.Companion.getEmpty()) {
                    boolean bl11 = false;
                    Function0<Unit> value$iv = ComposableSingletons$MainKt::lambda__985202011$lambda$0$17$0;
                    $this$cache$iv7.updateRememberedValue(value$iv);
                    function0 = value$iv;
                } else {
                    function0 = it$iv7;
                }
                Function0 function02 = function0;
                ComposerKt.sourceInformationMarkerEnd($composer);
                Window_desktopKt.Window((Function0<Unit>)function02, windowState2, false, "", windowIcon, true, false, false, false, false, true, null, null, (Function3<? super FrameWindowScope, ? super Composer, ? super Integer, Unit>)ComposableLambdaKt.rememberComposableLambda(523409816, true, (arg_0, arg_1, arg_2) -> ComposableSingletons$MainKt.lambda__985202011$lambda$0$18(showSplash$delegate, arg_0, arg_1, arg_2), $composer, 54), $composer, 14355462, 3078, 6916);
                $composer.endReplaceGroup();
            } else {
                Object object8;
                $composer.startReplaceGroup(1655487075);
                ComposerKt.sourceInformation($composer, "4844@186264L17,4848@186441L2688,4843@186223L2906");
                ComposerKt.sourceInformationMarkerStart($composer, -1886261418, "CC(remember):Main.kt#9igjgp");
                Composer $this$cache$iv7 = $composer;
                boolean invalid$iv8 = ($dirty & 0xE) == 4;
                $i$f$cache = false;
                Object it$iv8 = $this$cache$iv7.rememberedValue();
                $i$a$-let-ComposerKt$cache$1$iv = false;
                if (invalid$iv8 || it$iv8 == Composer.Companion.getEmpty()) {
                    boolean bl12 = false;
                    KFunction value$iv = (KFunction)((Object)new Function0<Unit>((Object)$this$application){

                        public final void invoke() {
                            ((ApplicationScope)this.receiver).exitApplication();
                        }
                    });
                    $this$cache$iv7.updateRememberedValue(value$iv);
                    object8 = value$iv;
                } else {
                    object8 = it$iv8;
                }
                KFunction kFunction = (KFunction)object8;
                ComposerKt.sourceInformationMarkerEnd($composer);
                Window_desktopKt.Window((Function0<Unit>)((Function0)((Object)kFunction)), windowState, false, "READMarkable\u2122 KOReader Installer v26.01.18", windowIcon, false, false, false, false, false, false, null, null, (Function3<? super FrameWindowScope, ? super Composer, ? super Integer, Unit>)ComposableLambdaKt.rememberComposableLambda(827619567, true, (arg_0, arg_1, arg_2) -> ComposableSingletons$MainKt.lambda__985202011$lambda$0$20($this$application, isActivated$delegate, isExpired$delegate, daysRemaining$delegate, isUninstallerOnly$delegate, arg_0, arg_1, arg_2), $composer, 54), $composer, 0, 3072, 8164);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /*
     * WARNING - void declaration
     */
    private static final boolean lambda__985202011$lambda$0$2(MutableState<Boolean> $showSplash$delegate) {
        void $this$getValue$iv;
        State state = $showSplash$delegate;
        Object var2_2 = null;
        Object property$iv = null;
        boolean $i$f$getValue = false;
        return (Boolean)$this$getValue$iv.getValue();
    }

    /*
     * WARNING - void declaration
     */
    private static final void lambda__985202011$lambda$0$3(MutableState<Boolean> $showSplash$delegate, boolean bl) {
        void $this$setValue$iv;
        MutableState<Boolean> mutableState = $showSplash$delegate;
        Object var3_3 = null;
        Object var4_4 = null;
        Boolean value$iv = bl;
        boolean $i$f$setValue = false;
        $this$setValue$iv.setValue(value$iv);
    }

    /*
     * WARNING - void declaration
     */
    private static final boolean lambda__985202011$lambda$0$5(MutableState<Boolean> $isActivated$delegate) {
        void $this$getValue$iv;
        State state = $isActivated$delegate;
        Object var2_2 = null;
        Object property$iv = null;
        boolean $i$f$getValue = false;
        return (Boolean)$this$getValue$iv.getValue();
    }

    /*
     * WARNING - void declaration
     */
    private static final void lambda__985202011$lambda$0$6(MutableState<Boolean> $isActivated$delegate, boolean bl) {
        void $this$setValue$iv;
        MutableState<Boolean> mutableState = $isActivated$delegate;
        Object var3_3 = null;
        Object var4_4 = null;
        Boolean value$iv = bl;
        boolean $i$f$setValue = false;
        $this$setValue$iv.setValue(value$iv);
    }

    /*
     * WARNING - void declaration
     */
    private static final boolean lambda__985202011$lambda$0$8(MutableState<Boolean> $isExpired$delegate) {
        void $this$getValue$iv;
        State state = $isExpired$delegate;
        Object var2_2 = null;
        Object property$iv = null;
        boolean $i$f$getValue = false;
        return (Boolean)$this$getValue$iv.getValue();
    }

    /*
     * WARNING - void declaration
     */
    private static final void lambda__985202011$lambda$0$9(MutableState<Boolean> $isExpired$delegate, boolean bl) {
        void $this$setValue$iv;
        MutableState<Boolean> mutableState = $isExpired$delegate;
        Object var3_3 = null;
        Object var4_4 = null;
        Boolean value$iv = bl;
        boolean $i$f$setValue = false;
        $this$setValue$iv.setValue(value$iv);
    }

    /*
     * WARNING - void declaration
     */
    private static final int lambda__985202011$lambda$0$11(MutableState<Integer> $daysRemaining$delegate) {
        void $this$getValue$iv;
        State state = $daysRemaining$delegate;
        Object var2_2 = null;
        Object property$iv = null;
        boolean $i$f$getValue = false;
        return ((Number)$this$getValue$iv.getValue()).intValue();
    }

    /*
     * WARNING - void declaration
     */
    private static final void lambda__985202011$lambda$0$12(MutableState<Integer> $daysRemaining$delegate, int n) {
        void $this$setValue$iv;
        MutableState<Integer> mutableState = $daysRemaining$delegate;
        Object var3_3 = null;
        Object var4_4 = null;
        Integer value$iv = n;
        boolean $i$f$setValue = false;
        $this$setValue$iv.setValue(value$iv);
    }

    /*
     * WARNING - void declaration
     */
    private static final boolean lambda__985202011$lambda$0$14(MutableState<Boolean> $isUninstallerOnly$delegate) {
        void $this$getValue$iv;
        State state = $isUninstallerOnly$delegate;
        Object var2_2 = null;
        Object property$iv = null;
        boolean $i$f$getValue = false;
        return (Boolean)$this$getValue$iv.getValue();
    }

    /*
     * WARNING - void declaration
     */
    private static final void lambda__985202011$lambda$0$15(MutableState<Boolean> $isUninstallerOnly$delegate, boolean bl) {
        void $this$setValue$iv;
        MutableState<Boolean> mutableState = $isUninstallerOnly$delegate;
        Object var3_3 = null;
        Object var4_4 = null;
        Boolean value$iv = bl;
        boolean $i$f$setValue = false;
        $this$setValue$iv.setValue(value$iv);
    }

    private static final Unit lambda__985202011$lambda$0$17$0() {
        return Unit.INSTANCE;
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit lambda__985202011$lambda$0$18(MutableState $showSplash$delegate, FrameWindowScope $this$Window, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Window, "$this$Window");
        ComposerKt.sourceInformation($composer, "C4838@186091L88,4838@186002L177:Main.kt#p91eg0");
        if (($changed & 0x11) != 16 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(523409816, $changed, -1, "org.example.ComposableSingletons$MainKt.lambda$-985202011.<anonymous>.<anonymous> (Main.kt:4838)");
            }
            CompositionLocalKt.CompositionLocalProvider(MainKt.getLocalMonotonicFrameClock().provides(new DesktopMonotonicFrameClock()), (Function2<? super Composer, ? super Integer, Unit>)ComposableLambdaKt.rememberComposableLambda(-1545765672, true, (arg_0, arg_1) -> ComposableSingletons$MainKt.lambda__985202011$lambda$0$18$0($showSplash$delegate, arg_0, arg_1), $composer, 54), $composer, 0x30 | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /*
     * WARNING - void declaration
     */
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit lambda__985202011$lambda$0$18$0(MutableState $showSplash$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C4839@186138L22,4839@186113L48:Main.kt#p91eg0");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            Function0<Unit> function0;
            void $this$cache$iv;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1545765672, $changed, -1, "org.example.ComposableSingletons$MainKt.lambda$-985202011.<anonymous>.<anonymous>.<anonymous> (Main.kt:4839)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 577875150, "CC(remember):Main.kt#9igjgp");
            Composer composer = $composer;
            boolean invalid$iv = false;
            boolean $i$f$cache = false;
            Function0<Unit> it$iv = $this$cache$iv.rememberedValue();
            boolean bl = false;
            if (it$iv == Composer.Companion.getEmpty()) {
                boolean bl2 = false;
                Function0<Unit> value$iv = () -> ComposableSingletons$MainKt.lambda__985202011$lambda$0$18$0$0$0($showSplash$delegate);
                $this$cache$iv.updateRememberedValue(value$iv);
                function0 = value$iv;
            } else {
                function0 = it$iv;
            }
            Function0 function02 = function0;
            ComposerKt.sourceInformationMarkerEnd($composer);
            MainKt.SplashScreen(function02, $composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private static final Unit lambda__985202011$lambda$0$18$0$0$0(MutableState $showSplash$delegate) {
        ComposableSingletons$MainKt.lambda__985202011$lambda$0$3($showSplash$delegate, false);
        return Unit.INSTANCE;
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit lambda__985202011$lambda$0$20(ApplicationScope $this_application, MutableState $isActivated$delegate, MutableState $isExpired$delegate, MutableState $daysRemaining$delegate, MutableState $isUninstallerOnly$delegate, FrameWindowScope $this$Window, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Window, "$this$Window");
        ComposerKt.sourceInformation($composer, "C4849@186548L2567,4849@186459L2656:Main.kt#p91eg0");
        if (($changed & 0x11) != 16 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(827619567, $changed, -1, "org.example.ComposableSingletons$MainKt.lambda$-985202011.<anonymous>.<anonymous> (Main.kt:4849)");
            }
            CompositionLocalKt.CompositionLocalProvider(MainKt.getLocalMonotonicFrameClock().provides(new DesktopMonotonicFrameClock()), (Function2<? super Composer, ? super Integer, Unit>)ComposableLambdaKt.rememberComposableLambda(-1377883089, true, (arg_0, arg_1) -> ComposableSingletons$MainKt.lambda__985202011$lambda$0$20$0($this_application, $isActivated$delegate, $isExpired$delegate, $daysRemaining$delegate, $isUninstallerOnly$delegate, arg_0, arg_1), $composer, 54), $composer, 0x30 | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit lambda__985202011$lambda$0$20$0(ApplicationScope $this_application, MutableState $isActivated$delegate, MutableState $isExpired$delegate, MutableState $daysRemaining$delegate, MutableState $isUninstallerOnly$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C4850@186584L2513,4850@186570L2527:Main.kt#p91eg0");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1377883089, $changed, -1, "org.example.ComposableSingletons$MainKt.lambda$-985202011.<anonymous>.<anonymous>.<anonymous> (Main.kt:4850)");
            }
            MaterialThemeKt.MaterialTheme(null, null, null, ComposableLambdaKt.rememberComposableLambda(1470679515, true, (arg_0, arg_1) -> ComposableSingletons$MainKt.lambda__985202011$lambda$0$20$0$0($this_application, $isActivated$delegate, $isExpired$delegate, $daysRemaining$delegate, $isUninstallerOnly$delegate, arg_0, arg_1), $composer, 54), $composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit lambda__985202011$lambda$0$20$0$0(ApplicationScope $this_application, MutableState $isActivated$delegate, MutableState $isExpired$delegate, MutableState $daysRemaining$delegate, MutableState $isUninstallerOnly$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C4854@186768L2307,4851@186610L2465:Main.kt#p91eg0");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1470679515, $changed, -1, "org.example.ComposableSingletons$MainKt.lambda$-985202011.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Main.kt:4851)");
            }
            SurfaceKt.Surface-F-jzlyU(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, ColorPalette.INSTANCE.getBackground-0d7_KjU(), 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(1635351063, true, (arg_0, arg_1) -> ComposableSingletons$MainKt.lambda__985202011$lambda$0$20$0$0$0($this_application, $isActivated$delegate, $isExpired$delegate, $daysRemaining$delegate, $isUninstallerOnly$delegate, arg_0, arg_1), $composer, 54), $composer, 1573254, 58);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit lambda__985202011$lambda$0$20$0$0$0(ApplicationScope $this_application, MutableState $isActivated$delegate, MutableState $isExpired$delegate, MutableState $daysRemaining$delegate, MutableState $isUninstallerOnly$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:Main.kt#p91eg0");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1635351063, $changed, -1, "org.example.ComposableSingletons$MainKt.lambda$-985202011.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Main.kt:4855)");
            }
            if (!ComposableSingletons$MainKt.lambda__985202011$lambda$0$5($isActivated$delegate)) {
                Function<Object> function;
                Function1<String, Boolean> function1;
                Function<Object> value$iv;
                String string;
                Composer $this$cache$iv;
                $composer.startReplaceGroup(929614622);
                ComposerKt.sourceInformation($composer, "4859@187048L883,4873@187997L429,4857@186891L1573");
                String string2 = MainKt.getActivationManager().getMachineId();
                ComposerKt.sourceInformationMarkerStart($composer, -385648950, "CC(remember):Main.kt#9igjgp");
                Composer composer = $composer;
                boolean invalid$iv = false;
                boolean $i$f$cache = false;
                Function<Object> it$iv = $this$cache$iv.rememberedValue();
                boolean bl = false;
                if (it$iv == Composer.Companion.getEmpty()) {
                    string = string2;
                    boolean bl2 = false;
                    string2 = string;
                    value$iv = arg_0 -> ComposableSingletons$MainKt.lambda__985202011$lambda$0$20$0$0$0$0$0($isActivated$delegate, $isExpired$delegate, $daysRemaining$delegate, $isUninstallerOnly$delegate, arg_0);
                    $this$cache$iv.updateRememberedValue(value$iv);
                    function1 = value$iv;
                } else {
                    function1 = it$iv;
                }
                Function function2 = function1;
                ComposerKt.sourceInformationMarkerEnd($composer);
                Function1 function12 = function2;
                ComposerKt.sourceInformationMarkerStart($composer, -385619036, "CC(remember):Main.kt#9igjgp");
                $this$cache$iv = $composer;
                invalid$iv = false;
                $i$f$cache = false;
                it$iv = $this$cache$iv.rememberedValue();
                bl = false;
                if (it$iv == Composer.Companion.getEmpty()) {
                    Function1 function13 = function12;
                    string = string2;
                    boolean bl3 = false;
                    Function0<Unit> function0 = () -> ComposableSingletons$MainKt.lambda__985202011$lambda$0$20$0$0$0$1$0($isActivated$delegate, $isExpired$delegate, $daysRemaining$delegate, $isUninstallerOnly$delegate);
                    string2 = string;
                    function12 = function13;
                    value$iv = function0;
                    $this$cache$iv.updateRememberedValue(value$iv);
                    function = value$iv;
                } else {
                    function = it$iv;
                }
                function2 = (Function0)function;
                ComposerKt.sourceInformationMarkerEnd($composer);
                MainKt.ActivationScreen(string2, function12, (Function0<Unit>)function2, $composer, 432);
                $composer.endReplaceGroup();
            } else if (ComposableSingletons$MainKt.lambda__985202011$lambda$0$8($isExpired$delegate)) {
                $composer.startReplaceGroup(931243796);
                ComposerKt.sourceInformation($composer, "4883@188582L15");
                MainKt.ExpiredScreen($composer, 0);
                $composer.endReplaceGroup();
            } else {
                Object object;
                $composer.startReplaceGroup(931378832);
                ComposerKt.sourceInformation($composer, "4889@188930L17,4886@188710L275");
                int n = ComposableSingletons$MainKt.lambda__985202011$lambda$0$11($daysRemaining$delegate);
                boolean bl = ComposableSingletons$MainKt.lambda__985202011$lambda$0$14($isUninstallerOnly$delegate);
                ComposerKt.sourceInformationMarkerStart($composer, -385589592, "CC(remember):Main.kt#9igjgp");
                Composer $this$cache$iv = $composer;
                boolean invalid$iv = $composer.changed($this_application);
                boolean $i$f$cache = false;
                Object it$iv = $this$cache$iv.rememberedValue();
                boolean bl4 = false;
                if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
                    boolean bl5 = bl;
                    int n2 = n;
                    boolean bl6 = false;
                    KFunction kFunction = (KFunction)((Object)new Function0<Unit>((Object)$this_application){

                        public final void invoke() {
                            ((ApplicationScope)this.receiver).exitApplication();
                        }
                    });
                    n = n2;
                    bl = bl5;
                    KFunction value$iv = kFunction;
                    $this$cache$iv.updateRememberedValue(value$iv);
                    object = value$iv;
                } else {
                    object = it$iv;
                }
                KFunction kFunction = (KFunction)object;
                ComposerKt.sourceInformationMarkerEnd($composer);
                MainKt.MainInstallerScreen(n, bl, (Function0)((Object)kFunction), $composer, 0, 0);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private static final boolean lambda__985202011$lambda$0$20$0$0$0$0$0(MutableState $isActivated$delegate, MutableState $isExpired$delegate, MutableState $daysRemaining$delegate, MutableState $isUninstallerOnly$delegate, String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        boolean valid = MainKt.getActivationManager().validateActivationCode(code, MainKt.getActivationManager().getMachineId());
        if (valid) {
            MainKt.getActivationManager().saveActivation(code);
            ComposableSingletons$MainKt.lambda__985202011$lambda$0$6($isActivated$delegate, true);
            ComposableSingletons$MainKt.lambda__985202011$lambda$0$9($isExpired$delegate, false);
            ComposableSingletons$MainKt.lambda__985202011$lambda$0$12($daysRemaining$delegate, MainKt.getActivationManager().getTrialDaysRemaining());
            ComposableSingletons$MainKt.lambda__985202011$lambda$0$15($isUninstallerOnly$delegate, false);
        }
        return valid;
    }

    private static final Unit lambda__985202011$lambda$0$20$0$0$0$1$0(MutableState $isActivated$delegate, MutableState $isExpired$delegate, MutableState $daysRemaining$delegate, MutableState $isUninstallerOnly$delegate) {
        MainKt.getActivationManager().saveUninstallerActivation();
        ComposableSingletons$MainKt.lambda__985202011$lambda$0$6($isActivated$delegate, true);
        ComposableSingletons$MainKt.lambda__985202011$lambda$0$9($isExpired$delegate, false);
        ComposableSingletons$MainKt.lambda__985202011$lambda$0$12($daysRemaining$delegate, MainKt.getActivationManager().getTrialDaysRemaining());
        ComposableSingletons$MainKt.lambda__985202011$lambda$0$15($isUninstallerOnly$delegate, true);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ boolean access$lambda__985202011$lambda$0$2(MutableState $showSplash$delegate) {
        return ComposableSingletons$MainKt.lambda__985202011$lambda$0$2($showSplash$delegate);
    }

    public static final /* synthetic */ void access$lambda__985202011$lambda$0$6(MutableState $isActivated$delegate, boolean bl) {
        ComposableSingletons$MainKt.lambda__985202011$lambda$0$6($isActivated$delegate, bl);
    }

    public static final /* synthetic */ void access$lambda__985202011$lambda$0$9(MutableState $isExpired$delegate, boolean bl) {
        ComposableSingletons$MainKt.lambda__985202011$lambda$0$9($isExpired$delegate, bl);
    }

    public static final /* synthetic */ void access$lambda__985202011$lambda$0$12(MutableState $daysRemaining$delegate, int n) {
        ComposableSingletons$MainKt.lambda__985202011$lambda$0$12($daysRemaining$delegate, n);
    }

    public static final /* synthetic */ void access$lambda__985202011$lambda$0$15(MutableState $isUninstallerOnly$delegate, boolean bl) {
        ComposableSingletons$MainKt.lambda__985202011$lambda$0$15($isUninstallerOnly$delegate, bl);
    }
}
