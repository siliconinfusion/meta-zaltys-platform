# Copyright (C) 2015 - 2016 Silicon Infusion Ltd
# Released under an MIT license, see LICENCE file for details.

DESCRIPTION = "Zaltys platform image."

require recipes-fsl/images/fsl-image-gui.bb

IMAGE_INSTALL += "linux-firmware-rtl8192cu"
IMAGE_INSTALL += "dhcp-client"
IMAGE_INSTALL += "packagegroup-core-buildessential"
IMAGE_INSTALL += "packagegroup-xfce-base"
IMAGE_INSTALL += "chromium"
IMAGE_INSTALL += "git"
IMAGE_INSTALL += "python3-core"
IMAGE_INSTALL += "python3-modules"
IMAGE_INSTALL += "python3-misc"
IMAGE_INSTALL += "python3-cherrypy"
IMAGE_INSTALL += "python3-simplejson"
IMAGE_INSTALL += "python3-requests"
IMAGE_INSTALL += "python3-six"
IMAGE_INSTALL += "libzaltys-zwire"
IMAGE_INSTALL += "libzaltys-ad9361"
IMAGE_INSTALL += "zaltys-python-utils"

IMAGE_BASENAME = "zaltys-platform-image"
