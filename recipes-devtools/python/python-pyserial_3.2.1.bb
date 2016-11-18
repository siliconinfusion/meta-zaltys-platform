SUMMARY = "Python serial communications."
HOMEPAGE = "http://pypi.python.org/pypi/pyserial/"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d476d94926db6e0008a5b3860d1f5c0d"
DEPENDS = "python-core"

SRCNAME = "pyserial"
SRC_URI = "https://pypi.python.org/packages/b3/b2/238e2590826bfdd113244a40d9d3eb26918bd798fc187e2360a8367068db/${SRCNAME}-${PV}.tar.gz"
SRC_URI = "https://pypi.python.org/packages/1f/3b/ee6f354bcb1e28a7cd735be98f39ecf80554948284b41e9f7965951befa6/${SRCNAME}-${PV}.tar.gz"
SRC_URI[md5sum] = "7142a421c8b35d2dac6c47c254db023d"
S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} += "python-core"

inherit setuptools
