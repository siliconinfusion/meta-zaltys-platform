SUMMARY = "A library for the Zaltys HDRM Demodulator driver."
LICENSE = "Proprietary"

SILICON_INFUSION_CLOSED_HOST ??= "git:///SiliconInfusion/software/zaltys"

SRC_URI = "${SILICON_INFUSION_CLOSED_HOST}/libzaltys-hdrmd.git"
SRCREV = "master"

LIC_FILES_CHKSUM = "file://LICENCE;md5=c2464aba5d02a2a45e932724de985537"

S = "${WORKDIR}/git"

do_install() {
    oe_runmake install PREFIX="${D}/usr"
}

PACKAGES = "${PN}-dbg ${PN}-staticdev ${PN} ${PN}-dev"
FILES_${PN} += "${includedir}"
FILES_${PN} += "${libdir}"
