SUMMARY = "meta-python2-backport package group"

inherit packagegroup

RDEPENDS_${PN} = "\
    python-pytest-json-report \
    python-pytest-metadata \
    python-pytest-timeout \
"
