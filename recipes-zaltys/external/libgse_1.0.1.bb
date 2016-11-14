SUMMARY = "A library for Generic Stream Encapsulation packet processing."
LICENSE = "LGPLv3"

SILICON_INFUSION_EXTERNAL_HOST ??= "file:///SiliconInfusion/software/external"

SRC_URI = "${SILICON_INFUSION_EXTERNAL_HOST}/libgse/gse-${PV}.tar.gz"

LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS = "libpcap"

S = "${WORKDIR}/gse-${PV}"

inherit autotools
