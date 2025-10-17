# Append the set_timezone function to ROOTFS_POSTPROCESS_COMMAND
ROOTFS_POSTPROCESS_COMMAND += "set_timezone;"

# Function to set the timezone to Asia/Shanghai
set_timezone () {
    ln -sf /usr/share/zoneinfo/Asia/Shanghai ${IMAGE_ROOTFS}/etc/localtime
}
