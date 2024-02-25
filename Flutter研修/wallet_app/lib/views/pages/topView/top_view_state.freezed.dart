// coverage:ignore-file
// GENERATED CODE - DO NOT MODIFY BY HAND
// ignore_for_file: type=lint
// ignore_for_file: unused_element, deprecated_member_use, deprecated_member_use_from_same_package, use_function_type_syntax_for_parameters, unnecessary_const, avoid_init_to_null, invalid_override_different_default_values_named, prefer_expression_function_bodies, annotate_overrides, invalid_annotation_target, unnecessary_question_mark

part of 'top_view_state.dart';

// **************************************************************************
// FreezedGenerator
// **************************************************************************

T _$identity<T>(T value) => value;

final _privateConstructorUsedError = UnsupportedError(
    'It seems like you constructed your class using `MyClass._()`. This constructor is only meant to be used by freezed and you are not supposed to need it nor use it.\nPlease check the documentation here for more information: https://github.com/rrousselGit/freezed#adding-getters-and-methods-to-our-models');

/// @nodoc
mixin _$TopViewState {
  /// test
  String get test => throw _privateConstructorUsedError;

  @JsonKey(ignore: true)
  $TopViewStateCopyWith<TopViewState> get copyWith =>
      throw _privateConstructorUsedError;
}

/// @nodoc
abstract class $TopViewStateCopyWith<$Res> {
  factory $TopViewStateCopyWith(
          TopViewState value, $Res Function(TopViewState) then) =
      _$TopViewStateCopyWithImpl<$Res, TopViewState>;
  @useResult
  $Res call({String test});
}

/// @nodoc
class _$TopViewStateCopyWithImpl<$Res, $Val extends TopViewState>
    implements $TopViewStateCopyWith<$Res> {
  _$TopViewStateCopyWithImpl(this._value, this._then);

  // ignore: unused_field
  final $Val _value;
  // ignore: unused_field
  final $Res Function($Val) _then;

  @pragma('vm:prefer-inline')
  @override
  $Res call({
    Object? test = null,
  }) {
    return _then(_value.copyWith(
      test: null == test
          ? _value.test
          : test // ignore: cast_nullable_to_non_nullable
              as String,
    ) as $Val);
  }
}

/// @nodoc
abstract class _$$TopViewStateImplCopyWith<$Res>
    implements $TopViewStateCopyWith<$Res> {
  factory _$$TopViewStateImplCopyWith(
          _$TopViewStateImpl value, $Res Function(_$TopViewStateImpl) then) =
      __$$TopViewStateImplCopyWithImpl<$Res>;
  @override
  @useResult
  $Res call({String test});
}

/// @nodoc
class __$$TopViewStateImplCopyWithImpl<$Res>
    extends _$TopViewStateCopyWithImpl<$Res, _$TopViewStateImpl>
    implements _$$TopViewStateImplCopyWith<$Res> {
  __$$TopViewStateImplCopyWithImpl(
      _$TopViewStateImpl _value, $Res Function(_$TopViewStateImpl) _then)
      : super(_value, _then);

  @pragma('vm:prefer-inline')
  @override
  $Res call({
    Object? test = null,
  }) {
    return _then(_$TopViewStateImpl(
      test: null == test
          ? _value.test
          : test // ignore: cast_nullable_to_non_nullable
              as String,
    ));
  }
}

/// @nodoc

class _$TopViewStateImpl implements _TopViewState {
  _$TopViewStateImpl({this.test = ''});

  /// test
  @override
  @JsonKey()
  final String test;

  @override
  String toString() {
    return 'TopViewState(test: $test)';
  }

  @override
  bool operator ==(Object other) {
    return identical(this, other) ||
        (other.runtimeType == runtimeType &&
            other is _$TopViewStateImpl &&
            (identical(other.test, test) || other.test == test));
  }

  @override
  int get hashCode => Object.hash(runtimeType, test);

  @JsonKey(ignore: true)
  @override
  @pragma('vm:prefer-inline')
  _$$TopViewStateImplCopyWith<_$TopViewStateImpl> get copyWith =>
      __$$TopViewStateImplCopyWithImpl<_$TopViewStateImpl>(this, _$identity);
}

abstract class _TopViewState implements TopViewState {
  factory _TopViewState({final String test}) = _$TopViewStateImpl;

  @override

  /// test
  String get test;
  @override
  @JsonKey(ignore: true)
  _$$TopViewStateImplCopyWith<_$TopViewStateImpl> get copyWith =>
      throw _privateConstructorUsedError;
}
