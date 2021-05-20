SUMMARY = "i.MX M4 coprocessor images"
SECTION = "app"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "file://coprocessor.elf \
"
S = "${WORKDIR}"

do_install () {
    # install elf format binary to /lib/firmware
    install -d ${D}/lib/firmware
    install -m 0644 ${S}/coprocessor.elf ${D}/lib/firmware/coprocessor.elf
}

FILES_${PN} = "/lib/firmware/coprocessor.elf"


