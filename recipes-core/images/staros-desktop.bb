SUMMARY = "A very basic X11 image with a terminal"

IMAGE_FEATURES += "splash package-management x11-base"

LICENSE = "MIT"

inherit core-image features_check

REQUIRED_DISTRO_FEATURES = "x11"

IMAGE_INSTALL:append = " \
    packagegroup-core-full-cmdline \
    packagegroup-core-ssh-openssh \
    packagegroup-core-x11 \
    xkbcomp \
    lxdm \
    lxde-common \
    lxde-icon-theme \
    lxmenu-data \
    lxpanel \
    lxsession \
    lxterminal \
    lxappearance \
    iso-codes \
    openbox \
    kernel-modules \
    linux-firmware \
    mesa-demos \
    htop \
    git cmake meson ninja \
    vim gedit \
    python3-pip \
    python3-setuptools \
    flatpak \
    e2fsprogs e2fsprogs-resize2fs \
    libmd \
    ntp ntp-utils \
    tzdata \
    tree \
    xfce4-screenshooter \
    flex bison \
    glibc-utils tzcode localedef \
"

IMAGE_INSTALL:append = " glmark2"
PACKAGECONFIG:pn-glmark2 = " \ 
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11 opengl', 'x11-gles2', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland opengl', 'wayland-gles2', '', d)} \
    drm-gles2 \
"

inherit extrausers
HAPPY_PASSWD = "\$6\$happyos\$ft97yATdO0MXNg2G7UI0NO2BFQqc1FchkeXQapQb5/Q6AnkuAqv8c0RSQVKAiOYgduU9hEzgXaOcfdNPu..U.0"
EXTRA_USERS_PARAMS = "\
    useradd -p '${HAPPY_PASSWD}' -G sudo happy; \
    usermod -aG sudo happy; \
    usermod -aG input happy; \
"
inherit setchinatime
