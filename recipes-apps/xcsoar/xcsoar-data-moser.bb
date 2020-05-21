# Copyright (C) 2014 Unknow User <unknow@user.org>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "XCSoar Profiles"
HOMEPAGE = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT.md;md5=d41d8cd98f00b204e9800998ecf8427e"
SECTION = "base/app"

S = "${WORKDIR}"
PR = "r1"

SRC_URI =      "\
	file://MIT.md \
	file://airfields.cup \
	file://airspace.txt \
	file://D-KNUD.xcp \
	file://flarmnet.fln \
	file://init.lua \
	file://moser-small.xcm \
	file://moser.prf \
	file://xcsoar-checklist.txt \
"
addtask do_package_write_ipk after do_package after do_install

do_compile() {
        :
}

do_install() {
        echo "Installing ..."
        install -d ${D}/home/root/.xcsoar
        install -m 0644 ${S}/*.cup ${D}/home/root/.xcsoar/
        install -m 0644 ${S}/*.txt ${D}/home/root/.xcsoar/
        install -m 0644 ${S}/*.xcp ${D}/home/root/.xcsoar/
        install -m 0644 ${S}/*.xcm ${D}/home/root/.xcsoar/
        install -m 0644 ${S}/*.prf ${D}/home/root/.xcsoar/
        install -d ${D}/home/root/.xcsoar/lua
        install -m 0644 ${S}/*.lua ${D}/home/root/.xcsoar/lua/
}

FILES_${PN} = "/home/root/.xcsoar/*"

