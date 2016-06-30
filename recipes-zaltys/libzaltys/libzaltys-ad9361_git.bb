SUMMARY = "A library for AD9361 configuration and control."
LICENSE = "Proprietary"

SRC_URI = "git:///SiliconInfusion/software/zaltys/libzaltys-ad9361.git"
SRCREV = "master"

LIC_FILES_CHKSUM = "file://LICENCE;md5=157f7c0cd02ab99f6c7996ed53b9eb5a"

S = "${WORKDIR}/git"

do_install() {
    oe_runmake install PREFIX="${D}/usr"
}

PACKAGES = "${PN}-dbg ${PN}-staticdev ${PN} ${PN}-dev"
FILES_${PN} += "${includedir}"
