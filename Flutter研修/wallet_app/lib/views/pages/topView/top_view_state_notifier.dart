import 'package:flutter/material.dart';
import 'package:state_notifier/state_notifier.dart';
import 'package:wallet_app/views/pages/topView/top_view_state.dart';

/// TopView処理クラス
class TopViewStateNotifier extends StateNotifier<TopViewState>
    with LocatorMixin, WidgetsBindingObserver {
  /// コンストラクタ
  TopViewStateNotifier() : super(TopViewState());
}
