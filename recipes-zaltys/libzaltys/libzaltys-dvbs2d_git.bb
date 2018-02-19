SUMMARY = "A library for the Zaltys DVB-S2 Demodulator driver."
LICENSE = "Proprietary"

SILICON_INFUSION_CLOSED_HOST ??= "git:///SiliconInfusion/software/zaltys"

SRC_URI = "${SILICON_INFUSION_CLOSED_HOST}/libzaltys-dvbs2d.git"
SRCREV = "master"

LIC_FILES_CHKSUM = "file://LICENCE;md5=77751bfffececcc33370f280e787b864"

S = "${WORKDIR}/git"

do_install() {
    oe_runmake install PREFIX="${D}/usr"
}

PACKAGES = "${PN}-dbg ${PN}-staticdev ${PN} ${PN}-dev"
FILES_${PN} += "${includedir}"
FILES_${PN} += "${libdir}"
