# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "A cross-platform curses-based monitoring tool"
HOMEPAGE = "https://github.com/nicolargo/glances"
# NOTE: License in pyproject.toml is: LGPLv3
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING
#   LICENSES/LGPL-3.0-only.txt
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=852ecadc0ac7e6f4d7144d5544a3815b \
                    file://LICENSES/LGPL-3.0-only.txt;md5=852ecadc0ac7e6f4d7144d5544a3815b"

# No information for SRC_URI yet (only an external source tree was specified)
SRC_URI = ""

inherit python_setuptools_build_meta


# WARNING: We were unable to map the following python package/module
# runtime dependencies to the bitbake packages which include them:
#    defusedxml
#    shtab;
#    windows-curses;

RDEPENDS:${PN} = "python3-packaging python3-psutil"
ERROR_QA:remove = "license-checksum"
