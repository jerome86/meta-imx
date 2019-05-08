FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0001-ozone-wayland-Don-t-build-gbm_wrappers-without-gbm-u.patch \
                   file://0002-chromium-ozone-wayland-Stop-depending-on-the-system-.patch"

SRC_URI_append_mx8 = " file://0001-chromium-ozone-wayland-Fix-regression-with-VizDispla.patch"

# gbm is availiable only for mx8 
GN_ARGS_append_mx6 = " use_system_minigbm=false use_wayland_gbm=false"
GN_ARGS_append_mx7 = " use_system_minigbm=false use_wayland_gbm=false"
