require ${PN}.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=e88ae122f3925d8bde8319060f2ddb8e"

DEPENDS += "python-setuptools-scm-native"

SRC_URI = "git://github.com/python/importlib_metadata.git;protocol=https;nobranch=1"
SRCREV = "611dd521b03b0b24628ae247107e8fb86c3c3919"

S = "${WORKDIR}/git"

inherit setuptools

RDEPENDS:${PN} += "\
    ${PYTHON_PN}-pathlib2 \
    ${PYTHON_PN}-zipp \
    python-compression \
    python-configparser \
    python-contextlib2 \
    python-pathlib2 \
"
BBCLASSEXTEND = "native nativesdk"
