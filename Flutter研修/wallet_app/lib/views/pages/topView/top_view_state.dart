import 'package:freezed_annotation/freezed_annotation.dart';

part 'top_view_state.freezed.dart';

/// TopViewState
@freezed
class TopViewState with _$TopViewState {
  factory TopViewState({
    /// test
    @Default('') String test,
  }) = _TopViewState;
}
