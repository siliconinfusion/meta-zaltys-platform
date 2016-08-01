SUMMARY = "A library for AD9361 configuration and control."
LICENSE = "MIT"

SRC_URI = "git:///SiliconInfusion/software/zaltys/libzaltys-ad9361.git"
SRCREV = "master"

LIC_FILES_CHKSUM = "file://LICENCE;md5=d88774a506a0540e908c11bfd1c57e9a"

S = "${WORKDIR}/git"

do_install() {
    oe_runmake install PREFIX="${D}/usr"
}

PACKAGES = "${PN}-dbg ${PN}-staticdev ${PN} ${PN}-dev"
FILES_${PN} += "${includedir}"
FILES_${PN} += "${libdir}"
