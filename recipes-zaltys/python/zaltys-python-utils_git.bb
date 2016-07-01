SUMMARY = "Python utilities for the Zaltys platform."
LICENSE = "Proprietary"
PYTHON_MAJMIN = "3.3"

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
    install -d ${D}${libdir}/python${PYTHON_MAJMIN}
    install -m 0755 zspiread        ${D}${bindir}
    install -m 0755 zspiwrite       ${D}${bindir}
    install zaltys_zwire.py         ${D}${libdir}/python${PYTHON_MAJMIN}
    install zaltys_smpi_gateway.py  ${D}${libdir}/python${PYTHON_MAJMIN}
    install zaltys_ad9361_driver.py ${D}${libdir}/python${PYTHON_MAJMIN}
    install zaltys_hdrmd_driver.py  ${D}${libdir}/python${PYTHON_MAJMIN}
}

FILES_${PN} += "${libdir}/python${PYTHON_MAJMIN}"
