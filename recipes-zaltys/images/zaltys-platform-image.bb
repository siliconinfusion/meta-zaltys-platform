# Copyright (C) 2015 - 2016 Silicon Infusion Ltd
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Zaltys platform image."

inherit core-image

IMAGE_FEATURES += "splash x11-base hwcodecs"

EXTRA_IMAGE_FEATURES += "tools-debug tools-profile ssh-server-dropbear"

PACKAGE_ARCH = "${MACHINE_ARCH}"

IMAGE_INSTALL += "xorg-minimal-fonts"
IMAGE_INSTALL += "liberation-fonts"
IMAGE_INSTALL += "packagegroup-core-buildessential"
IMAGE_INSTALL += "packagegroup-xfce-base"
IMAGE_INSTALL += "linux-firmware-rtl8192cu"
IMAGE_INSTALL += "dhcp-client"
#IMAGE_INSTALL += "chromium"
#IMAGE_INSTALL += "firefox"
#IMAGE_INSTALL += "midori"
IMAGE_INSTALL += "epiphany"
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
