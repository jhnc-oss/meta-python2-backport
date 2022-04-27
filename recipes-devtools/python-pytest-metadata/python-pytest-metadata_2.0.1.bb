require ${PN}.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=5d425c8f3157dbf212db2ec53d9e5132"

SRC_URI = "\
    git://github.com/pytest-dev/pytest-metadata.git;protocol=https;nobranch=1 \
    file://python2.patch \
"
SRCREV = "6216274eb9b74c23398f49f6bc4b7677542fb5e0"

S = "${WORKDIR}/git"

inherit setuptools
PYPI_SOURCE_URI = "${SRC_URI}"

RDEPENDS:${PN} += "\
    python-pytest \
"
BBCLASSEXTEND = "native nativesdk"
