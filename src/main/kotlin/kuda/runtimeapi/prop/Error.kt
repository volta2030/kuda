package kuda.runtimeapi.prop

enum class Error(val num : Int) {
    SUCCESS(0),
    INVALID_VALUE(1),
    MEMORY_ALLOCATION(2),
    INITIALIZATION_ERROR(3),
    CUDART_UNLOADING(4),
    PROFILER_DISABLED(5),
    PROFILER_NOT_INITIALIZED(6),
    PROFILER_ALREADY_STARTED(7),
    PROFILER_ALREADY_STOPPED(8),
    INVALID_CONFIGURATION(9),
    INVALID_PITCH_VALUE(12),
    INVALID_SYMBOL(13),
    INVALID_HOST_POINTER(16),
    INVALID_DEVICE_POINTER(17),
    INVALID_TEXTURE(18),
    INVALID_TEXTURE_BINDING(19),
    INVALID_CHANNEL_DESCRIPTOR(20),
    INVALID_MEMCPY_DIRECTION(21),
    ADDRESS_OF_CONSTANT(22),
    TEXTURE_FETCH_FAILED(23),
    TEXTURE_NOT_BOUND(24),
    SYNCHRONIZATION_ERROR(25),
    INVALID_FILTER_SETTING(26),
    INVALID_NORM_SETTING(27),
    MIXED_DEVICE_EXECUTION(28),
    NOT_YET_IMPLEMENTED(31),
    MEMORY_VALUE_TOO_LARGE(32),
    STUB_LIBRARY(34),
    INSUFFICIENT_DRIVER(35),
    CALL_REQUIRES_NEWER_DRIVER(36),
    INVALID_SURFACE(37),
    DUPLICATE_VARIABLE_NAME(43),
    DUPLICATE_TEXTURE_NAME(44),
    DUPLICATE_SURFACE_NAME(45),
    DEVICES_UNAVAILABLE(46),
    INCOMPATIBLE_DRIVER_CONTEXT(49),
    MISSING_CONFIGURATION(52),
    PRIOR_LAUNCH_FAILURE(53),
    LAUNCH_MAX_DEPTH_EXCEEDED(65),
    LAUNCH_FILE_SCOPED_TEX(66),
    LAUNCH_FILE_SCOPED_SURF(67),
    SYNC_DEPTH_EXCEEDED(68),
    LAUNCH_PENDING_COUNT_EXCEEDED(69),
    INVALID_DEVICE_FUNCTION(98),

    NO_DEVICE(100),
    INVALID_DEVICE(101),
    DEVICE_NOT_LICENSED(102),
    SOFTWARE_VALIDITY_NOT_ESTABLISHED(103),
    STARTUP_FAILURE(127),

    INVALID_KERNEL_IMAGE(200),
    DEVICE_UNINITIALIZED(201),
    MAP_BUFFER_OBJECT_FAILED(205),
    UMMAP_BUFFER_OBJECT_FAILED(206),
    ARRAY_IS_MAPPED(207),
    ALREADY_MAPPED(208),
    NO_KERNEL_IMAGE_FOR_DEVICE(209),
    ALREADY_ACQUIRED(210),
    NOT_MAPPED(211),
    NOT_MAPPED_AS_ARRAY(212),
    NOT_MAPPED_AS_POINTER(213),
    ECC_UNCORRECTABLE(214),
    UNSUPPORTED_LIMIT(215),
    DEVICE_ALREADY_IN_USE(216),
    PEER_ACCESS_UNSUPPORTED(217),
    INVALID_PTX(218),
    INVALID_GRAPHICS_CONTEXT(219),
    NVLINK_UNCORRECTABLE(220),
    JIT_COMPILER_NOT_FOUND(221),
    UNSUPPORTED_PTX_VERSION(222),
    JIT_COMPILATION_DISABLED(223),
    UNSUPPORTED_EXEC_AFFINITY(224),
    UNSUPPORTED_DEV_SIDE_SYNC(225),

    INVALID_SOURCE(300),
    FILE_NOT_FOUND(301),
    SHARED_OBJECT_SYMBOL_NOT_FOUND(302),
    SHARED_OBJECT_INIT_FAILED(303),
    OPERATION_SYSTEM(304),

    INVALID_RESOURCE_HANDLE(400),
    ILLEGAL_STATE(401),
    LOSSY_QUERY(402),

    SYMBOL_NOT_FOUND(500),

    ERROR_NOT_READY(600),

    ILLEGAL_ADDRESS(700),
    LAUNCH_OUT_OF_RESOURCES(701),
    LAUNCH_TIMEOUT(702),
    LAUNCH_INCOMPATIBLE_TEXTURING(703),
    PEER_ACCESS_ALREADY_ENABLED(704),
    PEER_ACCESS_NOT_ENABLED(705),
    SET_ON_ACTIVE_PROCESS(708),
    CONTEXT_IS_DESTROYED(709),
    ASSERT(710),
    TOO_MANY_PEERS(711),
    HOST_MEMORY_ALREADY_REGISTERED(712),
    HOST_MEMORY_NOT_REGISTERED(713),
    HARDWARE_STACK_ERROR(714),
    ILLEGAL_INSTRUCTION(715),
    MISALIGNED_ADDRESS(716),
    INVALID_ADDRESS_SPACE(717),
    INVALID_PC(718),
    LAUNCH_FAILURE(719),
    COOPERATIVE_LAUNCH_TOO_LARGE(720),

    NOT_PERMITTED(800),
    NOT_SUPPORTED(801),
    SYSTEM_NOT_READY(802),
    SYSTEM_DRIVER_MISMATCH(803),
    COMPAT_NOT_SUPPORTED_ON_DEVICE(804),
    MPS_CONNECTION_FAILED(805),
    MPS_RPC_FAILURE(806),
    MPS_SERVER_NOT_READY(807),
    MPS_MAX_CLIENTS_REACHED(808),
    MPS_MAX_CONNECTIONS_REACHED(809),
    MPS_CLIENT_TERMINATED(810),
    CDP_NOT_SUPPORTED(811),
    CDP_VERSION_MISMATCH(812),

    STREAM_CAPTURE_UNSUPPORTED(900),
    STREAM_CAPTURE_INVALIDATED(901),
    STREAM_CAPTURE_MERGE(902),
    STREAM_CAPTURE_UNMATCHED(903),
    STREAM_CAPTURE_UNJOINED(904),
    STREAM_CAPTURE_ISOLATION(905),
    STREAM_CAPTURE_IMPLICIT(906),
    CAPTURED_EVENT(907),
    STREAM_CAPTURE_WRONG_THREAD(908),
    TIMEOUT(909),
    GRAPH_EXEC_UPDATE_FAILURE(910),
    EXTERNAL_DEVICE(911),
    INVALID_CLUSTER_SIZE(912),
    ERROR_UNKNOWN(999),

    API_FAILURE_BASE(1000)
}