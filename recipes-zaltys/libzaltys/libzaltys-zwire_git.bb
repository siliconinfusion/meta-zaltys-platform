SUMMARY = "A library for ZEDwire SPI communications."
LICENSE = "MIT"

SILICON_INFUSION_OPEN_HOST ??= "git://github.com/siliconinfusion"

SRC_URI = "${SILICON_INFUSION_OPEN_HOST}/libzaltys-zwire.git"
SRCREV = "master"

LIC_FILES_CHKSUM = "file://LICENCE;md5=9f99a6147d76cdf62362534311e782bc"

S = "${WORKDIR}/git"

do_install() {
    oe_runmake install PREFIX="${D}/usr"
}

PACKAGES = "${PN}-dbg ${PN}-staticdev ${PN} ${PN}-dev"
FILES_${PN} += "${includedir}"
FILES_${PN} += "${libdir}"
