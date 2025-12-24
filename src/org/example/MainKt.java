/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlinx.coroutines.BuildersKt
 *  kotlinx.coroutines.CoroutineScope
 *  kotlinx.coroutines.DelayKt
 *  kotlinx.coroutines.Dispatchers
 */
package org.example;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.CheckboxDefaults;
import androidx.compose.material.CheckboxKt;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.RadioButtonDefaults;
import androidx.compose.material.RadioButtonKt;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SkiaImageAsset_skikoKt;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.Application_desktopKt;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.invoke.LambdaMetafactory;
import java.nio.charset.Charset;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import org.example.ActivationManager;
import org.example.ColorPalette;
import org.example.ComposableSingletons$MainKt;
import org.example.GlobalState;
import org.example.InstallationConfig;
import org.example.InstallationJob;
import org.example.InstallationStatus;
import org.example.SSHOperations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.skia.Image;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={2, 2, 0}, k=2, xi=48, d1={"\u0000\u009e\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0011\u001a\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u001a\u0006\u0010\u0016\u001a\u00020\u0017\u001a\u001e\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00190\u0019\u001a\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0019\u001a\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0019\u001a\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001d\u001a\u00020\u00012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u001a \u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020#\u001a\u001e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001f\u001a*\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010-2\u0006\u0010.\u001a\u00020\u00012\u0006\u0010/\u001a\u0002002\u0006\u0010\u001e\u001a\u00020\u001f\u001a\u000e\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u000203\u001a\"\u00104\u001a\u00020%2\u0006\u00102\u001a\u0002032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0019\u001a\u000e\u00106\u001a\u00020%2\u0006\u00102\u001a\u000203\u001a\u000e\u00107\u001a\u00020%2\u0006\u00102\u001a\u000203\u001a\"\u00108\u001a\u00020\u00062\u0006\u00102\u001a\u0002032\b\b\u0002\u00109\u001a\u00020\u00042\b\b\u0002\u0010:\u001a\u00020\u0006\u001a\u000e\u0010;\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001f\u001a2\u0010<\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00102\u001a\u0002032\u0006\u0010/\u001a\u0002002\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0019\u001a\u000e\u0010=\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001f\u001a\u000e\u0010>\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001f\u001a\u001e\u0010?\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00102\u001a\u0002032\u0006\u0010/\u001a\u000200\u001a\u000e\u0010@\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001f\u001a\u0017\u0010A\u001a\u00020%2\b\b\u0002\u0010B\u001a\u00020\u0001H\u0007\u00a2\u0006\u0002\u0010C\u001a%\u0010D\u001a\u00020%2\u0006\u0010E\u001a\u00020\u00012\u0006\u0010F\u001a\u00020\u00012\u0006\u0010G\u001a\u00020\u0001H\u0007\u00a2\u0006\u0002\u0010H\u001a'\u0010I\u001a\u00020%2\u0006\u0010J\u001a\u00020\u00012\u0006\u0010K\u001a\u00020\u00012\b\b\u0002\u0010L\u001a\u00020\u0006H\u0007\u00a2\u0006\u0002\u0010M\u001a9\u0010N\u001a\u00020%2\u0006\u0010O\u001a\u00020\u00012\b\b\u0002\u0010P\u001a\u00020Q2\b\b\u0002\u0010R\u001a\u00020\u00062\f\u0010S\u001a\b\u0012\u0004\u0012\u00020%0TH\u0007\u00a2\u0006\u0004\bU\u0010V\u001a\u0015\u0010W\u001a\u00020%2\u0006\u0010X\u001a\u00020YH\u0007\u00a2\u0006\u0002\u0010Z\u001a\u001b\u0010[\u001a\u00020%2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00010]H\u0007\u00a2\u0006\u0002\u0010^\u001a7\u0010_\u001a\u00020%2\u0006\u0010`\u001a\u00020\u00012\u0012\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060b2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020%0TH\u0007\u00a2\u0006\u0002\u0010d\u001a\r\u0010e\u001a\u00020%H\u0007\u00a2\u0006\u0002\u0010f\u001a-\u0010g\u001a\u00020%2\u0006\u0010h\u001a\u00020\u00042\b\b\u0002\u0010i\u001a\u00020\u00062\f\u0010j\u001a\b\u0012\u0004\u0012\u00020%0TH\u0007\u00a2\u0006\u0002\u0010k\u001a\u001b\u0010l\u001a\u00020%2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020%0TH\u0007\u00a2\u0006\u0002\u0010n\u001a\u0019\u0010o\u001a\u00020\u00062\f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00010q\u00a2\u0006\u0002\u0010r\u001a\u0006\u0010s\u001a\u00020%\u001a\u0016\u0010t\u001a\u00020%2\u0006\u0010`\u001a\u00020\u00012\u0006\u0010u\u001a\u00020\u0004\u001a\u0019\u0010v\u001a\u00020%2\f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00010q\u00a2\u0006\u0002\u0010w\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0011\u0010(\u001a\u00020)\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+\u00a8\u0006x\u00b2\u0006\n\u0010y\u001a\u00020\u0001X\u008a\u008e\u0002\u00b2\u0006\n\u0010z\u001a\u00020\u0001X\u008a\u008e\u0002\u00b2\u0006\n\u0010{\u001a\u00020\u0001X\u008a\u008e\u0002\u00b2\u0006\n\u0010|\u001a\u00020\u0001X\u008a\u008e\u0002\u00b2\u0006\n\u0010}\u001a\u00020\u0001X\u008a\u008e\u0002\u00b2\u0006\n\u0010~\u001a\u00020\u0001X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u007f\u001a\u00020\u0001X\u008a\u008e\u0002\u00b2\u0006\u000b\u0010\u0080\u0001\u001a\u00020\u0006X\u008a\u008e\u0002\u00b2\u0006\n\u00101\u001a\u00020\u0006X\u008a\u008e\u0002\u00b2\u0006\u000b\u0010\u0081\u0001\u001a\u00020\u0006X\u008a\u008e\u0002\u00b2\u0006\r\u0010\u0082\u0001\u001a\u0004\u0018\u00010YX\u008a\u008e\u0002\u00b2\u0006\u0010\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00010]X\u008a\u008e\u0002"}, d2={"APP_VERSION", "", "ACTIVATION_SECRET_KEY", "TRIAL_DURATION_DAYS", "", "DESKTOP_MODE", "", "DEVICE_HOME", "DEVICE_XOVI_DIR", "DEVICE_EXTENSIONS_DIR", "DEVICE_APPLOAD_DIR", "DEVICE_SHIMS_DIR", "DEVICE_TRIPLETAP_DIR", "DEVICE_BACKUP_DIR", "DEVICE_CONFIG_FILE", "LocalMonotonicFrameClock", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/runtime/MonotonicFrameClock;", "getLocalMonotonicFrameClock", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "loadWindowIcon", "Landroidx/compose/ui/graphics/painter/Painter;", "getApplicationBaseDirectory", "Ljava/nio/file/Path;", "getLocalDependencyFiles", "", "getLocalCommonFiles", "getKOReaderLocalFiles", "findPatchesDirectory", "architecture", "job", "Lorg/example/InstallationJob;", "verifyLocalFile", "filepath", "minSize", "", "extractZip", "", "sourcePath", "destPath", "activationManager", "Lorg/example/ActivationManager;", "getActivationManager", "()Lorg/example/ActivationManager;", "loadLocalInstallationFiles", "", "archKey", "config", "Lorg/example/InstallationConfig;", "createBackup", "sshOps", "Lorg/example/SSHOperations;", "installTripletap", "downloadedFiles", "applyEthernetFix", "applyPatches", "rebootAndWaitForDevice", "maxWaitSeconds", "showDialog", "processInstallation", "continueInstallationStage2", "uninstallXovi", "processMaintenanceTasks", "continueMaintenanceHashtableRebuild", "processInstallationAsync", "TitleSection", "subtitle", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "StatusSection", "inputIP", "sshStatus", "activationStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "StatusItem", "label", "value", "isStatus", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V", "MenuButton", "text", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "enabled", "onClick", "Lkotlin/Function0;", "MenuButton-sW7UJKQ", "(Ljava/lang/String;JZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ProgressSection", "status", "Lorg/example/InstallationStatus;", "(Lorg/example/InstallationStatus;Landroidx/compose/runtime/Composer;I)V", "LogSection", "logs", "", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "ActivationScreen", "machineId", "onActivate", "Lkotlin/Function1;", "onUninstallerActivate", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ExpiredScreen", "(Landroidx/compose/runtime/Composer;I)V", "MainInstallerScreen", "daysRemaining", "isUninstallerOnly", "onExit", "(IZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SplashScreen", "onTimeout", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "handleCommandLineArgs", "args", "", "([Ljava/lang/String;)Z", "printHelp", "generateActivationCode", "durationDays", "main", "([Ljava/lang/String;)V", "kotlinkoreader18", "activationCode", "errorMessage", "successMessage", "deviceIP", "sshPassword", "deviceModel", "installationType", "enableTripletap", "isInstalling", "currentStatus"})
@SourceDebugExtension(value={"SMAP\nMain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Main.kt\norg/example/MainKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 11 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 12 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 13 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 14 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n+ 15 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 16 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4900:1\n1321#2,2:4901\n1321#2,2:4909\n1321#2,2:4911\n1878#3,3:4903\n1878#3,3:4906\n1869#3:6168\n1870#3:6222\n1869#3:6309\n1870#3:6363\n99#4,3:4913\n102#4:4944\n106#4:4988\n99#4:4992\n97#4,5:4993\n102#4:5026\n106#4:5030\n99#4:5305\n97#4,5:5306\n102#4:5339\n106#4:5427\n99#4,3:5816\n102#4:5847\n106#4:5858\n99#4:6176\n96#4,6:6177\n102#4:6211\n106#4:6221\n99#4:6317\n96#4,6:6318\n102#4:6352\n106#4:6362\n99#4:6369\n96#4,6:6370\n102#4:6404\n106#4:6414\n99#4:6415\n96#4,6:6416\n102#4:6450\n106#4:6460\n99#4:6471\n97#4,5:6472\n102#4:6505\n106#4:6525\n79#5,6:4916\n86#5,4:4931\n90#5,2:4941\n79#5,6:4952\n86#5,4:4967\n90#5,2:4977\n94#5:4983\n94#5:4987\n79#5,6:4998\n86#5,4:5013\n90#5,2:5023\n94#5:5029\n79#5,6:5083\n86#5,4:5098\n90#5,2:5108\n94#5:5117\n79#5,6:5125\n86#5,4:5140\n90#5,2:5150\n94#5:5159\n79#5,6:5237\n86#5,4:5252\n90#5,2:5262\n79#5,6:5274\n86#5,4:5289\n90#5,2:5299\n79#5,6:5311\n86#5,4:5326\n90#5,2:5336\n79#5,6:5347\n86#5,4:5362\n90#5,2:5372\n94#5:5380\n79#5,6:5389\n86#5,4:5404\n90#5,2:5414\n94#5:5422\n94#5:5426\n94#5:5433\n94#5:5437\n79#5,6:5446\n86#5,4:5461\n90#5,2:5471\n79#5,6:5479\n86#5,4:5494\n90#5,2:5504\n94#5:5511\n79#5,6:5521\n86#5,4:5536\n90#5,2:5546\n94#5:5554\n94#5:5558\n79#5,6:5574\n86#5,4:5589\n90#5,2:5599\n94#5:5606\n79#5,6:5616\n86#5,4:5631\n90#5,2:5641\n79#5,6:5655\n86#5,4:5670\n90#5,2:5680\n94#5:5686\n79#5,6:5699\n86#5,4:5714\n90#5,2:5724\n94#5:5730\n79#5,6:5742\n86#5,4:5757\n90#5,2:5767\n94#5:5773\n94#5:5777\n79#5,6:5787\n86#5,4:5802\n90#5,2:5812\n79#5,6:5819\n86#5,4:5834\n90#5,2:5844\n94#5:5857\n94#5:5862\n79#5,6:5872\n86#5,4:5887\n90#5,2:5897\n94#5:5910\n79#5,6:5941\n86#5,4:5956\n90#5,2:5966\n94#5:5995\n79#5,6:6005\n86#5,4:6020\n90#5,2:6030\n94#5:6047\n79#5,6:6086\n86#5,4:6101\n90#5,2:6111\n79#5,6:6139\n86#5,4:6154\n90#5,2:6164\n79#5,6:6183\n86#5,4:6198\n90#5,2:6208\n94#5:6220\n94#5:6225\n94#5:6229\n79#5,6:6239\n86#5,4:6254\n90#5,2:6264\n79#5,6:6280\n86#5,4:6295\n90#5,2:6305\n79#5,6:6324\n86#5,4:6339\n90#5,2:6349\n94#5:6361\n94#5:6366\n79#5,6:6376\n86#5,4:6391\n90#5,2:6401\n94#5:6413\n79#5,6:6422\n86#5,4:6437\n90#5,2:6447\n94#5:6459\n79#5,6:6477\n86#5,4:6492\n90#5,2:6502\n94#5:6524\n94#5:6528\n368#6,9:4922\n377#6:4943\n368#6,9:4958\n377#6:4979\n378#6,2:4981\n378#6,2:4985\n368#6,9:5004\n377#6:5025\n378#6,2:5027\n368#6,9:5089\n377#6:5110\n378#6,2:5115\n368#6,9:5131\n377#6:5152\n378#6,2:5157\n368#6,9:5243\n377#6:5264\n368#6,9:5280\n377#6:5301\n368#6,9:5317\n377#6:5338\n368#6,9:5353\n377#6:5374\n378#6,2:5378\n368#6,9:5395\n377#6:5416\n378#6,2:5420\n378#6,2:5424\n378#6,2:5431\n378#6,2:5435\n368#6,9:5452\n377#6:5473\n368#6,9:5485\n377#6:5506\n378#6,2:5509\n368#6,9:5527\n377#6:5548\n378#6,2:5552\n378#6,2:5556\n368#6,9:5580\n377#6:5601\n378#6,2:5604\n368#6,9:5622\n377#6:5643\n368#6,9:5661\n377#6:5682\n378#6,2:5684\n368#6,9:5705\n377#6:5726\n378#6,2:5728\n368#6,9:5748\n377#6:5769\n378#6,2:5771\n378#6,2:5775\n368#6,9:5793\n377#6:5814\n368#6,9:5825\n377#6:5846\n378#6,2:5855\n378#6,2:5860\n368#6,9:5878\n377#6:5899\n378#6,2:5908\n368#6,9:5947\n377#6:5968\n378#6,2:5993\n368#6,9:6011\n377#6:6032\n378#6,2:6045\n368#6,9:6092\n377#6:6113\n368#6,9:6145\n377#6:6166\n368#6,9:6189\n377#6:6210\n378#6,2:6218\n378#6,2:6223\n378#6,2:6227\n368#6,9:6245\n377#6:6266\n368#6,9:6286\n377#6:6307\n368#6,9:6330\n377#6:6351\n378#6,2:6359\n378#6,2:6364\n368#6,9:6382\n377#6:6403\n378#6,2:6411\n368#6,9:6428\n377#6:6449\n378#6,2:6457\n368#6,9:6483\n377#6:6504\n378#6,2:6522\n378#6,2:6526\n4034#7,6:4935\n4034#7,6:4971\n4034#7,6:5017\n4034#7,6:5102\n4034#7,6:5144\n4034#7,6:5256\n4034#7,6:5293\n4034#7,6:5330\n4034#7,6:5366\n4034#7,6:5408\n4034#7,6:5465\n4034#7,6:5498\n4034#7,6:5540\n4034#7,6:5593\n4034#7,6:5635\n4034#7,6:5674\n4034#7,6:5718\n4034#7,6:5761\n4034#7,6:5806\n4034#7,6:5838\n4034#7,6:5891\n4034#7,6:5960\n4034#7,6:6024\n4034#7,6:6105\n4034#7,6:6158\n4034#7,6:6202\n4034#7,6:6258\n4034#7,6:6299\n4034#7,6:6343\n4034#7,6:6395\n4034#7,6:6441\n4034#7,6:6496\n86#8:4945\n83#8,6:4946\n89#8:4980\n93#8:4984\n86#8:5267\n83#8,6:5268\n89#8:5302\n86#8:5340\n83#8,6:5341\n89#8:5375\n93#8:5381\n86#8:5382\n83#8,6:5383\n89#8:5417\n93#8:5423\n93#8:5434\n86#8,3:5476\n89#8:5507\n93#8:5512\n86#8:5514\n83#8,6:5515\n89#8:5549\n93#8:5555\n86#8:5567\n83#8,6:5568\n89#8:5602\n93#8:5607\n86#8:5609\n83#8,6:5610\n89#8:5644\n93#8:5778\n86#8:5780\n83#8,6:5781\n89#8:5815\n93#8:5863\n86#8:5934\n83#8,6:5935\n89#8:5969\n93#8:5996\n86#8:5998\n83#8,6:5999\n89#8:6033\n93#8:6048\n86#8:6079\n83#8,6:6080\n89#8:6114\n86#8:6131\n82#8,7:6132\n89#8:6167\n93#8:6226\n93#8:6230\n86#8:6232\n83#8,6:6233\n89#8:6267\n86#8:6272\n82#8,7:6273\n89#8:6308\n93#8:6367\n93#8:6529\n149#9:4989\n149#9:4990\n149#9:4991\n149#9:5031\n149#9:5032\n149#9:5033\n149#9:5034\n149#9:5056\n149#9:5057\n149#9:5058\n149#9:5112\n149#9:5113\n149#9:5114\n149#9:5154\n149#9:5155\n149#9:5156\n149#9:5266\n149#9:5303\n149#9:5304\n149#9:5376\n149#9:5377\n149#9:5418\n149#9:5419\n149#9:5428\n149#9:5429\n149#9:5430\n149#9:5475\n149#9:5508\n149#9:5513\n149#9:5550\n149#9:5551\n149#9:5566\n149#9:5603\n149#9:5608\n149#9:5645\n149#9:5646\n149#9:5647\n149#9:5688\n149#9:5689\n149#9:5690\n149#9:5691\n149#9:5732\n149#9:5733\n149#9:5734\n149#9:5779\n149#9:5848\n149#9:5859\n149#9:5864\n149#9:5901\n149#9:5933\n149#9:5970\n149#9:5971\n149#9:5972\n149#9:5973\n149#9:5974\n149#9:5981\n149#9:5982\n149#9:5983\n149#9:5990\n149#9:5991\n149#9:5992\n149#9:5997\n149#9:6034\n149#9:6035\n149#9:6036\n149#9:6037\n149#9:6044\n149#9:6049\n149#9:6078\n149#9:6115\n149#9:6122\n149#9:6129\n149#9:6130\n149#9:6175\n149#9:6231\n149#9:6268\n149#9:6269\n149#9:6270\n149#9:6271\n149#9:6316\n149#9:6368\n149#9:6461\n149#9:6462\n149#9:6463\n149#9:6470\n149#9:6506\n149#9:6507\n149#9:6514\n149#9:6515\n481#10:5035\n480#10,4:5036\n484#10,2:5043\n488#10:5049\n481#10:5215\n480#10,4:5216\n484#10,2:5223\n488#10:5229\n1225#11,3:5040\n1228#11,3:5046\n1225#11,6:5050\n1225#11,6:5059\n1225#11,6:5065\n1225#11,6:5071\n1225#11,6:5161\n1225#11,6:5167\n1225#11,6:5173\n1225#11,6:5179\n1225#11,6:5185\n1225#11,6:5191\n1225#11,6:5197\n1225#11,6:5203\n1225#11,6:5209\n1225#11,3:5220\n1228#11,3:5226\n1225#11,6:5560\n1225#11,6:5849\n1225#11,6:5902\n1225#11,6:5975\n1225#11,6:5984\n1225#11,6:6038\n1225#11,6:6116\n1225#11,6:6123\n1225#11,6:6169\n1225#11,6:6212\n1225#11,6:6310\n1225#11,6:6353\n1225#11,6:6405\n1225#11,6:6451\n1225#11,6:6464\n1225#11,6:6508\n1225#11,6:6516\n480#12:5045\n480#12:5225\n71#13:5077\n69#13,5:5078\n74#13:5111\n78#13:5118\n71#13:5119\n69#13,5:5120\n74#13:5153\n78#13:5160\n71#13:5230\n68#13,6:5231\n74#13:5265\n78#13:5438\n71#13:5439\n68#13,6:5440\n74#13:5474\n78#13:5559\n71#13:5648\n68#13,6:5649\n74#13:5683\n78#13:5687\n71#13:5692\n68#13,6:5693\n74#13:5727\n78#13:5731\n71#13:5735\n68#13,6:5736\n74#13:5770\n78#13:5774\n71#13:5865\n68#13,6:5866\n74#13:5900\n78#13:5911\n179#14,12:5912\n81#15:5924\n107#15,2:5925\n81#15:5927\n107#15,2:5928\n81#15:5930\n107#15,2:5931\n81#15:6050\n107#15,2:6051\n81#15:6053\n107#15,2:6054\n81#15:6056\n107#15,2:6057\n81#15:6059\n107#15,2:6060\n81#15:6062\n107#15,2:6063\n81#15:6065\n107#15,2:6066\n81#15:6068\n107#15,2:6069\n81#15:6071\n107#15,2:6072\n81#15:6074\n107#15,2:6075\n1#16:6077\n*S KotlinDebug\n*F\n+ 1 Main.kt\norg/example/MainKt\n*L\n385#1:4901,2\n2730#1:4909,2\n2742#1:4911,2\n2094#1:4903,3\n2160#1:4906,3\n4380#1:6168\n4380#1:6222\n4451#1:6309\n4451#1:6363\n3646#1:4913,3\n3646#1:4944\n3646#1:4988\n3711#1:4992\n3711#1:4993,5\n3711#1:5026\n3711#1:5030\n4315#1:5305\n4315#1:5306,5\n4315#1:5339\n4315#1:5427\n3889#1:5816,3\n3889#1:5847\n3889#1:5858\n4381#1:6176\n4381#1:6177,6\n4381#1:6211\n4381#1:6221\n4452#1:6317\n4452#1:6318,6\n4452#1:6352\n4452#1:6362\n4474#1:6369\n4474#1:6370,6\n4474#1:6404\n4474#1:6414\n4493#1:6415\n4493#1:6416,6\n4493#1:6450\n4493#1:6460\n4544#1:6471\n4544#1:6472,5\n4544#1:6505\n4544#1:6525\n3646#1:4916,6\n3646#1:4931,4\n3646#1:4941,2\n3652#1:4952,6\n3652#1:4967,4\n3652#1:4977,2\n3652#1:4983\n3646#1:4987\n3711#1:4998,6\n3711#1:5013,4\n3711#1:5023,2\n3711#1:5029\n3964#1:5083,6\n3964#1:5098,4\n3964#1:5108,2\n3964#1:5117\n4167#1:5125,6\n4167#1:5140,4\n4167#1:5150,2\n4167#1:5159\n4288#1:5237,6\n4288#1:5252,4\n4288#1:5262,2\n4297#1:5274,6\n4297#1:5289,4\n4297#1:5299,2\n4315#1:5311,6\n4315#1:5326,4\n4315#1:5336,2\n4320#1:5347,6\n4320#1:5362,4\n4320#1:5372,2\n4320#1:5380\n4405#1:5389,6\n4405#1:5404,4\n4405#1:5414,2\n4405#1:5422\n4315#1:5426\n4297#1:5433\n4288#1:5437\n4629#1:5446,6\n4629#1:5461,4\n4629#1:5471,2\n4638#1:5479,6\n4638#1:5494,4\n4638#1:5504,2\n4638#1:5511\n4670#1:5521,6\n4670#1:5536,4\n4670#1:5546,2\n4670#1:5554\n4629#1:5558\n3693#1:5574,6\n3693#1:5589,4\n3693#1:5599,2\n3693#1:5606\n3778#1:5616,6\n3778#1:5631,4\n3778#1:5641,2\n3789#1:5655,6\n3789#1:5670,4\n3789#1:5680,2\n3789#1:5686\n3831#1:5699,6\n3831#1:5714,4\n3831#1:5724,2\n3831#1:5730\n3847#1:5742,6\n3847#1:5757,4\n3847#1:5767,2\n3847#1:5773\n3778#1:5777\n3888#1:5787,6\n3888#1:5802,4\n3888#1:5812,2\n3889#1:5819,6\n3889#1:5834,4\n3889#1:5844,2\n3889#1:5857\n3888#1:5862\n3922#1:5872,6\n3922#1:5887,4\n3922#1:5897,2\n3922#1:5910\n3981#1:5941,6\n3981#1:5956,4\n3981#1:5966,2\n3981#1:5995\n4010#1:6005,6\n4010#1:6020,4\n4010#1:6030,2\n4010#1:6047\n4328#1:6086,6\n4328#1:6101,4\n4328#1:6111,2\n4379#1:6139,6\n4379#1:6154,4\n4379#1:6164,2\n4381#1:6183,6\n4381#1:6198,4\n4381#1:6208,2\n4381#1:6220\n4379#1:6225\n4328#1:6229\n4413#1:6239,6\n4413#1:6254,4\n4413#1:6264,2\n4450#1:6280,6\n4450#1:6295,4\n4450#1:6305,2\n4452#1:6324,6\n4452#1:6339,4\n4452#1:6349,2\n4452#1:6361\n4450#1:6366\n4474#1:6376,6\n4474#1:6391,4\n4474#1:6401,2\n4474#1:6413\n4493#1:6422,6\n4493#1:6437,4\n4493#1:6447,2\n4493#1:6459\n4544#1:6477,6\n4544#1:6492,4\n4544#1:6502,2\n4544#1:6524\n4413#1:6528\n3646#1:4922,9\n3646#1:4943\n3652#1:4958,9\n3652#1:4979\n3652#1:4981,2\n3646#1:4985,2\n3711#1:5004,9\n3711#1:5025\n3711#1:5027,2\n3964#1:5089,9\n3964#1:5110\n3964#1:5115,2\n4167#1:5131,9\n4167#1:5152\n4167#1:5157,2\n4288#1:5243,9\n4288#1:5264\n4297#1:5280,9\n4297#1:5301\n4315#1:5317,9\n4315#1:5338\n4320#1:5353,9\n4320#1:5374\n4320#1:5378,2\n4405#1:5395,9\n4405#1:5416\n4405#1:5420,2\n4315#1:5424,2\n4297#1:5431,2\n4288#1:5435,2\n4629#1:5452,9\n4629#1:5473\n4638#1:5485,9\n4638#1:5506\n4638#1:5509,2\n4670#1:5527,9\n4670#1:5548\n4670#1:5552,2\n4629#1:5556,2\n3693#1:5580,9\n3693#1:5601\n3693#1:5604,2\n3778#1:5622,9\n3778#1:5643\n3789#1:5661,9\n3789#1:5682\n3789#1:5684,2\n3831#1:5705,9\n3831#1:5726\n3831#1:5728,2\n3847#1:5748,9\n3847#1:5769\n3847#1:5771,2\n3778#1:5775,2\n3888#1:5793,9\n3888#1:5814\n3889#1:5825,9\n3889#1:5846\n3889#1:5855,2\n3888#1:5860,2\n3922#1:5878,9\n3922#1:5899\n3922#1:5908,2\n3981#1:5947,9\n3981#1:5968\n3981#1:5993,2\n4010#1:6011,9\n4010#1:6032\n4010#1:6045,2\n4328#1:6092,9\n4328#1:6113\n4379#1:6145,9\n4379#1:6166\n4381#1:6189,9\n4381#1:6210\n4381#1:6218,2\n4379#1:6223,2\n4328#1:6227,2\n4413#1:6245,9\n4413#1:6266\n4450#1:6286,9\n4450#1:6307\n4452#1:6330,9\n4452#1:6351\n4452#1:6359,2\n4450#1:6364,2\n4474#1:6382,9\n4474#1:6403\n4474#1:6411,2\n4493#1:6428,9\n4493#1:6449\n4493#1:6457,2\n4544#1:6483,9\n4544#1:6504\n4544#1:6522,2\n4413#1:6526,2\n3646#1:4935,6\n3652#1:4971,6\n3711#1:5017,6\n3964#1:5102,6\n4167#1:5144,6\n4288#1:5256,6\n4297#1:5293,6\n4315#1:5330,6\n4320#1:5366,6\n4405#1:5408,6\n4629#1:5465,6\n4638#1:5498,6\n4670#1:5540,6\n3693#1:5593,6\n3778#1:5635,6\n3789#1:5674,6\n3831#1:5718,6\n3847#1:5761,6\n3888#1:5806,6\n3889#1:5838,6\n3922#1:5891,6\n3981#1:5960,6\n4010#1:6024,6\n4328#1:6105,6\n4379#1:6158,6\n4381#1:6202,6\n4413#1:6258,6\n4450#1:6299,6\n4452#1:6343,6\n4474#1:6395,6\n4493#1:6441,6\n4544#1:6496,6\n3652#1:4945\n3652#1:4946,6\n3652#1:4980\n3652#1:4984\n4297#1:5267\n4297#1:5268,6\n4297#1:5302\n4320#1:5340\n4320#1:5341,6\n4320#1:5375\n4320#1:5381\n4405#1:5382\n4405#1:5383,6\n4405#1:5417\n4405#1:5423\n4297#1:5434\n4638#1:5476,3\n4638#1:5507\n4638#1:5512\n4670#1:5514\n4670#1:5515,6\n4670#1:5549\n4670#1:5555\n3693#1:5567\n3693#1:5568,6\n3693#1:5602\n3693#1:5607\n3778#1:5609\n3778#1:5610,6\n3778#1:5644\n3778#1:5778\n3888#1:5780\n3888#1:5781,6\n3888#1:5815\n3888#1:5863\n3981#1:5934\n3981#1:5935,6\n3981#1:5969\n3981#1:5996\n4010#1:5998\n4010#1:5999,6\n4010#1:6033\n4010#1:6048\n4328#1:6079\n4328#1:6080,6\n4328#1:6114\n4379#1:6131\n4379#1:6132,7\n4379#1:6167\n4379#1:6226\n4328#1:6230\n4413#1:6232\n4413#1:6233,6\n4413#1:6267\n4450#1:6272\n4450#1:6273,7\n4450#1:6308\n4450#1:6367\n4413#1:6529\n3689#1:4989\n3690#1:4990\n3714#1:4991\n3750#1:5031\n3755#1:5032\n3774#1:5033\n3775#1:5034\n3883#1:5056\n3884#1:5057\n3885#1:5058\n3976#1:5112\n3977#1:5113\n3978#1:5114\n4179#1:5154\n4180#1:5155\n4181#1:5156\n4300#1:5266\n4312#1:5303\n4317#1:5304\n4324#1:5376\n4325#1:5377\n4409#1:5418\n4410#1:5419\n4597#1:5428\n4602#1:5429\n4608#1:5430\n4641#1:5475\n4660#1:5508\n4673#1:5513\n4678#1:5550\n4681#1:5551\n3693#1:5566\n3701#1:5603\n3778#1:5608\n3786#1:5645\n3792#1:5646\n3793#1:5647\n3814#1:5688\n3830#1:5689\n3834#1:5690\n3835#1:5691\n3846#1:5732\n3850#1:5733\n3851#1:5734\n3888#1:5779\n3913#1:5848\n3919#1:5859\n3925#1:5864\n3931#1:5901\n3982#1:5933\n3993#1:5970\n4002#1:5971\n4008#1:5972\n4068#1:5973\n4078#1:5974\n4096#1:5981\n4121#1:5982\n4123#1:5983\n4129#1:5990\n4138#1:5991\n4146#1:5992\n4010#1:5997\n4017#1:6034\n4022#1:6035\n4037#1:6036\n4051#1:6037\n4056#1:6044\n4032#1:6049\n4328#1:6078\n4336#1:6115\n4352#1:6122\n4368#1:6129\n4371#1:6130\n4386#1:6175\n4413#1:6231\n4421#1:6268\n4431#1:6269\n4439#1:6270\n4443#1:6271\n4457#1:6316\n4472#1:6368\n4512#1:6461\n4533#1:6462\n4538#1:6463\n4546#1:6470\n4551#1:6506\n4556#1:6507\n4581#1:6514\n4586#1:6515\n3870#1:5035\n3870#1:5036,4\n3870#1:5043,2\n3870#1:5049\n4248#1:5215\n4248#1:5216,4\n4248#1:5223,2\n4248#1:5229\n3870#1:5040,3\n3870#1:5046,3\n3872#1:5050,6\n3960#1:5059,6\n3961#1:5065,6\n3962#1:5071,6\n4237#1:5161,6\n4238#1:5167,6\n4239#1:5173,6\n4240#1:5179,6\n4241#1:5185,6\n4242#1:5191,6\n4244#1:5197,6\n4245#1:5203,6\n4246#1:5209,6\n4248#1:5220,3\n4248#1:5226,3\n4691#1:5560,6\n3902#1:5849,6\n3932#1:5902,6\n4082#1:5975,6\n4099#1:5984,6\n4040#1:6038,6\n4340#1:6116,6\n4356#1:6123,6\n4385#1:6169,6\n4390#1:6212,6\n4456#1:6310,6\n4461#1:6353,6\n4480#1:6405,6\n4499#1:6451,6\n4518#1:6464,6\n4549#1:6508,6\n4566#1:6516,6\n3870#1:5045\n4248#1:5225\n3964#1:5077\n3964#1:5078,5\n3964#1:5111\n3964#1:5118\n4167#1:5119\n4167#1:5120,5\n4167#1:5153\n4167#1:5160\n4288#1:5230\n4288#1:5231,6\n4288#1:5265\n4288#1:5438\n4629#1:5439\n4629#1:5440,6\n4629#1:5474\n4629#1:5559\n3789#1:5648\n3789#1:5649,6\n3789#1:5683\n3789#1:5687\n3831#1:5692\n3831#1:5693,6\n3831#1:5727\n3831#1:5731\n3847#1:5735\n3847#1:5736,6\n3847#1:5770\n3847#1:5774\n3922#1:5865\n3922#1:5866,6\n3922#1:5900\n3922#1:5911\n3933#1:5912,12\n3960#1:5924\n3960#1:5925,2\n3961#1:5927\n3961#1:5928,2\n3962#1:5930\n3962#1:5931,2\n4237#1:6050\n4237#1:6051,2\n4238#1:6053\n4238#1:6054,2\n4239#1:6056\n4239#1:6057,2\n4240#1:6059\n4240#1:6060,2\n4241#1:6062\n4241#1:6063,2\n4242#1:6065\n4242#1:6066,2\n4244#1:6068\n4244#1:6069,2\n4245#1:6071\n4245#1:6072,2\n4246#1:6074\n4246#1:6075,2\n*E\n"})
public final class MainKt {
    @NotNull
    public static final String APP_VERSION = "v26.01.18";
    @NotNull
    public static final String ACTIVATION_SECRET_KEY = "remarkable_koreader_installer_activation_secret_key_ga_v26.01.18";
    public static final int TRIAL_DURATION_DAYS = 90;
    public static final boolean DESKTOP_MODE = true;
    @NotNull
    public static final String DEVICE_HOME = "/home/root";
    @NotNull
    public static final String DEVICE_XOVI_DIR = "/home/root/xovi";
    @NotNull
    public static final String DEVICE_EXTENSIONS_DIR = "/home/root/xovi/extensions.d";
    @NotNull
    public static final String DEVICE_APPLOAD_DIR = "/home/root/xovi/exthome/appload";
    @NotNull
    public static final String DEVICE_SHIMS_DIR = "/home/root/shims";
    @NotNull
    public static final String DEVICE_TRIPLETAP_DIR = "/home/root/xovi-tripletap";
    @NotNull
    public static final String DEVICE_BACKUP_DIR = "/opt/backup";
    @NotNull
    public static final String DEVICE_CONFIG_FILE = "/home/root/.config/remarkable/xochitl.conf";
    @NotNull
    private static final ProvidableCompositionLocal<MonotonicFrameClock> LocalMonotonicFrameClock = CompositionLocalKt.staticCompositionLocalOf(MainKt::LocalMonotonicFrameClock$lambda$0);
    @NotNull
    private static final ActivationManager activationManager = new ActivationManager();

    @NotNull
    public static final ProvidableCompositionLocal<MonotonicFrameClock> getLocalMonotonicFrameClock() {
        return LocalMonotonicFrameClock;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Nullable
    public static final Painter loadWindowIcon() {
        Painter painter;
        try {
            BitmapPainter bitmapPainter;
            InputStream resourceStream;
            InputStream inputStream = resourceStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("book.png");
            if (inputStream != null) {
                Closeable closeable = inputStream;
                Throwable throwable = null;
                try {
                    InputStream stream = (InputStream)closeable;
                    boolean bl = false;
                    byte[] bytes = ByteStreamsKt.readBytes(stream);
                    BitmapPainter bitmapPainter2 = new BitmapPainter(SkiaImageAsset_skikoKt.toComposeImageBitmap(Image.Companion.makeFromEncoded(bytes)), 0L, 0L, 6, null);
                    bitmapPainter = bitmapPainter2;
                }
                catch (Throwable throwable2) {
                    throwable = throwable2;
                    throw throwable2;
                }
                finally {
                    CloseableKt.closeFinally(closeable, throwable);
                }
            } else {
                bitmapPainter = null;
            }
            painter = bitmapPainter;
        }
        catch (Exception e) {
            painter = null;
        }
        return painter;
    }

    @NotNull
    public static final Path getApplicationBaseDirectory() {
        Path jarPath = Paths.get(InstallationJob.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParent();
        Path path = jarPath;
        if (path == null) {
            Path path2 = Paths.get(System.getProperty("user.dir"), new String[0]);
            path = path2;
            Intrinsics.checkNotNullExpressionValue(path2, "get(...)");
        }
        return path;
    }

    @NotNull
    public static final Map<String, Map<String, String>> getLocalDependencyFiles() {
        Path baseDir = MainKt.getApplicationBaseDirectory();
        Path depsDir = baseDir.resolve("dependencies");
        Pair[] pairArray = new Pair[2];
        Pair[] pairArray2 = new Pair[]{TuplesKt.to("xovi_extensions", ((Object)depsDir.resolve("arm32/extensions-arm32-testing.zip")).toString()), TuplesKt.to("appload", ((Object)depsDir.resolve("arm32/appload-arm32.zip")).toString()), TuplesKt.to("xovi_binary", ((Object)depsDir.resolve("arm32/xovi-arm32.so")).toString())};
        pairArray[0] = TuplesKt.to("arm32", MapsKt.mapOf(pairArray2));
        pairArray2 = new Pair[]{TuplesKt.to("xovi_extensions", ((Object)depsDir.resolve("aarch64/extensions-aarch64.zip")).toString()), TuplesKt.to("appload", ((Object)depsDir.resolve("aarch64/appload-aarch64.zip")).toString()), TuplesKt.to("xovi_binary", ((Object)depsDir.resolve("aarch64/xovi-aarch64.so")).toString())};
        pairArray[1] = TuplesKt.to("aarch64", MapsKt.mapOf(pairArray2));
        return MapsKt.mapOf(pairArray);
    }

    @NotNull
    public static final Map<String, String> getLocalCommonFiles() {
        Path baseDir = MainKt.getApplicationBaseDirectory();
        Path depsDir = baseDir.resolve("dependencies/common");
        return MapsKt.mapOf(TuplesKt.to("xovi_tripletap", ((Object)depsDir.resolve("xovi-tripletap-main.zip")).toString()));
    }

    @NotNull
    public static final Map<String, String> getKOReaderLocalFiles() {
        Path baseDir = MainKt.getApplicationBaseDirectory();
        Pair[] pairArray = new Pair[]{TuplesKt.to("remarkable-paper-pro-move", ((Object)baseDir.resolve("nightly/koreader-remarkable-aarch64-v2025.10-29-g55bf6c9c5_2025-11-20.zip")).toString()), TuplesKt.to("remarkable-paper-pro", ((Object)baseDir.resolve("nightly/koreader-remarkable-aarch64-v2025.10-29-g55bf6c9c5_2025-11-20.zip")).toString()), TuplesKt.to("remarkable-2", ((Object)baseDir.resolve("stable/koreader-remarkable-v2025.10-29-g55bf6c9c5_2025-11-20.zip")).toString())};
        return MapsKt.mapOf(pairArray);
    }

    @Nullable
    public static final Path findPatchesDirectory(@NotNull String architecture, @Nullable InstallationJob job) {
        Intrinsics.checkNotNullParameter(architecture, "architecture");
        Path baseDir = MainKt.getApplicationBaseDirectory();
        boolean isArm32 = StringsKt.contains$default((CharSequence)architecture, "armv7", false, 2, null) || StringsKt.contains$default((CharSequence)architecture, "armhf", false, 2, null) || StringsKt.contains$default((CharSequence)architecture, "armv6", false, 2, null) || Intrinsics.areEqual(architecture, "arm32");
        String primaryPatchDir = isArm32 ? "patch32" : "patch";
        String logMessage = "Architecture: " + architecture + " -> Using patch directory: " + primaryPatchDir;
        if (job != null) {
            job.addLog(logMessage);
        } else {
            GlobalState.INSTANCE.addLog(logMessage);
        }
        Path[] pathArray = new Path[]{baseDir.resolve(primaryPatchDir), baseDir.resolve("patch")};
        List<Path> possibleDirs = CollectionsKt.listOf(pathArray);
        for (Path dirPath : possibleDirs) {
            String checkMessage = "Checking for patches directory: " + dirPath;
            if (job != null) {
                job.addLog(checkMessage);
            } else {
                GlobalState.INSTANCE.addLog(checkMessage);
            }
            Intrinsics.checkNotNull(dirPath);
            LinkOption[] linkOptionArray = new LinkOption[]{};
            if (!Files.exists(dirPath, Arrays.copyOf(linkOptionArray, linkOptionArray.length))) continue;
            LinkOption[] linkOptionArray2 = new LinkOption[]{};
            if (!Files.isDirectory(dirPath, Arrays.copyOf(linkOptionArray2, linkOptionArray2.length))) continue;
            String foundMessage = "Found patches directory: " + dirPath;
            if (job != null) {
                job.addLog(foundMessage);
            } else {
                GlobalState.INSTANCE.addLog(foundMessage);
            }
            return dirPath;
        }
        String notFoundMessage = "No patches directory found (checked " + primaryPatchDir + " and patch)";
        if (job != null) {
            job.addLog(notFoundMessage);
        } else {
            GlobalState.INSTANCE.addLog(notFoundMessage);
        }
        return null;
    }

    public static /* synthetic */ Path findPatchesDirectory$default(String string, InstallationJob installationJob, int n, Object object) {
        if ((n & 2) != 0) {
            installationJob = null;
        }
        return MainKt.findPatchesDirectory(string, installationJob);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final boolean verifyLocalFile(@NotNull String filepath, @NotNull InstallationJob job, long minSize) {
        block12: {
            Intrinsics.checkNotNullParameter(filepath, "filepath");
            Intrinsics.checkNotNullParameter(job, "job");
            Path path = Paths.get(filepath, new String[0]);
            Intrinsics.checkNotNull(path);
            LinkOption[] linkOptionArray = new LinkOption[]{};
            if (!Files.exists(path, Arrays.copyOf(linkOptionArray, linkOptionArray.length))) {
                throw new Exception("Required file not found: " + filepath + "\nPlease ensure all dependency files are in the correct location.");
            }
            long fileSize = Files.size(path);
            if (fileSize < minSize) {
                throw new Exception("File is too small (may be corrupted): " + filepath + "\nSize: " + fileSize + " bytes (expected at least " + minSize + " bytes)");
            }
            if (StringsKt.endsWith$default(filepath, ".zip", false, 2, null)) {
                try {
                    Closeable closeable = new ZipFile(filepath);
                    Throwable throwable = null;
                    try {
                        ZipFile zf = (ZipFile)closeable;
                        boolean bl = false;
                        Enumeration<? extends ZipEntry> enumeration = zf.entries();
                        Intrinsics.checkNotNullExpressionValue(enumeration, "entries(...)");
                        ArrayList<? extends ZipEntry> arrayList = Collections.list(enumeration);
                        Intrinsics.checkNotNullExpressionValue(arrayList, "list(...)");
                        List entries = arrayList;
                        if (entries.isEmpty()) {
                            throw new Exception("ZIP file is empty");
                        }
                        job.addLog("\u2713 Verified ZIP file: " + path.getFileName() + " (" + entries.size() + " files inside)");
                        Unit unit = Unit.INSTANCE;
                        break block12;
                    }
                    catch (Throwable throwable2) {
                        throwable = throwable2;
                        throw throwable2;
                    }
                    finally {
                        CloseableKt.closeFinally(closeable, throwable);
                    }
                }
                catch (Exception e) {
                    String string = e.getMessage();
                    boolean bl = string != null ? StringsKt.contains$default((CharSequence)string, "ZIP file is empty", false, 2, null) : false;
                    if (bl) {
                        throw e;
                    }
                    throw new Exception("File is not a valid ZIP archive: " + filepath);
                }
            }
            double fileSizeKb = (double)fileSize / 1024.0;
            Path path2 = path.getFileName();
            String string = "%.1f";
            Object[] objectArray = new Object[]{fileSizeKb};
            String string2 = String.format(string, Arrays.copyOf(objectArray, objectArray.length));
            Intrinsics.checkNotNullExpressionValue(string2, "format(...)");
            job.addLog("\u2713 Verified binary file: " + path2 + " (" + string2 + " KB)");
        }
        return true;
    }

    public static /* synthetic */ boolean verifyLocalFile$default(String string, InstallationJob installationJob, long l, int n, Object object) {
        if ((n & 4) != 0) {
            l = 1024L;
        }
        return MainKt.verifyLocalFile(string, installationJob, l);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public static final void extractZip(@NotNull String sourcePath, @NotNull String destPath, @NotNull InstallationJob job) {
        Intrinsics.checkNotNullParameter(sourcePath, "sourcePath");
        Intrinsics.checkNotNullParameter(destPath, "destPath");
        Intrinsics.checkNotNullParameter(job, "job");
        job.addLog("Extracting " + Paths.get(sourcePath, new String[0]).getFileName());
        try {
            Closeable closeable = new ZipFile(sourcePath);
            Throwable throwable = null;
            try {
                void $this$forEach$iv;
                ZipFile zip = (ZipFile)closeable;
                boolean bl = false;
                Path destDir = Paths.get(destPath, new String[0]);
                Intrinsics.checkNotNull(destDir);
                LinkOption[] linkOptionArray = new LinkOption[]{};
                if (!Files.exists(destDir, Arrays.copyOf(linkOptionArray, linkOptionArray.length))) {
                    Files.createDirectories(destDir, new FileAttribute[0]);
                }
                Enumeration<? extends ZipEntry> enumeration = zip.entries();
                Intrinsics.checkNotNullExpressionValue(enumeration, "entries(...)");
                Sequence<? extends ZipEntry> sequence = SequencesKt.asSequence(CollectionsKt.iterator(enumeration));
                boolean $i$f$forEach = false;
                for (Object element$iv : $this$forEach$iv) {
                    ZipEntry entry = (ZipEntry)element$iv;
                    boolean bl2 = false;
                    Path entryPath = destDir.resolve(entry.getName());
                    if (entry.isDirectory()) {
                        Files.createDirectories(entryPath, new FileAttribute[0]);
                        continue;
                    }
                    Files.createDirectories(entryPath.getParent(), new FileAttribute[0]);
                    Closeable closeable2 = zip.getInputStream(entry);
                    Throwable throwable2 = null;
                    try {
                        InputStream input = (InputStream)closeable2;
                        boolean bl3 = false;
                        CopyOption[] copyOptionArray = new CopyOption[]{StandardCopyOption.REPLACE_EXISTING};
                        Files.copy(input, entryPath, copyOptionArray);
                        Unit unit = Unit.INSTANCE;
                    }
                    catch (Throwable throwable3) {
                        throwable2 = throwable3;
                        throw throwable3;
                    }
                    finally {
                        CloseableKt.closeFinally(closeable2, throwable2);
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
            catch (Throwable throwable4) {
                throwable = throwable4;
                throw throwable4;
            }
            finally {
                CloseableKt.closeFinally(closeable, throwable);
            }
            job.addLog("Extraction complete");
        }
        catch (Exception e) {
            throw new Exception("Failed to extract: " + e.getMessage());
        }
    }

    @NotNull
    public static final ActivationManager getActivationManager() {
        return activationManager;
    }

    @NotNull
    public static final Map<String, String> loadLocalInstallationFiles(@NotNull String archKey, @NotNull InstallationConfig config, @NotNull InstallationJob job) {
        Intrinsics.checkNotNullParameter(archKey, "archKey");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(job, "job");
        job.addLog("Loading installation files from local directories...");
        Map downloadedFiles = new LinkedHashMap();
        Map<String, Map<String, String>> localFiles = MainKt.getLocalDependencyFiles();
        Map<String, String> commonFiles = MainKt.getLocalCommonFiles();
        if (!localFiles.containsKey(archKey)) {
            throw new Exception("Unknown architecture: " + archKey);
        }
        Map<String, String> map = localFiles.get(archKey);
        Intrinsics.checkNotNull(map);
        Map<String, String> archFiles = map;
        job.addLog("Loading XOVI extensions...");
        String string = archFiles.get("xovi_extensions");
        Intrinsics.checkNotNull(string);
        String xoviExtFile = string;
        MainKt.verifyLocalFile(xoviExtFile, job, 400000L);
        downloadedFiles.put("xovi_extensions", xoviExtFile);
        job.addLog("Loading AppLoad launcher...");
        String string2 = archFiles.get("appload");
        Intrinsics.checkNotNull(string2);
        String apploadFile = string2;
        MainKt.verifyLocalFile(apploadFile, job, 100000L);
        downloadedFiles.put("appload", apploadFile);
        job.addLog("Loading XOVI binary...");
        String string3 = archFiles.get("xovi_binary");
        Intrinsics.checkNotNull(string3);
        String xoviBinFile = string3;
        MainKt.verifyLocalFile(xoviBinFile, job, 50000L);
        downloadedFiles.put("xovi_binary", xoviBinFile);
        String[] stringArray = new String[]{"full", "stage2"};
        if (CollectionsKt.listOf(stringArray).contains(config.getInstallationType())) {
            job.addLog("Loading KOReader from local files...");
            Map<String, String> koreaderFiles = MainKt.getKOReaderLocalFiles();
            String string4 = koreaderFiles.get(config.getDeviceModel());
            if (string4 == null) {
                throw new Exception("Unknown device model: " + config.getDeviceModel());
            }
            String localKoreaderPath = string4;
            job.addLog("Using local KOReader file: " + localKoreaderPath);
            if (!new File(localKoreaderPath).exists()) {
                throw new Exception("KOReader file not found: " + localKoreaderPath);
            }
            long fileSize = new File(localKoreaderPath).length();
            double fileSizeMb = (double)fileSize / 1048576.0;
            String string5 = "%.2f";
            Object[] objectArray = new Object[]{fileSizeMb};
            String string6 = String.format(string5, Arrays.copyOf(objectArray, objectArray.length));
            Intrinsics.checkNotNullExpressionValue(string6, "format(...)");
            job.addLog("Local file size: " + string6 + " MB");
            if (fileSize < 0x100000L) {
                string5 = "%.2f";
                objectArray = new Object[]{fileSizeMb};
                String string7 = String.format(string5, Arrays.copyOf(objectArray, objectArray.length));
                Intrinsics.checkNotNullExpressionValue(string7, "format(...)");
                throw new Exception("KOReader file is too small (" + string7 + " MB) - file may be corrupted");
            }
            job.addLog("\u2713 Local KOReader file verified");
            downloadedFiles.put("koreader", localKoreaderPath);
        }
        if (config.getEnableTripletap()) {
            job.addLog("Loading xovi-tripletap...");
            String string8 = commonFiles.get("xovi_tripletap");
            Intrinsics.checkNotNull(string8);
            String tripletapFile = string8;
            MainKt.verifyLocalFile(tripletapFile, job, 50000L);
            downloadedFiles.put("tripletap", tripletapFile);
        }
        job.addLog("\u2713 All installation files loaded and verified");
        return downloadedFiles;
    }

    @NotNull
    public static final String createBackup(@NotNull SSHOperations sshOps) {
        Intrinsics.checkNotNullParameter(sshOps, "sshOps");
        InstallationJob job = sshOps.getJob();
        job.addLog("Creating system backup with restore script...");
        String backupName = "koreader_backup_" + System.currentTimeMillis() / (long)1000;
        String backupPath = "/home/root/" + backupName;
        SSHOperations.executeCommand$default(sshOps, "mkdir -p " + backupPath, 0, 0, 6, null);
        String backupCmd = StringsKt.trimIndent("\nset -e\nBACKUP_PATH=" + backupPath + "\n\nif [ -d /home/root/xovi ]; then\n    cp -r /home/root/xovi ${BACKUP_PATH}/xovi_backup\nfi\n\nif [ -d /home/root/shims ]; then\n    cp -r /home/root/shims ${BACKUP_PATH}/shims_backup\nfi\n\nif [ -f /home/root/.config/remarkable/xochitl.conf ]; then\n    mkdir -p ${BACKUP_PATH}/config\n    cp /home/root/.config/remarkable/xochitl.conf ${BACKUP_PATH}/config/\nfi\n\ncat > ${BACKUP_PATH}/restore.sh << 'RESTORE_EOF'\n#!/bin/bash\necho 'Starting system restore...'\nsystemctl stop xochitl\nrm -rf /home/root/xovi /home/root/shims\nif [ -d ./xovi_backup ]; then\n    cp -r ./xovi_backup /home/root/xovi\nfi\nif [ -d ./shims_backup ]; then\n    cp -r ./shims_backup /home/root/shims\nfi\nsystemctl restart xochitl\necho 'Restore completed!'\nRESTORE_EOF\n\nchmod +x ${BACKUP_PATH}/restore.sh\necho \"Backup created at ${BACKUP_PATH}\"\n");
        SSHOperations.executeCommand$default(sshOps, backupCmd, 0, 0, 6, null);
        job.addLog("Backup created: " + backupName);
        return backupName;
    }

    public static final void installTripletap(@NotNull SSHOperations sshOps, @NotNull Map<String, String> downloadedFiles) {
        Intrinsics.checkNotNullParameter(sshOps, "sshOps");
        Intrinsics.checkNotNullParameter(downloadedFiles, "downloadedFiles");
        InstallationJob job = sshOps.getJob();
        if (!downloadedFiles.containsKey("tripletap")) {
            throw new Exception("Tripletap file not available");
        }
        job.addLog("Installing xovi-tripletap power button handler...");
        String tripletapRemotePath = "/home/root/xovi-tripletap.zip";
        String string = downloadedFiles.get("tripletap");
        Intrinsics.checkNotNull(string);
        SSHOperations.copyFile$default(sshOps, string, tripletapRemotePath, 0, 4, null);
        String installCmd = "set -e\ncd /home/root\n\nrm -rf xovi-tripletap 2>/dev/null || true\nrm -rf xovi-tripletap-main 2>/dev/null || true\n\nmkdir -p xovi-tripletap\nunzip -q -o xovi-tripletap.zip\n\nif [ -d \"xovi-tripletap-main\" ]; then\n    SOURCE_DIR=\"xovi-tripletap-main\"\nelse\n    SOURCE_DIR=$(find . -maxdepth 1 -name \"*tripletap*\" -type d | grep -v \"^./xovi-tripletap$\" | head -1)\nfi\n\necho \"Source directory: $SOURCE_DIR\"\n\nif [ -n \"$SOURCE_DIR\" ] && [ -d \"$SOURCE_DIR\" ]; then\n    cp \"$SOURCE_DIR\"/* xovi-tripletap/ 2>/dev/null || true\n    rm -rf \"$SOURCE_DIR\"\n    echo \"Files extracted successfully\"\nelse\n    echo \"Error: Could not find extracted directory\"\n    exit 1\nfi\n\ncd xovi-tripletap\n\nARCH=$(uname -m)\nif [ \"$ARCH\" = \"aarch64\" ]; then\n    EVTEST_ARCH=\"arm64\"\nelse\n    EVTEST_ARCH=\"arm32\"\nfi\n\necho \"Detected architecture: $ARCH, using evtest.$EVTEST_ARCH\"\n\nif [ -f \"evtest.$EVTEST_ARCH\" ]; then\n    cp \"evtest.$EVTEST_ARCH\" evtest\n    chmod +x evtest\n    echo \"Configured evtest binary for $EVTEST_ARCH\"\nelse\n    echo \"Warning: evtest.$EVTEST_ARCH not found, will rely on system evtest\"\nfi\n\nchmod +x main.sh 2>/dev/null || true\nchmod +x enable.sh 2>/dev/null || true\nchmod +x uninstall.sh 2>/dev/null || true\n\necho \"Tripletap files prepared successfully\"";
        SSHOperations.executeCommand$default(sshOps, installCmd, 0, 0, 6, null);
        String mainScriptCmd = "cat > /home/root/xovi-tripletap/main.sh << 'MAIN_SCRIPT_EOF'\n#!/bin/bash\n\nDEVICE_FILE=\"/dev/input/event0\"\nLOG_FILE=\"/tmp/xovi-tripletap.log\"\n\nlog_message() {\n    echo \"$(date): $1\" >> \"$LOG_FILE\"\n}\n\napply_ethernet_fix() {\n    log_message \"Applying robust USB ethernet fix with duplicate detection...\"\n    \n    modprobe g_ether 2>/dev/null || log_message \"g_ether module load failed (may already be loaded)\"\n    \n    USB_INTERFACES_WITH_IP=$(ip addr show | grep -B2 '10.11.99.1' | grep -E '^[0-9]+: usb[0-9]+:' | cut -d: -f2 | tr -d ' ')\n    \n    if [ -n \"$USB_INTERFACES_WITH_IP\" ]; then\n        INTERFACE_COUNT=$(echo \"$USB_INTERFACES_WITH_IP\" | wc -l)\n        \n        if [ $INTERFACE_COUNT -gt 1 ]; then\n            log_message \"Found duplicate IP 10.11.99.1 on $INTERFACE_COUNT USB interfaces - fixing...\"\n            \n            KEEP_INTERFACE=$(echo \"$USB_INTERFACES_WITH_IP\" | sort -V | tail -n1)\n            log_message \"Keeping interface: $KEEP_INTERFACE\"\n            \n            for iface in $USB_INTERFACES_WITH_IP; do\n                if [ \"$iface\" != \"$KEEP_INTERFACE\" ]; then\n                    log_message \"Removing duplicate IP from $iface\"\n                    ip link set $iface down 2>/dev/null || true\n                    ip addr del 10.11.99.1/27 dev $iface 2>/dev/null || true\n                    log_message \"Fixed: $iface interface down and IP removed\"\n                fi\n            done\n            \n            ip link set $KEEP_INTERFACE up 2>/dev/null || log_message \"Warning: Could not bring up $KEEP_INTERFACE\"\n            log_message \"Robust ethernet fix completed - using $KEEP_INTERFACE\"\n        else\n            log_message \"Single USB interface $USB_INTERFACES_WITH_IP already has IP 10.11.99.1 - ensuring it's up\"\n            ip link set $USB_INTERFACES_WITH_IP up 2>/dev/null || log_message \"Warning: Could not bring up $USB_INTERFACES_WITH_IP\"\n        fi\n    else\n        log_message \"No USB interfaces found with IP 10.11.99.1 - configuring usb0\"\n        ip link set usb0 up 2>/dev/null || log_message \"usb0 interface up failed\"\n        ip addr add 10.11.99.1/27 dev usb0 2>/dev/null || log_message \"IP configuration completed (may already exist)\"\n        log_message \"Fallback configuration applied to usb0\"\n    fi\n    \n    log_message \"Robust ethernet fix applied successfully\"\n}\n\nlaunch_xovi() {\n    log_message \"Triple-tap detected! Launching XOVI and applying ethernet fix...\"\n    \n    apply_ethernet_fix\n    \n    /home/root/xovi/start 2>&1 | while read line; do\n        log_message \"XOVI: $line\"\n    done\n    \n    log_message \"XOVI launch completed\"\n}\n\nlog_message \"xovi-tripletap service started with ethernet fix integration\"\n\nwhile true; do\n    if [ -c \"$DEVICE_FILE\" ]; then\n        /usr/bin/evtest \"$DEVICE_FILE\" 2>/dev/null | while read line; do\n            if echo \"$line\" | grep -q \"KEY_POWER.*value 1\"; then\n                log_message \"Power button press detected\"\n                \n                count=1\n                start_time=$(date +%s)\n                \n                while [ $count -lt 3 ]; do\n                    if read -t 2 next_line; then\n                        if echo \"$next_line\" | grep -q \"KEY_POWER.*value 1\"; then\n                            count=$((count + 1))\n                            log_message \"Power button press $count detected\"\n                        fi\n                    else\n                        break\n                    fi\n                done\n                \n                if [ $count -eq 3 ]; then\n                    current_time=$(date +%s)\n                    elapsed=$((current_time - start_time))\n                    \n                    if [ $elapsed -le 3 ]; then\n                        launch_xovi\n                        sleep 5\n                    fi\n                fi\n            fi\n        done\n    else\n        log_message \"Device file $DEVICE_FILE not found, retrying in 5 seconds...\"\n        sleep 5\n    fi\ndone\nMAIN_SCRIPT_EOF\n\nchmod +x /home/root/xovi-tripletap/main.sh\necho \"Enhanced main.sh created successfully\"\n\nrm -f /home/root/xovi-tripletap.zip\n\necho \"xovi-tripletap files installation completed - service installation will follow\"";
        SSHOperations.executeCommand$default(sshOps, mainScriptCmd, 0, 0, 6, null);
        job.addLog("xovi-tripletap files prepared successfully");
        job.addLog("Installing and enabling xovi-tripletap systemd service...");
        String serviceInstallCmd = "cd /home/root/xovi-tripletap\n\nif grep -qE \"reMarkable (Ferrari|Chiappa)\" /proc/device-tree/model 2>/dev/null; then\n    echo \"Detected reMarkable Paper Pro family - remounting filesystem for write access...\"\n    mount -o remount,rw /\n    umount -R /etc || true\n    echo \"Filesystem remounted successfully\"\n    \n    echo \"Allowing filesystem to stabilize...\"\n    sleep 3\nfi\n\nif [ -f xovi-tripletap.service ]; then\n    cp xovi-tripletap.service /etc/systemd/system/\n    echo \"Service file copied to /etc/systemd/system/\"\nelse\n    echo \"WARNING: xovi-tripletap.service file not found, creating default service\"\n    cat > /etc/systemd/system/xovi-tripletap.service << 'SERVICE_EOF'\n[Unit]\nDescription=XOVI Triple-Tap Power Button Handler\nAfter=multi-user.target\n\n[Service]\nType=simple\nExecStart=/home/root/xovi-tripletap/main.sh\nRestart=always\nRestartSec=10\nStandardOutput=journal\nStandardError=journal\n\n[Install]\nWantedBy=multi-user.target\nSERVICE_EOF\n    echo \"Default service file created\"\nfi\n\necho \"Reloading systemd daemon...\"\nsystemctl daemon-reload\n\necho \"Enabling and starting xovi-tripletap service...\"\nsystemctl enable xovi-tripletap\nsystemctl start xovi-tripletap\n\necho \"xovi-tripletap service installation completed\"";
        SSHOperations.executeCommand$default(sshOps, serviceInstallCmd, 0, 0, 6, null);
        job.addLog("xovi-tripletap systemd service installed");
        job.addLog("Verifying xovi-tripletap service status...");
        job.addLog("Allowing Paper Pro filesystem to fully stabilize...");
        Thread.sleep(3000L);
        Triple verifyResult = SSHOperations.executeCommand$default(sshOps, "systemctl is-active xovi-tripletap", 0, 0, 6, null);
        String string2 = ((String)verifyResult.getFirst()).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
        if (StringsKt.contains$default((CharSequence)string2, "active", false, 2, null)) {
            job.addLog("\u2713 xovi-tripletap service is ACTIVE and running");
            job.addLog("Triple-press power button to launch XOVI");
        } else {
            job.addLog("\u26a0 WARNING: xovi-tripletap service may not be running properly");
            job.addLog("Checking service status...");
            Triple statusResult = SSHOperations.executeCommand$default(sshOps, "systemctl status xovi-tripletap --no-pager", 0, 0, 6, null);
            job.addLog("Service status: " + statusResult.getFirst());
        }
    }

    public static final void applyEthernetFix(@NotNull SSHOperations sshOps) {
        Intrinsics.checkNotNullParameter(sshOps, "sshOps");
        InstallationJob job = sshOps.getJob();
        job.addLog("Applying USB ethernet safety fix...");
        String fixCmd = "modprobe g_ether 2>/dev/null || true\nUSB_INTERFACES=$(ip addr show | grep -B2 '10.11.99.1' | grep -E '^[0-9]+: usb[0-9]+:' | cut -d: -f2 | tr -d ' ')\n\nif [ -n \"$USB_INTERFACES\" ]; then\n    INTERFACE_COUNT=$(echo \"$USB_INTERFACES\" | wc -l)\n    if [ $INTERFACE_COUNT -gt 1 ]; then\n        KEEP_INTERFACE=$(echo \"$USB_INTERFACES\" | sort -V | tail -n1)\n        for iface in $USB_INTERFACES; do\n            if [ \"$iface\" != \"$KEEP_INTERFACE\" ]; then\n                ip link set $iface down 2>/dev/null || true\n                ip addr del 10.11.99.1/27 dev $iface 2>/dev/null || true\n            fi\n        done\n        ip link set $KEEP_INTERFACE up 2>/dev/null || true\n    fi\nelse\n    ip link set usb0 up 2>/dev/null || true\n    ip addr add 10.11.99.1/27 dev usb0 2>/dev/null || true\nfi\necho \"Ethernet fix applied\"";
        try {
            SSHOperations.executeCommand$default(sshOps, fixCmd, 0, 0, 6, null);
            job.addLog("USB ethernet safety fix applied successfully");
        }
        catch (Exception e) {
            job.addLog("Warning: Ethernet fix encountered issues: " + e.getMessage());
        }
    }

    /*
     * Unable to fully structure code
     */
    public static final void applyPatches(@NotNull SSHOperations sshOps) {
        block45: {
            block44: {
                Intrinsics.checkNotNullParameter(sshOps, "sshOps");
                job = sshOps.getJob();
                job.addLog("Checking for patches to apply...");
                patchesDir = MainKt.findPatchesDirectory(job.getState().getArchitecture(), job);
                if (patchesDir == null) {
                    job.addLog("No patches directory found - skipping patch application");
                    return;
                }
                xoviPatchDir = patchesDir.resolve("xovi");
                shimsPatchDir = patchesDir.resolve("shims");
                patchesApplied = false;
                successfulPatches = 0;
                failedPatches = 0;
                Intrinsics.checkNotNull(xoviPatchDir);
                v0 = new LinkOption[]{};
                if (!Files.exists(xoviPatchDir, Arrays.copyOf(v0, v0.length))) ** GOTO lbl-1000
                v1 = new LinkOption[]{};
                if (Files.isDirectory(xoviPatchDir, Arrays.copyOf(v1, v1.length))) {
                    job.addLog("Found xovi patches - applying...");
                    try {
                        v2 = xoviPatchDir.toFile();
                        Intrinsics.checkNotNullExpressionValue(v2, "toFile(...)");
                        xoviFiles = SequencesKt.toList(SequencesKt.filter(FilesKt.walkTopDown(v2), (Function1<File, Boolean>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, applyPatches$lambda$0(java.io.File ), (Ljava/io/File;)Ljava/lang/Boolean;)()));
                        if (((Collection)xoviFiles).isEmpty() == false) {
                            totalFiles = xoviFiles.size();
                            job.addLog("Found " + totalFiles + " file(s) to patch in xovi directory");
                            $this$forEachIndexed$iv = xoviFiles;
                            $i$f$forEachIndexed = false;
                            index$iv = 0;
                            for (T item$iv : $this$forEachIndexed$iv) {
                                if ((var15_27 = index$iv++) < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                var16_29 = (File)item$iv;
                                idx = var15_27;
                                $i$a$-forEachIndexed-MainKt$applyPatches$1 = false;
                                try {
                                    relPath = xoviPatchDir.relativize(file.toPath());
                                    relPathStr = StringsKt.replace$default(relPath.toString(), '\\', '/', false, 4, null);
                                    remotePath = "/home/root/xovi/" + relPathStr;
                                    job.addLog("Patching (" + (idx + 1) + "/" + totalFiles + "): " + relPathStr);
                                    remoteDir = StringsKt.substringBeforeLast$default(remotePath, '/', null, 2, null);
                                    if (((CharSequence)remoteDir).length() > 0) {
                                        SSHOperations.executeCommand$default(sshOps, "mkdir -p " + remoteDir, 0, 3, 2, null);
                                    }
                                    if (idx > 0) {
                                        Thread.sleep(500L);
                                    }
                                    v3 = file.getAbsolutePath();
                                    Intrinsics.checkNotNullExpressionValue(v3, "getAbsolutePath(...)");
                                    SSHOperations.copyFile$default(sshOps, v3, remotePath, 0, 4, null);
                                    extension = FilesKt.getExtension((File)file);
                                    name = file.getName();
                                    if (Intrinsics.areEqual(extension, "sh") || ((CharSequence)extension).length() == 0 || CollectionsKt.listOf(var25_45 = new String[]{"start", "stop", "rebuild-hashtable"}).contains(name)) {
                                        SSHOperations.executeCommand$default(sshOps, "chmod +x " + remotePath, 0, 2, 2, null);
                                    }
                                    var25_44 = successfulPatches;
                                    successfulPatches = var25_44 + 1;
                                }
                                catch (Exception e) {
                                    ++failedPatches;
                                    job.addLog("Warning: Failed to patch " + (File)file + ": " + e.getMessage());
                                }
                            }
                            if (successfulPatches > 0) {
                                job.addLog("XOVI patches applied: " + successfulPatches + " successful, " + failedPatches + " failed");
                                patchesApplied = true;
                            } else {
                                job.addLog("Warning: All " + totalFiles + " xovi patch(es) failed to apply");
                            }
                            break block44;
                        }
                        job.addLog("No files found in xovi patches directory");
                    }
                    catch (Exception e) {
                        job.addLog("Warning: Failed to process xovi patches: " + e.getMessage());
                    }
                } else lbl-1000:
                // 2 sources

                {
                    job.addLog("No xovi patches found");
                }
            }
            Intrinsics.checkNotNull(shimsPatchDir);
            v4 = new LinkOption[]{};
            if (!Files.exists(shimsPatchDir, Arrays.copyOf(v4, v4.length))) ** GOTO lbl-1000
            v5 = new LinkOption[]{};
            if (Files.isDirectory(shimsPatchDir, Arrays.copyOf(v5, v5.length))) {
                job.addLog("Found shims patches - applying...");
                try {
                    v6 = shimsPatchDir.toFile();
                    Intrinsics.checkNotNullExpressionValue(v6, "toFile(...)");
                    shimsFiles = SequencesKt.toList(SequencesKt.filter(FilesKt.walkTopDown(v6), (Function1<File, Boolean>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, applyPatches$lambda$2(java.io.File ), (Ljava/io/File;)Ljava/lang/Boolean;)()));
                    if (((Collection)shimsFiles).isEmpty() == false) {
                        totalFiles = shimsFiles.size();
                        job.addLog("Found " + totalFiles + " file(s) to patch in shims directory");
                        shimsSuccessful = 0;
                        shimsFailed = 0;
                        $this$forEachIndexed$iv = shimsFiles;
                        $i$f$forEachIndexed = false;
                        index$iv = 0;
                        for (T item$iv : $this$forEachIndexed$iv) {
                            if ((var17_30 = index$iv++) < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            $i$a$-forEachIndexed-MainKt$applyPatches$1 = (File)item$iv;
                            idx = var17_30;
                            $i$a$-forEachIndexed-MainKt$applyPatches$2 = false;
                            try {
                                relPath = shimsPatchDir.relativize(file.toPath());
                                relPathStr = StringsKt.replace$default(relPath.toString(), '\\', '/', false, 4, null);
                                remotePath = "/home/root/shims/" + relPathStr;
                                job.addLog("Patching (" + (idx + 1) + "/" + totalFiles + "): " + relPathStr);
                                remoteDir = StringsKt.substringBeforeLast$default(remotePath, '/', null, 2, null);
                                if (((CharSequence)remoteDir).length() > 0) {
                                    SSHOperations.executeCommand$default(sshOps, "mkdir -p " + remoteDir, 0, 3, 2, null);
                                }
                                if (idx > 0) {
                                    Thread.sleep(500L);
                                }
                                v7 = file.getAbsolutePath();
                                Intrinsics.checkNotNullExpressionValue(v7, "getAbsolutePath(...)");
                                SSHOperations.copyFile$default(sshOps, v7, remotePath, 0, 4, null);
                                if (Intrinsics.areEqual(FilesKt.getExtension((File)file), "so")) {
                                    SSHOperations.executeCommand$default(sshOps, "chmod +x " + remotePath, 0, 2, 2, null);
                                }
                                ++shimsSuccessful;
                                var25_44 = successfulPatches;
                                successfulPatches = var25_44 + 1;
                            }
                            catch (Exception e) {
                                ++shimsFailed;
                                ++failedPatches;
                                job.addLog("Warning: Failed to patch " + (File)file + ": " + e.getMessage());
                            }
                        }
                        if (shimsSuccessful > 0) {
                            job.addLog("Shims patches applied: " + shimsSuccessful + " successful, " + shimsFailed + " failed");
                            patchesApplied = true;
                        } else {
                            job.addLog("Warning: All " + totalFiles + " shims patch(es) failed to apply");
                        }
                        break block45;
                    }
                    job.addLog("No files found in shims patches directory");
                }
                catch (Exception e) {
                    job.addLog("Warning: Failed to process shims patches: " + e.getMessage());
                }
            } else lbl-1000:
            // 2 sources

            {
                job.addLog("No shims patches found");
            }
        }
        if (successfulPatches > 0) {
            failedMsg = failedPatches > 0 ? ", " + failedPatches + " failed" : "";
            job.addLog("\u2713 Patch summary: " + successfulPatches + " file(s) applied successfully" + (String)failedMsg);
        } else if (failedPatches > 0) {
            job.addLog("\u26a0 Warning: All " + failedPatches + " patch file(s) failed to apply");
        } else {
            job.addLog("No patches were applied");
        }
        if (patchesApplied) {
            job.addLog("Patches applied - rebuilding hashtable and restarting XOVI...");
            try {
                job.addLog("Allowing system to settle after file transfers...");
                Thread.sleep(2000L);
                job.addLog("Stopping xochitl...");
                SSHOperations.executeCommand$default(sshOps, "systemctl stop xochitl", 0, 3, 2, null);
                job.addLog("Waiting for xochitl to stop completely...");
                Thread.sleep(3000L);
                job.addLog("Rebuilding hashtable (this may take 30-60 seconds)...");
                sshOps.executeCommand("set -e\ncd /home/root/xovi\nif [ -f ./rebuild-hashtable.sh ]; then\n    chmod +x ./rebuild-hashtable.sh\n    ./rebuild-hashtable.sh\nelse\n    echo \"WARNING: rebuild-hashtable.sh not found\"\nfi", 120, 2);
                job.addLog("Hashtable rebuilt successfully");
                job.addLog("Allowing system to stabilize after hashtable rebuild...");
                Thread.sleep(5000L);
                job.addLog("Starting XOVI...");
                startMaxRetries = 5;
                startSucceeded = false;
                for (startAttempt = 0; startAttempt < startMaxRetries; ++startAttempt) {
                    try {
                        if (startAttempt > 0) {
                            waitTime = 3 * (startAttempt + 1);
                            job.addLog("Retry attempt " + (startAttempt + 1) + "/" + startMaxRetries + ", waiting " + waitTime + "s...");
                            Thread.sleep((long)waitTime * 1000L);
                        }
                        sshOps.executeCommand("cd /home/root/xovi\nif [ -f ./start ]; then\n    chmod +x ./start\n    ./start\nelse\n    echo \"WARNING: start script not found\"\n    systemctl start xochitl\nfi", 60, 1);
                        job.addLog("XOVI started successfully");
                        startSucceeded = true;
                        Thread.sleep(2000L);
                        try {
                            verifyOutput = SSHOperations.executeCommand$default(sshOps, "ps aux | grep -i xochitl | grep -v grep | head -n 1", 0, 2, 2, null);
                            if (!(((CharSequence)verifyOutput.getFirst()).length() > 0)) break;
                            job.addLog("\u2713 XOVI verified running");
                        }
                        catch (Exception e) {
                            job.addLog("Could not verify XOVI status: " + e.getMessage());
                        }
                        break;
                    }
                    catch (Exception e) {
                        if (startAttempt == startMaxRetries - 1) {
                            job.addLog("Warning: Failed to start XOVI after " + startMaxRetries + " attempts: " + e.getMessage());
                            job.addLog("\u26a0 IMPORTANT: Please manually restart XOVI:");
                            job.addLog("  Option 1: Triple-press the power button on your device");
                            job.addLog("  Option 2: SSH to device and run: cd /home/root/xovi && ./start");
                            break;
                        }
                        job.addLog("Start attempt " + (startAttempt + 1) + " failed: " + e.getMessage());
                        continue;
                    }
                }
                if (startSucceeded) {
                    job.addLog("\u2713 Patch application and XOVI restart completed successfully");
                }
            }
            catch (Exception e) {
                job.addLog("Warning: Failed to restart XOVI after patching: " + e.getMessage());
                job.addLog("\u26a0 IMPORTANT: You MUST manually restart XOVI:");
                job.addLog("  Option 1: Triple-press the power button on your device");
                job.addLog("  Option 2: SSH to device and run: cd /home/root/xovi && ./start");
            }
        }
    }

    public static final boolean rebootAndWaitForDevice(@NotNull SSHOperations sshOps, int maxWaitSeconds, boolean showDialog) {
        Intrinsics.checkNotNullParameter(sshOps, "sshOps");
        InstallationJob job = sshOps.getJob();
        try {
            job.addLog("Initiating device reboot...");
            job.addLog("\u26a0\ufe0f Your device will restart - this is normal and expected");
            job.addLog("Running pre-reboot diagnostics...");
            try {
                Triple<String, String, Integer> diagOutput = sshOps.executeCommand("echo \"=== Pre-Reboot Diagnostics ===\"\necho \"Device model:\"\ncat /proc/device-tree/model 2>/dev/null || echo \"Model info not available\"\necho \"\"\necho \"Systemd reboot available:\"\nwhich systemctl && echo \"YES\" || echo \"NO\"\necho \"\"\necho \"Traditional reboot available:\"\nwhich reboot && echo \"YES\" || echo \"NO\"\necho \"\"\necho \"Current user:\"\nwhoami\necho \"\"\necho \"Uptime:\"\nuptime", 10, 2);
                if (((CharSequence)diagOutput.getFirst()).length() > 0) {
                    job.addLog("Diagnostics: " + StringsKt.take(diagOutput.getFirst(), 500));
                }
            }
            catch (Exception e) {
                job.addLog("Diagnostics failed (non-critical): " + e.getMessage());
            }
            job.addLog("Preparing device for reboot (syncing filesystems)...");
            String rebootCmd = "sync\nsync\nsystemctl stop xochitl 2>/dev/null || true\nsleep 2\nsync\nsystemctl reboot &\nsleep 1\n/sbin/reboot &\nsleep 1";
            try {
                sshOps.executeCommand(rebootCmd, 15, 1);
            }
            catch (Exception e) {
                job.addLog("Reboot initiated (connection lost as expected: " + Reflection.getOrCreateKotlinClass(e.getClass()).getSimpleName() + ")");
            }
            job.addLog("Reboot command sent, waiting for device to restart...");
            job.setNeedsUserRebootConfirmation();
            job.addLog(StringsKt.repeat("=", 60));
            job.addLog("\u26a0\ufe0f IMPORTANT: If your device does not automatically restart,");
            job.addLog("please manually restart your device now:");
            job.addLog("Go to: Settings \u2192 Restart");
            job.addLog("Click OK in the dialog after initiating the restart.");
            job.addLog(StringsKt.repeat("=", 60));
            if (showDialog) {
                SwingUtilities.invokeLater(() -> MainKt.rebootAndWaitForDevice$lambda$0(job));
            }
            int confirmationTimeout = 60;
            long confirmationStart = System.currentTimeMillis();
            while (System.currentTimeMillis() - confirmationStart < (long)(confirmationTimeout * 1000)) {
                if (job.getRebootConfirmed()) {
                    job.addLog("User confirmed device restart");
                    break;
                }
                Thread.sleep(500L);
            }
            Thread.sleep(10000L);
            long startTime = System.currentTimeMillis();
            long checkInterval = 5000L;
            while (System.currentTimeMillis() - startTime < (long)(maxWaitSeconds * 1000)) {
                long elapsed = (System.currentTimeMillis() - startTime) / (long)1000;
                job.addLog("Waiting for device to come online... (" + elapsed + "s elapsed)");
                try {
                    JSch jsch = new JSch();
                    Session testSession = jsch.getSession("root", sshOps.getJob().getConfig().getDeviceIP(), 22);
                    testSession.setPassword(sshOps.getJob().getConfig().getSshPassword());
                    Properties config = new Properties();
                    ((Map)config).put("StrictHostKeyChecking", "no");
                    ((Map)config).put("PreferredAuthentications", "password");
                    ((Map)config).put("kex", "curve25519-sha256,curve25519-sha256@libssh.org,ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521,diffie-hellman-group14-sha256");
                    ((Map)config).put("server_host_key", "ssh-ed25519,rsa-sha2-256,ssh-rsa");
                    ((Map)config).put("cipher.s2c", "chacha20-poly1305@openssh.com,aes256-ctr,aes128-ctr");
                    ((Map)config).put("cipher.c2s", "chacha20-poly1305@openssh.com,aes256-ctr,aes128-ctr");
                    ((Map)config).put("mac.s2c", "hmac-sha2-256,hmac-sha1");
                    ((Map)config).put("mac.c2s", "hmac-sha2-256,hmac-sha1");
                    testSession.setConfig(config);
                    testSession.setTimeout(5000);
                    testSession.connect(5000);
                    Channel channel = testSession.openChannel("exec");
                    Intrinsics.checkNotNull(channel, "null cannot be cast to non-null type com.jcraft.jsch.ChannelExec");
                    ChannelExec channel2 = (ChannelExec)channel;
                    channel2.setCommand("echo 'online'");
                    channel2.setInputStream(null);
                    InputStream inputStream = channel2.getInputStream();
                    channel2.connect(5000);
                    Intrinsics.checkNotNull(inputStream);
                    InputStream inputStream2 = inputStream;
                    Charset charset = Charsets.UTF_8;
                    Reader reader = new InputStreamReader(inputStream2, charset);
                    int n = 8192;
                    String result = ((Object)StringsKt.trim((CharSequence)TextStreamsKt.readText(reader instanceof BufferedReader ? (BufferedReader)reader : new BufferedReader(reader, n)))).toString();
                    channel2.disconnect();
                    testSession.disconnect();
                    if (Intrinsics.areEqual(result, "online")) {
                        job.addLog("\u2713 Device is back online after " + elapsed + "s");
                        job.addLog("Waiting for services to fully stabilize...");
                        Thread.sleep(5000L);
                        return true;
                    }
                }
                catch (Exception exception) {
                    // empty catch block
                }
                Thread.sleep(checkInterval);
            }
            job.addLog("\u26a0\ufe0f Warning: Device did not come back online within " + maxWaitSeconds + "s");
            job.addLog("The device may still be rebooting - please wait a moment and try again");
            return false;
        }
        catch (Exception e) {
            job.addLog("Error during reboot process: " + e.getMessage());
            return false;
        }
    }

    public static /* synthetic */ boolean rebootAndWaitForDevice$default(SSHOperations sSHOperations, int n, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = 180;
        }
        if ((n2 & 4) != 0) {
            bl = true;
        }
        return MainKt.rebootAndWaitForDevice(sSHOperations, n, bl);
    }

    public static final void processInstallation(@NotNull InstallationJob job) {
        Object remotePath;
        File file;
        Object element$iv;
        Intrinsics.checkNotNullParameter(job, "job");
        InstallationConfig config = job.getConfig();
        Path baseDir = MainKt.getApplicationBaseDirectory();
        SSHOperations sshOps = new SSHOperations(config.getDeviceIP(), config.getSshPassword(), job);
        job.updateStatus("testing", "Testing SSH connection...", 3, 1, "Connection Test", "setup");
        SSHOperations.executeCommand$default(sshOps, "echo 'Connection test'", 0, 0, 6, null);
        job.markStageComplete("setup");
        job.updateStatus("checking", "Detecting device architecture...", 5, 2, "Device Detection", "setup");
        String arch = null;
        try {
            Triple archOutput = SSHOperations.executeCommand$default(sshOps, "uname -m", 0, 0, 6, null);
            arch = ((Object)StringsKt.trim((CharSequence)((String)archOutput.getFirst()))).toString();
        }
        catch (Exception e) {
            job.addLog("Warning: Architecture detection failed: " + e.getMessage());
            arch = "";
        }
        if (((CharSequence)arch).length() == 0) {
            String string;
            job.addLog("\u26a0 Direct architecture detection failed, using device model fallback");
            String e = config.getDeviceModel();
            if (Intrinsics.areEqual(e, "remarkable-paper-pro-move") || Intrinsics.areEqual(e, "remarkable-paper-pro")) {
                job.addLog("\u2713 Device model indicates aarch64 architecture");
                string = "aarch64";
            } else {
                job.addLog("\u2713 Device model indicates arm32 architecture");
                string = "armv7l";
            }
            arch = string;
        }
        job.getState().setArchitecture(arch);
        String archKey = null;
        if (StringsKt.contains$default((CharSequence)arch, "aarch64", false, 2, null) || StringsKt.contains$default((CharSequence)arch, "arm64", false, 2, null)) {
            archKey = "aarch64";
            String string = config.getDeviceModel();
            if (Intrinsics.areEqual(string, "remarkable-paper-pro-move")) {
                job.getState().setDeviceType("rMPP-Move");
                job.addLog("\u2713 Detected: Remarkable Paper Pro Move (aarch64)");
                job.addLog("\u2713 This device will use local KOReader NIGHTLY build");
            } else if (Intrinsics.areEqual(string, "remarkable-paper-pro")) {
                job.getState().setDeviceType("rMPP");
                job.addLog("\u2713 Detected: Remarkable Paper Pro (aarch64)");
                job.addLog("\u2713 This device will use local KOReader NIGHTLY build");
            } else {
                job.getState().setDeviceType("rMPP");
                job.addLog("\u2713 Detected: Remarkable Paper Pro (aarch64)");
            }
        } else if (StringsKt.contains$default((CharSequence)arch, "armv7", false, 2, null) || StringsKt.contains$default((CharSequence)arch, "armhf", false, 2, null)) {
            archKey = "arm32";
            job.getState().setDeviceType("rM2");
            job.addLog("\u2713 Detected: Remarkable 2 (armv7)");
        } else if (StringsKt.contains$default((CharSequence)arch, "armv6", false, 2, null)) {
            archKey = "arm32";
            job.getState().setDeviceType("rM1");
            job.addLog("\u2713 Detected: Remarkable 1 (armv6)");
        } else {
            archKey = "arm32";
            job.getState().setDeviceType("rM2");
            job.addLog("\u2713 Detected: Unknown architecture (" + arch + "), defaulting to rM2");
        }
        job.addLog("Architecture key: " + archKey);
        if (config.getCreateBackup()) {
            job.updateStatus("backup", "Creating system backup...", 8, 3, "System Backup", "backup");
            try {
                String backupName = MainKt.createBackup(sshOps);
                job.getState().setBackupName(backupName);
                job.markStageComplete("backup");
            }
            catch (Exception e) {
                job.addLog("Warning: Backup failed: " + e.getMessage());
            }
        }
        job.updateStatus("loading", "Loading installation files from local directories...", 12, 4, "Load Files", "load");
        Map<String, String> downloadedFiles = null;
        try {
            downloadedFiles = MainKt.loadLocalInstallationFiles(archKey, config, job);
        }
        catch (Exception e) {
            String errorMsg = "Failed to load required files: " + e.getMessage();
            job.addLog(errorMsg);
            throw new Exception(errorMsg);
        }
        job.markStageComplete("load");
        job.updateStatus("installing", "Installing XOVI framework...", 25, 5, "XOVI Installation", "xovi_install");
        job.addLog("Uploading XOVI extensions archive to device...");
        String string = downloadedFiles.get("xovi_extensions");
        Intrinsics.checkNotNull(string);
        SSHOperations.copyFile$default(sshOps, string, "/home/root/extensions.zip", 0, 4, null);
        job.addLog("Extracting and installing XOVI extensions on device...");
        String extractCmd = "set -e\ncd /home/root\n\nrm -rf extensions-* 2>/dev/null || true\n\nmkdir -p /home/root/xovi\nmkdir -p /home/root/xovi/extensions.d\nmkdir -p /home/root/xovi/exthome/appload\nmkdir -p /home/root/shims\n\nunzip -q -o extensions.zip\n\necho \"Moving extension .so files from /home/root to extensions directory...\"\n\nfor ext_file in fileman.so framebuffer-spy.so qt-command-executor.so qt-resource-rebuilder.so random-suspend-screen.so webserver-remote.so xovi-message-broker.so; do\n    if [ -f \"/home/root/$ext_file\" ]; then\n        mv \"/home/root/$ext_file\" /home/root/xovi/extensions.d/\n        chmod +x /home/root/xovi/extensions.d/$ext_file\n        echo \"Moved $ext_file to extensions directory\"\n    else\n        echo \"WARNING: $ext_file not found in /home/root\"\n    fi\ndone\n\necho \"Verifying extensions directory:\"\nls -la /home/root/xovi/extensions.d/\n\nrm -f extensions.zip\n\necho \"XOVI extensions installation complete\"";
        SSHOperations.executeCommand$default(sshOps, extractCmd, 0, 0, 6, null);
        job.addLog("Installing XOVI binary...");
        String string2 = downloadedFiles.get("xovi_binary");
        Intrinsics.checkNotNull(string2);
        SSHOperations.copyFile$default(sshOps, string2, "/home/root/xovi/xovi.so", 0, 4, null);
        SSHOperations.executeCommand$default(sshOps, "chmod +x /home/root/xovi/xovi.so", 0, 0, 6, null);
        job.addLog("Creating XOVI control scripts...");
        SSHOperations.executeCommand$default(sshOps, "cat > /home/root/xovi/start << 'START_SCRIPT'\n#!/bin/bash\nmkdir -p /etc/systemd/system/xochitl.service.d\nmount -t tmpfs tmpfs /etc/systemd/system/xochitl.service.d\ncat > /etc/systemd/system/xochitl.service.d/xovi.conf << 'XOVI_CONF'\n[Service]\nEnvironment=\"QML_DISABLE_DISK_CACHE=1\"\nEnvironment=\"QML_XHR_ALLOW_FILE_WRITE=1\"\nEnvironment=\"QML_XHR_ALLOW_FILE_READ=1\"\nEnvironment=\"LD_PRELOAD=/home/root/xovi/xovi.so\"\nXOVI_CONF\nsystemctl daemon-reload\nsystemctl restart xochitl\nSTART_SCRIPT\n\nchmod +x /home/root/xovi/start", 0, 0, 6, null);
        SSHOperations.executeCommand$default(sshOps, "cat > /home/root/xovi/stop << 'STOP_SCRIPT'\n#!/bin/bash\numount /etc/systemd/system/xochitl.service.d 2>/dev/null || true\nrmdir /etc/systemd/system/xochitl.service.d 2>/dev/null || true\nsystemctl daemon-reload\nsystemctl restart xochitl\nSTOP_SCRIPT\n\nchmod +x /home/root/xovi/stop", 0, 0, 6, null);
        job.addLog("Creating hashtable rebuild script...");
        String scriptPart1 = "#!/bin/bash\n\nif [[ ! -e '/home/root/xovi/extensions.d/qt-resource-rebuilder.so' ]]; then\n    echo \"Please install qt-resource-rebuilder before updating the hashtable\"\n    exit 1\nfi\n\necho \"Rebuilding hashtable...\"\nsystemctl stop xochitl.service\n\nif pidof xochitl; then\n  kill -15 $(pidof xochitl)\nfi\n\nmkdir -p /home/root/xovi/exthome/qt-resource-rebuilder\nrm -f /home/root/xovi/exthome/qt-resource-rebuilder/hashtab\necho \"Starting hashtable rebuild process...\"\necho \"This may take several minutes. Progress will be shown below:\"\necho \"\"";
        String scriptPart2 = "QMLDIFF_HASHTAB_CREATE=/home/root/xovi/exthome/qt-resource-rebuilder/hashtab \\\nQML_DISABLE_DISK_CACHE=1 \\\nLD_PRELOAD=/home/root/xovi/xovi.so \\\n/usr/bin/xochitl 2>&1 | while IFS= read line; do\n  echo \"$line\"\n  if [[ \"$line\" == *\"Hashtab saved\"* ]]; then\n    kill -15 $(pidof xochitl) 2>/dev/null || true\n    break\n  fi\ndone\n\necho \"\"\necho \"Hashtable rebuild completed. Restarting xochitl service...\"\nsleep 5\nsystemctl start xochitl.service\necho \"XOVI hashtable rebuild completed successfully!\"";
        SSHOperations.executeCommand$default(sshOps, "cat > /home/root/xovi/rebuild-hashtable.sh << 'PART1_EOF'\n" + scriptPart1 + "\nPART1_EOF", 0, 0, 6, null);
        SSHOperations.executeCommand$default(sshOps, "cat >> /home/root/xovi/rebuild-hashtable.sh << 'PART2_EOF'\n" + scriptPart2 + "\nPART2_EOF", 0, 0, 6, null);
        SSHOperations.executeCommand$default(sshOps, "chmod +x /home/root/xovi/rebuild-hashtable.sh", 0, 0, 6, null);
        job.addLog("Hashtable rebuild script created successfully");
        job.markStageComplete("xovi_install");
        job.updateStatus("installing", "Installing AppLoad launcher...", 35, 6, "AppLoad Installation", "xovi_install");
        Path apploadExtractDir = baseDir.resolve("temp_appload_extracted");
        Intrinsics.checkNotNull(apploadExtractDir);
        LinkOption[] linkOptionArray = new LinkOption[]{};
        if (Files.exists(apploadExtractDir, Arrays.copyOf(linkOptionArray, linkOptionArray.length))) {
            File file2 = apploadExtractDir.toFile();
            Intrinsics.checkNotNullExpressionValue(file2, "toFile(...)");
            FilesKt.deleteRecursively(file2);
        }
        String string3 = downloadedFiles.get("appload");
        Intrinsics.checkNotNull(string3);
        MainKt.extractZip(string3, ((Object)apploadExtractDir).toString(), job);
        File file3 = apploadExtractDir.toFile();
        Intrinsics.checkNotNullExpressionValue(file3, "toFile(...)");
        Sequence $this$forEach$iv = FilesKt.walkTopDown(file3);
        boolean $i$f$forEach = false;
        Iterator iterator2 = $this$forEach$iv.iterator();
        while (iterator2.hasNext()) {
            element$iv = iterator2.next();
            file = (File)element$iv;
            boolean bl = false;
            if (!file.isFile() || !Intrinsics.areEqual(FilesKt.getExtension(file), "so")) continue;
            String string4 = file.getName();
            Intrinsics.checkNotNullExpressionValue(string4, "getName(...)");
            if (!StringsKt.contains$default((CharSequence)string4, "shim", false, 2, null)) continue;
            remotePath = "/home/root/shims/" + file.getName();
            try {
                String string5 = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(string5, "getAbsolutePath(...)");
                SSHOperations.copyFile$default(sshOps, string5, (String)remotePath, 0, 4, null);
                SSHOperations.executeCommand$default(sshOps, "chmod +x " + (String)remotePath, 0, 0, 6, null);
            }
            catch (Exception e) {
                job.addLog("Warning: Failed to copy " + file.getName() + ": " + e.getMessage());
            }
        }
        File file4 = apploadExtractDir.toFile();
        Intrinsics.checkNotNullExpressionValue(file4, "toFile(...)");
        $this$forEach$iv = FilesKt.walkTopDown(file4);
        $i$f$forEach = false;
        iterator2 = $this$forEach$iv.iterator();
        while (iterator2.hasNext()) {
            element$iv = iterator2.next();
            file = (File)element$iv;
            boolean bl = false;
            if (!file.isFile() || !Intrinsics.areEqual(file.getName(), "appload.so")) continue;
            remotePath = "/home/root/xovi/extensions.d/appload.so";
            try {
                job.addLog("Uploading appload.so to extensions directory...");
                String string6 = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(string6, "getAbsolutePath(...)");
                SSHOperations.copyFile$default(sshOps, string6, (String)remotePath, 0, 4, null);
                SSHOperations.executeCommand$default(sshOps, "chmod +x " + (String)remotePath, 0, 0, 6, null);
                job.addLog("appload.so uploaded successfully");
            }
            catch (Exception e) {
                job.addLog("Warning: Failed to copy appload.so: " + e.getMessage());
            }
        }
        LinkOption[] linkOptionArray2 = new LinkOption[]{};
        if (Files.exists(apploadExtractDir, Arrays.copyOf(linkOptionArray2, linkOptionArray2.length))) {
            File file5 = apploadExtractDir.toFile();
            Intrinsics.checkNotNullExpressionValue(file5, "toFile(...)");
            FilesKt.deleteRecursively(file5);
        }
        job.addLog("Configuring AppLoad launcher...");
        SSHOperations.executeCommand$default(sshOps, "mkdir -p /home/root/xovi/exthome/appload\necho 'enabled=1' > /home/root/xovi/extensions.d/appload.so.conf", 0, 0, 6, null);
        String verifyCmd = "ls -la /home/root/xovi/extensions.d/appload.so* && cat /home/root/xovi/extensions.d/appload.so.conf";
        Triple verifyResult = SSHOperations.executeCommand$default(sshOps, verifyCmd, 0, 0, 6, null);
        if (((CharSequence)verifyResult.getFirst()).length() > 0) {
            job.addLog("AppLoad verification: " + verifyResult.getFirst());
        } else {
            job.addLog("Warning: AppLoad verification failed");
        }
        job.updateStatus("configuring", "Rebuilding system hashtable (this may take several minutes)...", 45, 7, "Hashtable Rebuild", "hashtable_rebuild");
        try {
            job.addLog("Stopping xochitl service...");
            SSHOperations.executeCommand$default(sshOps, "systemctl stop xochitl", 30, 0, 4, null);
            Thread.sleep(2000L);
            job.addLog("Ensuring xochitl is stopped...");
            try {
                SSHOperations.executeCommand$default(sshOps, "pkill -15 xochitl || true", 10, 0, 4, null);
            }
            catch (Exception element$iv2) {
                // empty catch block
            }
            job.addLog("Verifying qt-resource-rebuilder.so is installed...");
            Triple verifyResultRebuild = SSHOperations.executeCommand$default(sshOps, "ls -lh /home/root/xovi/extensions.d/qt-resource-rebuilder.so", 0, 0, 6, null);
            if (((Number)verifyResultRebuild.getThird()).intValue() != 0) {
                job.addLog("ERROR: qt-resource-rebuilder.so not found in extensions directory!");
                job.addLog("This is required for hashtable rebuild. Installation cannot continue.");
                throw new Exception("qt-resource-rebuilder.so missing from extensions directory");
            }
            job.addLog("\u2713 qt-resource-rebuilder.so confirmed: " + ((Object)StringsKt.trim((CharSequence)((String)verifyResultRebuild.getFirst()))).toString());
            job.addLog(StringsKt.repeat("=", 60));
            job.addLog("Starting hashtable rebuild process...");
            job.addLog("This may take 5-10 minutes. Please be patient.");
            job.addLog("Progress will be shown below:");
            job.addLog(StringsKt.repeat("=", 60));
            Triple rebuildResult = SSHOperations.executeCommand$default(sshOps, "cd /home/root/xovi && ./rebuild-hashtable.sh", 600, 0, 4, null);
            job.addLog(StringsKt.repeat("=", 60));
            if (((Number)rebuildResult.getThird()).intValue() == 0) {
                job.addLog("\u2713 Hashtable rebuilt successfully");
            } else {
                job.addLog("Warning: Hashtable rebuild may have encountered issues");
                job.addLog("Exit code: " + rebuildResult.getThird());
                if (((CharSequence)rebuildResult.getSecond()).length() > 0) {
                    job.addLog("Error output: " + StringsKt.take((String)rebuildResult.getSecond(), 500));
                }
            }
            Thread.sleep(3000L);
            job.addLog("Verifying xochitl service is running...");
            Triple serviceVerify = SSHOperations.executeCommand$default(sshOps, "systemctl is-active xochitl", 10, 0, 4, null);
            if (StringsKt.contains$default((CharSequence)serviceVerify.getFirst(), "active", false, 2, null)) {
                job.addLog("\u2713 xochitl service is active");
            } else {
                job.addLog("\u26a0 xochitl may not be running - starting it...");
                SSHOperations.executeCommand$default(sshOps, "systemctl start xochitl", 30, 0, 4, null);
            }
            job.markStageComplete("hashtable_rebuild");
        }
        catch (Exception e) {
            job.addLog("Warning: Hashtable rebuild encountered issues: " + e.getMessage());
            job.addLog("Device may need manual reboot");
        }
        if (Intrinsics.areEqual(config.getInstallationType(), "stage1")) {
            job.updateStatus("stage1_complete", "Stage 1 complete - Reboot required", 50, 8, "Stage 1 Complete", "reboot");
            job.setNeedsReboot();
            return;
        }
        if (Intrinsics.areEqual(config.getInstallationType(), "full")) {
            job.updateStatus("info", "Note: Device will need reboot after Stage 1", 50, 8, "Reboot Notice", "reboot");
            job.addLog("Continuing with Stage 2 installation...");
            Thread.sleep(2000L);
        }
        MainKt.continueInstallationStage2(job, sshOps, config, downloadedFiles);
    }

    public static final void continueInstallationStage2(@NotNull InstallationJob job, @NotNull SSHOperations sshOps, @NotNull InstallationConfig config, @NotNull Map<String, String> downloadedFiles) {
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(sshOps, "sshOps");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(downloadedFiles, "downloadedFiles");
        String[] stringArray = new String[]{"full", "stage2"};
        if (CollectionsKt.listOf(stringArray).contains(config.getInstallationType())) {
            job.updateStatus("installing", "Installing KOReader...", 60, 9, "KOReader Installation", "koreader_install");
            String koreaderRemotePath = "/home/root/koreader.zip";
            String string = downloadedFiles.get("koreader");
            Intrinsics.checkNotNull(string);
            String localKoreaderPath = string;
            long localSize = new File(localKoreaderPath).length();
            double localSizeMb = (double)localSize / 1048576.0;
            String string2 = "%.2f";
            Object[] objectArray = new Object[]{localSizeMb};
            String string3 = String.format(string2, Arrays.copyOf(objectArray, objectArray.length));
            Intrinsics.checkNotNullExpressionValue(string3, "format(...)");
            job.addLog("Local KOReader file size: " + string3 + " MB");
            if (localSize < 0x100000L) {
                string2 = "%.2f";
                objectArray = new Object[]{localSizeMb};
                String string4 = String.format(string2, Arrays.copyOf(objectArray, objectArray.length));
                Intrinsics.checkNotNullExpressionValue(string4, "format(...)");
                throw new Exception("Local KOReader file is too small (" + string4 + " MB) - file may be corrupted");
            }
            string2 = "%.2f";
            objectArray = new Object[]{localSizeMb};
            String string5 = String.format(string2, Arrays.copyOf(objectArray, objectArray.length));
            Intrinsics.checkNotNullExpressionValue(string5, "format(...)");
            job.addLog("Transferring KOReader (" + string5 + " MB) to device...");
            SSHOperations.copyFile$default(sshOps, localKoreaderPath, koreaderRemotePath, 0, 4, null);
            job.addLog("Installing KOReader to AppLoad directory...");
            String installCmd = "set -e\ncd /home/root\n\n# Remove old installations\necho \"Removing old KOReader installations...\"\nrm -rf koreader 2>/dev/null || true\nrm -rf /home/root/xovi/exthome/appload/koreader 2>/dev/null || true\n\n# Extract KOReader\necho \"Extracting KOReader...\"\nunzip -q koreader.zip\n\n# Verify extraction succeeded\nif [ ! -d \"koreader\" ]; then\n    echo \"ERROR: KOReader directory not found after extraction\"\n    exit 1\nfi\n\necho \"KOReader extracted successfully\"\n\n# Create AppLoad directory structure\necho \"Creating AppLoad directory structure...\"\nmkdir -p /home/root/xovi/exthome/appload\n\n# CRITICAL STEP: Move KOReader to AppLoad directory\necho \"Moving KOReader to AppLoad directory...\"\nmv /home/root/koreader /home/root/xovi/exthome/appload/\n\n# Verify move was successful\nif [ ! -d \"/home/root/xovi/exthome/appload/koreader\" ]; then\n    echo \"ERROR: KOReader not found in AppLoad directory after move\"\n    exit 1\nfi\n\necho \"KOReader moved successfully to /home/root/xovi/exthome/appload/\"\n\n# Set proper permissions\nchmod -R 755 /home/root/xovi/exthome/appload/koreader\n\n# Cleanup\nrm -f koreader.zip\n\n# Final verification\necho \"KOReader installation completed successfully!\"\necho \"Location: /home/root/xovi/exthome/appload/koreader\"";
            job.addLog("Executing KOReader installation commands...");
            SSHOperations.executeCommand$default(sshOps, installCmd, 0, 0, 6, null);
            job.addLog("KOReader installed successfully");
            job.markStageComplete("koreader_install");
        }
        if (config.getEnableTripletap() && downloadedFiles.containsKey("tripletap")) {
            job.updateStatus("installing", "Installing XOVI tripletap...", 75, 10, "Tripletap Installation", "tripletap");
            try {
                MainKt.installTripletap(sshOps, downloadedFiles);
                job.markStageComplete("tripletap");
            }
            catch (Exception e) {
                job.addLog("Warning: Tripletap installation failed: " + e.getMessage());
            }
        }
        job.updateStatus("configuring", "Applying USB ethernet safety fix...", 80, 11, "Ethernet Fix", "complete");
        try {
            MainKt.applyEthernetFix(sshOps);
        }
        catch (Exception e) {
            job.addLog("Continuing despite ethernet fix warning...");
        }
        job.updateStatus("finalizing", "Starting XOVI framework...", 85, 12, "XOVI Activation", "complete");
        try {
            SSHOperations.executeCommand$default(sshOps, "cd /home/root/xovi\nif [ -f ./start ]; then\n    chmod +x ./start\n    ./start\nfi", 0, 0, 6, null);
            job.addLog("Allowing XOVI to fully initialize...");
            Thread.sleep(5000L);
        }
        catch (Exception e) {
            job.addLog("Warning: XOVI start may have issues: " + e.getMessage());
            Thread.sleep(5000L);
        }
        job.updateStatus("verifying", "Verifying installation...", 95, 13, "Verification", "complete");
        try {
            Triple<String, String, Integer> verifyOutput = sshOps.executeCommand("echo \"Checking XOVI installation...\"\nls -la /home/root/xovi/extensions.d/\necho \"\"\necho \"Checking AppLoad directory...\"\nls -la /home/root/xovi/exthome/appload/\necho \"\"\necho \"Checking KOReader installation...\"\nif [ -d \"/home/root/xovi/exthome/appload/koreader\" ]; then\n    ls -la /home/root/xovi/exthome/appload/koreader/ | tail -10\n    du -sh /home/root/xovi/exthome/appload/koreader/\n    echo \"KOReader is installed in AppLoad directory\"\nelse\n    echo \"WARNING: KOReader not found in AppLoad directory\"\nfi", 60, 5);
            job.addLog("Verification output:\n" + verifyOutput.getFirst());
        }
        catch (Exception verifyOutput) {
            // empty catch block
        }
        boolean patchesApplied = false;
        Path patchesDir = MainKt.findPatchesDirectory(job.getState().getArchitecture(), job);
        if (patchesDir != null) {
            job.updateStatus("rebooting", "Rebooting device before applying patches...", 95, 14, "Device Reboot", "reboot");
            job.addLog(StringsKt.repeat("=", 60));
            job.addLog("Device reboot is required before applying patches");
            job.addLog("This ensures SSH stability after the installation");
            job.addLog(StringsKt.repeat("=", 60));
            boolean rebootSuccess = MainKt.rebootAndWaitForDevice$default(sshOps, 180, false, 4, null);
            if (rebootSuccess) {
                job.addLog("\u2713 Device successfully rebooted and reconnected");
                job.updateStatus("patching", "Applying patches...", 97, 15, "Apply Patches", "complete");
                job.addLog("Starting patch application...");
                try {
                    MainKt.applyPatches(sshOps);
                    patchesApplied = true;
                    job.markStageComplete("patches");
                }
                catch (Exception e) {
                    job.addLog("Warning: Patch application encountered issues: " + e.getMessage());
                    job.addLog("You may need to apply patches manually or run installation again");
                }
            } else {
                job.addLog("\u26a0 Could not reconnect to device after reboot");
                job.addLog("Please ensure device has fully restarted, then:");
                job.addLog("  1. Check device is powered on and connected");
                job.addLog("  2. Wait 1-2 minutes for full boot");
                job.addLog("  3. You may need to apply patches manually");
            }
        } else {
            job.addLog("No patches directory found (checked ./patch and ./patches) - skipping patch application");
        }
        job.addLog("Installation completed successfully!");
        job.addLog("\u2554" + StringsKt.repeat("\u2550", 158) + "\u2557");
        job.addLog("\ud83d\udcf1 To use KOReader:");
        job.addLog("   1. Open sidebar on your device");
        job.addLog("   2. Navigate to AppLoad menu");
        job.addLog("   3. Select KOReader");
        if (config.getEnableTripletap()) {
            job.addLog("\u26a1 Triple-press power button quickly to launch AppLoad anytime");
        }
        if (config.getCreateBackup()) {
            job.addLog("\ud83d\udcbe Backup saved as: " + job.getState().getBackupName());
            job.addLog("   To restore: ssh to device and run restore.sh in backup folder");
        }
        if (patchesApplied) {
            job.addLog("\ud83d\udce6 Custom patches have been applied");
        } else {
            job.addLog("\u2139\ufe0f No patches were found to apply");
        }
        job.addLog("\u26a0\ufe0f To start AppLoad Triple-press The Power Button -or- execute: xovi/start via SSH");
        job.addLog("\u255a" + StringsKt.repeat("\u2550", 158) + "\u255d");
    }

    public static final void uninstallXovi(@NotNull InstallationJob job) {
        Intrinsics.checkNotNullParameter(job, "job");
        InstallationConfig config = job.getConfig();
        SSHOperations sshOps = new SSHOperations(config.getDeviceIP(), config.getSshPassword(), job);
        job.updateStatus("testing", "Testing SSH connection...", 10, 1, "Connection Test", "setup");
        SSHOperations.executeCommand$default(sshOps, "echo 'Connection test'", 0, 0, 6, null);
        job.markStageComplete("setup");
        job.updateStatus("removing", "Stopping XOVI services...", 25, 2, "Stop Services", "uninstall");
        try {
            SSHOperations.executeCommand$default(sshOps, "if [ -f /home/root/xovi/stop ]; then\n    cd /home/root/xovi && ./stop 2>/dev/null || true\nfi\necho \"XOVI services stopped\"", 0, 0, 6, null);
        }
        catch (Exception e) {
            job.addLog("Warning: Error stopping XOVI: " + e.getMessage());
        }
        job.updateStatus("removing", "Removing xovi-tripletap service...", 40, 3, "Remove Tripletap", "uninstall");
        try {
            SSHOperations.executeCommand$default(sshOps, "systemctl stop xovi-tripletap 2>/dev/null || true\nsystemctl disable xovi-tripletap 2>/dev/null || true\nrm -f /etc/systemd/system/xovi-tripletap.service 2>/dev/null || true\necho \"xovi-tripletap service removed\"", 0, 0, 6, null);
        }
        catch (Exception e) {
            job.addLog("Warning: Error removing tripletap: " + e.getMessage());
        }
        job.updateStatus("removing", "Removing XOVI files and directories...", 60, 4, "Remove Files", "uninstall");
        SSHOperations.executeCommand$default(sshOps, "rm -rf /home/root/xovi 2>/dev/null || true\nrm -rf /home/root/shims 2>/dev/null || true\nrm -rf /home/root/xovi-tripletap 2>/dev/null || true\nsystemctl daemon-reload 2>/dev/null || true\necho \"All installation files removed\"", 0, 0, 6, null);
        job.markStageComplete("uninstall");
        job.updateStatus("finalizing", "Restarting reMarkable UI...", 85, 5, "Restart UI", "complete");
        try {
            SSHOperations.executeCommand$default(sshOps, "systemctl restart xochitl\necho \"System UI restarted\"", 0, 0, 6, null);
        }
        catch (Exception e) {
            job.addLog("Warning: Error restarting xochitl: " + e.getMessage());
        }
        job.addLog("Uninstallation completed successfully!");
        job.addLog("\u2554" + StringsKt.repeat("\u2550", 48) + "\u2557");
        job.addLog("\u2713 XOVI has been completely removed");
        job.addLog("\u2713 Your device has been restored to stock firmware");
        job.addLog("\u255a" + StringsKt.repeat("\u2550", 48) + "\u255d");
    }

    public static final void processMaintenanceTasks(@NotNull InstallationJob job) {
        Intrinsics.checkNotNullParameter(job, "job");
        InstallationConfig config = job.getConfig();
        SSHOperations sshOps = new SSHOperations(config.getDeviceIP(), config.getSshPassword(), job);
        job.updateStatus("testing", "Testing SSH connection...", 10, 1, "Connection Test", "setup");
        SSHOperations.executeCommand$default(sshOps, "echo 'Connection test'", 0, 0, 6, null);
        job.markStageComplete("setup");
        job.updateStatus("enabling", "Re-enabling Tripletap service...", 30, 1, "Enable Tripletap", "maintenance");
        job.addLog(StringsKt.repeat("=", 60));
        job.addLog("Re-enabling xovi-tripletap service...");
        job.addLog(StringsKt.repeat("=", 60));
        boolean tripletapEnabled = false;
        try {
            String enableCmd = "cd /home/root/xovi-tripletap\nif [ -f ./enable.sh ]; then\n    chmod +x ./enable.sh\n    ./enable.sh\n    echo \"Tripletap enable script executed successfully\"\nelse\n    echo \"WARNING: enable.sh not found, attempting manual enable\"\n    systemctl enable xovi-tripletap 2>/dev/null || true\n    systemctl start xovi-tripletap 2>/dev/null || true\n    echo \"Tripletap service enabled manually\"\nfi";
            Triple result = SSHOperations.executeCommand$default(sshOps, enableCmd, 60, 0, 4, null);
            if (((Number)result.getThird()).intValue() == 0) {
                job.addLog("\u2713 Tripletap enable command completed");
                tripletapEnabled = true;
            } else {
                job.addLog("\u26a0 WARNING: Tripletap enable encountered issues (exit code: " + result.getThird() + ")");
                if (((CharSequence)result.getSecond()).length() > 0) {
                    job.addLog("Error output: " + StringsKt.take((String)result.getSecond(), 500));
                }
            }
        }
        catch (Exception e) {
            job.addLog("\u26a0 WARNING: Tripletap enable failed: " + e.getMessage());
            job.addLog("Will continue with hashtable rebuild...");
        }
        job.markStageComplete("tripletap_enable");
        job.addLog(StringsKt.repeat("=", 60));
        job.addLog("CRITICAL: Allowing extended device recovery period");
        job.addLog("The enable.sh script performs intensive systemd operations");
        job.addLog("that require the device to fully stabilize before proceeding.");
        job.addLog(StringsKt.repeat("=", 60));
        int recoveryWait = 20;
        int i = 1;
        while (true) {
            job.addLog("Device recovery: " + i + "/" + recoveryWait + " seconds (no SSH activity)...");
            Thread.sleep(1000L);
            if (i == recoveryWait) break;
            ++i;
        }
        job.addLog(StringsKt.repeat("=", 60));
        job.addLog("Initial recovery complete. Verifying SSH connectivity...");
        job.addLog(StringsKt.repeat("=", 60));
        int maxConnectionAttempts = 5;
        boolean connectionVerified = false;
        for (int attempt = 0; attempt < maxConnectionAttempts; ++attempt) {
            try {
                Triple<String, String, Integer> testResult;
                if (attempt > 0) {
                    int waitTime = 5 * (attempt + 1);
                    job.addLog("SSH verification attempt " + (attempt + 1) + "/" + maxConnectionAttempts + "...");
                    job.addLog("Waiting " + waitTime + " seconds before retry...");
                    Thread.sleep((long)waitTime * 1000L);
                }
                if (((Number)(testResult = sshOps.executeCommand("echo 'SSH stable'", 20, 1)).getThird()).intValue() == 0 && StringsKt.contains$default((CharSequence)testResult.getFirst(), "SSH stable", false, 2, null)) {
                    job.addLog("\u2713 SSH connection verified stable");
                    connectionVerified = true;
                    break;
                }
                job.addLog("SSH test returned unexpected result, will retry...");
                continue;
            }
            catch (Exception e) {
                String errorMsg;
                String string = e.getMessage();
                if (string == null) {
                    string = errorMsg = "Unknown error";
                }
                if (attempt == maxConnectionAttempts - 1) {
                    job.addLog("\u26a0 WARNING: SSH verification failed after " + maxConnectionAttempts + " attempts");
                    job.addLog("Last error: " + errorMsg);
                    job.addLog("Will attempt to proceed, but device may need manual reboot");
                    continue;
                }
                job.addLog("SSH verification failed: " + errorMsg);
                job.addLog("Device may still be recovering from enable.sh operations...");
            }
        }
        if (!connectionVerified) {
            job.addLog(StringsKt.repeat("=", 60));
            job.addLog("\u26a0 WARNING: Could not verify stable SSH connection");
            job.addLog("This may indicate device needs more recovery time");
            job.addLog("Adding additional stabilization period...");
            job.addLog(StringsKt.repeat("=", 60));
            for (int i2 = 1; i2 < 11; ++i2) {
                job.addLog("Additional stabilization: " + i2 + "/10 seconds...");
                Thread.sleep(1000L);
            }
        }
        job.addLog(StringsKt.repeat("=", 60));
        job.addLog("Final stabilization before hashtable rebuild...");
        job.addLog(StringsKt.repeat("=", 60));
        Thread.sleep(5000L);
        if (tripletapEnabled) {
            try {
                job.addLog("Checking tripletap service status (non-critical)...");
                Triple<String, String, Integer> verifyResult = sshOps.executeCommand("systemctl is-active xovi-tripletap || echo 'status unknown'", 15, 2);
                String string = verifyResult.getFirst().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
                if (StringsKt.contains$default((CharSequence)string, "active", false, 2, null)) {
                    job.addLog("\u2713 Tripletap service is ACTIVE and running");
                } else {
                    job.addLog("\u2139 Tripletap status: " + StringsKt.take(((Object)StringsKt.trim((CharSequence)verifyResult.getFirst())).toString(), 100));
                }
            }
            catch (Exception e) {
                job.addLog("Note: Could not verify tripletap status: " + e.getMessage());
                job.addLog("This is non-critical, continuing with hashtable rebuild");
            }
        }
        job.addLog(StringsKt.repeat("=", 60));
        job.addLog("\u26a0\ufe0f DEVICE REBOOT REQUIRED");
        job.addLog("A device reboot is required before hashtable rebuild");
        job.addLog("This ensures SSH stability for the intensive rebuild");
        job.addLog(StringsKt.repeat("=", 60));
        job.setNeedsUserRebootConfirmation();
        job.addLog(StringsKt.repeat("=", 60));
        job.addLog("\u26a0\ufe0f IMPORTANT: Please manually restart your device now:");
        job.addLog("Go to: Settings \u2192 Restart");
        job.addLog("Click OK in the dialog after initiating the restart.");
        job.addLog(StringsKt.repeat("=", 60));
        SwingUtilities.invokeLater(() -> MainKt.processMaintenanceTasks$lambda$0(job));
        int confirmationTimeout = 120;
        long confirmationStart = System.currentTimeMillis();
        boolean userConfirmed = false;
        while (System.currentTimeMillis() - confirmationStart < (long)(confirmationTimeout * 1000)) {
            if (job.getRebootConfirmed()) {
                job.addLog("User confirmed device restart");
                userConfirmed = true;
                break;
            }
            Thread.sleep(500L);
        }
        if (!userConfirmed) {
            job.addLog("\u26a0\ufe0f WARNING: User confirmation timeout - proceeding anyway");
            job.addLog("Please ensure your device has been restarted");
        }
        job.addLog("Waiting for device to restart...");
        Thread.sleep(15000L);
        job.addLog("Waiting for device to come back online...");
        int maxWaitSeconds = 180;
        long startTime = System.currentTimeMillis();
        boolean deviceOnline = false;
        while (System.currentTimeMillis() - startTime < (long)(maxWaitSeconds * 1000)) {
            long elapsed = (System.currentTimeMillis() - startTime) / (long)1000;
            job.addLog("Waiting for device to come online... (" + elapsed + "s elapsed)");
            try {
                JSch jsch = new JSch();
                Session testSession = jsch.getSession("root", config.getDeviceIP(), 22);
                testSession.setPassword(config.getSshPassword());
                Properties sessionConfig = new Properties();
                ((Map)sessionConfig).put("StrictHostKeyChecking", "no");
                ((Map)sessionConfig).put("PreferredAuthentications", "password");
                ((Map)sessionConfig).put("kex", "curve25519-sha256,curve25519-sha256@libssh.org,ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521,diffie-hellman-group14-sha256");
                ((Map)sessionConfig).put("server_host_key", "ssh-ed25519,rsa-sha2-256,ssh-rsa");
                ((Map)sessionConfig).put("cipher.s2c", "chacha20-poly1305@openssh.com,aes256-ctr,aes128-ctr");
                ((Map)sessionConfig).put("cipher.c2s", "chacha20-poly1305@openssh.com,aes256-ctr,aes128-ctr");
                ((Map)sessionConfig).put("mac.s2c", "hmac-sha2-256,hmac-sha1");
                ((Map)sessionConfig).put("mac.c2s", "hmac-sha2-256,hmac-sha1");
                testSession.setConfig(sessionConfig);
                testSession.setTimeout(5000);
                testSession.connect(5000);
                Channel channel = testSession.openChannel("exec");
                Intrinsics.checkNotNull(channel, "null cannot be cast to non-null type com.jcraft.jsch.ChannelExec");
                ChannelExec channel2 = (ChannelExec)channel;
                channel2.setCommand("echo 'online'");
                channel2.setInputStream(null);
                InputStream inputStream = channel2.getInputStream();
                channel2.connect(5000);
                Intrinsics.checkNotNull(inputStream);
                InputStream inputStream2 = inputStream;
                Charset charset = Charsets.UTF_8;
                Reader reader = new InputStreamReader(inputStream2, charset);
                int n = 8192;
                String result = ((Object)StringsKt.trim((CharSequence)TextStreamsKt.readText(reader instanceof BufferedReader ? (BufferedReader)reader : new BufferedReader(reader, n)))).toString();
                channel2.disconnect();
                testSession.disconnect();
                if (Intrinsics.areEqual(result, "online")) {
                    job.addLog("\u2713 Device is back online after " + elapsed + "s");
                    job.addLog("Waiting for services to fully stabilize...");
                    Thread.sleep(8000L);
                    deviceOnline = true;
                    break;
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            Thread.sleep(5000L);
        }
        if (!deviceOnline) {
            job.addLog("\u26a0\ufe0f WARNING: Device did not come back online within " + maxWaitSeconds + "s");
            job.addLog("The device may still be rebooting - attempting to proceed");
            job.addLog("If hashtable rebuild fails, please:");
            job.addLog("  1. Ensure device is fully booted");
            job.addLog("  2. Wait 1-2 minutes");
            job.addLog("  3. Run maintenance tasks again");
        } else {
            job.addLog("\u2713 Device successfully restarted and reconnected");
            job.addLog("SSH connection is now stable for hashtable rebuild");
        }
        job.addLog("Final stabilization period after reboot...");
        Thread.sleep(5000L);
        MainKt.continueMaintenanceHashtableRebuild(job, sshOps, config);
    }

    public static final void continueMaintenanceHashtableRebuild(@NotNull InstallationJob job, @NotNull SSHOperations sshOps, @NotNull InstallationConfig config) {
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(sshOps, "sshOps");
        Intrinsics.checkNotNullParameter(config, "config");
        job.updateStatus("rebuilding", "Rebuilding system hashtable (this may take several minutes)...", 60, 2, "Hashtable Rebuild", "maintenance");
        job.addLog(StringsKt.repeat("=", 60));
        job.addLog("Starting hashtable rebuild process...");
        job.addLog("This may take 5-10 minutes. Please be patient.");
        job.addLog(StringsKt.repeat("=", 60));
        try {
            job.addLog("Stopping xochitl service...");
            int stopMaxRetries = 5;
            boolean stopSucceeded = false;
            for (int stopAttempt = 0; stopAttempt < stopMaxRetries; ++stopAttempt) {
                try {
                    if (stopAttempt > 0) {
                        int waitTime = 4 * (stopAttempt + 1);
                        job.addLog("Retry attempt " + (stopAttempt + 1) + "/" + stopMaxRetries + " to stop xochitl...");
                        job.addLog("Waiting " + waitTime + " seconds before retry...");
                        Thread.sleep((long)waitTime * 1000L);
                    }
                    sshOps.executeCommand("systemctl stop xochitl", 30, 1);
                    stopSucceeded = true;
                    job.addLog("\u2713 xochitl stopped successfully");
                    break;
                }
                catch (Exception e) {
                    if (stopAttempt == stopMaxRetries - 1) {
                        job.addLog("\u26a0 WARNING: Failed to stop xochitl after " + stopMaxRetries + " attempts: " + e.getMessage());
                        job.addLog("Will attempt forceful termination...");
                        continue;
                    }
                    job.addLog("Stop attempt " + (stopAttempt + 1) + " failed: " + e.getMessage());
                    job.addLog("Device may still be recovering, retrying...");
                    continue;
                }
            }
            job.addLog("Waiting for xochitl to stop completely...");
            Thread.sleep(4000L);
            if (!stopSucceeded) {
                try {
                    job.addLog("Attempting forceful process termination...");
                    sshOps.executeCommand("pkill -15 xochitl || true", 15, 2);
                    Thread.sleep(2000L);
                    job.addLog("Forceful termination attempted");
                }
                catch (Exception e) {
                    job.addLog("Warning: Process termination encountered issues: " + e.getMessage());
                    job.addLog("Continuing with rebuild attempt...");
                }
            }
            job.addLog("Verifying rebuild-hashtable.sh exists...");
            int verifyAttempts = 3;
            boolean scriptVerified = false;
            for (int verifyAttempt = 0; verifyAttempt < verifyAttempts; ++verifyAttempt) {
                try {
                    Triple<String, String, Integer> verifyResult;
                    if (verifyAttempt > 0) {
                        job.addLog("Verification attempt " + (verifyAttempt + 1) + "/" + verifyAttempts + "...");
                        Thread.sleep(3000L);
                    }
                    if (((Number)(verifyResult = sshOps.executeCommand("ls -lh /home/root/xovi/rebuild-hashtable.sh", 20, 1)).getThird()).intValue() != 0) continue;
                    job.addLog("\u2713 rebuild-hashtable.sh confirmed");
                    scriptVerified = true;
                    break;
                }
                catch (Exception e) {
                    if (verifyAttempt == verifyAttempts - 1) {
                        throw new Exception("Cannot verify rebuild-hashtable.sh after " + verifyAttempts + " attempts: " + e.getMessage());
                    }
                    job.addLog("Verification attempt " + (verifyAttempt + 1) + " failed, retrying...");
                }
            }
            if (!scriptVerified) {
                throw new Exception("rebuild-hashtable.sh not found at /home/root/xovi/rebuild-hashtable.sh");
            }
            job.addLog("Preparing for hashtable rebuild...");
            Thread.sleep(3000L);
            job.addLog("Executing hashtable rebuild (this will take several minutes)...");
            job.addLog("Please do not interrupt this process...");
            Triple<String, String, Integer> rebuildResult = sshOps.executeCommand("cd /home/root/xovi && ./rebuild-hashtable.sh", 600, 1);
            job.addLog(StringsKt.repeat("=", 60));
            if (((Number)rebuildResult.getThird()).intValue() == 0) {
                job.addLog("\u2713 Hashtable rebuilt successfully");
            } else {
                job.addLog("\u26a0 WARNING: Hashtable rebuild may have encountered issues");
                job.addLog("Exit code: " + rebuildResult.getThird());
                if (((CharSequence)rebuildResult.getSecond()).length() > 0) {
                    job.addLog("Error output: " + StringsKt.take(rebuildResult.getSecond(), 500));
                }
            }
            job.addLog("Allowing system to stabilize after rebuild...");
            Thread.sleep(6000L);
            job.addLog("Verifying xochitl service is running...");
            int verifyMaxAttempts = 4;
            boolean xochitlVerified = false;
            for (int verifyAttempt = 0; verifyAttempt < verifyMaxAttempts; ++verifyAttempt) {
                try {
                    if (verifyAttempt > 0) {
                        int waitTime = 3 * (verifyAttempt + 1);
                        job.addLog("Verification attempt " + (verifyAttempt + 1) + "/" + verifyMaxAttempts + "...");
                        job.addLog("Waiting " + waitTime + " seconds...");
                        Thread.sleep((long)waitTime * 1000L);
                    }
                    Triple<String, String, Integer> verifyServiceResult = sshOps.executeCommand("systemctl is-active xochitl", 20, 1);
                    String string = verifyServiceResult.getFirst().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
                    if (StringsKt.contains$default((CharSequence)string, "active", false, 2, null)) {
                        job.addLog("\u2713 xochitl service is active");
                        xochitlVerified = true;
                        break;
                    }
                    if (verifyAttempt < verifyMaxAttempts - 1) {
                        job.addLog("xochitl not active yet, waiting for startup...");
                        continue;
                    }
                    job.addLog("\u26a0 xochitl may not be running - attempting to start it...");
                    try {
                        sshOps.executeCommand("systemctl start xochitl", 30, 2);
                        Thread.sleep(4000L);
                        job.addLog("xochitl start command sent");
                        xochitlVerified = true;
                    }
                    catch (Exception startError) {
                        job.addLog("Warning: Could not start xochitl: " + startError.getMessage());
                    }
                    continue;
                }
                catch (Exception e) {
                    if (verifyAttempt == verifyMaxAttempts - 1) {
                        job.addLog("\u26a0 WARNING: xochitl verification failed: " + e.getMessage());
                        job.addLog("Device may need manual restart");
                        continue;
                    }
                    job.addLog("Verification attempt failed, retrying...");
                }
            }
            job.markStageComplete("hashtable_rebuild");
        }
        catch (Exception e) {
            job.addLog("\u26a0 WARNING: Hashtable rebuild encountered issues: " + e.getMessage());
            job.addLog(StringsKt.repeat("=", 60));
            job.addLog("TROUBLESHOOTING STEPS:");
            job.addLog("1. Manually reboot your reMarkable device");
            job.addLog("2. Wait 2-3 minutes for complete boot");
            job.addLog("3. Verify device is accessible via SSH");
            job.addLog("4. Run maintenance tasks again");
            job.addLog(StringsKt.repeat("=", 60));
        }
        job.updateStatus("complete", "Maintenance tasks completed successfully!", 100, 2, "Complete", "complete");
        job.addLog(StringsKt.repeat("=", 64));
        job.addLog("\u2713 Maintenance tasks completed successfully!");
        job.addLog(StringsKt.repeat("=", 64));
        job.addLog("\ud83d\udcf1 KOReader, AppLoad, and Tripletap have been re-enabled");
        job.addLog("\u26a1 Triple-press power button to launch AppLoad");
        job.addLog("\ud83d\udcd6 Your device is ready to use");
        job.addLog(StringsKt.repeat("=", 64));
    }

    public static final void processInstallationAsync(@NotNull InstallationJob job) {
        Intrinsics.checkNotNullParameter(job, "job");
        try {
            String string = job.getConfig().getInstallationType();
            if (Intrinsics.areEqual(string, "uninstall")) {
                MainKt.uninstallXovi(job);
            } else if (Intrinsics.areEqual(string, "maintenance")) {
                MainKt.processMaintenanceTasks(job);
            } else {
                MainKt.processInstallation(job);
            }
            job.setComplete();
        }
        catch (Exception e) {
            GlobalState.INSTANCE.addLog("Installation failed for job " + job.getId() + ": " + e.getMessage());
            job.setError(e);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void TitleSection(@Nullable String subtitle, @Nullable Composer $composer, int $changed, int n) {
        block18: {
            $composer = $composer.startRestartGroup(86268253);
            ComposerKt.sourceInformation($composer, "C(TitleSection)3645@137750L1237:Main.kt#p91eg0");
            int $dirty = $changed;
            if ((n & 1) != 0) {
                $dirty |= 6;
            } else if (($changed & 6) == 0) {
                $dirty |= $composer.changed(subtitle) ? 4 : 2;
            }
            if (($dirty & 3) != 2 || !$composer.getSkipping()) {
                void $composer2;
                void $changed$iv$iv$iv;
                void $changed$iv$iv;
                void modifier$iv;
                void $changed$iv;
                void horizontalAlignment$iv;
                void $composer$iv;
                void $composer3;
                void $changed$iv$iv$iv2;
                void $changed$iv$iv2;
                void modifier$iv2;
                void $changed$iv2;
                void verticalAlignment$iv;
                void horizontalArrangement$iv;
                void $composer$iv2;
                if ((n & 1) != 0) {
                    subtitle = "";
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(86268253, $dirty, -1, "org.example.TitleSection (Main.kt:3644)");
                }
                Modifier modifier = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                Arrangement.Horizontal horizontal = Arrangement.INSTANCE.getSpaceBetween();
                Alignment.Vertical vertical = Alignment.Companion.getCenterVertically();
                Composer composer = $composer;
                int n2 = 438;
                boolean $i$f$Row = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy((Arrangement.Horizontal)horizontalArrangement$iv, (Alignment.Vertical)verticalAlignment$iv, (Composer)$composer$iv2, 0xE & $changed$iv2 >> 3 | 0x70 & $changed$iv2 >> 3);
                int n3 = 0x70 & $changed$iv2 << 3;
                boolean $i$f$Layout = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv2, 0);
                CompositionLocalMap localMap$iv$iv = $composer$iv2.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier((Composer)$composer$iv2, (Modifier)modifier$iv2);
                Function0<ComposeUiNode> function0 = ComposeUiNode.Companion.getConstructor();
                int n4 = 6 | 0x380 & $changed$iv$iv2 << 6;
                boolean $i$f$ReusableComposeNode = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer$iv2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv2.startReusableNode();
                if ($composer$iv2.getInserting()) {
                    void factory$iv$iv$iv;
                    $composer$iv2.createNode(factory$iv$iv$iv);
                } else {
                    $composer$iv2.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl((Composer)$composer$iv2);
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
                int n5 = 0xE & $changed$iv$iv$iv2 >> 6;
                void $composer$iv3 = $composer$iv2;
                boolean bl4 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                int n6 = 6 | 0x70 & $changed$iv2 >> 6;
                void var30_30 = $composer$iv3;
                RowScope $this$TitleSection_u24lambda_u240 = RowScopeInstance.INSTANCE;
                boolean bl5 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer3, -229781275, "C3650@137928L38,3651@137975L744,3672@138728L253:Main.kt#p91eg0");
                SpacerKt.Spacer(RowScope.weight$default($this$TitleSection_u24lambda_u240, Modifier.Companion, 1.0f, false, 2, null), (Composer)$composer3, 0);
                Alignment.Horizontal horizontal2 = Alignment.Companion.getCenterHorizontally();
                Object object = RowScope.weight$default($this$TitleSection_u24lambda_u240, Modifier.Companion, 2.0f, false, 2, null);
                Alignment.Horizontal horizontal3 = horizontal2;
                Modifier modifier2 = $composer3;
                int n7 = 384;
                boolean $i$f$Column = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
                MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, (Alignment.Horizontal)horizontalAlignment$iv, (Composer)$composer$iv, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3);
                int n8 = 0x70 & $changed$iv << 3;
                boolean $i$f$Layout2 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv, 0);
                CompositionLocalMap localMap$iv$iv2 = $composer$iv.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier((Composer)$composer$iv, (Modifier)modifier$iv);
                Function0<ComposeUiNode> function02 = ComposeUiNode.Companion.getConstructor();
                int n9 = 6 | 0x380 & $changed$iv$iv << 6;
                boolean $i$f$ReusableComposeNode2 = false;
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
                Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.constructor-impl((Composer)$composer$iv);
                $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = false;
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> block$iv$iv$iv2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                $i$f$set-impl = false;
                Composer $this$set_impl_u24lambda_u240$iv$iv$iv2 = $this$Layout_u24lambda_u240$iv$iv2;
                $i$a$-with-Updater$set$1$iv$iv$iv = false;
                if ($this$set_impl_u24lambda_u240$iv$iv$iv2.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv2.rememberedValue(), (Object)compositeKeyHash$iv$iv2)) {
                    $this$set_impl_u24lambda_u240$iv$iv$iv2.updateRememberedValue(compositeKeyHash$iv$iv2);
                    $this$Layout_u24lambda_u240$iv$iv2.apply(compositeKeyHash$iv$iv2, block$iv$iv$iv2);
                }
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
                int n10 = 0xE & $changed$iv$iv$iv >> 6;
                void $composer$iv4 = $composer$iv;
                boolean bl6 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv4, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                int n11 = 6 | 0x70 & $changed$iv >> 6;
                void var59_59 = $composer$iv4;
                ColumnScope $this$TitleSection_u24lambda_u240_u240 = ColumnScopeInstance.INSTANCE;
                boolean bl7 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer2, 1883339321, "C3655@138114L305:Main.kt#p91eg0");
                long l = ColorPalette.INSTANCE.getPrimaryVariant-0d7_KjU();
                SystemFontFamily systemFontFamily = FontFamily.Companion.getDefault();
                FontWeight fontWeight = FontWeight.Companion.getBold();
                long l2 = TextUnitKt.getSp(28);
                int n12 = TextAlign.Companion.getCenter-e0LSkKk();
                TextKt.Text--4IGK_g("READMarkable\u2122 KOReader Installer", null, l, l2, null, fontWeight, (FontFamily)systemFontFamily, 0L, null, TextAlign.box-impl(n12), 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 200070, 0, 130450);
                if (((CharSequence)subtitle).length() > 0) {
                    $composer2.startReplaceGroup(1883670865);
                    ComposerKt.sourceInformation((Composer)$composer2, "3664@138477L218");
                    TextKt.Text--4IGK_g(subtitle, null, Color.copy-wmQWz5c$default(ColorPalette.INSTANCE.getOnSurface-0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(14), null, null, null, 0L, null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 0xD80 | 0xE & $dirty, 0, 130546);
                    $composer2.endReplaceGroup();
                } else {
                    $composer2.startReplaceGroup(1746310795);
                    $composer2.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer2);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv4);
                $composer$iv.endNode();
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
                long l3 = ColorPalette.INSTANCE.getPrimaryVariant-0d7_KjU();
                object = FontFamily.Companion.getDefault();
                long l4 = TextUnitKt.getSp(16);
                modifier2 = RowScope.weight$default($this$TitleSection_u24lambda_u240, Modifier.Companion, 1.0f, false, 2, null);
                n7 = TextAlign.Companion.getEnd-e0LSkKk();
                TextKt.Text--4IGK_g(APP_VERSION, modifier2, l3, l4, null, null, (FontFamily)object, 0L, null, TextAlign.box-impl(n7), 0L, 0, false, 0, 0, null, null, (Composer)$composer3, 3462, 0, 130480);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer3);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv3);
                $composer$iv2.endNode();
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv2);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv2);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                $composer.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScope = $composer.endRestartGroup();
            if (scopeUpdateScope == null) break block18;
            scopeUpdateScope.updateScope((arg_0, arg_1) -> MainKt.TitleSection$lambda$1(subtitle, $changed, n, arg_0, arg_1));
        }
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void StatusSection(@NotNull String inputIP, @NotNull String sshStatus, @NotNull String activationStatus, @Nullable Composer $composer, int $changed) {
        block7: {
            Intrinsics.checkNotNullParameter(inputIP, "inputIP");
            Intrinsics.checkNotNullParameter(sshStatus, "sshStatus");
            Intrinsics.checkNotNullParameter(activationStatus, "activationStatus");
            $composer = $composer.startRestartGroup(538524531);
            ComposerKt.sourceInformation($composer, "C(StatusSection)P(1,2)3691@139275L562,3685@139089L748:Main.kt#p91eg0");
            int $dirty = $changed;
            if (($changed & 6) == 0) {
                $dirty |= $composer.changed(inputIP) ? 4 : 2;
            }
            if (($changed & 0x30) == 0) {
                $dirty |= $composer.changed(sshStatus) ? 32 : 16;
            }
            if (($changed & 0x180) == 0) {
                $dirty |= $composer.changed(activationStatus) ? 256 : 128;
            }
            if (($dirty & 0x93) != 146 || !$composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(538524531, $dirty, -1, "org.example.StatusSection (Main.kt:3684)");
                }
                int $this$dp$iv = 8;
                boolean $i$f$getDp = false;
                Modifier modifier = ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl($this$dp$iv)));
                $this$dp$iv = 4;
                $i$f$getDp = false;
                CardKt.Card-F-jzlyU(ShadowKt.shadow-s4CzXII$default(modifier, Dp.constructor-impl($this$dp$iv), null, false, 0L, 0L, 30, null), null, ColorPalette.INSTANCE.getSurface-0d7_KjU(), 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(2085557680, true, (arg_0, arg_1) -> MainKt.StatusSection$lambda$0(inputIP, sshStatus, activationStatus, arg_0, arg_1), $composer, 54), $composer, 0x180180, 58);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                $composer.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScope = $composer.endRestartGroup();
            if (scopeUpdateScope == null) break block7;
            scopeUpdateScope.updateScope((arg_0, arg_1) -> MainKt.StatusSection$lambda$1(inputIP, sshStatus, activationStatus, $changed, arg_0, arg_1));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void StatusItem(@NotNull String label, @NotNull String value, boolean isStatus, @Nullable Composer $composer, int $changed, int n) {
        block14: {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            $composer = $composer.startRestartGroup(284290450);
            ComposerKt.sourceInformation($composer, "C(StatusItem)P(1,2)3710@139931L851:Main.kt#p91eg0");
            int $dirty = $changed;
            if (($changed & 6) == 0) {
                $dirty |= $composer.changed(label) ? 4 : 2;
            }
            if (($changed & 0x30) == 0) {
                $dirty |= $composer.changed(value) ? 32 : 16;
            }
            if ((n & 4) != 0) {
                $dirty |= 0x180;
            } else if (($changed & 0x180) == 0) {
                $dirty |= $composer.changed(isStatus) ? 256 : 128;
            }
            if (($dirty & 0x93) != 146 || !$composer.getSkipping()) {
                void $composer2;
                void $changed$iv$iv$iv;
                void $changed$iv$iv;
                void modifier$iv;
                void $changed$iv;
                void horizontalArrangement$iv;
                void $composer$iv;
                if ((n & 4) != 0) {
                    isStatus = false;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(284290450, $dirty, -1, "org.example.StatusItem (Main.kt:3709)");
                }
                int $this$dp$iv22 = 4;
                boolean $i$f$getDp22 = false;
                Modifier $this$dp$iv22 = PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, Dp.constructor-impl($this$dp$iv22), 1, null);
                Arrangement.Horizontal $i$f$getDp22 = Arrangement.INSTANCE.getSpaceBetween();
                Composer composer = $composer;
                int n2 = 54;
                boolean $i$f$Row = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getTop();
                MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy((Arrangement.Horizontal)horizontalArrangement$iv, verticalAlignment$iv, (Composer)$composer$iv, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3);
                int n3 = 0x70 & $changed$iv << 3;
                boolean $i$f$Layout = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv, 0);
                CompositionLocalMap localMap$iv$iv = $composer$iv.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier((Composer)$composer$iv, (Modifier)modifier$iv);
                Function0<ComposeUiNode> function0 = ComposeUiNode.Companion.getConstructor();
                int n4 = 6 | 0x380 & $changed$iv$iv << 6;
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
                int n5 = 0xE & $changed$iv$iv$iv >> 6;
                void $composer$iv2 = $composer$iv;
                boolean bl4 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                int n6 = 6 | 0x70 & $changed$iv >> 6;
                void var32_34 = $composer$iv2;
                RowScope $this$StatusItem_u24lambda_u240 = RowScopeInstance.INSTANCE;
                boolean bl5 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer2, -284354123, "C3716@140104L178,3722@140291L485:Main.kt#p91eg0");
                long l = Color.copy-wmQWz5c$default(ColorPalette.INSTANCE.getOnSurface-0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
                SystemFontFamily systemFontFamily = FontFamily.Companion.getDefault();
                long l2 = TextUnitKt.getSp(16);
                TextKt.Text--4IGK_g(label, null, l, l2, null, null, (FontFamily)systemFontFamily, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 0xD80 | 0xE & $dirty, 0, 130994);
                l = isStatus ? (StringsKt.contains$default((CharSequence)value, "Missing", false, 2, null) || StringsKt.contains$default((CharSequence)value, "Expired", false, 2, null) ? ColorPalette.INSTANCE.getError-0d7_KjU() : (StringsKt.contains$default((CharSequence)value, "Active", false, 2, null) || StringsKt.contains$default((CharSequence)value, "Connected", false, 2, null) ? ColorPalette.INSTANCE.getSuccess-0d7_KjU() : ColorPalette.INSTANCE.getOnSurface-0d7_KjU())) : ColorPalette.INSTANCE.getOnSurface-0d7_KjU();
                systemFontFamily = FontFamily.Companion.getMonospace();
                l2 = TextUnitKt.getSp(16);
                TextKt.Text--4IGK_g(value, null, l, l2, null, null, (FontFamily)systemFontFamily, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 0xC00 | 0xE & $dirty >> 3, 0, 130994);
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
            ScopeUpdateScope scopeUpdateScope = $composer.endRestartGroup();
            if (scopeUpdateScope == null) break block14;
            scopeUpdateScope.updateScope((arg_0, arg_1) -> MainKt.StatusItem$lambda$1(label, value, isStatus, $changed, n, arg_0, arg_1));
        }
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void MenuButton-sW7UJKQ(@NotNull String text, long l, boolean enabled, @NotNull Function0<Unit> onClick, @Nullable Composer $composer, int $changed, int n) {
        block14: {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            $composer = $composer.startRestartGroup(2004884312);
            ComposerKt.sourceInformation($composer, "C(MenuButton)P(3,0:c#ui.graphics.Color)3750@141131L143,3755@141323L366,3744@140953L736:Main.kt#p91eg0");
            int $dirty = $changed;
            if (($changed & 6) == 0) {
                $dirty |= $composer.changed(text) ? 4 : 2;
            }
            if ((n & 2) != 0) {
                $dirty |= 0x30;
            } else if (($changed & 0x30) == 0) {
                $dirty |= $composer.changed(l) ? 32 : 16;
            }
            if ((n & 4) != 0) {
                $dirty |= 0x180;
            } else if (($changed & 0x180) == 0) {
                $dirty |= $composer.changed(enabled) ? 256 : 128;
            }
            if (($changed & 0xC00) == 0) {
                $dirty |= $composer.changedInstance(onClick) ? 2048 : 1024;
            }
            if (($dirty & 0x493) != 1170 || !$composer.getSkipping()) {
                if ((n & 2) != 0) {
                    l = ColorPalette.INSTANCE.getButtonBackground-0d7_KjU();
                }
                if ((n & 4) != 0) {
                    enabled = true;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2004884312, $dirty, -1, "org.example.MenuButton (Main.kt:3743)");
                }
                int $this$dp$iv = 48;
                boolean $i$f$getDp = false;
                Modifier modifier = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.constructor-impl($this$dp$iv));
                ButtonColors buttonColors = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(l, 0L, Color.copy-wmQWz5c$default(l, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, $composer, 0xE & $dirty >> 3 | ButtonDefaults.$stable << 12, 10);
                int $this$dp$iv2 = 8;
                boolean $i$f$getDp2 = false;
                RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl($this$dp$iv2));
                ButtonKt.Button(onClick, modifier, enabled, null, null, roundedCornerShape, null, buttonColors, null, ComposableLambdaKt.rememberComposableLambda(-882323640, true, (arg_0, arg_1, arg_2) -> MainKt.MenuButton_sW7UJKQ$lambda$0(enabled, text, arg_0, arg_1, arg_2), $composer, 54), $composer, 0x30000030 | 0xE & $dirty >> 9 | 0x380 & $dirty, 344);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                $composer.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScope = $composer.endRestartGroup();
            if (scopeUpdateScope == null) break block14;
            scopeUpdateScope.updateScope((arg_0, arg_1) -> MainKt.MenuButton_sW7UJKQ$lambda$1(text, l, enabled, onClick, $changed, n, arg_0, arg_1));
        }
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void ProgressSection(@NotNull InstallationStatus status, @Nullable Composer $composer, int $changed) {
        block5: {
            Intrinsics.checkNotNullParameter(status, "status");
            $composer = $composer.startRestartGroup(-2090082103);
            ComposerKt.sourceInformation($composer, "C(ProgressSection)3776@141945L3041,3770@141759L3227:Main.kt#p91eg0");
            int $dirty = $changed;
            if (($changed & 6) == 0) {
                $dirty |= $composer.changedInstance(status) ? 4 : 2;
            }
            if (($dirty & 3) != 2 || !$composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2090082103, $dirty, -1, "org.example.ProgressSection (Main.kt:3769)");
                }
                int $this$dp$iv = 8;
                boolean $i$f$getDp = false;
                Modifier modifier = ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl($this$dp$iv)));
                $this$dp$iv = 4;
                $i$f$getDp = false;
                CardKt.Card-F-jzlyU(ShadowKt.shadow-s4CzXII$default(modifier, Dp.constructor-impl($this$dp$iv), null, false, 0L, 0L, 30, null), null, ColorPalette.INSTANCE.getSurface-0d7_KjU(), 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-543048954, true, (arg_0, arg_1) -> MainKt.ProgressSection$lambda$0(status, arg_0, arg_1), $composer, 54), $composer, 0x180180, 58);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                $composer.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScope = $composer.endRestartGroup();
            if (scopeUpdateScope == null) break block5;
            scopeUpdateScope.updateScope((arg_0, arg_1) -> MainKt.ProgressSection$lambda$1(status, $changed, arg_0, arg_1));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void LogSection(@NotNull List<String> logs, @Nullable Composer $composer, int $changed) {
        block9: {
            Intrinsics.checkNotNullParameter(logs, "logs");
            $composer = $composer.startRestartGroup(559547990);
            ComposerKt.sourceInformation($composer, "C(LogSection)3868@145251L23,3869@145300L24,3871@145356L161,3871@145330L187,3886@145737L2494,3879@145523L2708:Main.kt#p91eg0");
            int $dirty = $changed;
            if (($changed & 6) == 0) {
                $dirty |= $composer.changedInstance(logs) ? 4 : 2;
            }
            if (($dirty & 3) != 2 || !$composer.getSkipping()) {
                Object object;
                void $this$cache$iv;
                Object object2;
                void $this$cache$iv$iv;
                Composer $composer$iv;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(559547990, $dirty, -1, "org.example.LogSection (Main.kt:3867)");
                }
                LazyListState listState = LazyListStateKt.rememberLazyListState(0, 0, $composer, 0, 3);
                Composer composer = $composer;
                boolean bl = false;
                boolean $i$f$rememberCoroutineScope = false;
                ComposerKt.sourceInformationMarkerStart($composer$iv, 773894976, "CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp");
                void composer$iv = $composer$iv;
                ComposerKt.sourceInformationMarkerStart($composer$iv, -954370320, "CC(remember):Effects.kt#9igjgp");
                void var11_10 = $composer$iv;
                boolean invalid$iv$iv = false;
                boolean $i$f$cache = false;
                Object it$iv$iv = $this$cache$iv$iv.rememberedValue();
                boolean bl2 = false;
                if (it$iv$iv == Composer.Companion.getEmpty()) {
                    boolean bl3 = false;
                    boolean bl4 = false;
                    CoroutineScope coroutineScope = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, (Composer)composer$iv);
                    CompositionScopedCoroutineScopeCanceller value$iv$iv = new CompositionScopedCoroutineScopeCanceller(coroutineScope);
                    $this$cache$iv$iv.updateRememberedValue(value$iv$iv);
                    object2 = value$iv$iv;
                } else {
                    object2 = it$iv$iv;
                }
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = (CompositionScopedCoroutineScopeCanceller)object2;
                ComposerKt.sourceInformationMarkerEnd($composer$iv);
                CompositionScopedCoroutineScopeCanceller wrapper$iv = compositionScopedCoroutineScopeCanceller;
                compositionScopedCoroutineScopeCanceller = wrapper$iv.getCoroutineScope();
                ComposerKt.sourceInformationMarkerEnd($composer$iv);
                CompositionScopedCoroutineScopeCanceller coroutineScope = compositionScopedCoroutineScopeCanceller;
                Integer n = logs.size();
                ComposerKt.sourceInformationMarkerStart($composer, 854711735, "CC(remember):Main.kt#9igjgp");
                $composer$iv = $composer;
                boolean invalid$iv = $composer.changedInstance(logs) | $composer.changedInstance(coroutineScope) | $composer.changed(listState);
                boolean $i$f$cache2 = false;
                Object it$iv = $this$cache$iv.rememberedValue();
                boolean bl5 = false;
                if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
                    Integer n2 = n;
                    boolean bl6 = false;
                    n = n2;
                    Function2 value$iv = new Function2<CoroutineScope, Continuation<? super Unit>, Object>(logs, (CoroutineScope)coroutineScope, listState, null){
                        int label;
                        final /* synthetic */ List<String> $logs;
                        final /* synthetic */ CoroutineScope $coroutineScope;
                        final /* synthetic */ LazyListState $listState;
                        {
                            this.$logs = $logs;
                            this.$coroutineScope = $coroutineScope;
                            this.$listState = $listState;
                            super(2, $completion);
                        }

                        public final Object invokeSuspend(Object $result) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            switch (this.label) {
                                case 0: {
                                    ResultKt.throwOnFailure($result);
                                    if (!((Collection)this.$logs).isEmpty()) {
                                        BuildersKt.launch$default((CoroutineScope)this.$coroutineScope, null, null, (Function2)new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$listState, this.$logs, null){
                                            int label;
                                            final /* synthetic */ LazyListState $listState;
                                            final /* synthetic */ List<String> $logs;
                                            {
                                                this.$listState = $listState;
                                                this.$logs = $logs;
                                                super(2, $completion);
                                            }

                                            /*
                                             * Enabled force condition propagation
                                             * Lifted jumps to return sites
                                             */
                                            public final Object invokeSuspend(Object $result) {
                                                Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                switch (this.label) {
                                                    case 0: {
                                                        ResultKt.throwOnFailure($result);
                                                        this.label = 1;
                                                        Object object2 = LazyListState.animateScrollToItem$default(this.$listState, this.$logs.size() - 1, 0, this, 2, null);
                                                        if (object2 != object) return Unit.INSTANCE;
                                                        return object;
                                                    }
                                                    case 1: {
                                                        ResultKt.throwOnFailure($result);
                                                        Object object2 = $result;
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
                                        }, (int)3, null);
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
                    object = it$iv;
                }
                Function2 function2 = (Function2)object;
                ComposerKt.sourceInformationMarkerEnd($composer);
                EffectsKt.LaunchedEffect(n, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>)function2, $composer, 0);
                int $this$dp$iv = 350;
                boolean $i$f$getDp = false;
                Modifier modifier = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.constructor-impl($this$dp$iv));
                $this$dp$iv = 8;
                $i$f$getDp = false;
                Modifier modifier2 = ClipKt.clip(modifier, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl($this$dp$iv)));
                $this$dp$iv = 4;
                $i$f$getDp = false;
                CardKt.Card-F-jzlyU(ShadowKt.shadow-s4CzXII$default(modifier2, Dp.constructor-impl($this$dp$iv), null, false, 0L, 0L, 30, null), null, ColorPalette.INSTANCE.getSurface-0d7_KjU(), 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(1383318329, true, (arg_0, arg_1) -> MainKt.LogSection$lambda$1(logs, listState, arg_0, arg_1), $composer, 54), $composer, 0x180180, 58);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                $composer.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScope = $composer.endRestartGroup();
            if (scopeUpdateScope == null) break block9;
            scopeUpdateScope.updateScope((arg_0, arg_1) -> MainKt.LogSection$lambda$2(logs, $changed, arg_0, arg_1));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void ActivationScreen(@NotNull String machineId, @NotNull Function1<? super String, Boolean> onActivate, @NotNull Function0<Unit> onUninstallerActivate, @Nullable Composer $composer, int $changed) {
        block17: {
            Intrinsics.checkNotNullParameter(machineId, "machineId");
            Intrinsics.checkNotNullParameter(onActivate, "onActivate");
            Intrinsics.checkNotNullParameter(onUninstallerActivate, "onUninstallerActivate");
            $composer = $composer.startRestartGroup(235584609);
            ComposerKt.sourceInformation($composer, "C(ActivationScreen)3959@148585L31,3960@148641L31,3961@148699L31,3963@148736L7864:Main.kt#p91eg0");
            int $dirty = $changed;
            if (($changed & 6) == 0) {
                $dirty |= $composer.changed(machineId) ? 4 : 2;
            }
            if (($changed & 0x30) == 0) {
                $dirty |= $composer.changedInstance(onActivate) ? 32 : 16;
            }
            if (($changed & 0x180) == 0) {
                $dirty |= $composer.changedInstance(onUninstallerActivate) ? 256 : 128;
            }
            if (($dirty & 0x93) != 146 || !$composer.getSkipping()) {
                void $composer2;
                void $changed$iv$iv$iv;
                void $changed$iv$iv;
                void modifier$iv;
                void $changed$iv;
                void contentAlignment$iv;
                void $composer$iv;
                Object object;
                Alignment $this$cache$iv;
                Object object2;
                Object $this$cache$iv2;
                Object object3;
                MutableState $this$cache$iv3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(235584609, $dirty, -1, "org.example.ActivationScreen (Main.kt:3958)");
                }
                ComposerKt.sourceInformationMarkerStart($composer, -1236452608, "CC(remember):Main.kt#9igjgp");
                Composer composer = $composer;
                boolean invalid$iv22 = false;
                boolean $i$f$cache = false;
                Object it$iv = $this$cache$iv3.rememberedValue();
                boolean bl = false;
                if (it$iv == Composer.Companion.getEmpty()) {
                    boolean bl2 = false;
                    MutableState value$iv = SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                    $this$cache$iv3.updateRememberedValue(value$iv);
                    object3 = value$iv;
                } else {
                    object3 = it$iv;
                }
                MutableState mutableState = (MutableState)object3;
                ComposerKt.sourceInformationMarkerEnd($composer);
                MutableState activationCode$delegate = mutableState;
                ComposerKt.sourceInformationMarkerStart($composer, -1236450816, "CC(remember):Main.kt#9igjgp");
                Composer invalid$iv22 = $composer;
                boolean invalid$iv32 = false;
                boolean $i$f$cache2 = false;
                Object it$iv2 = $this$cache$iv2.rememberedValue();
                $i$a$-let-ComposerKt$cache$1$iv = false;
                if (it$iv2 == Composer.Companion.getEmpty()) {
                    boolean bl3 = false;
                    MutableState value$iv = SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                    $this$cache$iv2.updateRememberedValue(value$iv);
                    object2 = value$iv;
                } else {
                    object2 = it$iv2;
                }
                $this$cache$iv3 = (MutableState)object2;
                ComposerKt.sourceInformationMarkerEnd($composer);
                MutableState errorMessage$delegate = $this$cache$iv3;
                ComposerKt.sourceInformationMarkerStart($composer, -1236448960, "CC(remember):Main.kt#9igjgp");
                Composer invalid$iv32 = $composer;
                boolean invalid$iv = false;
                boolean $i$f$cache222 = false;
                Object it$iv222 = $this$cache$iv.rememberedValue();
                $i$a$-let-ComposerKt$cache$1$iv = false;
                if (it$iv222 == Composer.Companion.getEmpty()) {
                    boolean bl4 = false;
                    MutableState value$iv = SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                    $this$cache$iv.updateRememberedValue(value$iv);
                    object = value$iv;
                } else {
                    object = it$iv222;
                }
                $this$cache$iv2 = (Color[])object;
                ComposerKt.sourceInformationMarkerEnd($composer);
                Color[] successMessage$delegate = $this$cache$iv2;
                $this$cache$iv2 = new Color[]{Color.box-impl(ColorPalette.INSTANCE.getBackground-0d7_KjU()), Color.box-impl(ColorPalette.INSTANCE.getSurface-0d7_KjU())};
                $this$cache$iv2 = BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Brush.Companion.verticalGradient-8A-3gB4$default(Brush.Companion, CollectionsKt.listOf($this$cache$iv2), 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null);
                $this$cache$iv = Alignment.Companion.getCenter();
                Composer $i$f$cache222 = $composer;
                int it$iv222 = 54;
                boolean $i$f$Box = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                boolean propagateMinConstraints$iv = false;
                MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy((Alignment)contentAlignment$iv, propagateMinConstraints$iv);
                int n = 0x70 & $changed$iv << 3;
                boolean $i$f$Layout = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv, 0);
                CompositionLocalMap localMap$iv$iv = $composer$iv.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier((Composer)$composer$iv, (Modifier)modifier$iv);
                Function0<ComposeUiNode> function0 = ComposeUiNode.Companion.getConstructor();
                int n2 = 6 | 0x380 & $changed$iv$iv << 6;
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
                boolean bl5 = false;
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash();
                boolean bl6 = false;
                Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv;
                boolean bl7 = false;
                if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), (Object)compositeKeyHash$iv$iv)) {
                    $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(compositeKeyHash$iv$iv);
                    $this$Layout_u24lambda_u240$iv$iv.apply(compositeKeyHash$iv$iv, block$iv$iv$iv);
                }
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
                int n3 = 0xE & $changed$iv$iv$iv >> 6;
                void $composer$iv2 = $composer$iv;
                boolean bl8 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                int n4 = 6 | 0x70 & $changed$iv >> 6;
                void var34_47 = $composer$iv2;
                BoxScope $this$ActivationScreen_u24lambda_u249 = BoxScopeInstance.INSTANCE;
                boolean bl9 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer2, 846761239, "C3979@149239L7355,3973@149037L7557:Main.kt#p91eg0");
                int $this$dp$iv = 600;
                boolean $i$f$getDp = false;
                Modifier modifier = SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv));
                $this$dp$iv = 20;
                $i$f$getDp = false;
                Modifier modifier2 = ClipKt.clip(modifier, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl($this$dp$iv)));
                $this$dp$iv = 20;
                $i$f$getDp = false;
                CardKt.Card-F-jzlyU(ShadowKt.shadow-s4CzXII$default(modifier2, Dp.constructor-impl($this$dp$iv), null, false, 0L, 0L, 30, null), null, Color.Companion.getWhite-0d7_KjU(), 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(1192248458, true, (arg_0, arg_1) -> MainKt.ActivationScreen$lambda$9$0(onUninstallerActivate, onActivate, machineId, activationCode$delegate, errorMessage$delegate, (MutableState)successMessage$delegate, arg_0, arg_1), (Composer)$composer2, 54), (Composer)$composer2, 0x180180, 58);
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
            ScopeUpdateScope scopeUpdateScope = $composer.endRestartGroup();
            if (scopeUpdateScope == null) break block17;
            scopeUpdateScope.updateScope((arg_0, arg_1) -> MainKt.ActivationScreen$lambda$10(machineId, onActivate, onUninstallerActivate, $changed, arg_0, arg_1));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void ExpiredScreen(@Nullable Composer $composer, int $changed) {
        block8: {
            $composer = $composer.startRestartGroup(1707782468);
            ComposerKt.sourceInformation($composer, "C(ExpiredScreen)4166@156827L1923:Main.kt#p91eg0");
            if ($changed != 0 || !$composer.getSkipping()) {
                void $composer2;
                void $changed$iv$iv$iv;
                void $changed$iv$iv;
                void modifier$iv;
                void $changed$iv;
                void contentAlignment$iv;
                void $composer$iv;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1707782468, $changed, -1, "org.example.ExpiredScreen (Main.kt:4165)");
                }
                Object object = new Color[]{Color.box-impl(ColorPalette.INSTANCE.getBackground-0d7_KjU()), Color.box-impl(ColorPalette.INSTANCE.getSurface-0d7_KjU())};
                object = BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Brush.Companion.verticalGradient-8A-3gB4$default(Brush.Companion, CollectionsKt.listOf(object), 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null);
                Alignment alignment = Alignment.Companion.getCenter();
                Composer composer = $composer;
                int n = 54;
                boolean $i$f$Box = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                boolean propagateMinConstraints$iv = false;
                MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy((Alignment)contentAlignment$iv, propagateMinConstraints$iv);
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
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                int n5 = 6 | 0x70 & $changed$iv >> 6;
                void var27_27 = $composer$iv2;
                BoxScope $this$ExpiredScreen_u24lambda_u240 = BoxScopeInstance.INSTANCE;
                boolean bl5 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer2, -916643531, "C4176@157128L1616:Main.kt#p91eg0");
                int $this$dp$iv = 600;
                boolean $i$f$getDp = false;
                Modifier modifier = SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv));
                $this$dp$iv = 20;
                $i$f$getDp = false;
                Modifier modifier2 = ClipKt.clip(modifier, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl($this$dp$iv)));
                $this$dp$iv = 20;
                $i$f$getDp = false;
                CardKt.Card-F-jzlyU(ShadowKt.shadow-s4CzXII$default(modifier2, Dp.constructor-impl($this$dp$iv), null, false, 0L, 0L, 30, null), null, Color.Companion.getWhite-0d7_KjU(), 0L, null, 0.0f, ComposableSingletons$MainKt.INSTANCE.getLambda$1473079419$kotlinkoreader18(), (Composer)$composer2, 0x180180, 58);
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
            ScopeUpdateScope scopeUpdateScope = $composer.endRestartGroup();
            if (scopeUpdateScope == null) break block8;
            scopeUpdateScope.updateScope((arg_0, arg_1) -> MainKt.ExpiredScreen$lambda$1($changed, arg_0, arg_1));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void MainInstallerScreen(int daysRemaining, boolean isUninstallerOnly, @NotNull Function0<Unit> onExit, @Nullable Composer $composer, int $changed, int n) {
        block55: {
            Intrinsics.checkNotNullParameter(onExit, "onExit");
            $composer = $composer.startRestartGroup(1938420667);
            ComposerKt.sourceInformation($composer, "C(MainInstallerScreen)4236@159094L41,4237@159159L31,4238@159214L56,4239@159299L35,4240@159362L33,4241@159420L33,4243@159479L34,4244@159539L54,4245@159610L45,4247@159682L24,4287@161092L17879:Main.kt#p91eg0");
            int $dirty = $changed;
            if (($changed & 6) == 0) {
                $dirty |= $composer.changed(daysRemaining) ? 4 : 2;
            }
            if ((n & 2) != 0) {
                $dirty |= 0x30;
            } else if (($changed & 0x30) == 0) {
                $dirty |= $composer.changed(isUninstallerOnly) ? 32 : 16;
            }
            if (($dirty & 0x13) != 18 || !$composer.getSkipping()) {
                void $composer2;
                int $changed$iv$iv$iv;
                Function0<ComposeUiNode> factory$iv$iv$iv;
                int $changed$iv$iv;
                Modifier modifier$iv;
                void $composer$iv;
                void $composer3;
                void $changed$iv$iv$iv2;
                void $changed$iv$iv2;
                void modifier$iv2;
                void $changed$iv;
                void horizontalArrangement$iv;
                void $composer$iv2;
                Object object;
                void $composer4;
                void $changed$iv$iv$iv3;
                void $changed$iv$iv3;
                void modifier$iv3;
                void $changed$iv2;
                void $composer$iv3;
                void $composer5;
                void $changed$iv$iv$iv4;
                void $changed$iv$iv4;
                void modifier$iv4;
                void $changed$iv3;
                void $composer$iv4;
                Object object2;
                void $this$cache$iv$iv;
                void $composer$iv5;
                Object object3;
                MutableState value$iv;
                Object $this$cache$iv;
                Object object4;
                MutableState $this$cache$iv2;
                Object object5;
                MutableState $this$cache$iv3;
                Object object6;
                MutableState $this$cache$iv4;
                Object object7;
                MutableState $this$cache$iv5;
                Object object8;
                MutableState $this$cache$iv6;
                Object object9;
                MutableState $this$cache$iv7;
                Object object10;
                MutableState $this$cache$iv8;
                Object object11;
                MutableState $this$cache$iv9;
                if ((n & 2) != 0) {
                    isUninstallerOnly = false;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1938420667, $dirty, -1, "org.example.MainInstallerScreen (Main.kt:4235)");
                }
                ComposerKt.sourceInformationMarkerStart($composer, -1193541084, "CC(remember):Main.kt#9igjgp");
                Composer composer = $composer;
                boolean invalid$iv22 = false;
                boolean $i$f$cache = false;
                Object it$iv = $this$cache$iv9.rememberedValue();
                boolean bl = false;
                if (it$iv == Composer.Companion.getEmpty()) {
                    boolean bl2 = false;
                    MutableState value$iv2 = SnapshotStateKt.mutableStateOf$default("10.11.99.1", null, 2, null);
                    $this$cache$iv9.updateRememberedValue(value$iv2);
                    object11 = value$iv2;
                } else {
                    object11 = it$iv;
                }
                MutableState mutableState = (MutableState)object11;
                ComposerKt.sourceInformationMarkerEnd($composer);
                MutableState deviceIP$delegate = mutableState;
                ComposerKt.sourceInformationMarkerStart($composer, -1193539014, "CC(remember):Main.kt#9igjgp");
                Composer invalid$iv22 = $composer;
                boolean invalid$iv32 = false;
                boolean $i$f$cache2 = false;
                Object it$iv2 = $this$cache$iv8.rememberedValue();
                $i$a$-let-ComposerKt$cache$1$iv = false;
                if (it$iv2 == Composer.Companion.getEmpty()) {
                    boolean bl3 = false;
                    MutableState value$iv3 = SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                    $this$cache$iv8.updateRememberedValue(value$iv3);
                    object10 = value$iv3;
                } else {
                    object10 = it$iv2;
                }
                $this$cache$iv9 = (MutableState)object10;
                ComposerKt.sourceInformationMarkerEnd($composer);
                MutableState sshPassword$delegate = $this$cache$iv9;
                ComposerKt.sourceInformationMarkerStart($composer, -1193537229, "CC(remember):Main.kt#9igjgp");
                Composer invalid$iv32 = $composer;
                boolean invalid$iv42 = false;
                boolean $i$f$cache3 = false;
                Object it$iv3 = $this$cache$iv7.rememberedValue();
                $i$a$-let-ComposerKt$cache$1$iv = false;
                if (it$iv3 == Composer.Companion.getEmpty()) {
                    boolean bl4 = false;
                    MutableState value$iv4 = SnapshotStateKt.mutableStateOf$default("remarkable-paper-pro-move", null, 2, null);
                    $this$cache$iv7.updateRememberedValue(value$iv4);
                    object9 = value$iv4;
                } else {
                    object9 = it$iv3;
                }
                $this$cache$iv8 = (MutableState)object9;
                ComposerKt.sourceInformationMarkerEnd($composer);
                MutableState deviceModel$delegate = $this$cache$iv8;
                ComposerKt.sourceInformationMarkerStart($composer, -1193534530, "CC(remember):Main.kt#9igjgp");
                Composer invalid$iv42 = $composer;
                boolean invalid$iv52 = false;
                boolean $i$f$cache4 = false;
                Object it$iv4 = $this$cache$iv6.rememberedValue();
                $i$a$-let-ComposerKt$cache$1$iv = false;
                if (it$iv4 == Composer.Companion.getEmpty()) {
                    boolean bl5 = false;
                    MutableState value$iv5 = SnapshotStateKt.mutableStateOf$default("full", null, 2, null);
                    $this$cache$iv6.updateRememberedValue(value$iv5);
                    object8 = value$iv5;
                } else {
                    object8 = it$iv4;
                }
                $this$cache$iv7 = (MutableState)object8;
                ComposerKt.sourceInformationMarkerEnd($composer);
                MutableState installationType$delegate = $this$cache$iv7;
                ComposerKt.sourceInformationMarkerStart($composer, -1193532516, "CC(remember):Main.kt#9igjgp");
                Composer invalid$iv52 = $composer;
                boolean invalid$iv62 = false;
                boolean $i$f$cache5 = false;
                Object it$iv5 = $this$cache$iv5.rememberedValue();
                $i$a$-let-ComposerKt$cache$1$iv = false;
                if (it$iv5 == Composer.Companion.getEmpty()) {
                    boolean bl6 = false;
                    MutableState value$iv6 = SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                    $this$cache$iv5.updateRememberedValue(value$iv6);
                    object7 = value$iv6;
                } else {
                    object7 = it$iv5;
                }
                $this$cache$iv6 = (MutableState)object7;
                ComposerKt.sourceInformationMarkerEnd($composer);
                MutableState enableTripletap$delegate = $this$cache$iv6;
                ComposerKt.sourceInformationMarkerStart($composer, -1193530660, "CC(remember):Main.kt#9igjgp");
                Composer invalid$iv62 = $composer;
                boolean invalid$iv72 = false;
                boolean $i$f$cache6 = false;
                Object it$iv6 = $this$cache$iv4.rememberedValue();
                $i$a$-let-ComposerKt$cache$1$iv = false;
                if (it$iv6 == Composer.Companion.getEmpty()) {
                    boolean bl7 = false;
                    MutableState value$iv7 = SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                    $this$cache$iv4.updateRememberedValue(value$iv7);
                    object6 = value$iv7;
                } else {
                    object6 = it$iv6;
                }
                $this$cache$iv5 = (MutableState)object6;
                ComposerKt.sourceInformationMarkerEnd($composer);
                MutableState createBackup$delegate = $this$cache$iv5;
                ComposerKt.sourceInformationMarkerStart($composer, -1193528771, "CC(remember):Main.kt#9igjgp");
                Composer invalid$iv72 = $composer;
                boolean invalid$iv82 = false;
                boolean $i$f$cache7 = false;
                Object it$iv7 = $this$cache$iv3.rememberedValue();
                $i$a$-let-ComposerKt$cache$1$iv = false;
                if (it$iv7 == Composer.Companion.getEmpty()) {
                    boolean bl8 = false;
                    MutableState value$iv8 = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    $this$cache$iv3.updateRememberedValue(value$iv8);
                    object5 = value$iv8;
                } else {
                    object5 = it$iv7;
                }
                $this$cache$iv4 = (MutableState)object5;
                ComposerKt.sourceInformationMarkerEnd($composer);
                MutableState isInstalling$delegate = $this$cache$iv4;
                ComposerKt.sourceInformationMarkerStart($composer, -1193526831, "CC(remember):Main.kt#9igjgp");
                Composer invalid$iv82 = $composer;
                boolean invalid$iv92 = false;
                boolean $i$f$cache8 = false;
                Object it$iv8 = $this$cache$iv2.rememberedValue();
                $i$a$-let-ComposerKt$cache$1$iv = false;
                if (it$iv8 == Composer.Companion.getEmpty()) {
                    boolean bl9 = false;
                    MutableState value$iv9 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    $this$cache$iv2.updateRememberedValue(value$iv9);
                    object4 = value$iv9;
                } else {
                    object4 = it$iv8;
                }
                $this$cache$iv3 = (MutableState)object4;
                ComposerKt.sourceInformationMarkerEnd($composer);
                MutableState currentStatus$delegate = $this$cache$iv3;
                ComposerKt.sourceInformationMarkerStart($composer, -1193524568, "CC(remember):Main.kt#9igjgp");
                Composer invalid$iv92 = $composer;
                boolean invalid$iv102 = false;
                boolean $i$f$cache9 = false;
                Object it$iv9 = $this$cache$iv.rememberedValue();
                $i$a$-let-ComposerKt$cache$1$iv = false;
                if (it$iv9 == Composer.Companion.getEmpty()) {
                    boolean bl10 = false;
                    value$iv = SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    $this$cache$iv.updateRememberedValue(value$iv);
                    object3 = value$iv;
                } else {
                    object3 = it$iv9;
                }
                $this$cache$iv2 = (MutableState)object3;
                ComposerKt.sourceInformationMarkerEnd($composer);
                MutableState logs$delegate = $this$cache$iv2;
                Composer invalid$iv102 = $composer;
                $i$f$cache9 = false;
                boolean $i$f$rememberCoroutineScope22 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv5, 773894976, "CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp");
                void composer$iv22 = $composer$iv5;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv5, -954370320, "CC(remember):Effects.kt#9igjgp");
                value$iv = $composer$iv5;
                boolean invalid$iv$iv = false;
                int $i$f$cache10 = 0;
                Object it$iv$iv = $this$cache$iv$iv.rememberedValue();
                boolean bl11 = false;
                if (it$iv$iv == Composer.Companion.getEmpty()) {
                    boolean bl12 = false;
                    boolean bl13 = false;
                    CoroutineScope coroutineScope = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, (Composer)composer$iv22);
                    CompositionScopedCoroutineScopeCanceller value$iv$iv = new CompositionScopedCoroutineScopeCanceller(coroutineScope);
                    $this$cache$iv$iv.updateRememberedValue(value$iv$iv);
                    object2 = value$iv$iv;
                } else {
                    object2 = it$iv$iv;
                }
                Object object12 = (CompositionScopedCoroutineScopeCanceller)object2;
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv5);
                CompositionScopedCoroutineScopeCanceller wrapper$iv22 = object12;
                object12 = wrapper$iv22.getCoroutineScope();
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv5);
                CompositionScopedCoroutineScopeCanceller coroutineScope = object12;
                $this$cache$iv = new Color[]{Color.box-impl(ColorPalette.INSTANCE.getBackground-0d7_KjU()), Color.box-impl(ColorPalette.INSTANCE.getSurface-0d7_KjU())};
                $this$cache$iv = BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Brush.Companion.verticalGradient-8A-3gB4$default(Brush.Companion, CollectionsKt.listOf($this$cache$iv), 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null);
                Composer $i$f$rememberCoroutineScope22 = $composer;
                int composer$iv22 = 6;
                boolean $i$f$Box = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
                boolean propagateMinConstraints$iv = false;
                MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv);
                $i$f$cache10 = 0x70 & $changed$iv3 << 3;
                boolean $i$f$Layout = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv4, 0);
                CompositionLocalMap localMap$iv$iv = $composer$iv4.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier((Composer)$composer$iv4, (Modifier)modifier$iv4);
                object12 = ComposeUiNode.Companion.getConstructor();
                int wrapper$iv22 = 6 | 0x380 & $changed$iv$iv4 << 6;
                boolean $i$f$ReusableComposeNode = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer$iv4.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv4.startReusableNode();
                if ($composer$iv4.getInserting()) {
                    void factory$iv$iv$iv2;
                    $composer$iv4.createNode(factory$iv$iv$iv2);
                } else {
                    $composer$iv4.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl((Composer)$composer$iv4);
                boolean bl14 = false;
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash();
                boolean bl15 = false;
                Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv;
                boolean bl16 = false;
                if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), (Object)compositeKeyHash$iv$iv)) {
                    $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(compositeKeyHash$iv$iv);
                    $this$Layout_u24lambda_u240$iv$iv.apply(compositeKeyHash$iv$iv, block$iv$iv$iv);
                }
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
                int n2 = 0xE & $changed$iv$iv$iv4 >> 6;
                void $composer$iv6 = $composer$iv4;
                boolean bl17 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv6, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                int n3 = 6 | 0x70 & $changed$iv3 >> 6;
                void var42_95 = $composer$iv6;
                BoxScope $this$MainInstallerScreen_u24lambda_u2429 = BoxScopeInstance.INSTANCE;
                boolean bl18 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer5, 221259825, "C4300@161483L21,4296@161348L17617:Main.kt#p91eg0");
                int $this$dp$iv22 = 24;
                boolean $i$f$getDp = false;
                Modifier $this$dp$iv22 = ScrollKt.verticalScroll$default(PaddingKt.padding-3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Dp.constructor-impl($this$dp$iv22)), ScrollKt.rememberScrollState(0, (Composer)$composer5, 0, 1), false, null, false, 14, null);
                void var47_102 = $composer5;
                boolean bl19 = false;
                boolean $i$f$Column = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
                Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
                MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, (Composer)$composer$iv3, 0xE & $changed$iv2 >> 3 | 0x70 & $changed$iv2 >> 3);
                int n4 = 0x70 & $changed$iv2 << 3;
                boolean $i$f$Layout2 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv3, 0);
                CompositionLocalMap localMap$iv$iv2 = $composer$iv3.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier((Composer)$composer$iv3, (Modifier)modifier$iv3);
                Function0<ComposeUiNode> function0 = ComposeUiNode.Companion.getConstructor();
                int n5 = 6 | 0x380 & $changed$iv$iv3 << 6;
                boolean $i$f$ReusableComposeNode2 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer$iv3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv3.startReusableNode();
                if ($composer$iv3.getInserting()) {
                    void factory$iv$iv$iv3;
                    $composer$iv3.createNode(factory$iv$iv$iv3);
                } else {
                    $composer$iv3.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.constructor-impl((Composer)$composer$iv3);
                $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = false;
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> block$iv$iv$iv2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                $i$f$set-impl = false;
                Composer $this$set_impl_u24lambda_u240$iv$iv$iv2 = $this$Layout_u24lambda_u240$iv$iv2;
                $i$a$-with-Updater$set$1$iv$iv$iv = false;
                if ($this$set_impl_u24lambda_u240$iv$iv$iv2.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv2.rememberedValue(), (Object)compositeKeyHash$iv$iv2)) {
                    $this$set_impl_u24lambda_u240$iv$iv$iv2.updateRememberedValue(compositeKeyHash$iv$iv2);
                    $this$Layout_u24lambda_u240$iv$iv2.apply(compositeKeyHash$iv$iv2, block$iv$iv$iv2);
                }
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
                int n6 = 0xE & $changed$iv$iv$iv3 >> 6;
                void $composer$iv7 = $composer$iv3;
                boolean bl20 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv7, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                int n7 = 6 | 0x70 & $changed$iv2 >> 6;
                void var70_125 = $composer$iv7;
                ColumnScope $this$MainInstallerScreen_u24lambda_u2429_u240 = ColumnScopeInstance.INSTANCE;
                boolean bl21 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer4, 861371963, "C4309@161820L22,4311@161856L41,4314@161954L16162,4596@178130L41,4605@178423L16,4607@178453L41,4610@178540L415:Main.kt#p91eg0");
                if (isUninstallerOnly) {
                    object = "Uninstall-Only Mode";
                } else if (daysRemaining > 0) {
                    String dayText = daysRemaining == 1 ? "Day" : "Days";
                    object = "License: " + daysRemaining + " " + dayText + " Remaining";
                } else {
                    object = "";
                }
                String subtitle = object;
                MainKt.TitleSection(subtitle, (Composer)$composer4, 0, 0);
                int $this$dp$iv32 = 20;
                boolean $i$f$getDp2 = false;
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv32)), (Composer)$composer4, 6);
                Modifier $this$dp$iv32 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                int $this$dp$iv42 = 20;
                boolean $i$f$getDp3 = false;
                Arrangement.Horizontal $this$dp$iv42 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl($this$dp$iv42));
                void var77_138 = $composer4;
                int n8 = 54;
                boolean $i$f$Row = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getTop();
                MeasurePolicy measurePolicy$iv3 = RowKt.rowMeasurePolicy((Arrangement.Horizontal)horizontalArrangement$iv, verticalAlignment$iv, (Composer)$composer$iv2, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3);
                int n9 = 0x70 & $changed$iv << 3;
                boolean $i$f$Layout3 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv3 = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv2, 0);
                CompositionLocalMap localMap$iv$iv3 = $composer$iv2.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier((Composer)$composer$iv2, (Modifier)modifier$iv2);
                Function0<ComposeUiNode> function02 = ComposeUiNode.Companion.getConstructor();
                int n10 = 6 | 0x380 & $changed$iv$iv2 << 6;
                boolean $i$f$ReusableComposeNode3 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer$iv2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv2.startReusableNode();
                if ($composer$iv2.getInserting()) {
                    void factory$iv$iv$iv4;
                    $composer$iv2.createNode(factory$iv$iv$iv4);
                } else {
                    $composer$iv2.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.constructor-impl((Composer)$composer$iv2);
                $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = false;
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> block$iv$iv$iv3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                $i$f$set-impl = false;
                Composer $this$set_impl_u24lambda_u240$iv$iv$iv3 = $this$Layout_u24lambda_u240$iv$iv3;
                $i$a$-with-Updater$set$1$iv$iv$iv = false;
                if ($this$set_impl_u24lambda_u240$iv$iv$iv3.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv3.rememberedValue(), (Object)compositeKeyHash$iv$iv3)) {
                    $this$set_impl_u24lambda_u240$iv$iv$iv3.updateRememberedValue(compositeKeyHash$iv$iv3);
                    $this$Layout_u24lambda_u240$iv$iv3.apply(compositeKeyHash$iv$iv3, block$iv$iv$iv3);
                }
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.Companion.getSetModifier());
                int n11 = 0xE & $changed$iv$iv$iv2 >> 6;
                void $composer$iv8 = $composer$iv2;
                boolean bl22 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv8, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                int n12 = 6 | 0x70 & $changed$iv >> 6;
                void var99_161 = $composer$iv8;
                RowScope $this$MainInstallerScreen_u24lambda_u2429_u240_u240 = RowScopeInstance.INSTANCE;
                boolean bl23 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer3, -1689739226, "C4319@162164L4589,4404@166826L11276:Main.kt#p91eg0");
                Modifier modifier = RowScope.weight$default($this$MainInstallerScreen_u24lambda_u2429_u240_u240, Modifier.Companion, 1.0f, false, 2, null);
                void var103_165 = $composer3;
                int $changed$iv4 = 0;
                boolean $i$f$Column2 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Arrangement.Vertical verticalArrangement$iv2 = Arrangement.INSTANCE.getTop();
                Alignment.Horizontal horizontalAlignment$iv2 = Alignment.Companion.getStart();
                MeasurePolicy measurePolicy$iv4 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, horizontalAlignment$iv2, (Composer)$composer$iv, 0xE & $changed$iv4 >> 3 | 0x70 & $changed$iv4 >> 3);
                int n13 = 0x70 & $changed$iv4 << 3;
                boolean $i$f$Layout4 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv4 = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv, 0);
                CompositionLocalMap localMap$iv$iv4 = $composer$iv.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier((Composer)$composer$iv, modifier$iv);
                Function0<ComposeUiNode> function03 = ComposeUiNode.Companion.getConstructor();
                int n14 = 6 | 0x380 & $changed$iv$iv << 6;
                boolean $i$f$ReusableComposeNode4 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer$iv.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv.startReusableNode();
                if ($composer$iv.getInserting()) {
                    $composer$iv.createNode(factory$iv$iv$iv);
                } else {
                    $composer$iv.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.constructor-impl((Composer)$composer$iv);
                $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = false;
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> block$iv$iv$iv4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                $i$f$set-impl = false;
                Composer $this$set_impl_u24lambda_u240$iv$iv$iv4 = $this$Layout_u24lambda_u240$iv$iv4;
                $i$a$-with-Updater$set$1$iv$iv$iv = false;
                if ($this$set_impl_u24lambda_u240$iv$iv$iv4.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv4.rememberedValue(), (Object)compositeKeyHash$iv$iv4)) {
                    $this$set_impl_u24lambda_u240$iv$iv$iv4.updateRememberedValue(compositeKeyHash$iv$iv4);
                    $this$Layout_u24lambda_u240$iv$iv4.apply(compositeKeyHash$iv$iv4, block$iv$iv$iv4);
                }
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.Companion.getSetModifier());
                int n15 = 0xE & $changed$iv$iv$iv >> 6;
                void $composer$iv9 = $composer$iv;
                $i$a$-Layout-ColumnKt$Column$1$iv = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv9, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                int n16 = 6 | 0x70 & $changed$iv4 >> 6;
                void var127_189 = $composer$iv9;
                ColumnScope $this$MainInstallerScreen_u24lambda_u2429_u240_u240_u240 = ColumnScopeInstance.INSTANCE;
                boolean bl24 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer2, -1529178700, "C4326@162507L4228,4320@162225L4510:Main.kt#p91eg0");
                int $this$dp$iv = 8;
                boolean $i$f$getDp4 = false;
                Modifier modifier2 = ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl($this$dp$iv)));
                $this$dp$iv = 4;
                $i$f$getDp4 = false;
                CardKt.Card-F-jzlyU(ShadowKt.shadow-s4CzXII$default(modifier2, Dp.constructor-impl($this$dp$iv), null, false, 0L, 0L, 30, null), null, ColorPalette.INSTANCE.getSurface-0d7_KjU(), 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(650158516, true, (arg_0, arg_1) -> MainKt.MainInstallerScreen$lambda$29$0$0$0$0(deviceIP$delegate, isInstalling$delegate, sshPassword$delegate, deviceModel$delegate, arg_0, arg_1), (Composer)$composer2, 54), (Composer)$composer2, 0x180180, 58);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer2);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv9);
                $composer$iv.endNode();
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
                modifier$iv = RowScope.weight$default($this$MainInstallerScreen_u24lambda_u2429_u240_u240, Modifier.Companion, 1.0f, false, 2, null);
                $composer$iv = $composer3;
                $changed$iv4 = 0;
                $i$f$Column2 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                verticalArrangement$iv2 = Arrangement.INSTANCE.getTop();
                horizontalAlignment$iv2 = Alignment.Companion.getStart();
                measurePolicy$iv4 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, horizontalAlignment$iv2, (Composer)$composer$iv, 0xE & $changed$iv4 >> 3 | 0x70 & $changed$iv4 >> 3);
                $changed$iv$iv = 0x70 & $changed$iv4 << 3;
                $i$f$Layout4 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                compositeKeyHash$iv$iv4 = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv, 0);
                localMap$iv$iv4 = $composer$iv.getCurrentCompositionLocalMap();
                materialized$iv$iv4 = ComposedModifierKt.materializeModifier((Composer)$composer$iv, modifier$iv);
                factory$iv$iv$iv = ComposeUiNode.Companion.getConstructor();
                $changed$iv$iv$iv = 6 | 0x380 & $changed$iv$iv << 6;
                $i$f$ReusableComposeNode4 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer$iv.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv.startReusableNode();
                if ($composer$iv.getInserting()) {
                    $composer$iv.createNode(factory$iv$iv$iv);
                } else {
                    $composer$iv.useNode();
                }
                $this$Layout_u24lambda_u240$iv$iv4 = Updater.constructor-impl((Composer)$composer$iv);
                $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = false;
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                block$iv$iv$iv4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                $i$f$set-impl = false;
                $this$set_impl_u24lambda_u240$iv$iv$iv4 = $this$Layout_u24lambda_u240$iv$iv4;
                $i$a$-with-Updater$set$1$iv$iv$iv = false;
                if ($this$set_impl_u24lambda_u240$iv$iv$iv4.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv4.rememberedValue(), (Object)compositeKeyHash$iv$iv4)) {
                    $this$set_impl_u24lambda_u240$iv$iv$iv4.updateRememberedValue(compositeKeyHash$iv$iv4);
                    $this$Layout_u24lambda_u240$iv$iv4.apply(compositeKeyHash$iv$iv4, block$iv$iv$iv4);
                }
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.Companion.getSetModifier());
                int $changed$iv5 = 0xE & $changed$iv$iv$iv >> 6;
                $composer$iv9 = $composer$iv;
                $i$a$-Layout-ColumnKt$Column$1$iv = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv9, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                int $changed2 = 6 | 0x70 & $changed$iv4 >> 6;
                $composer2 = $composer$iv9;
                ColumnScope $this$MainInstallerScreen_u24lambda_u2429_u240_u240_u241 = ColumnScopeInstance.INSTANCE;
                boolean bl25 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer2, -2119839202, "C4411@167169L10915,4405@166887L11197:Main.kt#p91eg0");
                $this$dp$iv = 8;
                $i$f$getDp4 = false;
                Modifier modifier3 = ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl($this$dp$iv)));
                $this$dp$iv = 4;
                $i$f$getDp4 = false;
                CardKt.Card-F-jzlyU(ShadowKt.shadow-s4CzXII$default(modifier3, Dp.constructor-impl($this$dp$iv), null, false, 0L, 0L, 30, null), null, ColorPalette.INSTANCE.getSurface-0d7_KjU(), 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1142301973, true, (arg_0, arg_1) -> MainKt.MainInstallerScreen$lambda$29$0$0$1$0(isUninstallerOnly, (CoroutineScope)coroutineScope, isInstalling$delegate, installationType$delegate, enableTripletap$delegate, createBackup$delegate, sshPassword$delegate, logs$delegate, deviceIP$delegate, deviceModel$delegate, currentStatus$delegate, arg_0, arg_1), (Composer)$composer2, 54), (Composer)$composer2, 0x180180, 58);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer2);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv9);
                $composer$iv.endNode();
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer3);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv8);
                $composer$iv2.endNode();
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv2);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv2);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv2);
                int $this$dp$iv5 = 20;
                $i$f$getDp = false;
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv5)), (Composer)$composer4, 6);
                if (MainKt.MainInstallerScreen$lambda$22(currentStatus$delegate) != null) {
                    $composer4.startReplaceGroup(877431729);
                    ComposerKt.sourceInformation((Composer)$composer4, "4600@178278L32,4601@178327L41");
                    InstallationStatus installationStatus = MainKt.MainInstallerScreen$lambda$22(currentStatus$delegate);
                    Intrinsics.checkNotNull(installationStatus);
                    MainKt.ProgressSection(installationStatus, (Composer)$composer4, 0);
                    $this$dp$iv5 = 20;
                    $i$f$getDp = false;
                    SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv5)), (Composer)$composer4, 6);
                    $composer4.endReplaceGroup();
                } else {
                    $composer4.startReplaceGroup(700593035);
                    $composer4.endReplaceGroup();
                }
                MainKt.LogSection(MainKt.MainInstallerScreen$lambda$25(logs$delegate), (Composer)$composer4, 0);
                $this$dp$iv5 = 20;
                $i$f$getDp = false;
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv5)), (Composer)$composer4, 6);
                long l = Color.copy-wmQWz5c$default(ColorPalette.INSTANCE.getOnSurface-0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
                long l2 = TextUnitKt.getSp(12);
                n8 = TextAlign.Companion.getCenter-e0LSkKk();
                Modifier modifier4 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                TextKt.Text--4IGK_g("Notice: reMarkable\u2122 is a trademark of reMarkable AS.\nThis installer is neither endorsed nor sponsored by, nor affiliated with, reMarkable AS.", modifier4, l, l2, null, null, null, 0L, null, TextAlign.box-impl(n8), 0L, 0, false, 0, 0, null, null, (Composer)$composer4, 3504, 0, 130544);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer4);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv7);
                $composer$iv3.endNode();
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv3);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv3);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv3);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer5);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv6);
                $composer$iv4.endNode();
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv4);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv4);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                $composer.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScope = $composer.endRestartGroup();
            if (scopeUpdateScope == null) break block55;
            scopeUpdateScope.updateScope((arg_0, arg_1) -> MainKt.MainInstallerScreen$lambda$30(daysRemaining, isUninstallerOnly, onExit, $changed, n, arg_0, arg_1));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    public static final void SplashScreen(@NotNull Function0<Unit> onTimeout, @Nullable Composer $composer, int $changed) {
        block19: {
            Intrinsics.checkNotNullParameter(onTimeout, "onTimeout");
            $composer = $composer.startRestartGroup(-1354949648);
            ComposerKt.sourceInformation($composer, "C(SplashScreen)4628@179211L1825,4690@181063L47,4690@181042L68:Main.kt#p91eg0");
            int $dirty = $changed;
            if (($changed & 6) == 0) {
                $dirty |= $composer.changedInstance(onTimeout) ? 4 : 2;
            }
            if (($dirty & 3) != 2 || !$composer.getSkipping()) {
                Object object;
                void $this$cache$iv;
                void $composer2;
                void $changed$iv$iv$iv;
                void $changed$iv$iv;
                void modifier$iv;
                void $changed$iv;
                void horizontalAlignment$iv;
                void $composer$iv;
                void $composer3;
                void $changed$iv$iv$iv2;
                void $changed$iv$iv2;
                void modifier$iv2;
                int $changed$iv2;
                void horizontalAlignment$iv2;
                void verticalArrangement$iv22;
                void $composer$iv2;
                void $composer4;
                void $changed$iv$iv$iv3;
                void $changed$iv$iv3;
                void modifier$iv3;
                void $changed$iv3;
                void $composer$iv3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1354949648, $dirty, -1, "org.example.SplashScreen (Main.kt:4627)");
                }
                Object object2 = new Color[]{Color.box-impl(ColorPalette.INSTANCE.getBackground-0d7_KjU()), Color.box-impl(ColorPalette.INSTANCE.getSurface-0d7_KjU())};
                object2 = BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Brush.Companion.verticalGradient-8A-3gB4$default(Brush.Companion, CollectionsKt.listOf(object2), 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null);
                Composer composer = $composer;
                int n = 6;
                boolean $i$f$Box = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                Object contentAlignment$iv = Alignment.Companion.getTopStart();
                boolean propagateMinConstraints$iv = false;
                MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy((Alignment)contentAlignment$iv, propagateMinConstraints$iv);
                int n2 = 0x70 & $changed$iv3 << 3;
                boolean $i$f$Layout = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv3, 0);
                CompositionLocalMap localMap$iv$iv = $composer$iv3.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier((Composer)$composer$iv3, (Modifier)modifier$iv3);
                Function0<ComposeUiNode> function0 = ComposeUiNode.Companion.getConstructor();
                int n3 = 6 | 0x380 & $changed$iv$iv3 << 6;
                boolean $i$f$ReusableComposeNode = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer$iv3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv3.startReusableNode();
                if ($composer$iv3.getInserting()) {
                    void factory$iv$iv$iv;
                    $composer$iv3.createNode(factory$iv$iv$iv);
                } else {
                    $composer$iv3.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl((Composer)$composer$iv3);
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
                int n4 = 0xE & $changed$iv$iv$iv3 >> 6;
                void $composer$iv4 = $composer$iv3;
                boolean bl4 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                int n5 = 6 | 0x70 & $changed$iv3 >> 6;
                void var29_33 = $composer$iv4;
                BoxScope $this$SplashScreen_u24lambda_u240 = BoxScopeInstance.INSTANCE;
                boolean bl5 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer4, 1518123678, "C4637@179467L917,4669@180433L597:Main.kt#p91eg0");
                int $this$dp$iv22 = 100;
                boolean $i$f$getDp22 = false;
                Modifier modifier = PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), 0.0f, Dp.constructor-impl($this$dp$iv22), 0.0f, 0.0f, 13, null);
                Alignment.Horizontal $this$dp$iv22 = Alignment.Companion.getCenterHorizontally();
                Object $i$f$getDp22 = Arrangement.INSTANCE.getTop();
                Modifier modifier2 = modifier;
                Arrangement.Vertical vertical = $i$f$getDp22;
                Alignment.Horizontal horizontal = $this$dp$iv22;
                void var38_50 = $composer4;
                int n6 = 438;
                boolean $i$f$Column = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy((Arrangement.Vertical)verticalArrangement$iv22, (Alignment.Horizontal)horizontalAlignment$iv2, (Composer)$composer$iv2, 0xE & $changed$iv2 >> 3 | 0x70 & $changed$iv2 >> 3);
                int n7 = 0x70 & $changed$iv2 << 3;
                boolean $i$f$Layout2 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv22 = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv2, 0);
                CompositionLocalMap localMap$iv$iv22 = $composer$iv2.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier((Composer)$composer$iv2, (Modifier)modifier$iv2);
                Function0<ComposeUiNode> function02 = ComposeUiNode.Companion.getConstructor();
                int n8 = 6 | 0x380 & $changed$iv$iv2 << 6;
                boolean $i$f$ReusableComposeNode2 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer$iv2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv2.startReusableNode();
                if ($composer$iv2.getInserting()) {
                    void factory$iv$iv$iv;
                    $composer$iv2.createNode(factory$iv$iv$iv);
                } else {
                    $composer$iv2.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.constructor-impl((Composer)$composer$iv2);
                $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = false;
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv22, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> block$iv$iv$iv2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                int $i$f$set-impl2 = 0;
                Composer $this$set_impl_u24lambda_u240$iv$iv$iv2 = $this$Layout_u24lambda_u240$iv$iv2;
                $i$a$-with-Updater$set$1$iv$iv$iv = false;
                if ($this$set_impl_u24lambda_u240$iv$iv$iv2.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv2.rememberedValue(), (Object)compositeKeyHash$iv$iv22)) {
                    $this$set_impl_u24lambda_u240$iv$iv$iv2.updateRememberedValue(compositeKeyHash$iv$iv22);
                    $this$Layout_u24lambda_u240$iv$iv2.apply(compositeKeyHash$iv$iv22, block$iv$iv$iv2);
                }
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
                int n9 = 0xE & $changed$iv$iv$iv2 >> 6;
                void $composer$iv5 = $composer$iv2;
                boolean bl6 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv5, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                int n10 = 6 | 0x70 & $changed$iv2 >> 6;
                void var60_83 = $composer$iv5;
                ColumnScope $this$SplashScreen_u24lambda_u240_u240 = ColumnScopeInstance.INSTANCE;
                boolean bl7 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer3, -1832087811, "C4644@179716L240,4652@179970L194,4659@180178L41,4661@180233L141:Main.kt#p91eg0");
                long l = ColorPalette.INSTANCE.getPrimaryVariant-0d7_KjU();
                SystemFontFamily systemFontFamily = FontFamily.Companion.getDefault();
                FontWeight fontWeight = FontWeight.Companion.getBold();
                long l2 = TextUnitKt.getSp(48);
                TextKt.Text--4IGK_g("READMarkable\u2122", null, l, l2, null, fontWeight, (FontFamily)systemFontFamily, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer3, 200070, 0, 130962);
                l = ColorPalette.INSTANCE.getOnSurface-0d7_KjU();
                systemFontFamily = FontFamily.Companion.getDefault();
                long l3 = TextUnitKt.getSp(32);
                TextKt.Text--4IGK_g("KOReader Installer", null, l, l3, null, null, (FontFamily)systemFontFamily, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer3, 3462, 0, 130994);
                int $this$dp$iv = 20;
                boolean $i$f$getDp = false;
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv)), (Composer)$composer3, 6);
                TextKt.Text--4IGK_g(APP_VERSION, null, ColorPalette.INSTANCE.getPrimaryVariant-0d7_KjU(), TextUnitKt.getSp(20), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer3, 3462, 0, 131058);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer3);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv5);
                $composer$iv2.endNode();
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv2);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv2);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv2);
                int $this$dp$iv32 = 50;
                boolean $i$f$getDp3 = false;
                Modifier $this$dp$iv32 = PaddingKt.padding-qDBjuR0$default($this$SplashScreen_u24lambda_u240.align(Modifier.Companion, Alignment.Companion.getBottomCenter()), 0.0f, 0.0f, 0.0f, Dp.constructor-impl($this$dp$iv32), 7, null);
                $i$f$getDp22 = Alignment.Companion.getCenterHorizontally();
                modifier$iv2 = $composer4;
                int verticalArrangement$iv22 = 384;
                boolean $i$f$Column2 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
                MeasurePolicy measurePolicy$iv3 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, (Alignment.Horizontal)horizontalAlignment$iv, (Composer)$composer$iv, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3);
                $changed$iv2 = 0x70 & $changed$iv << 3;
                boolean $i$f$Layout3 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv3 = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv, 0);
                CompositionLocalMap localMap$iv$iv3 = $composer$iv.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier((Composer)$composer$iv, (Modifier)modifier$iv);
                Function0<ComposeUiNode> compositeKeyHash$iv$iv22 = ComposeUiNode.Companion.getConstructor();
                int localMap$iv$iv22 = 6 | 0x380 & $changed$iv$iv << 6;
                boolean $i$f$ReusableComposeNode3 = false;
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
                Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.constructor-impl((Composer)$composer$iv);
                $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = false;
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> block$iv$iv$iv3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                $i$f$set-impl = false;
                Composer $this$set_impl_u24lambda_u240$iv$iv$iv3 = $this$Layout_u24lambda_u240$iv$iv3;
                $i$a$-with-Updater$set$1$iv$iv$iv = false;
                if ($this$set_impl_u24lambda_u240$iv$iv$iv3.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv3.rememberedValue(), (Object)compositeKeyHash$iv$iv3)) {
                    $this$set_impl_u24lambda_u240$iv$iv$iv3.updateRememberedValue(compositeKeyHash$iv$iv3);
                    $this$Layout_u24lambda_u240$iv$iv3.apply(compositeKeyHash$iv$iv3, block$iv$iv$iv3);
                }
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.Companion.getSetModifier());
                $i$f$set-impl2 = 0xE & $changed$iv$iv$iv >> 6;
                void $composer$iv6 = $composer$iv;
                $i$a$-Layout-ColumnKt$Column$1$iv = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv6, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                int $changed$iv4 = 6 | 0x70 & $changed$iv >> 6;
                $composer$iv5 = $composer$iv6;
                ColumnScope $this$SplashScreen_u24lambda_u240_u241 = ColumnScopeInstance.INSTANCE;
                boolean bl8 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer2, -889342477, "C4675@180649L141,4680@180804L41,4682@180859L161:Main.kt#p91eg0");
                long l4 = ColorPalette.INSTANCE.getPrimaryVariant-0d7_KjU();
                int $this$dp$iv4 = 40;
                boolean $i$f$getDp4 = false;
                ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv4)), l4, 0.0f, 0L, 0, (Composer)$composer2, 54, 28);
                int $this$dp$iv5 = 16;
                boolean $i$f$getDp5 = false;
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv5)), (Composer)$composer2, 6);
                TextKt.Text--4IGK_g("Initializing...", null, Color.copy-wmQWz5c$default(ColorPalette.INSTANCE.getOnSurface-0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 3462, 0, 131058);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer2);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv6);
                $composer$iv.endNode();
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer4);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv4);
                $composer$iv3.endNode();
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv3);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv3);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv3);
                Unit unit = Unit.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, -731460257, "CC(remember):Main.kt#9igjgp");
                contentAlignment$iv = $composer;
                boolean invalid$iv = ($dirty & 0xE) == 4;
                boolean $i$f$cache = false;
                Object it$iv = $this$cache$iv.rememberedValue();
                boolean bl9 = false;
                if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
                    Unit unit2 = unit;
                    boolean bl10 = false;
                    unit = unit2;
                    Function2 value$iv = new Function2<CoroutineScope, Continuation<? super Unit>, Object>(onTimeout, null){
                        int label;
                        final /* synthetic */ Function0<Unit> $onTimeout;
                        {
                            this.$onTimeout = $onTimeout;
                            super(2, $completion);
                        }

                        /*
                         * Unable to fully structure code
                         */
                        public final Object invokeSuspend(Object $result) {
                            var2_2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            switch (this.label) {
                                case 0: {
                                    ResultKt.throwOnFailure($result);
                                    this.label = 1;
                                    v0 = DelayKt.delay((long)2000L, (Continuation)this);
                                    if (v0 == var2_2) {
                                        return var2_2;
                                    }
                                    ** GOTO lbl13
                                }
                                case 1: {
                                    ResultKt.throwOnFailure($result);
                                    v0 = $result;
lbl13:
                                    // 2 sources

                                    this.$onTimeout.invoke();
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
                    object = it$iv;
                }
                object2 = (Function2)object;
                ComposerKt.sourceInformationMarkerEnd($composer);
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>)object2, $composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                $composer.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScope = $composer.endRestartGroup();
            if (scopeUpdateScope == null) break block19;
            scopeUpdateScope.updateScope((arg_0, arg_1) -> MainKt.SplashScreen$lambda$2(onTimeout, $changed, arg_0, arg_1));
        }
    }

    public static final boolean handleCommandLineArgs(@NotNull String[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        if (args.length == 0) {
            return false;
        }
        String generateActivation = null;
        int duration = 90;
        int i = 0;
        block11: while (i < args.length) {
            switch (args[i]) {
                case "--generate-activation": {
                    if (i + 1 < args.length) {
                        generateActivation = args[i + 1];
                        i += 2;
                        continue block11;
                    }
                    System.out.println((Object)"Error: --generate-activation requires a machine ID argument");
                    return true;
                }
                case "--duration": {
                    if (i + 1 < args.length) {
                        Integer n = StringsKt.toIntOrNull(args[i + 1]);
                        duration = n != null ? n : 90;
                        i += 2;
                        continue block11;
                    }
                    System.out.println((Object)"Error: --duration requires a number argument");
                    return true;
                }
                case "--help": 
                case "-h": {
                    MainKt.printHelp();
                    return true;
                }
            }
            ++i;
        }
        if (generateActivation != null) {
            MainKt.generateActivationCode(generateActivation, duration);
            return true;
        }
        return false;
    }

    public static final void printHelp() {
        String string = "READMarkable KOReader Installer v26.01.18\n\nUsage:\n  java -jar remarkable-installer.jar [options]\n\nOptions:\n  --generate-activation <MACHINE_ID>  Generate activation code for machine ID\n  --duration <DAYS>                   Duration in days for activation (default: 90)\n  --help, -h                          Show this help message\n\nExamples:\n  java -jar remarkable-installer.jar\n  java -jar remarkable-installer.jar --generate-activation 03cbc52a5080fe8d --duration 36135";
        System.out.println((Object)string);
    }

    public static final void generateActivationCode(@NotNull String machineId, int durationDays) {
        Intrinsics.checkNotNullParameter(machineId, "machineId");
        System.out.println((Object)StringsKt.repeat("=", 70));
        System.out.println((Object)"ACTIVATION CODE GENERATOR");
        System.out.println((Object)StringsKt.repeat("=", 70));
        System.out.println((Object)("Machine ID: " + machineId));
        System.out.println((Object)("Duration:   " + durationDays + " days"));
        System.out.println((Object)StringsKt.repeat("-", 70));
        String activationCode = activationManager.generateActivationCode(machineId, durationDays);
        System.out.println((Object)"Activation Code:");
        System.out.println();
        System.out.println((Object)activationCode);
        System.out.println();
        System.out.println((Object)StringsKt.repeat("=", 70));
        System.out.println((Object)"This activation code can be used to activate the installer");
        System.out.println((Object)"for the specified machine ID and duration.");
        System.out.println((Object)StringsKt.repeat("=", 70));
    }

    public static final void main(@NotNull String[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        if (MainKt.handleCommandLineArgs(args)) {
            return;
        }
        Application_desktopKt.application$default(false, ComposableSingletons$MainKt.INSTANCE.getLambda$-985202011$kotlinkoreader18(), 1, null);
    }

    private static final MonotonicFrameClock LocalMonotonicFrameClock$lambda$0() {
        throw new IllegalStateException("No MonotonicFrameClock provided".toString());
    }

    private static final boolean applyPatches$lambda$0(File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.isFile();
    }

    private static final boolean applyPatches$lambda$2(File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.isFile();
    }

    private static final void rebootAndWaitForDevice$lambda$0(InstallationJob $job) {
        JOptionPane.showMessageDialog(null, "\u26a0\ufe0f MANUAL REBOOT REQUIRED\n\nIf your device does not automatically restart,\nplease manually restart your device now.\n\nGo to: Settings \u2192 Restart\n\nClick OK after you have initiated the restart.", "Device Reboot Required", 2);
        $job.confirmReboot();
    }

    private static final void processMaintenanceTasks$lambda$0(InstallationJob $job) {
        JOptionPane.showMessageDialog(null, "\u26a0\ufe0f MANUAL REBOOT REQUIRED\n\nPlease manually restart your device now.\n\nGo to: Settings \u2192 Restart\n\nClick OK after you have initiated the restart.", "Device Reboot Required", 2);
        $job.confirmReboot();
    }

    private static final Unit TitleSection$lambda$1(String $subtitle, int $$changed, int $$default, Composer $composer, int $force) {
        MainKt.TitleSection($subtitle, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 1), $$default);
        return Unit.INSTANCE;
    }

    /*
     * WARNING - void declaration
     */
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit StatusSection$lambda$0(String $inputIP, String $sshStatus, String $activationStatus, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C3692@139285L546:Main.kt#p91eg0");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            void $composer2;
            void $changed$iv$iv$iv;
            void $changed$iv$iv;
            void modifier$iv;
            void $composer$iv;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2085557680, $changed, -1, "org.example.StatusSection.<anonymous> (Main.kt:3692)");
            }
            int $this$dp$iv22 = 16;
            boolean $i$f$getDp = false;
            Modifier $this$dp$iv22 = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv22));
            Composer composer = $composer;
            int $changed$iv = 6;
            boolean $i$f$Column = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, (Composer)$composer$iv, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3);
            int n = 0x70 & $changed$iv << 3;
            boolean $i$f$Layout = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv, 0);
            CompositionLocalMap localMap$iv$iv = $composer$iv.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier((Composer)$composer$iv, (Modifier)modifier$iv);
            Function0<ComposeUiNode> function0 = ComposeUiNode.Companion.getConstructor();
            int n2 = 6 | 0x380 & $changed$iv$iv << 6;
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
            int n3 = 0xE & $changed$iv$iv$iv >> 6;
            void $composer$iv2 = $composer$iv;
            boolean bl4 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            int n4 = 6 | 0x70 & $changed$iv >> 6;
            void var30_32 = $composer$iv2;
            ColumnScope $this$StatusSection_u24lambda_u240_u240 = ColumnScopeInstance.INSTANCE;
            boolean bl5 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer2, 1318274058, "C3693@139342L244,3700@139599L40,3701@139652L32,3702@139697L52,3703@139762L59:Main.kt#p91eg0");
            long l = ColorPalette.INSTANCE.getPrimaryVariant-0d7_KjU();
            SystemFontFamily systemFontFamily = FontFamily.Companion.getDefault();
            FontWeight fontWeight = FontWeight.Companion.getBold();
            long l2 = TextUnitKt.getSp(20);
            TextKt.Text--4IGK_g("Connection Status", null, l, l2, null, fontWeight, (FontFamily)systemFontFamily, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 200070, 0, 130962);
            int $this$dp$iv = 8;
            boolean $i$f$getDp2 = false;
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv)), (Composer)$composer2, 6);
            MainKt.StatusItem("Device IP", $inputIP, false, (Composer)$composer2, 6, 4);
            MainKt.StatusItem("SSH Status", $sshStatus, true, (Composer)$composer2, 390, 0);
            MainKt.StatusItem("Activation", $activationStatus, true, (Composer)$composer2, 390, 0);
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

    private static final Unit StatusSection$lambda$1(String $inputIP, String $sshStatus, String $activationStatus, int $$changed, Composer $composer, int $force) {
        MainKt.StatusSection($inputIP, $sshStatus, $activationStatus, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 1));
        return Unit.INSTANCE;
    }

    private static final Unit StatusItem$lambda$1(String $label, String $value, boolean $isStatus, int $$changed, int $$default, Composer $composer, int $force) {
        MainKt.StatusItem($label, $value, $isStatus, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 1), $$default);
        return Unit.INSTANCE;
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit MenuButton_sW7UJKQ$lambda$0(boolean $enabled, String $text, RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C3756@141333L350:Main.kt#p91eg0");
        if (($changed & 0x11) != 16 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-882323640, $changed, -1, "org.example.MenuButton.<anonymous> (Main.kt:3756)");
            }
            long l = $enabled ? ColorPalette.INSTANCE.getOnSurface-0d7_KjU() : Color.copy-wmQWz5c$default(ColorPalette.INSTANCE.getOnSurface-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
            SystemFontFamily systemFontFamily = FontFamily.Companion.getDefault();
            FontWeight fontWeight = FontWeight.Companion.getMedium();
            long l2 = TextUnitKt.getSp(18);
            Modifier modifier = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            int n = TextAlign.Companion.getLeft-e0LSkKk();
            TextKt.Text--4IGK_g($text, modifier, l, l2, null, fontWeight, (FontFamily)systemFontFamily, 0L, null, TextAlign.box-impl(n), 0L, 0, false, 0, 0, null, null, $composer, 199728, 0, 130448);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private static final Unit MenuButton_sW7UJKQ$lambda$1(String $text, long l, boolean $enabled, Function0 $onClick, int $$changed, int $$default, Composer $composer, int $force) {
        MainKt.MenuButton-sW7UJKQ($text, l, $enabled, $onClick, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 1), $$default);
        return Unit.INSTANCE;
    }

    /*
     * WARNING - void declaration
     */
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit ProgressSection$lambda$0(InstallationStatus $status, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C3777@141955L3025:Main.kt#p91eg0");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            int $changed2;
            int $changed$iv;
            void $composer2;
            int $changed$iv$iv$iv;
            Function0<ComposeUiNode> factory$iv$iv$iv;
            int $changed$iv$iv;
            void modifier$iv;
            int $changed$iv2;
            void $composer$iv;
            void $composer3;
            void $changed$iv$iv$iv2;
            void $changed$iv$iv2;
            void modifier$iv2;
            void $composer$iv2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-543048954, $changed, -1, "org.example.ProgressSection.<anonymous> (Main.kt:3777)");
            }
            int $this$dp$iv22 = 16;
            boolean $i$f$getDp = false;
            Modifier $this$dp$iv22 = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv22));
            Composer composer = $composer;
            int $changed$iv3 = 6;
            boolean $i$f$Column = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, (Composer)$composer$iv2, 0xE & $changed$iv3 >> 3 | 0x70 & $changed$iv3 >> 3);
            int n = 0x70 & $changed$iv3 << 3;
            boolean $i$f$Layout = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv2, 0);
            CompositionLocalMap localMap$iv$iv = $composer$iv2.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier((Composer)$composer$iv2, (Modifier)modifier$iv2);
            Function0<ComposeUiNode> function0 = ComposeUiNode.Companion.getConstructor();
            int n2 = 6 | 0x380 & $changed$iv$iv2 << 6;
            boolean $i$f$ReusableComposeNode = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer$iv2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer$iv2.startReusableNode();
            if ($composer$iv2.getInserting()) {
                void factory$iv$iv$iv2;
                $composer$iv2.createNode(factory$iv$iv$iv2);
            } else {
                $composer$iv2.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl((Composer)$composer$iv2);
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
            int n3 = 0xE & $changed$iv$iv$iv2 >> 6;
            void $composer$iv3 = $composer$iv2;
            boolean bl4 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            int n4 = 6 | 0x70 & $changed$iv3 >> 6;
            void var28_30 = $composer$iv3;
            ColumnScope $this$ProgressSection_u24lambda_u240_u240 = ColumnScopeInstance.INSTANCE;
            boolean bl5 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer3, -1658141915, "C3778@142012L248,3785@142273L41,3788@142356L928,3813@143298L40,3815@143352L187,3822@143553L195:Main.kt#p91eg0");
            long l = ColorPalette.INSTANCE.getPrimaryVariant-0d7_KjU();
            SystemFontFamily systemFontFamily = FontFamily.Companion.getDefault();
            FontWeight fontWeight = FontWeight.Companion.getBold();
            long l2 = TextUnitKt.getSp(20);
            TextKt.Text--4IGK_g("Installation Progress", null, l, l2, null, fontWeight, (FontFamily)systemFontFamily, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer3, 200070, 0, 130962);
            int $this$dp$iv = 16;
            boolean $i$f$getDp2 = false;
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv)), (Composer)$composer3, 6);
            $this$dp$iv = 30;
            $i$f$getDp2 = false;
            Modifier modifier = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.constructor-impl($this$dp$iv));
            $this$dp$iv = 15;
            $i$f$getDp2 = false;
            Modifier $this$dp$iv3 = BackgroundKt.background-bw27NRU$default(ClipKt.clip(modifier, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl($this$dp$iv))), ColorPalette.INSTANCE.getBackground-0d7_KjU(), null, 2, null);
            fontWeight = $composer3;
            boolean bl6 = false;
            boolean $i$f$Box = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
            boolean propagateMinConstraints$iv = false;
            MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv);
            int n5 = 0x70 & $changed$iv2 << 3;
            boolean $i$f$Layout2 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv, 0);
            CompositionLocalMap localMap$iv$iv2 = $composer$iv.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier((Composer)$composer$iv, (Modifier)modifier$iv);
            Function0<ComposeUiNode> function02 = ComposeUiNode.Companion.getConstructor();
            int n6 = 6 | 0x380 & $changed$iv$iv << 6;
            boolean $i$f$ReusableComposeNode2 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer$iv.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer$iv.startReusableNode();
            if ($composer$iv.getInserting()) {
                $composer$iv.createNode(factory$iv$iv$iv);
            } else {
                $composer$iv.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.constructor-impl((Composer)$composer$iv);
            $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = false;
            Updater.set-impl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> block$iv$iv$iv2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            $i$f$set-impl = false;
            Composer $this$set_impl_u24lambda_u240$iv$iv$iv2 = $this$Layout_u24lambda_u240$iv$iv2;
            $i$a$-with-Updater$set$1$iv$iv$iv = false;
            if ($this$set_impl_u24lambda_u240$iv$iv$iv2.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv2.rememberedValue(), (Object)compositeKeyHash$iv$iv2)) {
                $this$set_impl_u24lambda_u240$iv$iv$iv2.updateRememberedValue(compositeKeyHash$iv$iv2);
                $this$Layout_u24lambda_u240$iv$iv2.apply(compositeKeyHash$iv$iv2, block$iv$iv$iv2);
            }
            Updater.set-impl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
            int n7 = 0xE & $changed$iv$iv$iv >> 6;
            void $composer$iv4 = $composer$iv;
            boolean bl7 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            int n8 = 6 | 0x70 & $changed$iv2 >> 6;
            void var60_71 = $composer$iv4;
            BoxScope $this$ProgressSection_u24lambda_u240_u240_u240 = BoxScopeInstance.INSTANCE;
            boolean bl8 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer2, -1155288987, "C3795@142610L415,3805@143042L228:Main.kt#p91eg0");
            Object object = new Color[]{Color.box-impl(ColorPalette.INSTANCE.getProgressBar-0d7_KjU()), Color.box-impl(ColorPalette.INSTANCE.getProgressBarEnd-0d7_KjU())};
            BoxKt.Box(BackgroundKt.background$default(SizeKt.fillMaxWidth(SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null), (float)$status.getProgress() / 100.0f), Brush.Companion.horizontalGradient-8A-3gB4$default(Brush.Companion, CollectionsKt.listOf(object), 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null), (Composer)$composer2, 0);
            object = $status.getProgress() + "%";
            long l3 = Color.Companion.getWhite-0d7_KjU();
            FontWeight fontWeight2 = FontWeight.Companion.getBold();
            Modifier modifier2 = $this$ProgressSection_u24lambda_u240_u240_u240.align(Modifier.Companion, Alignment.Companion.getCenter());
            TextKt.Text--4IGK_g((String)object, modifier2, l3, 0L, null, fontWeight2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 196992, 0, 131032);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer2);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv4);
            $composer$iv.endNode();
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
            $this$dp$iv = 8;
            $i$f$getDp = false;
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv)), (Composer)$composer3, 6);
            TextKt.Text--4IGK_g($status.getMessage(), null, ColorPalette.INSTANCE.getOnSurface-0d7_KjU(), TextUnitKt.getSp(16), null, FontWeight.Companion.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer3, 200064, 0, 131026);
            TextKt.Text--4IGK_g("Step " + $status.getStepNumber() + " of " + $status.getTotalSteps(), null, Color.copy-wmQWz5c$default(ColorPalette.INSTANCE.getOnSurface-0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer3, 3456, 0, 131058);
            if (Intrinsics.areEqual($status.getStatus(), "complete")) {
                $composer3.startReplaceGroup(-1656447363);
                ComposerKt.sourceInformation((Composer)$composer3, "3829@143813L40,3830@143870L476");
                $this$dp$iv = 8;
                $i$f$getDp = false;
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv)), (Composer)$composer3, 6);
                $this$dp$iv = 4;
                $i$f$getDp = false;
                Modifier modifier3 = BackgroundKt.background-bw27NRU(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Color.copy-wmQWz5c$default(ColorPalette.INSTANCE.getSuccess-0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl($this$dp$iv)));
                $this$dp$iv = 12;
                $i$f$getDp = false;
                Modifier $this$dp$iv4 = PaddingKt.padding-3ABfNKs(modifier3, Dp.constructor-impl($this$dp$iv));
                $composer$iv = $composer3;
                $changed$iv2 = 0;
                $i$f$Box = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                contentAlignment$iv = Alignment.Companion.getTopStart();
                propagateMinConstraints$iv = false;
                measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv);
                $changed$iv$iv = 0x70 & $changed$iv2 << 3;
                $i$f$Layout2 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv, 0);
                localMap$iv$iv2 = $composer$iv.getCurrentCompositionLocalMap();
                materialized$iv$iv2 = ComposedModifierKt.materializeModifier((Composer)$composer$iv, (Modifier)modifier$iv);
                factory$iv$iv$iv = ComposeUiNode.Companion.getConstructor();
                $changed$iv$iv$iv = 6 | 0x380 & $changed$iv$iv << 6;
                $i$f$ReusableComposeNode2 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer$iv.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv.startReusableNode();
                if ($composer$iv.getInserting()) {
                    $composer$iv.createNode(factory$iv$iv$iv);
                } else {
                    $composer$iv.useNode();
                }
                $this$Layout_u24lambda_u240$iv$iv2 = Updater.constructor-impl((Composer)$composer$iv);
                $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = false;
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                block$iv$iv$iv2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                $i$f$set-impl = false;
                $this$set_impl_u24lambda_u240$iv$iv$iv2 = $this$Layout_u24lambda_u240$iv$iv2;
                $i$a$-with-Updater$set$1$iv$iv$iv = false;
                if ($this$set_impl_u24lambda_u240$iv$iv$iv2.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv2.rememberedValue(), (Object)compositeKeyHash$iv$iv2)) {
                    $this$set_impl_u24lambda_u240$iv$iv$iv2.updateRememberedValue(compositeKeyHash$iv$iv2);
                    $this$Layout_u24lambda_u240$iv$iv2.apply(compositeKeyHash$iv$iv2, block$iv$iv$iv2);
                }
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
                $changed$iv = 0xE & $changed$iv$iv$iv >> 6;
                $composer$iv4 = $composer$iv;
                bl7 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                $changed2 = 6 | 0x70 & $changed$iv2 >> 6;
                $composer2 = $composer$iv4;
                BoxScope $this$ProgressSection_u24lambda_u240_u240_u241 = BoxScopeInstance.INSTANCE;
                boolean bl9 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer2, -658172458, "C3836@144138L190:Main.kt#p91eg0");
                TextKt.Text--4IGK_g("\u2705 " + $status.getMessage(), null, ColorPalette.INSTANCE.getSuccess-0d7_KjU(), 0L, null, FontWeight.Companion.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 196992, 0, 131034);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer2);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv4);
                $composer$iv.endNode();
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
                $composer3.endReplaceGroup();
            } else {
                $composer3.startReplaceGroup(-1799110510);
                $composer3.endReplaceGroup();
            }
            if (Intrinsics.areEqual($status.getStatus(), "error")) {
                $composer3.startReplaceGroup(-1655843204);
                ComposerKt.sourceInformation((Composer)$composer3, "3845@144422L40,3846@144479L477");
                int $this$dp$iv5 = 8;
                $i$f$getDp = false;
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv5)), (Composer)$composer3, 6);
                $this$dp$iv5 = 4;
                $i$f$getDp = false;
                Modifier modifier4 = BackgroundKt.background-bw27NRU(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Color.copy-wmQWz5c$default(ColorPalette.INSTANCE.getError-0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl($this$dp$iv5)));
                $this$dp$iv5 = 12;
                $i$f$getDp = false;
                Modifier $this$dp$iv4 = PaddingKt.padding-3ABfNKs(modifier4, Dp.constructor-impl($this$dp$iv5));
                $composer$iv = $composer3;
                $changed$iv2 = 0;
                $i$f$Box = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                contentAlignment$iv = Alignment.Companion.getTopStart();
                propagateMinConstraints$iv = false;
                measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv);
                $changed$iv$iv = 0x70 & $changed$iv2 << 3;
                $i$f$Layout2 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv, 0);
                localMap$iv$iv2 = $composer$iv.getCurrentCompositionLocalMap();
                materialized$iv$iv2 = ComposedModifierKt.materializeModifier((Composer)$composer$iv, (Modifier)modifier$iv);
                factory$iv$iv$iv = ComposeUiNode.Companion.getConstructor();
                $changed$iv$iv$iv = 6 | 0x380 & $changed$iv$iv << 6;
                $i$f$ReusableComposeNode2 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer$iv.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv.startReusableNode();
                if ($composer$iv.getInserting()) {
                    $composer$iv.createNode(factory$iv$iv$iv);
                } else {
                    $composer$iv.useNode();
                }
                $this$Layout_u24lambda_u240$iv$iv2 = Updater.constructor-impl((Composer)$composer$iv);
                $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = false;
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                block$iv$iv$iv2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                $i$f$set-impl = false;
                $this$set_impl_u24lambda_u240$iv$iv$iv2 = $this$Layout_u24lambda_u240$iv$iv2;
                $i$a$-with-Updater$set$1$iv$iv$iv = false;
                if ($this$set_impl_u24lambda_u240$iv$iv$iv2.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv2.rememberedValue(), (Object)compositeKeyHash$iv$iv2)) {
                    $this$set_impl_u24lambda_u240$iv$iv$iv2.updateRememberedValue(compositeKeyHash$iv$iv2);
                    $this$Layout_u24lambda_u240$iv$iv2.apply(compositeKeyHash$iv$iv2, block$iv$iv$iv2);
                }
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
                $changed$iv = 0xE & $changed$iv$iv$iv >> 6;
                $composer$iv4 = $composer$iv;
                bl7 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                $changed2 = 6 | 0x70 & $changed$iv2 >> 6;
                $composer2 = $composer$iv4;
                BoxScope $this$ProgressSection_u24lambda_u240_u240_u242 = BoxScopeInstance.INSTANCE;
                boolean bl10 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer2, 1052303402, "C3852@144745L193:Main.kt#p91eg0");
                TextKt.Text--4IGK_g("\u274c Error: " + $status.getError(), null, ColorPalette.INSTANCE.getError-0d7_KjU(), 0L, null, FontWeight.Companion.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 196992, 0, 131034);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer2);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv4);
                $composer$iv.endNode();
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
                $composer3.endReplaceGroup();
            } else {
                $composer3.startReplaceGroup(-1799110510);
                $composer3.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer3);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv3);
            $composer$iv2.endNode();
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv2);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv2);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ProgressSection$lambda$1(InstallationStatus $status, int $$changed, Composer $composer, int $force) {
        MainKt.ProgressSection($status, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 1));
        return Unit.INSTANCE;
    }

    /*
     * WARNING - void declaration
     */
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit LogSection$lambda$1(List $logs, LazyListState $listState, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C3887@145747L2478:Main.kt#p91eg0");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            Function0<Unit> function0;
            void $this$cache$iv;
            void $composer2;
            void $changed$iv$iv$iv;
            void $changed$iv$iv;
            void modifier$iv;
            void $changed$iv;
            void verticalAlignment$iv;
            void horizontalArrangement$iv;
            void $composer$iv;
            void $composer3;
            void $changed$iv$iv$iv2;
            void $changed$iv$iv2;
            void modifier$iv2;
            void $composer$iv2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1383318329, $changed, -1, "org.example.LogSection.<anonymous> (Main.kt:3887)");
            }
            int $this$dp$iv22 = 16;
            boolean $i$f$getDp = false;
            Modifier $this$dp$iv22 = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv22));
            Composer composer = $composer;
            int $changed$iv2 = 6;
            boolean $i$f$Column = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, (Composer)$composer$iv2, 0xE & $changed$iv2 >> 3 | 0x70 & $changed$iv2 >> 3);
            int n = 0x70 & $changed$iv2 << 3;
            boolean $i$f$Layout = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv2, 0);
            CompositionLocalMap localMap$iv$iv = $composer$iv2.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier((Composer)$composer$iv2, (Modifier)modifier$iv2);
            Function0<ComposeUiNode> function02 = ComposeUiNode.Companion.getConstructor();
            int n2 = 6 | 0x380 & $changed$iv$iv2 << 6;
            boolean $i$f$ReusableComposeNode = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer$iv2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer$iv2.startReusableNode();
            if ($composer$iv2.getInserting()) {
                void factory$iv$iv$iv;
                $composer$iv2.createNode(factory$iv$iv$iv);
            } else {
                $composer$iv2.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl((Composer)$composer$iv2);
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
            int n3 = 0xE & $changed$iv$iv$iv2 >> 6;
            void $composer$iv3 = $composer$iv2;
            boolean bl4 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            int n4 = 6 | 0x70 & $changed$iv2 >> 6;
            void var29_31 = $composer$iv3;
            ColumnScope $this$LogSection_u24lambda_u241_u240 = ColumnScopeInstance.INSTANCE;
            boolean bl5 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer3, -1545039703, "C3888@145804L1333,3918@147151L40,3920@147224L991,3920@147205L1010:Main.kt#p91eg0");
            Modifier modifier = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical vertical = Alignment.Companion.getCenterVertically();
            void var35_39 = $composer3;
            int n5 = 438;
            boolean $i$f$Row = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy((Arrangement.Horizontal)horizontalArrangement$iv, (Alignment.Vertical)verticalAlignment$iv, (Composer)$composer$iv, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3);
            int n6 = 0x70 & $changed$iv << 3;
            boolean $i$f$Layout2 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv, 0);
            CompositionLocalMap localMap$iv$iv2 = $composer$iv.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier((Composer)$composer$iv, (Modifier)modifier$iv);
            Function0<ComposeUiNode> function03 = ComposeUiNode.Companion.getConstructor();
            int n7 = 6 | 0x380 & $changed$iv$iv << 6;
            boolean $i$f$ReusableComposeNode2 = false;
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
            Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.constructor-impl((Composer)$composer$iv);
            $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = false;
            Updater.set-impl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> block$iv$iv$iv2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            $i$f$set-impl = false;
            Composer $this$set_impl_u24lambda_u240$iv$iv$iv2 = $this$Layout_u24lambda_u240$iv$iv2;
            $i$a$-with-Updater$set$1$iv$iv$iv = false;
            if ($this$set_impl_u24lambda_u240$iv$iv$iv2.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv2.rememberedValue(), (Object)compositeKeyHash$iv$iv2)) {
                $this$set_impl_u24lambda_u240$iv$iv$iv2.updateRememberedValue(compositeKeyHash$iv$iv2);
                $this$Layout_u24lambda_u240$iv$iv2.apply(compositeKeyHash$iv$iv2, block$iv$iv$iv2);
            }
            Updater.set-impl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
            int n8 = 0xE & $changed$iv$iv$iv >> 6;
            void $composer$iv4 = $composer$iv;
            boolean bl6 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv4, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            int n9 = 6 | 0x70 & $changed$iv >> 6;
            void var57_61 = $composer$iv4;
            RowScope $this$LogSection_u24lambda_u241_u240_u240 = RowScopeInstance.INSTANCE;
            boolean bl7 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer2, -1692139101, "C3893@146022L277,3911@146905L49,3901@146354L505,3900@146316L807:Main.kt#p91eg0");
            long l = ColorPalette.INSTANCE.getPrimaryVariant-0d7_KjU();
            SystemFontFamily systemFontFamily = FontFamily.Companion.getDefault();
            FontWeight fontWeight = FontWeight.Companion.getBold();
            long l2 = TextUnitKt.getSp(20);
            TextKt.Text--4IGK_g("\ud83d\udccb Detailed Logs", null, l, l2, null, fontWeight, (FontFamily)systemFontFamily, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 200070, 0, 130962);
            ButtonColors buttonColors = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279900182L), 0L, 0L, 0L, (Composer)$composer2, 6 | ButtonDefaults.$stable << 12, 14);
            int $this$dp$iv = 36;
            boolean $i$f$getDp22 = false;
            Modifier modifier2 = SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv));
            ComposerKt.sourceInformationMarkerStart((Composer)$composer2, 361066892, "CC(remember):Main.kt#9igjgp");
            void $i$f$getDp22 = $composer2;
            boolean invalid$iv = $composer2.changedInstance($logs);
            boolean $i$f$cache = false;
            Function0<Unit> it$iv = $this$cache$iv.rememberedValue();
            boolean bl8 = false;
            if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
                boolean bl9 = false;
                Function0<Unit> value$iv = () -> MainKt.LogSection$lambda$1$0$0$0$0($logs);
                $this$cache$iv.updateRememberedValue(value$iv);
                function0 = value$iv;
            } else {
                function0 = it$iv;
            }
            Function0 function04 = function0;
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer2);
            ButtonKt.Button(function04, modifier2, false, null, null, null, null, buttonColors, null, ComposableSingletons$MainKt.INSTANCE.getLambda$-28447613$kotlinkoreader18(), (Composer)$composer2, 0x30000030, 380);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer2);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv4);
            $composer$iv.endNode();
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
            int $this$dp$iv3 = 8;
            boolean $i$f$getDp3 = false;
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv3)), (Composer)$composer3, 6);
            SelectionContainerKt.SelectionContainer(null, ComposableLambdaKt.rememberComposableLambda(-949723374, true, (arg_0, arg_1) -> MainKt.LogSection$lambda$1$0$1($listState, $logs, arg_0, arg_1), (Composer)$composer3, 54), (Composer)$composer3, 48, 1);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer3);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv3);
            $composer$iv2.endNode();
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv2);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv2);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private static final Unit LogSection$lambda$1$0$0$0$0(List $logs) {
        String logText = CollectionsKt.joinToString$default($logs, "\n", null, null, 0, null, null, 62, null);
        try {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection selection = new StringSelection(logText);
            clipboard.setContents(selection, selection);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return Unit.INSTANCE;
    }

    /*
     * WARNING - void declaration
     */
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit LogSection$lambda$1$0$1(LazyListState $listState, List $logs, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C3921@147242L959:Main.kt#p91eg0");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            Function1<LazyListScope, Unit> function1;
            void $this$cache$iv;
            void $composer2;
            void $changed$iv$iv$iv;
            void $changed$iv$iv;
            void modifier$iv;
            void $changed$iv;
            void $composer$iv;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-949723374, $changed, -1, "org.example.LogSection.<anonymous>.<anonymous>.<anonymous> (Main.kt:3921)");
            }
            int $this$dp$iv22 = 4;
            boolean $i$f$getDp = false;
            Modifier $this$dp$iv22 = BackgroundKt.background-bw27NRU(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), ColorPalette.INSTANCE.getLogBackground-0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl($this$dp$iv22)));
            Composer composer = $composer;
            boolean bl = false;
            boolean $i$f$Box = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
            boolean propagateMinConstraints$iv = false;
            MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv);
            int n = 0x70 & $changed$iv << 3;
            boolean $i$f$Layout = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv, 0);
            CompositionLocalMap localMap$iv$iv = $composer$iv.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier((Composer)$composer$iv, (Modifier)modifier$iv);
            Function0<ComposeUiNode> function0 = ComposeUiNode.Companion.getConstructor();
            int n2 = 6 | 0x380 & $changed$iv$iv << 6;
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
            boolean bl2 = false;
            Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash();
            boolean bl3 = false;
            Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv;
            boolean bl4 = false;
            if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), (Object)compositeKeyHash$iv$iv)) {
                $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(compositeKeyHash$iv$iv);
                $this$Layout_u24lambda_u240$iv$iv.apply(compositeKeyHash$iv$iv, block$iv$iv$iv);
            }
            Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
            int n3 = 0xE & $changed$iv$iv$iv >> 6;
            void $composer$iv2 = $composer$iv;
            boolean bl5 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            int n4 = 6 | 0x70 & $changed$iv >> 6;
            void var29_31 = $composer$iv2;
            BoxScope $this$LogSection_u24lambda_u241_u240_u241_u240 = BoxScopeInstance.INSTANCE;
            boolean bl6 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer2, 1948729780, "C3931@147663L520,3926@147456L727:Main.kt#p91eg0");
            int $this$dp$iv = 8;
            boolean $i$f$getDp22 = false;
            Modifier modifier = PaddingKt.padding-3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Dp.constructor-impl($this$dp$iv));
            LazyListState lazyListState = $listState;
            PaddingValues paddingValues = null;
            boolean bl7 = false;
            Arrangement.Vertical vertical = null;
            Alignment.Horizontal horizontal = null;
            FlingBehavior flingBehavior = null;
            boolean bl8 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer2, 201416000, "CC(remember):Main.kt#9igjgp");
            void $i$f$getDp22 = $composer2;
            boolean invalid$iv = $composer2.changedInstance($logs);
            boolean $i$f$cache = false;
            Function1<LazyListScope, Unit> it$iv = $this$cache$iv.rememberedValue();
            boolean bl9 = false;
            if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
                boolean bl10 = bl8;
                FlingBehavior flingBehavior2 = flingBehavior;
                Alignment.Horizontal horizontal2 = horizontal;
                Arrangement.Vertical vertical2 = vertical;
                boolean bl11 = bl7;
                PaddingValues paddingValues2 = paddingValues;
                LazyListState lazyListState2 = lazyListState;
                Modifier modifier2 = modifier;
                boolean bl12 = false;
                Function1<LazyListScope, Unit> function12 = arg_0 -> MainKt.LogSection$lambda$1$0$1$0$0$0($logs, arg_0);
                modifier = modifier2;
                lazyListState = lazyListState2;
                paddingValues = paddingValues2;
                bl7 = bl11;
                vertical = vertical2;
                horizontal = horizontal2;
                flingBehavior = flingBehavior2;
                bl8 = bl10;
                Function1<LazyListScope, Unit> value$iv = function12;
                $this$cache$iv.updateRememberedValue(value$iv);
                function1 = value$iv;
            } else {
                function1 = it$iv;
            }
            Function1 function13 = function1;
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer2);
            LazyDslKt.LazyColumn(modifier, lazyListState, paddingValues, bl7, vertical, horizontal, flingBehavior, bl8, function13, (Composer)$composer2, 6, 252);
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

    /*
     * WARNING - void declaration
     */
    private static final Unit LogSection$lambda$1$0$1$0$0$0(List $logs, LazyListScope $this$LazyColumn) {
        void $this$itemsIndexed_u24default$iv;
        Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn");
        LazyListScope lazyListScope = $this$LazyColumn;
        List items$iv = $logs;
        Object key$iv = null;
        boolean $i$f$itemsIndexed = false;
        $this$itemsIndexed_u24default$iv.items(items$iv.size(), null, (Function1<? super Integer, ? extends Object>)new Function1<Integer, Object>(items$iv){
            final /* synthetic */ List $items;
            {
                this.$items = $items;
                super(1);
            }

            @Nullable
            public final Object invoke(int index) {
                this.$items.get(index);
                int n = index;
                boolean bl = false;
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>(items$iv){
            final /* synthetic */ List $items;
            {
                this.$items = $items;
                super(4);
            }

            /*
             * WARNING - void declaration
             */
            @Composable
            public final void invoke(@NotNull LazyItemScope $this$items, int it, @Nullable Composer $composer, int $changed) {
                Intrinsics.checkNotNullParameter($this$items, "$this$items");
                ComposerKt.sourceInformation($composer, "C188@8866L26:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 0x30) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (($dirty & 0x93) != 146 || !$composer.getSkipping()) {
                    void $changed2;
                    void log;
                    void $composer2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1091073711, $dirty, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
                    }
                    int n = 0xE & $dirty | 0x70 & $dirty;
                    Composer composer = $composer;
                    String string = (String)this.$items.get(it);
                    LazyItemScope $this$LogSection_u24lambda_u241_u240_u241_u240_u240_u240_u240 = $this$items;
                    boolean bl = false;
                    $composer2.startReplaceGroup(686420291);
                    ComposerKt.sourceInformation((Composer)$composer2, "C*3933@147748L387:Main.kt#p91eg0");
                    long l = ColorPalette.INSTANCE.getLogText-0d7_KjU();
                    GenericFontFamily genericFontFamily = FontFamily.Companion.getMonospace();
                    long l2 = TextUnitKt.getSp(13);
                    long l3 = TextUnitKt.getSp(18);
                    boolean $this$dp$iv = true;
                    boolean $i$f$getDp = false;
                    Modifier modifier = PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 0.0f, Dp.constructor-impl((float)$this$dp$iv), 1, null);
                    TextKt.Text--4IGK_g((String)log, modifier, l, l2, null, null, (FontFamily)genericFontFamily, 0L, null, null, l3, 0, false, 0, 0, null, null, (Composer)$composer2, 0xDB0 | 0xE & $changed2 >> 6, 6, 129968);
                    $composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    $composer.skipToGroupEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    private static final Unit LogSection$lambda$2(List $logs, int $$changed, Composer $composer, int $force) {
        MainKt.LogSection($logs, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 1));
        return Unit.INSTANCE;
    }

    /*
     * WARNING - void declaration
     */
    private static final String ActivationScreen$lambda$1(MutableState<String> $activationCode$delegate) {
        void $this$getValue$iv;
        State state = $activationCode$delegate;
        Object var2_2 = null;
        Object property$iv = null;
        boolean $i$f$getValue = false;
        return (String)$this$getValue$iv.getValue();
    }

    /*
     * WARNING - void declaration
     */
    private static final void ActivationScreen$lambda$2(MutableState<String> $activationCode$delegate, String string) {
        void $this$setValue$iv;
        MutableState<String> mutableState = $activationCode$delegate;
        Object var3_3 = null;
        Object var4_4 = null;
        String value$iv = string;
        boolean $i$f$setValue = false;
        $this$setValue$iv.setValue(value$iv);
    }

    /*
     * WARNING - void declaration
     */
    private static final String ActivationScreen$lambda$4(MutableState<String> $errorMessage$delegate) {
        void $this$getValue$iv;
        State state = $errorMessage$delegate;
        Object var2_2 = null;
        Object property$iv = null;
        boolean $i$f$getValue = false;
        return (String)$this$getValue$iv.getValue();
    }

    /*
     * WARNING - void declaration
     */
    private static final void ActivationScreen$lambda$5(MutableState<String> $errorMessage$delegate, String string) {
        void $this$setValue$iv;
        MutableState<String> mutableState = $errorMessage$delegate;
        Object var3_3 = null;
        Object var4_4 = null;
        String value$iv = string;
        boolean $i$f$setValue = false;
        $this$setValue$iv.setValue(value$iv);
    }

    /*
     * WARNING - void declaration
     */
    private static final String ActivationScreen$lambda$7(MutableState<String> $successMessage$delegate) {
        void $this$getValue$iv;
        State state = $successMessage$delegate;
        Object var2_2 = null;
        Object property$iv = null;
        boolean $i$f$getValue = false;
        return (String)$this$getValue$iv.getValue();
    }

    /*
     * WARNING - void declaration
     */
    private static final void ActivationScreen$lambda$8(MutableState<String> $successMessage$delegate, String string) {
        void $this$setValue$iv;
        MutableState<String> mutableState = $successMessage$delegate;
        Object var3_3 = null;
        Object var4_4 = null;
        String value$iv = string;
        boolean $i$f$setValue = false;
        $this$setValue$iv.setValue(value$iv);
    }

    /*
     * WARNING - void declaration
     */
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit ActivationScreen$lambda$9$0(Function0 $onUninstallerActivate, Function1 $onActivate, String $machineId, MutableState $activationCode$delegate, MutableState $errorMessage$delegate, MutableState $successMessage$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C3980@149253L7331:Main.kt#p91eg0");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            Function<Object> function;
            Function1<String, Unit> function1;
            Function<Object> value$iv;
            void $this$cache$iv;
            void $composer2;
            void $changed$iv$iv$iv;
            void $changed$iv$iv;
            void modifier$iv;
            void $changed$iv;
            void horizontalAlignment$iv;
            void $composer$iv;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1192248458, $changed, -1, "org.example.ActivationScreen.<anonymous>.<anonymous> (Main.kt:3980)");
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
            void var33_35 = $composer$iv2;
            ColumnScope $this$ActivationScreen_u24lambda_u249_u240_u240 = ColumnScopeInstance.INSTANCE;
            boolean bl5 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer2, -1757156467, "C3984@149412L283,3992@149713L41,3994@149772L215,4001@150005L41,4008@150293L2679,4004@150102L2870,4067@152990L41,4070@153085L228,4077@153331L41,4089@153888L158,4081@153489L153,4079@153390L674,4095@154082L41,4121@155239L49,4098@154179L944,4097@154141L1345,4145@156166L41,4148@156272L298:Main.kt#p91eg0");
            TextKt.Text--4IGK_g("READMarkable\u2122 KOReader Installer v26.01.18", null, ColorKt.Color(0xFF333333L), TextUnitKt.getSp(24), null, FontWeight.Companion.getBold(), null, 0L, null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 200064, 0, 130514);
            int $this$dp$iv = 10;
            boolean $i$f$getDp2 = false;
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv)), (Composer)$composer2, 6);
            TextKt.Text--4IGK_g("License Activation Required", null, ColorKt.Color(0xFF666666L), TextUnitKt.getSp(16), null, null, null, 0L, null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 3462, 0, 130546);
            $this$dp$iv = 30;
            $i$f$getDp2 = false;
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv)), (Composer)$composer2, 6);
            Modifier $this$dp$iv3 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            long l = ColorKt.Color(0xFFF5F5F5L);
            int $this$dp$iv52 = 10;
            boolean $i$f$getDp3 = false;
            Object object = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl($this$dp$iv52));
            CardKt.Card-F-jzlyU($this$dp$iv3, (Shape)object, l, 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-662588317, true, (arg_0, arg_1) -> MainKt.ActivationScreen$lambda$9$0$0$0($machineId, arg_0, arg_1), (Composer)$composer2, 54), (Composer)$composer2, 1573254, 56);
            $this$dp$iv = 30;
            $i$f$getDp2 = false;
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv)), (Composer)$composer2, 6);
            long l2 = ColorKt.Color(0xFF333333L);
            Object object2 = FontWeight.Companion.getBold();
            object = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            TextKt.Text--4IGK_g("Enter Activation Code:", (Modifier)object, l2, 0L, null, (FontWeight)object2, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 197046, 0, 131032);
            $this$dp$iv = 10;
            $i$f$getDp2 = false;
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv)), (Composer)$composer2, 6);
            String $this$dp$iv4 = MainKt.ActivationScreen$lambda$1($activationCode$delegate);
            Modifier $i$f$getDp22 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            object2 = TextFieldDefaults.INSTANCE.outlinedTextFieldColors-dx8h9Zs(Color.Companion.getBlack-0d7_KjU(), 0L, 0L, 0L, 0L, ColorKt.Color(4282549748L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, (Composer)$composer2, 196614, 0, 48, 2097118);
            String string = $this$dp$iv4;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer2, 774724985, "CC(remember):Main.kt#9igjgp");
            void $this$dp$iv52 = $composer2;
            boolean invalid$iv = false;
            boolean $i$f$cache = false;
            Function<Object> it$iv = $this$cache$iv.rememberedValue();
            boolean bl6 = false;
            if (it$iv == Composer.Companion.getEmpty()) {
                String string2 = string;
                boolean bl7 = false;
                string = string2;
                value$iv = arg_0 -> MainKt.ActivationScreen$lambda$9$0$0$1$0($activationCode$delegate, $errorMessage$delegate, $successMessage$delegate, arg_0);
                $this$cache$iv.updateRememberedValue(value$iv);
                function1 = value$iv;
            } else {
                function1 = it$iv;
            }
            object = function1;
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer2);
            OutlinedTextFieldKt.OutlinedTextField(string, (Function1<? super String, Unit>)object, $i$f$getDp22, false, false, null, null, ComposableSingletons$MainKt.INSTANCE.getLambda$-1483246279$kotlinkoreader18(), null, null, false, null, null, null, true, 0, 0, null, null, (TextFieldColors)object2, (Composer)$composer2, 12583344, 24576, 507768);
            $this$dp$iv6 = 15;
            $i$f$getDp = false;
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv6)), (Composer)$composer2, 6);
            int $this$dp$iv72 = 50;
            boolean $i$f$getDp4 = false;
            Modifier $this$dp$iv6 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.constructor-impl($this$dp$iv72));
            ButtonColors $this$dp$iv72 = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279900182L), 0L, 0L, 0L, (Composer)$composer2, 6 | ButtonDefaults.$stable << 12, 14);
            int $this$dp$iv8 = 5;
            boolean $i$f$getDp322 = false;
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl($this$dp$iv8));
            ComposerKt.sourceInformationMarkerStart((Composer)$composer2, 774747856, "CC(remember):Main.kt#9igjgp");
            void $i$f$getDp322 = $composer2;
            invalid$iv = $composer2.changed($onUninstallerActivate) | $composer2.changed($onActivate);
            $i$f$cache = false;
            it$iv = $this$cache$iv.rememberedValue();
            bl6 = false;
            if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
                boolean bl8 = false;
                value$iv = () -> MainKt.ActivationScreen$lambda$9$0$0$2$0($onUninstallerActivate, $onActivate, $activationCode$delegate, $errorMessage$delegate, $successMessage$delegate);
                $this$cache$iv.updateRememberedValue(value$iv);
                function = value$iv;
            } else {
                function = it$iv;
            }
            Function0 function02 = (Function0)function;
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer2);
            ButtonKt.Button(function02, $this$dp$iv6, false, null, null, roundedCornerShape, null, $this$dp$iv72, null, ComposableSingletons$MainKt.INSTANCE.getLambda$272377072$kotlinkoreader18(), (Composer)$composer2, 0x30000030, 348);
            if (((CharSequence)MainKt.ActivationScreen$lambda$4($errorMessage$delegate)).length() > 0) {
                $composer2.startReplaceGroup(-1751295701);
                ComposerKt.sourceInformation((Composer)$composer2, "4128@155557L41,4129@155619L177");
                $this$dp$iv = 10;
                $i$f$getDp = false;
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv)), (Composer)$composer2, 6);
                TextKt.Text--4IGK_g(MainKt.ActivationScreen$lambda$4($errorMessage$delegate), null, ColorPalette.INSTANCE.getError-0d7_KjU(), 0L, null, null, null, 0L, null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 384, 0, 130554);
                $composer2.endReplaceGroup();
            } else {
                $composer2.startReplaceGroup(-1905596062);
                $composer2.endReplaceGroup();
            }
            if (((CharSequence)MainKt.ActivationScreen$lambda$7($successMessage$delegate)).length() > 0) {
                $composer2.startReplaceGroup(-1750968217);
                ComposerKt.sourceInformation((Composer)$composer2, "4137@155887L41,4138@155949L181");
                $this$dp$iv = 10;
                $i$f$getDp = false;
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv)), (Composer)$composer2, 6);
                TextKt.Text--4IGK_g(MainKt.ActivationScreen$lambda$7($successMessage$delegate), null, ColorPalette.INSTANCE.getSuccess-0d7_KjU(), 0L, null, null, null, 0L, null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 384, 0, 130554);
                $composer2.endReplaceGroup();
            } else {
                $composer2.startReplaceGroup(-1905596062);
                $composer2.endReplaceGroup();
            }
            $this$dp$iv = 20;
            $i$f$getDp = false;
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv)), (Composer)$composer2, 6);
            l2 = ColorKt.Color(0xFF999999L);
            long l3 = TextUnitKt.getSp(12);
            int n6 = TextAlign.Companion.getCenter-e0LSkKk();
            Modifier modifier = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            TextKt.Text--4IGK_g("Tip: Enter 'UNINSTALLER' to access uninstall-only mode", modifier, l2, l3, null, null, null, 0L, null, TextAlign.box-impl(n6), 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 3510, 0, 130544);
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

    /*
     * WARNING - void declaration
     */
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit ActivationScreen$lambda$9$0$0$0(String $machineId, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C4009@150315L2639:Main.kt#p91eg0");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            Function0<Unit> function0;
            void $this$cache$iv;
            void $composer2;
            void $changed$iv$iv$iv;
            void $changed$iv$iv;
            void modifier$iv;
            void $composer$iv;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-662588317, $changed, -1, "org.example.ActivationScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Main.kt:4009)");
            }
            int $this$dp$iv22 = 20;
            boolean $i$f$getDp = false;
            Modifier $this$dp$iv22 = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv22));
            Composer composer = $composer;
            int $changed$iv = 6;
            boolean $i$f$Column = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, (Composer)$composer$iv, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3);
            int n = 0x70 & $changed$iv << 3;
            boolean $i$f$Layout = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv, 0);
            CompositionLocalMap localMap$iv$iv = $composer$iv.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier((Composer)$composer$iv, (Modifier)modifier$iv);
            Function0<ComposeUiNode> function02 = ComposeUiNode.Companion.getConstructor();
            int n2 = 6 | 0x380 & $changed$iv$iv << 6;
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
            int n3 = 0xE & $changed$iv$iv$iv >> 6;
            void $composer$iv2 = $composer$iv;
            boolean bl4 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            int n4 = 6 | 0x70 & $changed$iv >> 6;
            void var28_30 = $composer$iv2;
            ColumnScope $this$ActivationScreen_u24lambda_u249_u240_u240_u240_u240 = ColumnScopeInstance.INSTANCE;
            boolean bl5 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer2, -391587498, "C4010@150384L198,4016@150608L41,4022@150891L591,4018@150675L807,4036@151508L41,4049@152248L49,4039@151621L509,4038@151575L911,4055@152512L41,4057@152579L353:Main.kt#p91eg0");
            TextKt.Text--4IGK_g("Your Machine ID:", null, ColorKt.Color(0xFF333333L), 0L, null, FontWeight.Companion.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 196998, 0, 131034);
            int $this$dp$iv32 = 10;
            boolean $i$f$getDp2 = false;
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv32)), (Composer)$composer2, 6);
            Modifier $this$dp$iv32 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            long l = Color.Companion.getWhite-0d7_KjU();
            int $this$dp$iv = 5;
            boolean $i$f$getDp3 = false;
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl($this$dp$iv));
            CardKt.Card-F-jzlyU($this$dp$iv32, roundedCornerShape, l, 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-234074372, true, (arg_0, arg_1) -> MainKt.ActivationScreen$lambda$9$0$0$0$0$0($machineId, arg_0, arg_1), (Composer)$composer2, 54), (Composer)$composer2, 1573254, 56);
            int $this$dp$iv42 = 10;
            $i$f$getDp2 = false;
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv42)), (Composer)$composer2, 6);
            Modifier $this$dp$iv42 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            ButtonColors $i$f$getDp22 = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279900182L), 0L, 0L, 0L, (Composer)$composer2, 6 | ButtonDefaults.$stable << 12, 14);
            int $this$dp$iv5 = 5;
            boolean $i$f$getDp322 = false;
            RoundedCornerShape roundedCornerShape2 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl($this$dp$iv5));
            ComposerKt.sourceInformationMarkerStart((Composer)$composer2, -151141642, "CC(remember):Main.kt#9igjgp");
            void $i$f$getDp322 = $composer2;
            boolean invalid$iv = $composer2.changed($machineId);
            boolean $i$f$cache = false;
            Function0<Unit> it$iv = $this$cache$iv.rememberedValue();
            boolean bl6 = false;
            if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
                boolean bl7 = false;
                Function0<Unit> value$iv = () -> MainKt.ActivationScreen$lambda$9$0$0$0$0$1$0($machineId);
                $this$cache$iv.updateRememberedValue(value$iv);
                function0 = value$iv;
            } else {
                function0 = it$iv;
            }
            Function0 function03 = function0;
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer2);
            ButtonKt.Button(function03, $this$dp$iv42, false, null, null, roundedCornerShape2, null, $i$f$getDp22, null, ComposableSingletons$MainKt.INSTANCE.getLambda$-2037903031$kotlinkoreader18(), (Composer)$composer2, 0x30000030, 348);
            int $this$dp$iv6 = 15;
            $i$f$getDp = false;
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv6)), (Composer)$composer2, 6);
            long l2 = ColorKt.Color(0xFF666666L);
            long l3 = TextUnitKt.getSp(14);
            int n5 = TextAlign.Companion.getCenter-e0LSkKk();
            Modifier modifier = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            TextKt.Text--4IGK_g("Please visit: readmarkable.org to generate an Activation Code", modifier, l2, l3, null, null, null, 0L, null, TextAlign.box-impl(n5), 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 3510, 0, 130544);
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
    private static final Unit ActivationScreen$lambda$9$0$0$0$0$0(String $machineId, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C4023@150940L516,4023@150921L535:Main.kt#p91eg0");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-234074372, $changed, -1, "org.example.ActivationScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Main.kt:4023)");
            }
            SelectionContainerKt.SelectionContainer(null, ComposableLambdaKt.rememberComposableLambda(1884151583, true, (arg_0, arg_1) -> MainKt.ActivationScreen$lambda$9$0$0$0$0$0$0($machineId, arg_0, arg_1), $composer, 54), $composer, 48, 1);
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
    private static final Unit ActivationScreen$lambda$9$0$0$0$0$0$0(String $machineId, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C4024@150974L452:Main.kt#p91eg0");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1884151583, $changed, -1, "org.example.ActivationScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Main.kt:4024)");
            }
            GenericFontFamily genericFontFamily = FontFamily.Companion.getMonospace();
            long l = TextUnitKt.getSp(14);
            int n = TextAlign.Companion.getCenter-e0LSkKk();
            int $this$dp$iv = 15;
            boolean $i$f$getDp = false;
            Modifier modifier = PaddingKt.padding-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.constructor-impl($this$dp$iv));
            TextKt.Text--4IGK_g($machineId, modifier, 0L, l, null, null, (FontFamily)genericFontFamily, 0L, null, TextAlign.box-impl(n), 0L, 0, false, 0, 0, null, null, $composer, 3120, 0, 130484);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ActivationScreen$lambda$9$0$0$0$0$1$0(String $machineId) {
        try {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection selection = new StringSelection($machineId);
            clipboard.setContents(selection, selection);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return Unit.INSTANCE;
    }

    private static final Unit ActivationScreen$lambda$9$0$0$1$0(MutableState $activationCode$delegate, MutableState $errorMessage$delegate, MutableState $successMessage$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        MainKt.ActivationScreen$lambda$2($activationCode$delegate, it);
        MainKt.ActivationScreen$lambda$5($errorMessage$delegate, "");
        MainKt.ActivationScreen$lambda$8($successMessage$delegate, "");
        return Unit.INSTANCE;
    }

    private static final Unit ActivationScreen$lambda$9$0$0$2$0(Function0 $onUninstallerActivate, Function1 $onActivate, MutableState $activationCode$delegate, MutableState $errorMessage$delegate, MutableState $successMessage$delegate) {
        if (StringsKt.isBlank(MainKt.ActivationScreen$lambda$1($activationCode$delegate))) {
            MainKt.ActivationScreen$lambda$5($errorMessage$delegate, "Please enter an activation code");
            return Unit.INSTANCE;
        }
        String trimmedCode = ((Object)StringsKt.trim((CharSequence)MainKt.ActivationScreen$lambda$1($activationCode$delegate))).toString();
        String string = trimmedCode.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string, "toUpperCase(...)");
        if (Intrinsics.areEqual(string, "UNINSTALLER")) {
            MainKt.ActivationScreen$lambda$8($successMessage$delegate, "Uninstall-Only Mode activated! Reloading...");
            $onUninstallerActivate.invoke();
            return Unit.INSTANCE;
        }
        if (((Boolean)$onActivate.invoke(trimmedCode)).booleanValue()) {
            MainKt.ActivationScreen$lambda$8($successMessage$delegate, "Activation successful! Reloading...");
        } else {
            MainKt.ActivationScreen$lambda$5($errorMessage$delegate, "Invalid activation code");
        }
        return Unit.INSTANCE;
    }

    private static final Unit ActivationScreen$lambda$10(String $machineId, Function1 $onActivate, Function0 $onUninstallerActivate, int $$changed, Composer $composer, int $force) {
        MainKt.ActivationScreen($machineId, $onActivate, $onUninstallerActivate, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 1));
        return Unit.INSTANCE;
    }

    private static final Unit ExpiredScreen$lambda$1(int $$changed, Composer $composer, int $force) {
        MainKt.ExpiredScreen($composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 1));
        return Unit.INSTANCE;
    }

    /*
     * WARNING - void declaration
     */
    private static final String MainInstallerScreen$lambda$1(MutableState<String> $deviceIP$delegate) {
        void $this$getValue$iv;
        State state = $deviceIP$delegate;
        Object var2_2 = null;
        Object property$iv = null;
        boolean $i$f$getValue = false;
        return (String)$this$getValue$iv.getValue();
    }

    /*
     * WARNING - void declaration
     */
    private static final void MainInstallerScreen$lambda$2(MutableState<String> $deviceIP$delegate, String string) {
        void $this$setValue$iv;
        MutableState<String> mutableState = $deviceIP$delegate;
        Object var3_3 = null;
        Object var4_4 = null;
        String value$iv = string;
        boolean $i$f$setValue = false;
        $this$setValue$iv.setValue(value$iv);
    }

    /*
     * WARNING - void declaration
     */
    private static final String MainInstallerScreen$lambda$4(MutableState<String> $sshPassword$delegate) {
        void $this$getValue$iv;
        State state = $sshPassword$delegate;
        Object var2_2 = null;
        Object property$iv = null;
        boolean $i$f$getValue = false;
        return (String)$this$getValue$iv.getValue();
    }

    /*
     * WARNING - void declaration
     */
    private static final void MainInstallerScreen$lambda$5(MutableState<String> $sshPassword$delegate, String string) {
        void $this$setValue$iv;
        MutableState<String> mutableState = $sshPassword$delegate;
        Object var3_3 = null;
        Object var4_4 = null;
        String value$iv = string;
        boolean $i$f$setValue = false;
        $this$setValue$iv.setValue(value$iv);
    }

    /*
     * WARNING - void declaration
     */
    private static final String MainInstallerScreen$lambda$7(MutableState<String> $deviceModel$delegate) {
        void $this$getValue$iv;
        State state = $deviceModel$delegate;
        Object var2_2 = null;
        Object property$iv = null;
        boolean $i$f$getValue = false;
        return (String)$this$getValue$iv.getValue();
    }

    /*
     * WARNING - void declaration
     */
    private static final void MainInstallerScreen$lambda$8(MutableState<String> $deviceModel$delegate, String string) {
        void $this$setValue$iv;
        MutableState<String> mutableState = $deviceModel$delegate;
        Object var3_3 = null;
        Object var4_4 = null;
        String value$iv = string;
        boolean $i$f$setValue = false;
        $this$setValue$iv.setValue(value$iv);
    }

    /*
     * WARNING - void declaration
     */
    private static final String MainInstallerScreen$lambda$10(MutableState<String> $installationType$delegate) {
        void $this$getValue$iv;
        State state = $installationType$delegate;
        Object var2_2 = null;
        Object property$iv = null;
        boolean $i$f$getValue = false;
        return (String)$this$getValue$iv.getValue();
    }

    /*
     * WARNING - void declaration
     */
    private static final void MainInstallerScreen$lambda$11(MutableState<String> $installationType$delegate, String string) {
        void $this$setValue$iv;
        MutableState<String> mutableState = $installationType$delegate;
        Object var3_3 = null;
        Object var4_4 = null;
        String value$iv = string;
        boolean $i$f$setValue = false;
        $this$setValue$iv.setValue(value$iv);
    }

    /*
     * WARNING - void declaration
     */
    private static final boolean MainInstallerScreen$lambda$13(MutableState<Boolean> $enableTripletap$delegate) {
        void $this$getValue$iv;
        State state = $enableTripletap$delegate;
        Object var2_2 = null;
        Object property$iv = null;
        boolean $i$f$getValue = false;
        return (Boolean)$this$getValue$iv.getValue();
    }

    /*
     * WARNING - void declaration
     */
    private static final void MainInstallerScreen$lambda$14(MutableState<Boolean> $enableTripletap$delegate, boolean bl) {
        void $this$setValue$iv;
        MutableState<Boolean> mutableState = $enableTripletap$delegate;
        Object var3_3 = null;
        Object var4_4 = null;
        Boolean value$iv = bl;
        boolean $i$f$setValue = false;
        $this$setValue$iv.setValue(value$iv);
    }

    /*
     * WARNING - void declaration
     */
    private static final boolean MainInstallerScreen$lambda$16(MutableState<Boolean> $createBackup$delegate) {
        void $this$getValue$iv;
        State state = $createBackup$delegate;
        Object var2_2 = null;
        Object property$iv = null;
        boolean $i$f$getValue = false;
        return (Boolean)$this$getValue$iv.getValue();
    }

    /*
     * WARNING - void declaration
     */
    private static final void MainInstallerScreen$lambda$17(MutableState<Boolean> $createBackup$delegate, boolean bl) {
        void $this$setValue$iv;
        MutableState<Boolean> mutableState = $createBackup$delegate;
        Object var3_3 = null;
        Object var4_4 = null;
        Boolean value$iv = bl;
        boolean $i$f$setValue = false;
        $this$setValue$iv.setValue(value$iv);
    }

    /*
     * WARNING - void declaration
     */
    private static final boolean MainInstallerScreen$lambda$19(MutableState<Boolean> $isInstalling$delegate) {
        void $this$getValue$iv;
        State state = $isInstalling$delegate;
        Object var2_2 = null;
        Object property$iv = null;
        boolean $i$f$getValue = false;
        return (Boolean)$this$getValue$iv.getValue();
    }

    /*
     * WARNING - void declaration
     */
    private static final void MainInstallerScreen$lambda$20(MutableState<Boolean> $isInstalling$delegate, boolean bl) {
        void $this$setValue$iv;
        MutableState<Boolean> mutableState = $isInstalling$delegate;
        Object var3_3 = null;
        Object var4_4 = null;
        Boolean value$iv = bl;
        boolean $i$f$setValue = false;
        $this$setValue$iv.setValue(value$iv);
    }

    /*
     * WARNING - void declaration
     */
    private static final InstallationStatus MainInstallerScreen$lambda$22(MutableState<InstallationStatus> $currentStatus$delegate) {
        void $this$getValue$iv;
        State state = $currentStatus$delegate;
        Object var2_2 = null;
        Object property$iv = null;
        boolean $i$f$getValue = false;
        return (InstallationStatus)$this$getValue$iv.getValue();
    }

    /*
     * WARNING - void declaration
     */
    private static final void MainInstallerScreen$lambda$23(MutableState<InstallationStatus> $currentStatus$delegate, InstallationStatus installationStatus) {
        void $this$setValue$iv;
        MutableState<InstallationStatus> mutableState = $currentStatus$delegate;
        Object var3_3 = null;
        Object var4_4 = null;
        InstallationStatus value$iv = installationStatus;
        boolean $i$f$setValue = false;
        $this$setValue$iv.setValue(value$iv);
    }

    /*
     * WARNING - void declaration
     */
    private static final List<String> MainInstallerScreen$lambda$25(MutableState<List<String>> $logs$delegate) {
        void $this$getValue$iv;
        State state = $logs$delegate;
        Object var2_2 = null;
        Object property$iv = null;
        boolean $i$f$getValue = false;
        return (List)$this$getValue$iv.getValue();
    }

    /*
     * WARNING - void declaration
     */
    private static final void MainInstallerScreen$lambda$26(MutableState<List<String>> $logs$delegate, List<String> list) {
        void $this$setValue$iv;
        MutableState<List<String>> mutableState = $logs$delegate;
        Object var3_3 = null;
        Object var4_4 = null;
        List<String> value$iv = list;
        boolean $i$f$setValue = false;
        $this$setValue$iv.setValue(value$iv);
    }

    private static final void MainInstallerScreen$startInstallation(CoroutineScope coroutineScope, MutableState<String> sshPassword$delegate, MutableState<List<String>> logs$delegate, MutableState<Boolean> isInstalling$delegate, MutableState<String> deviceIP$delegate, MutableState<String> deviceModel$delegate, MutableState<Boolean> enableTripletap$delegate, MutableState<Boolean> createBackup$delegate, MutableState<InstallationStatus> currentStatus$delegate, String type) {
        CharSequence charSequence;
        if (StringsKt.isBlank(MainKt.MainInstallerScreen$lambda$4(sshPassword$delegate))) {
            MainKt.MainInstallerScreen$lambda$26(logs$delegate, CollectionsKt.plus((Collection)MainKt.MainInstallerScreen$lambda$25(logs$delegate), "[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + "] Error: Please enter SSH password"));
            return;
        }
        if (activationManager.isTrialExpired()) {
            MainKt.MainInstallerScreen$lambda$26(logs$delegate, CollectionsKt.plus((Collection)MainKt.MainInstallerScreen$lambda$25(logs$delegate), "[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + "] Error: License has expired. Please visit readmarkable.org for a new activation code."));
            return;
        }
        MainKt.MainInstallerScreen$lambda$20(isInstalling$delegate, true);
        MainKt.MainInstallerScreen$lambda$26(logs$delegate, CollectionsKt.listOf("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + "] Starting " + type + "..."));
        CharSequence charSequence2 = MainKt.MainInstallerScreen$lambda$1(deviceIP$delegate);
        if (StringsKt.isBlank(charSequence2)) {
            boolean bl = false;
            charSequence = "10.11.99.1";
        } else {
            charSequence = charSequence2;
        }
        boolean bl = MainKt.MainInstallerScreen$lambda$16(createBackup$delegate);
        boolean bl2 = MainKt.MainInstallerScreen$lambda$13(enableTripletap$delegate);
        String string = type;
        String string2 = MainKt.MainInstallerScreen$lambda$7(deviceModel$delegate);
        String string3 = MainKt.MainInstallerScreen$lambda$4(sshPassword$delegate);
        String string4 = (String)charSequence;
        InstallationConfig config = new InstallationConfig(string4, string3, string2, string, bl2, bl);
        InstallationJob job = new InstallationJob(config, arg_0 -> MainKt.MainInstallerScreen$startInstallation$lambda$28(currentStatus$delegate, logs$delegate, arg_0));
        GlobalState.INSTANCE.getCurrentJob().set(job);
        BuildersKt.launch$default((CoroutineScope)coroutineScope, (CoroutineContext)((CoroutineContext)Dispatchers.getIO()), null, (Function2)new Function2<CoroutineScope, Continuation<? super Unit>, Object>(job, isInstalling$delegate, null){
            int label;
            final /* synthetic */ InstallationJob $job;
            final /* synthetic */ MutableState<Boolean> $isInstalling$delegate;
            {
                this.$job = $job;
                this.$isInstalling$delegate = $isInstalling$delegate;
                super(2, $completion);
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            public final Object invokeSuspend(Object $result) {
                Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0: {
                        ResultKt.throwOnFailure($result);
                        MainKt.processInstallationAsync(this.$job);
                        this.label = 1;
                        Object object2 = BuildersKt.withContext((CoroutineContext)((CoroutineContext)Dispatchers.getMain()), (Function2)new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$isInstalling$delegate, null){
                            int label;
                            final /* synthetic */ MutableState<Boolean> $isInstalling$delegate;
                            {
                                this.$isInstalling$delegate = $isInstalling$delegate;
                                super(2, $completion);
                            }

                            public final Object invokeSuspend(Object $result) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                switch (this.label) {
                                    case 0: {
                                        ResultKt.throwOnFailure($result);
                                        MainKt.access$MainInstallerScreen$lambda$20(this.$isInstalling$delegate, false);
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
                        }, (Continuation)this);
                        if (object2 != object) return Unit.INSTANCE;
                        return object;
                    }
                    case 1: {
                        ResultKt.throwOnFailure($result);
                        Object object2 = $result;
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
        }, (int)2, null);
    }

    private static final Unit MainInstallerScreen$startInstallation$lambda$28(MutableState $currentStatus$delegate, MutableState $logs$delegate, InstallationStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        MainKt.MainInstallerScreen$lambda$23($currentStatus$delegate, InstallationStatus.copy$default(status, null, null, null, 0, null, 0, 0, null, null, false, false, false, 4095, null));
        MainKt.MainInstallerScreen$lambda$26($logs$delegate, CollectionsKt.toList((Iterable)status.getDetailedLogs()));
        return Unit.INSTANCE;
    }

    /*
     * WARNING - void declaration
     */
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit MainInstallerScreen$lambda$29$0$0$0$0(MutableState $deviceIP$delegate, MutableState $isInstalling$delegate, MutableState $sshPassword$delegate, MutableState $deviceModel$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C4327@162533L4180:Main.kt#p91eg0");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            void $composer2;
            void $changed$iv$iv$iv;
            void $changed$iv$iv;
            void $changed$iv;
            void $composer$iv;
            Function1<String, Unit> function1;
            Function1<String, Unit> function12;
            Function1<String, Unit> value$iv;
            String string;
            void $this$cache$iv;
            void $composer3;
            void $changed$iv$iv$iv2;
            void $changed$iv$iv2;
            void modifier$iv;
            void $composer$iv2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(650158516, $changed, -1, "org.example.MainInstallerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Main.kt:4327)");
            }
            int $this$dp$iv22 = 16;
            boolean $i$f$getDp = false;
            Modifier $this$dp$iv22 = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv22));
            Composer composer = $composer;
            int $changed$iv2 = 6;
            boolean $i$f$Column = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, (Composer)$composer$iv2, 0xE & $changed$iv2 >> 3 | 0x70 & $changed$iv2 >> 3);
            int n = 0x70 & $changed$iv2 << 3;
            boolean $i$f$Layout = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv2, 0);
            CompositionLocalMap localMap$iv$iv = $composer$iv2.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier((Composer)$composer$iv2, (Modifier)modifier$iv);
            Function0<ComposeUiNode> function0 = ComposeUiNode.Companion.getConstructor();
            int n2 = 6 | 0x380 & $changed$iv$iv2 << 6;
            boolean $i$f$ReusableComposeNode = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer$iv2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer$iv2.startReusableNode();
            if ($composer$iv2.getInserting()) {
                void factory$iv$iv$iv;
                $composer$iv2.createNode(factory$iv$iv$iv);
            } else {
                $composer$iv2.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl((Composer)$composer$iv2);
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
            int n3 = 0xE & $changed$iv$iv$iv2 >> 6;
            void $composer$iv3 = $composer$iv2;
            boolean bl4 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            int n4 = 6 | 0x70 & $changed$iv2 >> 6;
            void var31_33 = $composer$iv3;
            ColumnScope $this$MainInstallerScreen_u24lambda_u2429_u240_u240_u240_u240_u240 = ColumnScopeInstance.INSTANCE;
            boolean bl5 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer3, 1796462344, "C4328@162606L278,4335@162914L41,4343@163408L401,4339@163102L17,4337@162985L854,4351@163869L41,4359@164364L401,4355@164060L20,4353@163940L855,4367@164825L41,4369@164896L70,4370@164995L40,4378@165387L1300:Main.kt#p91eg0");
            long l = ColorPalette.INSTANCE.getPrimaryVariant-0d7_KjU();
            FontWeight fontWeight = FontWeight.Companion.getBold();
            long l2 = TextUnitKt.getSp(20);
            TextKt.Text--4IGK_g("\ud83d\udd0c Device Connection", null, l, l2, null, fontWeight, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer3, 200070, 0, 131026);
            int $this$dp$iv32 = 16;
            boolean $i$f$getDp22 = false;
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv32)), (Composer)$composer3, 6);
            String $this$dp$iv32 = MainKt.MainInstallerScreen$lambda$1($deviceIP$delegate);
            Modifier $i$f$getDp22 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            boolean bl6 = !MainKt.MainInstallerScreen$lambda$19($isInstalling$delegate);
            TextFieldColors textFieldColors = TextFieldDefaults.INSTANCE.outlinedTextFieldColors-dx8h9Zs(ColorPalette.INSTANCE.getOnSurface-0d7_KjU(), 0L, ColorPalette.INSTANCE.getInputBackground-0d7_KjU(), 0L, 0L, ColorPalette.INSTANCE.getPrimaryVariant-0d7_KjU(), Color.copy-wmQWz5c$default(ColorPalette.INSTANCE.getOnSurface-0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, (Composer)$composer3, 1769862, 0, 48, 2097050);
            String string2 = $this$dp$iv32;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer3, 1027793531, "CC(remember):Main.kt#9igjgp");
            void var42_54 = $composer3;
            boolean invalid$iv = false;
            boolean $i$f$cache = false;
            Function1<String, Unit> it$iv = $this$cache$iv.rememberedValue();
            boolean bl7 = false;
            if (it$iv == Composer.Companion.getEmpty()) {
                string = string2;
                boolean bl8 = false;
                string2 = string;
                value$iv = arg_0 -> MainKt.MainInstallerScreen$lambda$29$0$0$0$0$0$0$0($deviceIP$delegate, arg_0);
                $this$cache$iv.updateRememberedValue(value$iv);
                function12 = value$iv;
            } else {
                function12 = it$iv;
            }
            Function1 function13 = function12;
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer3);
            OutlinedTextFieldKt.OutlinedTextField(string2, function13, $i$f$getDp22, bl6, false, null, ComposableSingletons$MainKt.INSTANCE.getLambda$-62673852$kotlinkoreader18(), null, null, null, false, null, null, null, false, 0, 0, null, null, textFieldColors, (Composer)$composer3, 1573296, 0, 524208);
            int $this$dp$iv42 = 12;
            boolean $i$f$getDp32 = false;
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv42)), (Composer)$composer3, 6);
            String $this$dp$iv42 = MainKt.MainInstallerScreen$lambda$4($sshPassword$delegate);
            Modifier $i$f$getDp32 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            bl6 = !MainKt.MainInstallerScreen$lambda$19($isInstalling$delegate);
            textFieldColors = TextFieldDefaults.INSTANCE.outlinedTextFieldColors-dx8h9Zs(ColorPalette.INSTANCE.getOnSurface-0d7_KjU(), 0L, ColorPalette.INSTANCE.getInputBackground-0d7_KjU(), 0L, 0L, ColorPalette.INSTANCE.getPrimaryVariant-0d7_KjU(), Color.copy-wmQWz5c$default(ColorPalette.INSTANCE.getOnSurface-0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, (Composer)$composer3, 1769862, 0, 48, 2097050);
            String string3 = $this$dp$iv42;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer3, 1027824190, "CC(remember):Main.kt#9igjgp");
            $this$cache$iv = $composer3;
            invalid$iv = false;
            $i$f$cache = false;
            it$iv = $this$cache$iv.rememberedValue();
            bl7 = false;
            if (it$iv == Composer.Companion.getEmpty()) {
                string = string3;
                boolean bl9 = false;
                string3 = string;
                value$iv = arg_0 -> MainKt.MainInstallerScreen$lambda$29$0$0$0$0$0$1$0($sshPassword$delegate, arg_0);
                $this$cache$iv.updateRememberedValue(value$iv);
                function1 = value$iv;
            } else {
                function1 = it$iv;
            }
            function13 = function1;
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer3);
            OutlinedTextFieldKt.OutlinedTextField(string3, function13, $i$f$getDp32, bl6, false, null, ComposableSingletons$MainKt.INSTANCE.getLambda$927792379$kotlinkoreader18(), null, null, null, false, null, null, null, false, 0, 0, null, null, textFieldColors, (Composer)$composer3, 1573296, 0, 524208);
            int $this$dp$iv = 12;
            boolean $i$f$getDp4 = false;
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv)), (Composer)$composer3, 6);
            TextKt.Text--4IGK_g("Device Model", null, ColorPalette.INSTANCE.getOnSurface-0d7_KjU(), TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer3, 3462, 0, 131058);
            $this$dp$iv = 4;
            $i$f$getDp4 = false;
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv)), (Composer)$composer3, 6);
            Pair[] $i$f$getDp42 = new Pair[]{TuplesKt.to("remarkable-paper-pro-move", "reMarkable\u2122 Paper Pro Move"), TuplesKt.to("remarkable-paper-pro", "reMarkable\u2122 Paper Pro"), TuplesKt.to("remarkable-2", "reMarkable\u2122 2")};
            List<Pair> models = CollectionsKt.listOf($i$f$getDp42);
            function13 = $composer3;
            boolean $this$cache$iv2 = false;
            boolean $i$f$Column2 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier$iv2 = Modifier.Companion;
            Arrangement.Vertical verticalArrangement$iv2 = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv2 = Alignment.Companion.getStart();
            MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, horizontalAlignment$iv2, (Composer)$composer$iv, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3);
            int it$iv2 = 0x70 & $changed$iv << 3;
            boolean $i$f$Layout2 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv, 0);
            CompositionLocalMap localMap$iv$iv2 = $composer$iv.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier((Composer)$composer$iv, modifier$iv2);
            Function0<ComposeUiNode> function02 = ComposeUiNode.Companion.getConstructor();
            int n5 = 6 | 0x380 & $changed$iv$iv << 6;
            boolean $i$f$ReusableComposeNode2 = false;
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
            Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.constructor-impl((Composer)$composer$iv);
            $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = false;
            Updater.set-impl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> block$iv$iv$iv2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            $i$f$set-impl = false;
            Composer $this$set_impl_u24lambda_u240$iv$iv$iv2 = $this$Layout_u24lambda_u240$iv$iv2;
            $i$a$-with-Updater$set$1$iv$iv$iv = false;
            if ($this$set_impl_u24lambda_u240$iv$iv$iv2.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv2.rememberedValue(), (Object)compositeKeyHash$iv$iv2)) {
                $this$set_impl_u24lambda_u240$iv$iv$iv2.updateRememberedValue(compositeKeyHash$iv$iv2);
                $this$Layout_u24lambda_u240$iv$iv2.apply(compositeKeyHash$iv$iv2, block$iv$iv$iv2);
            }
            Updater.set-impl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
            int n6 = 0xE & $changed$iv$iv$iv >> 6;
            void $composer$iv4 = $composer$iv;
            $i$a$-Layout-ColumnKt$Column$1$iv = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv4, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            int n7 = 6 | 0x70 & $changed$iv >> 6;
            void var65_80 = $composer$iv4;
            ColumnScope $this$MainInstallerScreen_u24lambda_u2429_u240_u240_u240_u240_u240_u242 = ColumnScopeInstance.INSTANCE;
            boolean bl10 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer2, 853901046, "C:Main.kt#p91eg0");
            $composer2.startReplaceGroup(-2050664570);
            ComposerKt.sourceInformation((Composer)$composer2, "*4384@165792L23,4380@165499L1124");
            Iterable $this$forEach$iv = models;
            boolean $i$f$forEach = false;
            for (Object element$iv : $this$forEach$iv) {
                Function0<Unit> function03;
                void $this$cache$iv3;
                void $composer4;
                void $changed$iv$iv$iv3;
                void $changed$iv$iv3;
                void modifier$iv3;
                void $changed$iv3;
                void verticalAlignment$iv;
                void $composer$iv5;
                Function0<Unit> function04;
                void $this$cache$iv4;
                Pair pair = (Pair)element$iv;
                boolean bl11 = false;
                String value = (String)pair.component1();
                String label = (String)pair.component2();
                Alignment.Vertical vertical = Alignment.Companion.getCenterVertically();
                Modifier modifier = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                boolean bl12 = !MainKt.MainInstallerScreen$lambda$19($isInstalling$delegate);
                String string4 = null;
                Role role = null;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer2, -63803472, "CC(remember):Main.kt#9igjgp");
                void var77_92 = $composer2;
                boolean invalid$iv22 = $composer2.changed(value);
                boolean $i$f$cache22 = false;
                Function0<Unit> it$iv32 = $this$cache$iv4.rememberedValue();
                $i$a$-let-ComposerKt$cache$1$iv = false;
                if (invalid$iv22 || it$iv32 == Composer.Companion.getEmpty()) {
                    Role role2 = role;
                    String string5 = string4;
                    boolean bl13 = bl12;
                    Modifier modifier2 = modifier;
                    boolean bl14 = false;
                    Function0<Unit> function05 = () -> MainKt.MainInstallerScreen$lambda$29$0$0$0$0$0$2$0$0$0(value, $deviceModel$delegate);
                    modifier = modifier2;
                    bl12 = bl13;
                    string4 = string5;
                    role = role2;
                    Function0<Unit> value$iv2 = function05;
                    $this$cache$iv4.updateRememberedValue(value$iv2);
                    function04 = value$iv2;
                } else {
                    function04 = it$iv32;
                }
                Function0 function06 = function04;
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer2);
                int $this$dp$iv52 = 4;
                boolean $i$f$getDp5 = false;
                Modifier $this$dp$iv52 = PaddingKt.padding-VpY3zN4$default(ClickableKt.clickable-XHw0xAI$default(modifier, bl12, string4, role, function06, 6, null), 0.0f, Dp.constructor-impl($this$dp$iv52), 1, null);
                Alignment.Vertical invalid$iv22 = vertical;
                void $i$f$cache22 = $composer2;
                int it$iv32 = 384;
                boolean $i$f$Row = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv5, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
                MeasurePolicy measurePolicy$iv3 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, (Alignment.Vertical)verticalAlignment$iv, (Composer)$composer$iv5, 0xE & $changed$iv3 >> 3 | 0x70 & $changed$iv3 >> 3);
                int value$iv2 = 0x70 & $changed$iv3 << 3;
                boolean $i$f$Layout3 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv3 = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv5, 0);
                CompositionLocalMap localMap$iv$iv3 = $composer$iv5.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier((Composer)$composer$iv5, (Modifier)modifier$iv3);
                Function0<ComposeUiNode> function07 = ComposeUiNode.Companion.getConstructor();
                int n8 = 6 | 0x380 & $changed$iv$iv3 << 6;
                boolean $i$f$ReusableComposeNode3 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer$iv5.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv5.startReusableNode();
                if ($composer$iv5.getInserting()) {
                    void factory$iv$iv$iv;
                    $composer$iv5.createNode(factory$iv$iv$iv);
                } else {
                    $composer$iv5.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.constructor-impl((Composer)$composer$iv5);
                $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = false;
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> block$iv$iv$iv3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                $i$f$set-impl = false;
                Composer $this$set_impl_u24lambda_u240$iv$iv$iv3 = $this$Layout_u24lambda_u240$iv$iv3;
                $i$a$-with-Updater$set$1$iv$iv$iv = false;
                if ($this$set_impl_u24lambda_u240$iv$iv$iv3.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv3.rememberedValue(), (Object)compositeKeyHash$iv$iv3)) {
                    $this$set_impl_u24lambda_u240$iv$iv$iv3.updateRememberedValue(compositeKeyHash$iv$iv3);
                    $this$Layout_u24lambda_u240$iv$iv3.apply(compositeKeyHash$iv$iv3, block$iv$iv$iv3);
                }
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.Companion.getSetModifier());
                int n9 = 0xE & $changed$iv$iv$iv3 >> 6;
                void $composer$iv6 = $composer$iv5;
                boolean bl15 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv6, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                int n10 = 6 | 0x70 & $changed$iv3 >> 6;
                void var107_129 = $composer$iv6;
                RowScope $this$MainInstallerScreen_u24lambda_u2429_u240_u240_u240_u240_u240_u242_u240_u241 = RowScopeInstance.INSTANCE;
                boolean bl16 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer4, 1503860035, "C4389@166110L42,4391@166296L145,4387@165966L517,4395@166524L61:Main.kt#p91eg0");
                boolean bl17 = Intrinsics.areEqual(MainKt.MainInstallerScreen$lambda$7($deviceModel$delegate), value);
                ComposerKt.sourceInformationMarkerStart((Composer)$composer4, -2029694337, "CC(remember):Main.kt#9igjgp");
                void var110_132 = $composer4;
                boolean invalid$iv3 = $composer4.changed(value);
                boolean $i$f$cache3 = false;
                Function0<Unit> it$iv4 = $this$cache$iv3.rememberedValue();
                $i$a$-let-ComposerKt$cache$1$iv = false;
                if (invalid$iv3 || it$iv4 == Composer.Companion.getEmpty()) {
                    boolean bl18 = bl17;
                    boolean bl19 = false;
                    Function0<Unit> function08 = () -> MainKt.MainInstallerScreen$lambda$29$0$0$0$0$0$2$0$1$0$0(value, $isInstalling$delegate, $deviceModel$delegate);
                    bl17 = bl18;
                    Function0<Unit> value$iv3 = function08;
                    $this$cache$iv3.updateRememberedValue(value$iv3);
                    function03 = value$iv3;
                } else {
                    function03 = it$iv4;
                }
                Function0 function09 = function03;
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer4);
                RadioButtonKt.RadioButton(bl17, function09, null, !MainKt.MainInstallerScreen$lambda$19($isInstalling$delegate), null, RadioButtonDefaults.INSTANCE.colors-RGew2ao(ColorPalette.INSTANCE.getPrimaryVariant-0d7_KjU(), 0L, 0L, (Composer)$composer4, 6 | RadioButtonDefaults.$stable << 9, 6), (Composer)$composer4, 0, 20);
                TextKt.Text--4IGK_g(label, null, ColorPalette.INSTANCE.getOnSurface-0d7_KjU(), TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer4, 3456, 0, 131058);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer4);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv6);
                $composer$iv5.endNode();
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv5);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv5);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv5);
            }
            $composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer2);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv4);
            $composer$iv.endNode();
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer3);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv3);
            $composer$iv2.endNode();
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv2);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv2);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private static final Unit MainInstallerScreen$lambda$29$0$0$0$0$0$0$0(MutableState $deviceIP$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        MainKt.MainInstallerScreen$lambda$2($deviceIP$delegate, it);
        return Unit.INSTANCE;
    }

    private static final Unit MainInstallerScreen$lambda$29$0$0$0$0$0$1$0(MutableState $sshPassword$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        MainKt.MainInstallerScreen$lambda$5($sshPassword$delegate, it);
        return Unit.INSTANCE;
    }

    private static final Unit MainInstallerScreen$lambda$29$0$0$0$0$0$2$0$0$0(String $value, MutableState $deviceModel$delegate) {
        MainKt.MainInstallerScreen$lambda$8($deviceModel$delegate, $value);
        return Unit.INSTANCE;
    }

    private static final Unit MainInstallerScreen$lambda$29$0$0$0$0$0$2$0$1$0$0(String $value, MutableState $isInstalling$delegate, MutableState $deviceModel$delegate) {
        if (!MainKt.MainInstallerScreen$lambda$19($isInstalling$delegate)) {
            MainKt.MainInstallerScreen$lambda$8($deviceModel$delegate, $value);
        }
        return Unit.INSTANCE;
    }

    /*
     * WARNING - void declaration
     */
    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit MainInstallerScreen$lambda$29$0$0$1$0(boolean $isUninstallerOnly, CoroutineScope $coroutineScope, MutableState $isInstalling$delegate, MutableState $installationType$delegate, MutableState $enableTripletap$delegate, MutableState $createBackup$delegate, MutableState $sshPassword$delegate, MutableState $logs$delegate, MutableState $deviceIP$delegate, MutableState $deviceModel$delegate, MutableState $currentStatus$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C4412@167195L10867:Main.kt#p91eg0");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            boolean $i$f$getDp;
            int $this$dp$iv72;
            int $changed$iv;
            Function1<Boolean, Unit> value$iv;
            Object object;
            void $composer$iv;
            int $i$f$set-impl2;
            void $composer2;
            void $changed$iv$iv$iv;
            void $changed$iv$iv;
            void modifier$iv;
            void $composer$iv2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1142301973, $changed, -1, "org.example.MainInstallerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Main.kt:4412)");
            }
            int $this$dp$iv22 = 16;
            boolean $i$f$getDp2 = false;
            Modifier $this$dp$iv22 = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv22));
            Composer composer = $composer;
            int $changed$iv2 = 6;
            boolean $i$f$Column = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, (Composer)$composer$iv2, 0xE & $changed$iv2 >> 3 | 0x70 & $changed$iv2 >> 3);
            int n = 0x70 & $changed$iv2 << 3;
            boolean $i$f$Layout = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv2, 0);
            CompositionLocalMap localMap$iv$iv = $composer$iv2.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier((Composer)$composer$iv2, (Modifier)modifier$iv);
            Function0<ComposeUiNode> function0 = ComposeUiNode.Companion.getConstructor();
            int n2 = 6 | 0x380 & $changed$iv$iv << 6;
            boolean $i$f$ReusableComposeNode = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer$iv2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer$iv2.startReusableNode();
            if ($composer$iv2.getInserting()) {
                void factory$iv$iv$iv;
                $composer$iv2.createNode(factory$iv$iv$iv);
            } else {
                $composer$iv2.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl((Composer)$composer$iv2);
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
            int n3 = 0xE & $changed$iv$iv$iv >> 6;
            void $composer$iv3 = $composer$iv2;
            boolean bl4 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            int n4 = 6 | 0x70 & $changed$iv2 >> 6;
            void var38_40 = $composer$iv3;
            ColumnScope $this$MainInstallerScreen_u24lambda_u2429_u240_u240_u241_u240_u240 = ColumnScopeInstance.INSTANCE;
            boolean bl5 = false;
            ComposerKt.sourceInformationMarkerStart((Composer)$composer2, -1629315662, "C4413@167268L334,4420@167632L41:Main.kt#p91eg0");
            String string = $isUninstallerOnly ? "\u2699\ufe0f Uninstall-Only Mode" : "\u2699\ufe0f Installation Options";
            long l = ColorPalette.INSTANCE.getPrimaryVariant-0d7_KjU();
            FontWeight fontWeight = FontWeight.Companion.getBold();
            long l2 = TextUnitKt.getSp(20);
            TextKt.Text--4IGK_g(string, null, l, l2, null, fontWeight, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 200064, 0, 131026);
            int $this$dp$iv = 16;
            boolean $i$f$getDp3 = false;
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv)), (Composer)$composer2, 6);
            if ($isUninstallerOnly) {
                $composer2.startReplaceGroup(-1629166553);
                ComposerKt.sourceInformation((Composer)$composer2, "4424@167842L270,4430@168146L40,4432@168220L323,4438@168577L41");
                TextKt.Text--4IGK_g("This mode only allows uninstalling KOReader.", null, Color.copy-wmQWz5c$default(ColorPalette.INSTANCE.getOnSurface-0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 3462, 0, 131058);
                $this$dp$iv = 8;
                $i$f$getDp3 = false;
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv)), (Composer)$composer2, 6);
                TextKt.Text--4IGK_g("To access full installation features, please obtain a valid activation code from readmarkable.org", null, Color.copy-wmQWz5c$default(ColorPalette.INSTANCE.getOnSurface-0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 3462, 0, 131058);
                $this$dp$iv = 16;
                $i$f$getDp3 = false;
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv)), (Composer)$composer2, 6);
                $composer2.endReplaceGroup();
            } else {
                Function1<Boolean, Unit> function1;
                Function1<Boolean, Unit> function12;
                void $this$cache$iv;
                void $composer3;
                int $changed$iv$iv$iv2;
                Function0<ComposeUiNode> factory$iv$iv$iv;
                int $changed$iv$iv2;
                Modifier modifier$iv2;
                int $changed$iv3;
                Alignment.Vertical verticalAlignment$iv;
                void $composer$iv4;
                Function1<Boolean, Unit> horizontalArrangement$iv;
                void $composer4;
                void $changed$iv$iv$iv3;
                void $changed$iv$iv3;
                void $changed$iv222;
                void $composer$iv5;
                $composer2.startReplaceGroup(-1628143615);
                ComposerKt.sourceInformation((Composer)$composer2, "4441@168754L75,4442@168862L40,4449@169169L1401,4471@170604L41,4473@170679L1042,4492@171755L1018,4511@172807L41");
                TextKt.Text--4IGK_g("Installation Type", null, ColorPalette.INSTANCE.getOnSurface-0d7_KjU(), TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer2, 3462, 0, 131058);
                $this$dp$iv = 4;
                $i$f$getDp3 = false;
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv)), (Composer)$composer2, 6);
                Pair[] $i$f$getDp4 = new Pair[]{TuplesKt.to("full", "Full Installation"), TuplesKt.to("maintenance", "Maintenance Mode")};
                List<Pair> installTypes = CollectionsKt.listOf($i$f$getDp4);
                void var48_59 = $composer2;
                boolean bl6 = false;
                boolean $i$f$Column22 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv5, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier modifier$iv3 = Modifier.Companion;
                Arrangement.Vertical verticalArrangement$iv2 = Arrangement.INSTANCE.getTop();
                Object horizontalAlignment$iv2 = Alignment.Companion.getStart();
                MeasurePolicy measurePolicy$iv22 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, (Alignment.Horizontal)horizontalAlignment$iv2, (Composer)$composer$iv5, 0xE & $changed$iv222 >> 3 | 0x70 & $changed$iv222 >> 3);
                int n5 = 0x70 & $changed$iv222 << 3;
                boolean $i$f$Layout2 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv5, 0);
                CompositionLocalMap localMap$iv$iv2 = $composer$iv5.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier((Composer)$composer$iv5, modifier$iv3);
                Function0<ComposeUiNode> function02 = ComposeUiNode.Companion.getConstructor();
                int n6 = 6 | 0x380 & $changed$iv$iv3 << 6;
                boolean $i$f$ReusableComposeNode22 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer$iv5.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv5.startReusableNode();
                if ($composer$iv5.getInserting()) {
                    void factory$iv$iv$iv2;
                    $composer$iv5.createNode(factory$iv$iv$iv2);
                } else {
                    $composer$iv5.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv22 = Updater.constructor-impl((Composer)$composer$iv5);
                $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = false;
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv22, measurePolicy$iv22, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv22, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> block$iv$iv$iv2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                $i$f$set-impl = false;
                Composer $this$set_impl_u24lambda_u240$iv$iv$iv2 = $this$Layout_u24lambda_u240$iv$iv22;
                $i$a$-with-Updater$set$1$iv$iv$iv = false;
                if ($this$set_impl_u24lambda_u240$iv$iv$iv2.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv2.rememberedValue(), (Object)compositeKeyHash$iv$iv2)) {
                    $this$set_impl_u24lambda_u240$iv$iv$iv2.updateRememberedValue(compositeKeyHash$iv$iv2);
                    $this$Layout_u24lambda_u240$iv$iv22.apply(compositeKeyHash$iv$iv2, block$iv$iv$iv2);
                }
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv22, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
                int n7 = 0xE & $changed$iv$iv$iv3 >> 6;
                void $composer$iv6 = $composer$iv5;
                int n8 = 0;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv6, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                int n9 = 6 | 0x70 & $changed$iv222 >> 6;
                void var71_119 = $composer$iv6;
                ColumnScope $this$MainInstallerScreen_u24lambda_u2429_u240_u240_u241_u240_u240_u2432 = ColumnScopeInstance.INSTANCE;
                boolean $i$a$-Column-MainKt$MainInstallerScreen$1$1$1$2$1$1$22 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer4, 834564094, "C:Main.kt#p91eg0");
                $composer4.startReplaceGroup(-1358551496);
                ComposerKt.sourceInformation((Composer)$composer4, "*4455@169604L28,4451@169295L1203");
                Iterable $this$forEach$iv = installTypes;
                boolean $i$f$forEach = false;
                for (Object element$iv : $this$forEach$iv) {
                    Function0<Unit> function03;
                    void $this$cache$iv2;
                    void $composer5;
                    void $changed$iv$iv$iv4;
                    void $changed$iv$iv4;
                    void modifier$iv4;
                    void $changed$iv4;
                    void verticalAlignment$iv2;
                    void $composer$iv7;
                    Function0<Unit> function04;
                    void $this$cache$iv3;
                    Pair pair = (Pair)element$iv;
                    boolean bl7 = false;
                    String value = (String)pair.component1();
                    String label = (String)pair.component2();
                    Alignment.Vertical vertical = Alignment.Companion.getCenterVertically();
                    Modifier modifier = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                    boolean bl8 = !MainKt.MainInstallerScreen$lambda$19($isInstalling$delegate);
                    String string2 = null;
                    Role role = null;
                    ComposerKt.sourceInformationMarkerStart((Composer)$composer4, -1782979568, "CC(remember):Main.kt#9igjgp");
                    void var83_160 = $composer4;
                    boolean invalid$iv22 = $composer4.changed(value);
                    boolean $i$f$cache22 = false;
                    Function0<Unit> it$iv22 = $this$cache$iv3.rememberedValue();
                    boolean bl9 = false;
                    if (invalid$iv22 || it$iv22 == Composer.Companion.getEmpty()) {
                        Role role2 = role;
                        String string3 = string2;
                        boolean bl10 = bl8;
                        Modifier modifier2 = modifier;
                        boolean bl11 = false;
                        Function0<Unit> function05 = () -> MainKt.MainInstallerScreen$lambda$29$0$0$1$0$0$0$0$0$0(value, $installationType$delegate);
                        modifier = modifier2;
                        bl8 = bl10;
                        string2 = string3;
                        role = role2;
                        Function0<Unit> value$iv2 = function05;
                        $this$cache$iv3.updateRememberedValue(value$iv2);
                        function04 = value$iv2;
                    } else {
                        function04 = it$iv22;
                    }
                    Function0 function06 = function04;
                    ComposerKt.sourceInformationMarkerEnd((Composer)$composer4);
                    int $this$dp$iv32 = 4;
                    boolean $i$f$getDp5 = false;
                    Modifier $this$dp$iv32 = PaddingKt.padding-VpY3zN4$default(ClickableKt.clickable-XHw0xAI$default(modifier, bl8, string2, role, function06, 6, null), 0.0f, Dp.constructor-impl($this$dp$iv32), 1, null);
                    Alignment.Vertical invalid$iv22 = vertical;
                    void $i$f$cache22 = $composer4;
                    int it$iv22 = 384;
                    boolean $i$f$Row = false;
                    ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv7, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
                    MeasurePolicy measurePolicy$iv3 = RowKt.rowMeasurePolicy((Arrangement.Horizontal)((Object)horizontalArrangement$iv), (Alignment.Vertical)verticalAlignment$iv2, (Composer)$composer$iv7, 0xE & $changed$iv4 >> 3 | 0x70 & $changed$iv4 >> 3);
                    int value$iv2 = 0x70 & $changed$iv4 << 3;
                    boolean $i$f$Layout3 = false;
                    ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv7, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int compositeKeyHash$iv$iv3 = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv7, 0);
                    CompositionLocalMap localMap$iv$iv3 = $composer$iv7.getCurrentCompositionLocalMap();
                    Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier((Composer)$composer$iv7, (Modifier)modifier$iv4);
                    Function0<ComposeUiNode> function07 = ComposeUiNode.Companion.getConstructor();
                    int n10 = 6 | 0x380 & $changed$iv$iv4 << 6;
                    boolean $i$f$ReusableComposeNode3 = false;
                    ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv7, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer$iv7.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer$iv7.startReusableNode();
                    if ($composer$iv7.getInserting()) {
                        void factory$iv$iv$iv3;
                        $composer$iv7.createNode(factory$iv$iv$iv3);
                    } else {
                        $composer$iv7.useNode();
                    }
                    Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.constructor-impl((Composer)$composer$iv7);
                    $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = false;
                    Updater.set-impl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.set-impl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> block$iv$iv$iv3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    $i$f$set-impl = false;
                    Composer $this$set_impl_u24lambda_u240$iv$iv$iv3 = $this$Layout_u24lambda_u240$iv$iv3;
                    $i$a$-with-Updater$set$1$iv$iv$iv = false;
                    if ($this$set_impl_u24lambda_u240$iv$iv$iv3.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv3.rememberedValue(), (Object)compositeKeyHash$iv$iv3)) {
                        $this$set_impl_u24lambda_u240$iv$iv$iv3.updateRememberedValue(compositeKeyHash$iv$iv3);
                        $this$Layout_u24lambda_u240$iv$iv3.apply(compositeKeyHash$iv$iv3, block$iv$iv$iv3);
                    }
                    Updater.set-impl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.Companion.getSetModifier());
                    int n11 = 0xE & $changed$iv$iv$iv4 >> 6;
                    void $composer$iv8 = $composer$iv7;
                    boolean bl12 = false;
                    ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv8, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    int n12 = 6 | 0x70 & $changed$iv4 >> 6;
                    void var113_199 = $composer$iv8;
                    RowScope $this$MainInstallerScreen_u24lambda_u2429_u240_u240_u241_u240_u240_u240_u240_u241 = RowScopeInstance.INSTANCE;
                    boolean bl13 = false;
                    ComposerKt.sourceInformationMarkerStart((Composer)$composer5, 1030276702, "C4460@169952L47,4462@170151L153,4458@169795L555,4466@170395L61:Main.kt#p91eg0");
                    boolean bl14 = Intrinsics.areEqual(MainKt.MainInstallerScreen$lambda$10($installationType$delegate), value);
                    ComposerKt.sourceInformationMarkerStart((Composer)$composer5, 864523135, "CC(remember):Main.kt#9igjgp");
                    void var116_202 = $composer5;
                    boolean invalid$iv = $composer5.changed(value);
                    boolean $i$f$cache = false;
                    Function0<Unit> it$iv = $this$cache$iv2.rememberedValue();
                    $i$a$-let-ComposerKt$cache$1$iv = false;
                    if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
                        boolean bl15 = bl14;
                        boolean bl16 = false;
                        Function0<Unit> function08 = () -> MainKt.MainInstallerScreen$lambda$29$0$0$1$0$0$0$0$1$0$0(value, $isInstalling$delegate, $installationType$delegate);
                        bl14 = bl15;
                        Function0<Unit> value$iv3 = function08;
                        $this$cache$iv2.updateRememberedValue(value$iv3);
                        function03 = value$iv3;
                    } else {
                        function03 = it$iv;
                    }
                    Function0 function09 = function03;
                    ComposerKt.sourceInformationMarkerEnd((Composer)$composer5);
                    RadioButtonKt.RadioButton(bl14, function09, null, !MainKt.MainInstallerScreen$lambda$19($isInstalling$delegate), null, RadioButtonDefaults.INSTANCE.colors-RGew2ao(ColorPalette.INSTANCE.getPrimaryVariant-0d7_KjU(), 0L, 0L, (Composer)$composer5, 6 | RadioButtonDefaults.$stable << 9, 6), (Composer)$composer5, 0, 20);
                    TextKt.Text--4IGK_g(label, null, ColorPalette.INSTANCE.getOnSurface-0d7_KjU(), TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer5, 3456, 0, 131058);
                    ComposerKt.sourceInformationMarkerEnd((Composer)$composer5);
                    ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv8);
                    $composer$iv7.endNode();
                    ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv7);
                    ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv7);
                    ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv7);
                }
                $composer4.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer4);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv6);
                $composer$iv5.endNode();
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv5);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv5);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv5);
                int $this$dp$iv42 = 12;
                boolean $i$f$getDp222 = false;
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv42)), (Composer)$composer2, 6);
                Alignment.Vertical $this$dp$iv42 = Alignment.Companion.getCenterVertically();
                Modifier $i$f$getDp222 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                horizontalAlignment$iv2 = $i$f$getDp222;
                Alignment.Vertical $changed$iv222 = $this$dp$iv42;
                void $i$f$Column22 = $composer2;
                int measurePolicy$iv22 = 390;
                boolean $i$f$Row = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv4, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                Arrangement.Horizontal horizontalArrangement$iv2 = Arrangement.INSTANCE.getStart();
                MeasurePolicy measurePolicy$iv4 = RowKt.rowMeasurePolicy(horizontalArrangement$iv2, verticalAlignment$iv, (Composer)$composer$iv4, 0xE & $changed$iv3 >> 3 | 0x70 & $changed$iv3 >> 3);
                compositeKeyHash$iv$iv2 = 0x70 & $changed$iv3 << 3;
                boolean $i$f$Layout4 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv4 = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv4, 0);
                CompositionLocalMap localMap$iv$iv4 = $composer$iv4.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier((Composer)$composer$iv4, modifier$iv2);
                Function0<ComposeUiNode> $i$f$ReusableComposeNode22 = ComposeUiNode.Companion.getConstructor();
                int $this$Layout_u24lambda_u240$iv$iv22 = 6 | 0x380 & $changed$iv$iv2 << 6;
                boolean $i$f$ReusableComposeNode4 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer$iv4.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv4.startReusableNode();
                if ($composer$iv4.getInserting()) {
                    $composer$iv4.createNode(factory$iv$iv$iv);
                } else {
                    $composer$iv4.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.constructor-impl((Composer)$composer$iv4);
                $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = false;
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> block$iv$iv$iv4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                $i$f$set-impl2 = 0;
                Composer $this$set_impl_u24lambda_u240$iv$iv$iv4 = $this$Layout_u24lambda_u240$iv$iv4;
                $i$a$-with-Updater$set$1$iv$iv$iv = false;
                if ($this$set_impl_u24lambda_u240$iv$iv$iv4.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv4.rememberedValue(), (Object)compositeKeyHash$iv$iv4)) {
                    $this$set_impl_u24lambda_u240$iv$iv$iv4.updateRememberedValue(compositeKeyHash$iv$iv4);
                    $this$Layout_u24lambda_u240$iv$iv4.apply(compositeKeyHash$iv$iv4, block$iv$iv$iv4);
                }
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.Companion.getSetModifier());
                n8 = 0xE & $changed$iv$iv$iv2 >> 6;
                $composer$iv = $composer$iv4;
                boolean bl17 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                int $this$MainInstallerScreen_u24lambda_u2429_u240_u240_u241_u240_u240_u2432 = 6 | 0x70 & $changed$iv3 >> 6;
                void $i$a$-Column-MainKt$MainInstallerScreen$1$1$1$2$1$1$22 = $composer$iv;
                RowScope $this$MainInstallerScreen_u24lambda_u2429_u240_u240_u241_u240_u240_u241 = RowScopeInstance.INSTANCE;
                boolean bl18 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer3, 1164149938, "C4479@171046L43,4481@171222L136,4477@170911L485,4485@171433L254:Main.kt#p91eg0");
                boolean bl19 = MainKt.MainInstallerScreen$lambda$13($enableTripletap$delegate);
                ComposerKt.sourceInformationMarkerStart((Composer)$composer3, 1423030132, "CC(remember):Main.kt#9igjgp");
                object = $composer3;
                boolean invalid$iv = false;
                boolean $i$f$cache = false;
                Function1<Boolean, Unit> it$iv = $this$cache$iv.rememberedValue();
                boolean bl20 = false;
                if (it$iv == Composer.Companion.getEmpty()) {
                    boolean label = bl19;
                    boolean bl21 = false;
                    horizontalArrangement$iv = arg_0 -> MainKt.MainInstallerScreen$lambda$29$0$0$1$0$0$1$0$0($isInstalling$delegate, $enableTripletap$delegate, arg_0);
                    bl19 = label;
                    value$iv = horizontalArrangement$iv;
                    $this$cache$iv.updateRememberedValue(value$iv);
                    function12 = value$iv;
                } else {
                    function12 = it$iv;
                }
                Function1 function13 = function12;
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer3);
                CheckboxKt.Checkbox(bl19, function13, null, !MainKt.MainInstallerScreen$lambda$19($isInstalling$delegate), null, CheckboxDefaults.INSTANCE.colors-zjMxDiM(ColorPalette.INSTANCE.getPrimaryVariant-0d7_KjU(), 0L, 0L, 0L, 0L, (Composer)$composer3, 6 | CheckboxDefaults.$stable << 15, 30), (Composer)$composer3, 48, 20);
                TextKt.Text--4IGK_g("Enable Tripletap Power Button Launcher", null, ColorPalette.INSTANCE.getOnSurface-0d7_KjU(), TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer3, 3462, 0, 131058);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer3);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
                $composer$iv4.endNode();
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv4);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv4);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv4);
                $this$dp$iv42 = Alignment.Companion.getCenterVertically();
                modifier$iv2 = $i$f$getDp222 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                verticalAlignment$iv = $this$dp$iv42;
                $composer$iv4 = $composer2;
                $changed$iv3 = 390;
                $i$f$Row = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv4, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                horizontalArrangement$iv2 = Arrangement.INSTANCE.getStart();
                measurePolicy$iv4 = RowKt.rowMeasurePolicy(horizontalArrangement$iv2, verticalAlignment$iv, (Composer)$composer$iv4, 0xE & $changed$iv3 >> 3 | 0x70 & $changed$iv3 >> 3);
                $changed$iv$iv2 = 0x70 & $changed$iv3 << 3;
                $i$f$Layout4 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                compositeKeyHash$iv$iv4 = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv4, 0);
                localMap$iv$iv4 = $composer$iv4.getCurrentCompositionLocalMap();
                materialized$iv$iv4 = ComposedModifierKt.materializeModifier((Composer)$composer$iv4, modifier$iv2);
                factory$iv$iv$iv = ComposeUiNode.Companion.getConstructor();
                $changed$iv$iv$iv2 = 6 | 0x380 & $changed$iv$iv2 << 6;
                $i$f$ReusableComposeNode4 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer$iv4.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv4.startReusableNode();
                if ($composer$iv4.getInserting()) {
                    $composer$iv4.createNode(factory$iv$iv$iv);
                } else {
                    $composer$iv4.useNode();
                }
                $this$Layout_u24lambda_u240$iv$iv4 = Updater.constructor-impl((Composer)$composer$iv4);
                $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = false;
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                block$iv$iv$iv4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                $i$f$set-impl2 = 0;
                $this$set_impl_u24lambda_u240$iv$iv$iv4 = $this$Layout_u24lambda_u240$iv$iv4;
                $i$a$-with-Updater$set$1$iv$iv$iv = false;
                if ($this$set_impl_u24lambda_u240$iv$iv$iv4.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv4.rememberedValue(), (Object)compositeKeyHash$iv$iv4)) {
                    $this$set_impl_u24lambda_u240$iv$iv$iv4.updateRememberedValue(compositeKeyHash$iv$iv4);
                    $this$Layout_u24lambda_u240$iv$iv4.apply(compositeKeyHash$iv$iv4, block$iv$iv$iv4);
                }
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.Companion.getSetModifier());
                $changed$iv = 0xE & $changed$iv$iv$iv2 >> 6;
                $composer$iv = $composer$iv4;
                bl17 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                int $changed2 = 6 | 0x70 & $changed$iv3 >> 6;
                $composer3 = $composer$iv;
                RowScope $this$MainInstallerScreen_u24lambda_u2429_u240_u240_u241_u240_u240_u242 = RowScopeInstance.INSTANCE;
                boolean bl22 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer3, 52063475, "C4498@172119L40,4500@172292L136,4496@171987L479,4504@172503L236:Main.kt#p91eg0");
                boolean bl23 = MainKt.MainInstallerScreen$lambda$16($createBackup$delegate);
                ComposerKt.sourceInformationMarkerStart((Composer)$composer3, 1248608968, "CC(remember):Main.kt#9igjgp");
                $this$cache$iv = $composer3;
                invalid$iv = false;
                $i$f$cache = false;
                it$iv = $this$cache$iv.rememberedValue();
                bl20 = false;
                if (it$iv == Composer.Companion.getEmpty()) {
                    boolean label = bl23;
                    boolean bl24 = false;
                    horizontalArrangement$iv = arg_0 -> MainKt.MainInstallerScreen$lambda$29$0$0$1$0$0$2$0$0($isInstalling$delegate, $createBackup$delegate, arg_0);
                    bl23 = label;
                    value$iv = horizontalArrangement$iv;
                    $this$cache$iv.updateRememberedValue(value$iv);
                    function1 = value$iv;
                } else {
                    function1 = it$iv;
                }
                function13 = function1;
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer3);
                CheckboxKt.Checkbox(bl23, function13, null, !MainKt.MainInstallerScreen$lambda$19($isInstalling$delegate), null, CheckboxDefaults.INSTANCE.colors-zjMxDiM(ColorPalette.INSTANCE.getPrimaryVariant-0d7_KjU(), 0L, 0L, 0L, 0L, (Composer)$composer3, 6 | CheckboxDefaults.$stable << 15, 30), (Composer)$composer3, 48, 20);
                TextKt.Text--4IGK_g("Create System Backup", null, ColorPalette.INSTANCE.getOnSurface-0d7_KjU(), TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, (Composer)$composer3, 3462, 0, 131058);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer3);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv);
                $composer$iv4.endNode();
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv4);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv4);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv4);
                $this$dp$iv72 = 16;
                $i$f$getDp = false;
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl($this$dp$iv72)), (Composer)$composer2, 6);
                $composer2.endReplaceGroup();
            }
            if ($isUninstallerOnly) {
                Function0<Unit> function010;
                void $this$cache$iv;
                $composer2.startReplaceGroup(-1623865677);
                ComposerKt.sourceInformation((Composer)$composer2, "4533@174239L231,4517@173100L930,4516@173046L1678");
                boolean installTypes = !MainKt.MainInstallerScreen$lambda$19($isInstalling$delegate);
                int $this$dp$iv52 = 48;
                boolean $i$f$getDp322 = false;
                Modifier $this$dp$iv3 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.constructor-impl($this$dp$iv52));
                ButtonColors $this$dp$iv52 = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279900182L), 0L, Color.copy-wmQWz5c$default(ColorKt.Color(4279900182L), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, (Composer)$composer2, 0x186 | ButtonDefaults.$stable << 12, 10);
                int $this$dp$iv62 = 8;
                boolean $i$f$getDp42 = false;
                RoundedCornerShape $i$f$getDp322 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl($this$dp$iv62));
                ComposerKt.sourceInformationMarkerStart((Composer)$composer2, -1299307773, "CC(remember):Main.kt#9igjgp");
                void $i$f$getDp42 = $composer2;
                boolean invalid$iv = $composer2.changedInstance($coroutineScope);
                $i$f$cache = 0;
                Function0<Unit> it$iv = $this$cache$iv.rememberedValue();
                boolean bl25 = false;
                if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
                    boolean bl26 = false;
                    Function0<Unit> value$iv4 = () -> MainKt.MainInstallerScreen$lambda$29$0$0$1$0$0$3$0($coroutineScope, $sshPassword$delegate, $logs$delegate, $isInstalling$delegate, $deviceIP$delegate, $deviceModel$delegate, $enableTripletap$delegate, $createBackup$delegate, $currentStatus$delegate);
                    $this$cache$iv.updateRememberedValue(value$iv4);
                    function010 = value$iv4;
                } else {
                    function010 = it$iv;
                }
                Function0 $this$dp$iv62 = function010;
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer2);
                ButtonKt.Button($this$dp$iv62, $this$dp$iv3, installTypes, null, null, $i$f$getDp322, null, $this$dp$iv52, null, ComposableSingletons$MainKt.INSTANCE.getLambda$-555358685$kotlinkoreader18(), (Composer)$composer2, 0x30000030, 344);
                $composer2.endReplaceGroup();
            } else {
                Function0<Unit> function011;
                Function0<Unit> function012;
                void $this$cache$iv;
                void $composer6;
                void $changed$iv$iv$iv5;
                void $changed$iv$iv5;
                void modifier$iv5;
                void $changed$iv5;
                void horizontalArrangement$iv;
                void $composer$iv9;
                $composer2.startReplaceGroup(-1622115851);
                ComposerKt.sourceInformation((Composer)$composer2, "4543@174860L3146");
                Modifier installTypes = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                $this$dp$iv72 = 12;
                $i$f$getDp = false;
                Arrangement.Horizontal $this$dp$iv72 = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl($this$dp$iv72));
                void $i$f$getDp322 = $composer2;
                int $this$dp$iv62 = 54;
                boolean $i$f$Row = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv9, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getTop();
                MeasurePolicy measurePolicy$iv5 = RowKt.rowMeasurePolicy((Arrangement.Horizontal)horizontalArrangement$iv, verticalAlignment$iv, (Composer)$composer$iv9, 0xE & $changed$iv5 >> 3 | 0x70 & $changed$iv5 >> 3);
                $i$f$cache = 0x70 & $changed$iv5 << 3;
                boolean $i$f$Layout5 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv9, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv5 = ComposablesKt.getCurrentCompositeKeyHash((Composer)$composer$iv9, 0);
                CompositionLocalMap localMap$iv$iv5 = $composer$iv9.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv5 = ComposedModifierKt.materializeModifier((Composer)$composer$iv9, (Modifier)modifier$iv5);
                Function0<ComposeUiNode> compositeKeyHash$iv$iv6 = ComposeUiNode.Companion.getConstructor();
                int localMap$iv$iv6 = 6 | 0x380 & $changed$iv$iv5 << 6;
                boolean $i$f$ReusableComposeNode5 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv9, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer$iv9.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv9.startReusableNode();
                if ($composer$iv9.getInserting()) {
                    void factory$iv$iv$iv;
                    $composer$iv9.createNode(factory$iv$iv$iv);
                } else {
                    $composer$iv9.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv5 = Updater.constructor-impl((Composer)$composer$iv9);
                $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = false;
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv5, measurePolicy$iv5, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv5, localMap$iv$iv5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> block$iv$iv$iv5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                boolean bl27 = false;
                Composer $this$set_impl_u24lambda_u240$iv$iv$iv5 = $this$Layout_u24lambda_u240$iv$iv5;
                $i$a$-with-Updater$set$1$iv$iv$iv = false;
                if ($this$set_impl_u24lambda_u240$iv$iv$iv5.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv5.rememberedValue(), (Object)compositeKeyHash$iv$iv5)) {
                    $this$set_impl_u24lambda_u240$iv$iv$iv5.updateRememberedValue(compositeKeyHash$iv$iv5);
                    $this$Layout_u24lambda_u240$iv$iv5.apply(compositeKeyHash$iv$iv5, block$iv$iv$iv5);
                }
                Updater.set-impl($this$Layout_u24lambda_u240$iv$iv5, materialized$iv$iv5, ComposeUiNode.Companion.getSetModifier());
                $i$f$set-impl2 = 0xE & $changed$iv$iv$iv5 >> 6;
                void $composer$iv10 = $composer$iv9;
                boolean bl28 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer$iv10, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                $changed$iv = 6 | 0x70 & $changed$iv5 >> 6;
                $composer$iv = $composer$iv10;
                RowScope $this$MainInstallerScreen_u24lambda_u2429_u240_u240_u241_u240_u240_u244 = RowScopeInstance.INSTANCE;
                boolean bl29 = false;
                ComposerKt.sourceInformationMarkerStart((Composer)$composer6, -1200840696, "C4551@175411L243,4548@175155L39,4556@175767L397,4547@175097L1067,4581@177459L243,4565@176260L982,4564@176202L1770:Main.kt#p91eg0");
                boolean bl30 = !MainKt.MainInstallerScreen$lambda$19($isInstalling$delegate);
                int $this$dp$iv82 = 48;
                boolean $i$f$getDp52 = false;
                object = SizeKt.height-3ABfNKs(RowScope.weight$default($this$MainInstallerScreen_u24lambda_u2429_u240_u240_u241_u240_u240_u244, Modifier.Companion, 1.0f, false, 2, null), Dp.constructor-impl($this$dp$iv82));
                ButtonColors $this$dp$iv82 = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279900182L), 0L, Color.copy-wmQWz5c$default(ColorKt.Color(4279900182L), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, (Composer)$composer6, 0x186 | ButtonDefaults.$stable << 12, 10);
                int $this$dp$iv92 = 8;
                boolean $i$f$getDp62 = false;
                RoundedCornerShape $i$f$getDp52 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl($this$dp$iv92));
                ComposerKt.sourceInformationMarkerStart((Composer)$composer6, -315832441, "CC(remember):Main.kt#9igjgp");
                void $i$f$getDp62 = $composer6;
                boolean invalid$iv = $composer6.changedInstance($coroutineScope);
                boolean $i$f$cache = false;
                Function0<Unit> it$iv = $this$cache$iv.rememberedValue();
                boolean bl31 = false;
                if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
                    boolean bl32 = false;
                    value$iv = () -> MainKt.MainInstallerScreen$lambda$29$0$0$1$0$0$4$0$0($installationType$delegate, $coroutineScope, $sshPassword$delegate, $logs$delegate, $isInstalling$delegate, $deviceIP$delegate, $deviceModel$delegate, $enableTripletap$delegate, $createBackup$delegate, $currentStatus$delegate);
                    $this$cache$iv.updateRememberedValue(value$iv);
                    function012 = value$iv;
                } else {
                    function012 = it$iv;
                }
                Function0 $this$dp$iv92 = function012;
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer6);
                ButtonKt.Button($this$dp$iv92, (Modifier)object, bl30, null, null, $i$f$getDp52, null, $this$dp$iv82, null, ComposableLambdaKt.rememberComposableLambda(997619536, true, (arg_0, arg_1, arg_2) -> MainKt.MainInstallerScreen$lambda$29$0$0$1$0$0$4$1($installationType$delegate, arg_0, arg_1, arg_2), (Composer)$composer6, 54), (Composer)$composer6, 0x30000000, 344);
                bl30 = !MainKt.MainInstallerScreen$lambda$19($isInstalling$delegate);
                int $this$dp$iv4 = 48;
                boolean $i$f$getDp7 = false;
                object = SizeKt.height-3ABfNKs(RowScope.weight$default($this$MainInstallerScreen_u24lambda_u2429_u240_u240_u241_u240_u240_u244, Modifier.Companion, 1.0f, false, 2, null), Dp.constructor-impl($this$dp$iv4));
                ButtonColors buttonColors = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(ColorKt.Color(4279900182L), 0L, Color.copy-wmQWz5c$default(ColorKt.Color(4279900182L), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, (Composer)$composer6, 0x186 | ButtonDefaults.$stable << 12, 10);
                int $this$dp$iv5 = 8;
                boolean $i$f$getDp722 = false;
                RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl($this$dp$iv5));
                ComposerKt.sourceInformationMarkerStart((Composer)$composer6, -315796138, "CC(remember):Main.kt#9igjgp");
                void $i$f$getDp722 = $composer6;
                invalid$iv = $composer6.changedInstance($coroutineScope);
                $i$f$cache = false;
                it$iv = $this$cache$iv.rememberedValue();
                bl31 = false;
                if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
                    boolean bl33 = false;
                    value$iv = () -> MainKt.MainInstallerScreen$lambda$29$0$0$1$0$0$4$2$0($coroutineScope, $sshPassword$delegate, $logs$delegate, $isInstalling$delegate, $deviceIP$delegate, $deviceModel$delegate, $enableTripletap$delegate, $createBackup$delegate, $currentStatus$delegate);
                    $this$cache$iv.updateRememberedValue(value$iv);
                    function011 = value$iv;
                } else {
                    function011 = it$iv;
                }
                Function0 function013 = function011;
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer6);
                ButtonKt.Button(function013, (Modifier)object, bl30, null, null, roundedCornerShape, null, buttonColors, null, ComposableSingletons$MainKt.INSTANCE.getLambda$-1577932857$kotlinkoreader18(), (Composer)$composer6, 0x30000000, 344);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer6);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv10);
                $composer$iv9.endNode();
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv9);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv9);
                ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv9);
                $composer2.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer2);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv3);
            $composer$iv2.endNode();
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv2);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv2);
            ComposerKt.sourceInformationMarkerEnd((Composer)$composer$iv2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private static final Unit MainInstallerScreen$lambda$29$0$0$1$0$0$0$0$0$0(String $value, MutableState $installationType$delegate) {
        MainKt.MainInstallerScreen$lambda$11($installationType$delegate, $value);
        return Unit.INSTANCE;
    }

    private static final Unit MainInstallerScreen$lambda$29$0$0$1$0$0$0$0$1$0$0(String $value, MutableState $isInstalling$delegate, MutableState $installationType$delegate) {
        if (!MainKt.MainInstallerScreen$lambda$19($isInstalling$delegate)) {
            MainKt.MainInstallerScreen$lambda$11($installationType$delegate, $value);
        }
        return Unit.INSTANCE;
    }

    private static final Unit MainInstallerScreen$lambda$29$0$0$1$0$0$1$0$0(MutableState $isInstalling$delegate, MutableState $enableTripletap$delegate, boolean it) {
        if (!MainKt.MainInstallerScreen$lambda$19($isInstalling$delegate)) {
            MainKt.MainInstallerScreen$lambda$14($enableTripletap$delegate, it);
        }
        return Unit.INSTANCE;
    }

    private static final Unit MainInstallerScreen$lambda$29$0$0$1$0$0$2$0$0(MutableState $isInstalling$delegate, MutableState $createBackup$delegate, boolean it) {
        if (!MainKt.MainInstallerScreen$lambda$19($isInstalling$delegate)) {
            MainKt.MainInstallerScreen$lambda$17($createBackup$delegate, it);
        }
        return Unit.INSTANCE;
    }

    private static final Unit MainInstallerScreen$lambda$29$0$0$1$0$0$3$0(CoroutineScope $coroutineScope, MutableState $sshPassword$delegate, MutableState $logs$delegate, MutableState $isInstalling$delegate, MutableState $deviceIP$delegate, MutableState $deviceModel$delegate, MutableState $enableTripletap$delegate, MutableState $createBackup$delegate, MutableState $currentStatus$delegate) {
        int result2 = JOptionPane.showConfirmDialog(null, "\u26a0\ufe0f WARNING: This will completely remove XOVI, AppLoad, and KOReader.\n\nYour reMarkable\u2122 device will be restored to stock firmware.\n\nAre you sure?", "Confirm Uninstall", 0, 2);
        if (result2 == 0) {
            MainKt.MainInstallerScreen$startInstallation($coroutineScope, $sshPassword$delegate, $logs$delegate, $isInstalling$delegate, $deviceIP$delegate, $deviceModel$delegate, $enableTripletap$delegate, $createBackup$delegate, $currentStatus$delegate, "uninstall");
        }
        return Unit.INSTANCE;
    }

    private static final Unit MainInstallerScreen$lambda$29$0$0$1$0$0$4$0$0(MutableState $installationType$delegate, CoroutineScope $coroutineScope, MutableState $sshPassword$delegate, MutableState $logs$delegate, MutableState $isInstalling$delegate, MutableState $deviceIP$delegate, MutableState $deviceModel$delegate, MutableState $enableTripletap$delegate, MutableState $createBackup$delegate, MutableState $currentStatus$delegate) {
        MainKt.MainInstallerScreen$startInstallation($coroutineScope, $sshPassword$delegate, $logs$delegate, $isInstalling$delegate, $deviceIP$delegate, $deviceModel$delegate, $enableTripletap$delegate, $createBackup$delegate, $currentStatus$delegate, MainKt.MainInstallerScreen$lambda$10($installationType$delegate));
        return Unit.INSTANCE;
    }

    @Composable
    @ComposableTarget(applier="androidx.compose.ui.UiComposable")
    private static final Unit MainInstallerScreen$lambda$29$0$0$1$0$0$4$1(MutableState $installationType$delegate, RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C4557@175809L317:Main.kt#p91eg0");
        if (($changed & 0x11) != 16 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(997619536, $changed, -1, "org.example.MainInstallerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Main.kt:4557)");
            }
            TextKt.Text--4IGK_g(Intrinsics.areEqual(MainKt.MainInstallerScreen$lambda$10($installationType$delegate), "maintenance") ? "Run Maintenance Tasks" : "Install KOReader", null, Color.Companion.getWhite-0d7_KjU(), 0L, null, FontWeight.Companion.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 196992, 0, 131034);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private static final Unit MainInstallerScreen$lambda$29$0$0$1$0$0$4$2$0(CoroutineScope $coroutineScope, MutableState $sshPassword$delegate, MutableState $logs$delegate, MutableState $isInstalling$delegate, MutableState $deviceIP$delegate, MutableState $deviceModel$delegate, MutableState $enableTripletap$delegate, MutableState $createBackup$delegate, MutableState $currentStatus$delegate) {
        int result2 = JOptionPane.showConfirmDialog(null, "\u26a0\ufe0f WARNING: This will completely remove XOVI, AppLoad, and KOReader.\n\nYour reMarkable\u2122 device will be restored to stock firmware.\n\nAre you sure?", "Confirm Uninstall", 0, 2);
        if (result2 == 0) {
            MainKt.MainInstallerScreen$startInstallation($coroutineScope, $sshPassword$delegate, $logs$delegate, $isInstalling$delegate, $deviceIP$delegate, $deviceModel$delegate, $enableTripletap$delegate, $createBackup$delegate, $currentStatus$delegate, "uninstall");
        }
        return Unit.INSTANCE;
    }

    private static final Unit MainInstallerScreen$lambda$30(int $daysRemaining, boolean $isUninstallerOnly, Function0 $onExit, int $$changed, int $$default, Composer $composer, int $force) {
        MainKt.MainInstallerScreen($daysRemaining, $isUninstallerOnly, $onExit, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 1), $$default);
        return Unit.INSTANCE;
    }

    private static final Unit SplashScreen$lambda$2(Function0 $onTimeout, int $$changed, Composer $composer, int $force) {
        MainKt.SplashScreen($onTimeout, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 1));
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$MainInstallerScreen$lambda$20(MutableState $isInstalling$delegate, boolean bl) {
        MainKt.MainInstallerScreen$lambda$20($isInstalling$delegate, bl);
    }
}
