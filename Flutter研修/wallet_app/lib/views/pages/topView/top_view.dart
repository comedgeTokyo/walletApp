import 'package:flutter/material.dart';
import 'package:flutter_state_notifier/flutter_state_notifier.dart';
import 'package:wallet_app/views/pages/topView/top_view_state.dart';
import 'package:wallet_app/views/pages/topView/top_view_state_notifier.dart';
import 'package:wallet_app/views/pages/topView/top_view_style.dart';

/// TopView画面
class TopView extends StatelessWidget {
  /// コンストラクタ
  ///
  /// [key] キー
  const TopView({Key? key}) : super(key: key);

  /// 画面
  ///
  /// [context] BuildContext
  ///
  /// 　　return 画面: Widget
  @override
  Widget build(BuildContext context) {
    return StateNotifierProvider<TopViewStateNotifier, TopViewState>(
      create: (_) => TopViewStateNotifier(),
      child: Body(),
    );
  }
}

/// 画面表示部分
class Body extends StatelessWidget {
  /// コンストラクタ
  ///
  /// [key] キー
  Body({super.key});

  /// スタイル
  final style = TopViewStyle();

  /// 画面
  ///
  /// [context] BuildContext
  ///
  /// 　　return 画面: Widget
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('財布アプリ'),
        ),
        body: _body(context),
      ),
    );
  }

  /// 画面
  ///
  /// [context] BuildContext
  ///
  /// 　　return 画面: Widget
  Widget _body(BuildContext context) {
    return Column(children: [
      Container(
        width: 50,
        height: 50,
        color: Colors.red,
      )
    ]);
  }
}
