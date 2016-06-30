SUMMARY = "A library for the Zaltys HDRM Demodulator driver."
LICENSE = "Proprietary"

SRC_URI = "git:///SiliconInfusion/software/zaltys/libzaltys-hdrmd.git"
SRCREV = "master"

LIC_FILES_CHKSUM = "file://LICENCE;md5=c2464aba5d02a2a45e932724de985537"

S = "${WORKDIR}/git"

do_install() {
    oe_runmake install PREFIX="${D}/usr"
}

FILES_${PN} += "${includedir}/*"
