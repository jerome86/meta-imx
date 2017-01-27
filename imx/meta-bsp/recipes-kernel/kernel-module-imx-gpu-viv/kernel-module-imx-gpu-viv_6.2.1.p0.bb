# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "b251482f8310e2eea6b8b6c0eb934aa4"
SRC_URI[sha256sum] = "03027671845c59c5fb9a30e5d124484e14ee150e13c92ec6d403fdc3136a387f"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
