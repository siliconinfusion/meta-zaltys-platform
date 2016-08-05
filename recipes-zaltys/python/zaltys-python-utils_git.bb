SUMMARY = "Python utilities for the Zaltys platform."
LICENSE = "MIT"
PYTHON_MAJMIN = "3.5"

SRC_URI = "git:///SiliconInfusion/software/zaltys/zaltys-python-utils.git"
SRCREV = "master"

LIC_FILES_CHKSUM = "file://LICENCE;md5=9f99a6147d76cdf62362534311e782bc"

S = "${WORKDIR}/git"

do_configure() {
}

do_compile() {
}

do_install() {
    install -d ${D}${bindir}
    install -d ${D}${libdir}/python${PYTHON_MAJMIN}
    install -d ${D}${datadir}/zaltys

    install -m 0755 zspiread  ${D}${bindir}
    install -m 0755 zspiwrite ${D}${bindir}

    install zaltys_zwire.py         ${D}${libdir}/python${PYTHON_MAJMIN}
    install zaltys_smpi_gateway.py  ${D}${libdir}/python${PYTHON_MAJMIN}
    install zaltys_ad9361_driver.py ${D}${libdir}/python${PYTHON_MAJMIN}
    install zaltys_hdrmd_driver.py  ${D}${libdir}/python${PYTHON_MAJMIN}
    install zaltys_plsv_utils.py    ${D}${libdir}/python${PYTHON_MAJMIN}

    install zaltys_smpi_gateway_test.py  ${D}${datadir}/zaltys
    install zaltys_ad9361_driver_test.py ${D}${datadir}/zaltys
    install zaltys_hdrmd_driver_test.py  ${D}${datadir}/zaltys
}

FILES_${PN} += "${libdir}/python${PYTHON_MAJMIN}"
FILES_${PN} += "${datadir}/zaltys"
