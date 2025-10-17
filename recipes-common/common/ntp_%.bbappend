FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://ntp.conf"
SRC_URI += "file://ntpd-new"

do_install:append() {
    install -m 0644 ${WORKDIR}/ntp.conf ${D}${sysconfdir}/ntp.conf
    install -m 0755 ${WORKDIR}/ntpd-new  ${D}${sysconfdir}/init.d/ntpd
}
