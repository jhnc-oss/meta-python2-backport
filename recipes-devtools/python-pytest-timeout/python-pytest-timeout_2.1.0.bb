require ${PN}.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=d8048cd156eda3df2e7f111b0ae9ceff"

SRC_URI = "\
    git://github.com/pytest-dev/pytest-timeout.git;protocol=https;nobranch=1 \
    file://python2.patch \
"
SRCREV = "ad28d098ed788b29c404c45701cb670873066d6c"

S = "${WORKDIR}/git"

inherit setuptools
PYPI_SOURCE_URI = "${SRC_URI}"

RDEPENDS:${PN} += "\
    python-pytest \
"
BBCLASSEXTEND = "native nativesdk"
