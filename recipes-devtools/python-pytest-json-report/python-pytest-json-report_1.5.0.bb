require ${PN}.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=8b4ca2f2ad5aaaebd8eb24f262f8fe60"

SRC_URI = "\
    git://github.com/numirias/pytest-json-report.git;protocol=https;nobranch=1 \
    file://python2.patch \
"
SRCREV = "c6f0bc93a174770e04b965e459d339a880005e78"

S = "${WORKDIR}/git"

inherit setuptools

RDEPENDS:${PN} += "\
    python-pytest \
    python-pytest-metadata \
"
BBCLASSEXTEND = "native nativesdk"
