require ${PN}.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=d8048cd156eda3df2e7f111b0ae9ceff"

SRC_URI = "\
    git://github.com/pytest-dev/pytest-timeout.git;protocol=https;nobranch=1 \
    file://python2.patch \
"
SRCREV = "8e4800ecbcf149790bb8035ec37dc30f3d48a127"

S = "${WORKDIR}/git"

inherit setuptools
PYPI_SOURCE_URI = "${SRC_URI}"

RDEPENDS:${PN} += "\
    python-pytest \
"
BBCLASSEXTEND = "native nativesdk"
