SUMMARY = "Simple GTK+ Text Editor"
HOMEPAGE = "https://github.com/stevenhoneyman/l3afpad"

# Note that COPYING seems to mistakenly contain LGPLv2.1.
# The source code is marked GPLv2+ and COPYING used to contain
# that as well.
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c \
                    file://src/l3afpad.h;endline=20;md5=8848fd645cd45115d8cb47ca5c42a50e \
                    file://src/utils.c;endline=20;md5=ae4792f69d3bb7b7ba91d582ba9b1a05"

DEPENDS = "gtk+3 intltool-native gettext-native"

PV = "0.8.18.1.11+git${SRCPV}"
SRC_URI = "git://github.com/stevenhoneyman/l3afpad.git;protocol=https"
SRCREV ="3cdccdc9505643e50f8208171d9eee5de11a42ff"

S = "${WORKDIR}/git"

inherit autotools pkgconfig distro_features_check

ANY_OF_DISTRO_FEATURES = "${GTK3DISTROFEATURES}"

EXTRA_OECONF = "--disable-emacs --disable-print"
FILES_${PN} += "${datadir}/icons"
