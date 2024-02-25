import 'package:wallet_app/views/pages/topView/top_view_style_handheld.dart';
import 'package:wallet_app/views/pages/topView/top_view_style_tablet.dart';

/// TopViewスタイルクラス
abstract class TopViewStyle {
  factory TopViewStyle() {
    // iPad,iPhone判定
    if (true) {
      return TopViewStyleTablet();
    } else {
      return TopViewStyleHandheld();
    }
  }
}
