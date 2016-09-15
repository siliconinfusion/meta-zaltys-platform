SUMMARY = "Python 2 and 3 compatibility utilities."
HOMEPAGE = "http://pypi.python.org/pypi/six/"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6f00d4a50713fa859858dd9abaa35b21"
DEPENDS = "python-core"

SRCNAME = "six"
SRC_URI = "https://pypi.python.org/packages/b3/b2/238e2590826bfdd113244a40d9d3eb26918bd798fc187e2360a8367068db/${SRCNAME}-${PV}.tar.gz"
SRC_URI[md5sum] = "34eed507548117b2ab523ab14b2f8b55"

S = "${WORKDIR}/${SRCNAME}-${PV}"

RDEPENDS_${PN} += "python-core"

inherit setuptools
