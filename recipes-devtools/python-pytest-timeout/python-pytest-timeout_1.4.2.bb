require ${PN}.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=d8048cd156eda3df2e7f111b0ae9ceff"

SRC_URI = "\
    git://github.com/pytest-dev/pytest-timeout.git;protocol=https;nobranch=1 \
"
SRCREV = "457e68aa2c4f2c901b190648ea940072e3826450"

S = "${WORKDIR}/git"

inherit setuptools
PYPI_SOURCE_URI = "${SRC_URI}"

RDEPENDS:${PN} += "\
    python-pytest \
"
BBCLASSEXTEND = "native nativesdk"
