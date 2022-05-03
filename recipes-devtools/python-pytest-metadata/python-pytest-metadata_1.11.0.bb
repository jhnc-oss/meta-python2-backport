require ${PN}.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=5d425c8f3157dbf212db2ec53d9e5132"

DEPENDS += "python-setuptools-scm-native"

SRC_URI = "\
    git://github.com/pytest-dev/pytest-metadata.git;protocol=https;nobranch=1 \
"
SRCREV = "a538cdee37b3f411d3fd865adfc60a8cb9b6033a"

S = "${WORKDIR}/git"

inherit setuptools
PYPI_SOURCE_URI = "${SRC_URI}"

RDEPENDS:${PN} += "python-pytest"

BBCLASSEXTEND = "native nativesdk"
