SUMMARY = "A library for ZEDwire SPI communications."
LICENSE = "Proprietary"

SRC_URI = "git:///SiliconInfusion/software/zaltys/libzaltys-zwire.git"
SRCREV = "master"

LIC_FILES_CHKSUM = "file://LICENCE;md5=cebdd13979af48edb1ddfe4f1df33569"

S = "${WORKDIR}/git"

do_install() {
    oe_runmake install PREFIX="${D}/usr"
}

PACKAGES = "${PN}-dbg ${PN}-staticdev ${PN} ${PN}-dev"
FILES_${PN} += "${includedir}"
FILES_${PN} += "${libdir}"
