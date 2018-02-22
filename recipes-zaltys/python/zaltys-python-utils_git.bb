SUMMARY = "Python utilities for the Zaltys platform."
LICENSE = "MIT"

SILICON_INFUSION_OPEN_HOST ??= "git://github.com/siliconinfusion"

SRC_URI = "${SILICON_INFUSION_OPEN_HOST}/zaltys-python-utils.git"
SRCREV = "master"

LIC_FILES_CHKSUM = "file://LICENCE;md5=9f99a6147d76cdf62362534311e782bc"

S = "${WORKDIR}/git"

PYTHON2_MAJMIN = "2.7"
PYTHON3_MAJMIN = "3.3"

do_configure() {
}

do_compile() {
}

do_install() {
    install -d ${D}${bindir}
    install -d ${D}${libdir}/python${PYTHON2_MAJMIN}
    install -d ${D}${libdir}/python${PYTHON3_MAJMIN}
    install -d ${D}${datadir}/zaltys

    install -m 0755 zspiread  ${D}${bindir}
    install -m 0755 zspiwrite ${D}${bindir}

    install -m 0755 zuartread  ${D}${bindir}
    install -m 0755 zuartwrite ${D}${bindir}

    install zaltys_zwire.py          ${D}${libdir}/python${PYTHON2_MAJMIN}
    install zaltys_smpi_gateway.py   ${D}${libdir}/python${PYTHON2_MAJMIN}
    install zaltys_ad9361_driver.py  ${D}${libdir}/python${PYTHON2_MAJMIN}
    install zaltys_hdrmm_driver.py   ${D}${libdir}/python${PYTHON2_MAJMIN}
    install zaltys_hdrmd_driver.py   ${D}${libdir}/python${PYTHON2_MAJMIN}
    install zaltys_dvbs2m_driver.py  ${D}${libdir}/python${PYTHON2_MAJMIN}
    install zaltys_dvbs2d_driver.py  ${D}${libdir}/python${PYTHON2_MAJMIN}
    install zaltys_dvbs2fd_driver.py ${D}${libdir}/python${PYTHON2_MAJMIN}
    install zaltys_plsv_utils.py     ${D}${libdir}/python${PYTHON2_MAJMIN}
    install libgse_wrapper.py        ${D}${libdir}/python${PYTHON2_MAJMIN}

    install zaltys_zwire.py          ${D}${libdir}/python${PYTHON3_MAJMIN}
    install zaltys_smpi_gateway.py   ${D}${libdir}/python${PYTHON3_MAJMIN}
    install zaltys_ad9361_driver.py  ${D}${libdir}/python${PYTHON3_MAJMIN}
    install zaltys_hdrmm_driver.py   ${D}${libdir}/python${PYTHON3_MAJMIN}
    install zaltys_hdrmd_driver.py   ${D}${libdir}/python${PYTHON3_MAJMIN}
    install zaltys_dvbs2m_driver.py  ${D}${libdir}/python${PYTHON3_MAJMIN}
    install zaltys_dvbs2d_driver.py  ${D}${libdir}/python${PYTHON3_MAJMIN}
    install zaltys_dvbs2fd_driver.py ${D}${libdir}/python${PYTHON3_MAJMIN}
    install zaltys_plsv_utils.py     ${D}${libdir}/python${PYTHON3_MAJMIN}
    install libgse_wrapper.py        ${D}${libdir}/python${PYTHON3_MAJMIN}

    install zaltys_smpi_gateway_test.py   ${D}${datadir}/zaltys
    install zaltys_ad9361_driver_test.py  ${D}${datadir}/zaltys
    install zaltys_hdrmm_driver_test.py   ${D}${datadir}/zaltys
    install zaltys_hdrmd_driver_test.py   ${D}${datadir}/zaltys
    install zaltys_dvbs2m_driver_test.py  ${D}${datadir}/zaltys
    install zaltys_dvbs2d_driver_test.py  ${D}${datadir}/zaltys
    install zaltys_dvbs2fd_driver_test.py ${D}${datadir}/zaltys
    install libgse_wrapper_test.py        ${D}${datadir}/zaltys

    install -m 0755 dvbs2_setup_test      ${D}${datadir}/zaltys
    install -m 0755 dvbs2_bbframe_test    ${D}${datadir}/zaltys
    install -m 0755 dvbs2_continuous_test ${D}${datadir}/zaltys
}

FILES_${PN} += "${libdir}/python${PYTHON2_MAJMIN}"
FILES_${PN} += "${libdir}/python${PYTHON3_MAJMIN}"
FILES_${PN} += "${datadir}/zaltys"
