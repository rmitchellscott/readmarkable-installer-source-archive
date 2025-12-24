# READMarkable KOReader Installer - Decompiled Source Archive

> **DISCLAIMER: I am NOT the author of this software.** This repository contains decompiled source code from the READMarkable KOReader Installer, archived for transparency and license compliance purposes.

## What is this?

This is a decompiled archive of the **READMarkable KOReader Installer v26.01.18**, a GUI application that installs KOReader on reMarkable tablets. The original software is distributed at [matrixcs.io](http://matrixcs.io:9550/).

The source code was obtained by:
1. Extracting the embedded JAR from the distributed macOS binary using `binwalk`
2. Decompiling the Java bytecode using [CFR](https://github.com/leibnitz27/cfr)

## Why does this exist?

1. Document what the installer does
2. Provide transparency about the activation/licensing system

The decompiled code in this repository is provided as-is for educational and compliance purposes.

## What's included

Only the decompiled installer GUI code (`org.example.*`):

- `ActivationManager.java` - Activation code validation
- `MainKt.java` - Main application logic and UI
- `SSHOperations.java` - SSH/SFTP operations for device communication
- `InstallationJob.java` - Installation workflow
- Other supporting classes

## What's NOT included

The distributed installer bundles these projects, which have been excluded from this archive:

| Project | License | Repository |
|---------|---------|------------|
| KOReader | AGPL-3.0 | https://github.com/koreader/koreader |
| AppLoad | GPL-3.0 | https://github.com/asivery/remarkable-appload |
| xovi-tripletap | MIT | https://github.com/rmitchellscott/xovi-tripletap |


## Technical notes

- **Binary analyzed:** `readmarkable-koreader-installer-macos-arm64` (v26.01.18)
- **Decompiler:** CFR 0.152
- **Extraction date:** December 2025

The installer is written in Kotlin, compiled to JVM bytecode, and bundled with an embedded JRE inside a Go wrapper binary.

## See also

- [readmarkable-activate](https://github.com/rmitchellscott/readmarkable-activate) - Activation code generator (the "secret" key is hardcoded in the distributed binary)
