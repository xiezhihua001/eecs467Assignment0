include ../../common.mk

# flags for building the gtk library
CFLAGS  =   $(CFLAGS_STD) $(CFLAGS_VX_GL)  $(CFLAGS_VX)  $(CFLAGS_IMAGESOURCE)  $(CFLAGS_MATH)  $(CFLAGS_COMMON)  $(CFLAGS_GTK) -O2
LDFLAGS =  $(LDFLAGS_STD) $(LDFLAGS_VX_GL) $(LDFLAGS_VX) $(LDFLAGS_IMAGESOURCE) $(LDFLAGS_MATH) $(LDFLAGS_COMMON) $(LDFLAGS_GTK) -lz
LIBDEPS = $(call libdeps, $(LDFLAGS))

LIB_VXGTK = $(LIB_PATH)/libvxgtk.a
VXGTK_OBJS = vx_gtk_display_source.o vx_gtk_display.o gtkuimagepane.o vx_gtk_buffer_manager.o

BIN_VX_DEMO = $(BIN_PATH)/vx_demo
BIN_VX_ZOO = $(BIN_PATH)/vx_zoo
BIN_VX_REMOTE_VIEWER = $(BIN_PATH)/vx_remote_viewer
BIN_VX_SCENE_VIEWER = $(BIN_PATH)/vx_scene_viewer
BIN_VX_TEST = $(BIN_PATH)/vx_test
ALL = $(LIB_VXGTK) $(BIN_VX_DEMO) $(BIN_VX_ZOO) $(BIN_VX_REMOTE_VIEWER) $(BIN_VX_SCENE_VIEWER) $(BIN_VX_TEST)

all: $(ALL)

$(LIB_VXGTK): $(VXGTK_OBJS) $(LIBDEPS)
	@echo "\t$@"
	@ar rc $@ $^

$(BIN_VX_DEMO): vx_demo.o $(LIB_VXGTK) $(LIB_VXGL) $(LIB_VX) $(LIBDEPS)
	@echo "\t$@"
	@$(CC) -o $@ $^ $(LDFLAGS)

$(BIN_VX_TEST): vx_test.o $(LIB_VXGTK) $(LIB_VXGL) $(LIB_VX) $(LIBDEPS)
	@echo "\t$@"
	@$(CC) -o $@ $^ $(LDFLAGS)

$(BIN_VX_ZOO): vx_zoo.o $(LIB_VXGTK) $(LIB_VXGL) $(LIB_VX) $(LIBDEPS)
	@echo "\t$@"
	@$(CC) -o $@ $^ $(LDFLAGS)

$(BIN_VX_SCENE_VIEWER): vx_scene_viewer.o $(LIB_VXGTK) $(LIB_VXGL) $(LIB_VX) $(LIBDEPS)
	@echo "\t$@"
	@$(CC) -o $@ $^ $(LDFLAGS)

$(BIN_VX_REMOTE_VIEWER): vx_remote_viewer.o $(LIB_VXGTK) $(LIBDEPS)
	@echo "\t$@"
	@$(CC) -o $@ $^ $(LDFLAGS)

clean:
	@rm -f *.o *~ *.a
	@rm -rf  $(ALL)
