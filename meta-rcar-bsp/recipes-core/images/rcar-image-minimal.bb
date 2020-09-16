SUMMARY = "A small image just capable of allowing a device to boot."

require recipes-core/images/core-image-minimal.bb

COMPATIBLE_MACHINE = "(falcon)"

# Basic packages
IMAGE_INSTALL_append = " \
    bash \
    v4l-utils \
    i2c-tools \
    coreutils \
    packagegroup-bsp-custom \
    packagegroup-bsp-devdbg \
"
