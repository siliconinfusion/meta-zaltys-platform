SUMMARY = "Python utilities for the Zaltys platform."
LICENSE = "Proprietary"

SRC_URI = "git:///SiliconInfusion/software/zaltys/zaltys-python-utils.git"
SRCREV = "master"

LIC_FILES_CHKSUM = "file://LICENCE;md5=cebdd13979af48edb1ddfe4f1df33569"

S = "${WORKDIR}/git"

do_configure() {
}

do_compile() {
}

do_install() {
    install -d ${D}${bindir}
    install -d ${D}${libdir}/python3
    install -m 0755 zspiread  ${D}${bindir}
    install -m 0755 zspiwrite ${D}${bindir}
    install zwire.py        ${D}${libdir}/python3
    install smpi_gateway.py ${D}${libdir}/python3
}

FILES_${PN} += "${libdir}/python3"
