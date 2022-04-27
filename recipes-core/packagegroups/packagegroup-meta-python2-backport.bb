SUMMARY = "meta-python2-backport package group"

inherit packagegroup

RDEPENDS_${PN} = "\
    python-pytest-timeout \
    python-pytest-metadata \
"
