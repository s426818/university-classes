
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver20HiddenTest {


  @Test
  public void test_omaha_holdem_5000_4c5s7d8sKh_QsAs3dAd_KdTd3h9c() {
    assertEquals(
      "KdTd3h9c QsAs3dAd",
      Solver.process("omaha-holdem 4c5s7d8sKh QsAs3dAd KdTd3h9c"));
  }

  @Test
  public void test_omaha_holdem_5001_2h3c6s8dJc_3hTdQcTh_Ks8s5h2s_Kc7s9s6d_TcJsTs2d_KhAh4s3s_5sAs6h3d_9c7c4cKd_Ac4h8hJh_8cAd2c9d() {
    assertEquals(
      "9c7c4cKd KhAh4s3s Kc7s9s6d 3hTdQcTh 5sAs6h3d 8cAd2c9d=Ks8s5h2s TcJsTs2d Ac4h8hJh",
      Solver.process("omaha-holdem 2h3c6s8dJc 3hTdQcTh Ks8s5h2s Kc7s9s6d TcJsTs2d KhAh4s3s 5sAs6h3d 9c7c4cKd Ac4h8hJh 8cAd2c9d"));
  }

  @Test
  public void test_omaha_holdem_5002_2c2s6c7d8s_7sJdKs5d_2d4dQdTh() {
    assertEquals(
      "7sJdKs5d 2d4dQdTh",
      Solver.process("omaha-holdem 2c2s6c7d8s 7sJdKs5d 2d4dQdTh"));
  }

  @Test
  public void test_omaha_holdem_5003_6c8d9hAhKh_3s7sAsQc_3h5d5h2s_Js4h8sTh() {
    assertEquals(
      "3s7sAsQc 3h5d5h2s Js4h8sTh",
      Solver.process("omaha-holdem 6c8d9hAhKh 3s7sAsQc 3h5d5h2s Js4h8sTh"));
  }

  @Test
  public void test_omaha_holdem_5004_2s6h7c7h9c_2d2cJcTc_JsQc6d9h() {
    assertEquals(
      "JsQc6d9h 2d2cJcTc",
      Solver.process("omaha-holdem 2s6h7c7h9c 2d2cJcTc JsQc6d9h"));
  }

  @Test
  public void test_omaha_holdem_5005_4c5h6s9d9s_9hTc5sKs_7s6hKh5d_Ac6d5c8c_Qc3sTsTh() {
    assertEquals(
      "7s6hKh5d Ac6d5c8c Qc3sTsTh 9hTc5sKs",
      Solver.process("omaha-holdem 4c5h6s9d9s 9hTc5sKs 7s6hKh5d Ac6d5c8c Qc3sTsTh"));
  }

  @Test
  public void test_omaha_holdem_5006_2c2h6d7c7h_7d2s9s8s_7s5s6sKs_TdKdQcJh_JdTsKh6c_8cAh9dAd_9h4s5cQd_4cJsAs8h() {
    assertEquals(
      "9h4s5cQd TdKdQcJh 4cJsAs8h JdTsKh6c 8cAh9dAd 7d2s9s8s 7s5s6sKs",
      Solver.process("omaha-holdem 2c2h6d7c7h 7d2s9s8s 7s5s6sKs TdKdQcJh JdTsKh6c 8cAh9dAd 9h4s5cQd 4cJsAs8h"));
  }

  @Test
  public void test_omaha_holdem_5007_4c8sQhTdTh_4h9dKdKh_Ac9c4s5h_8c8hTsQs_6d7cJsAh_9sJc7s2c_5s8dAdKs_QcTcJd3s() {
    assertEquals(
      "6d7cJsAh Ac9c4s5h 5s8dAdKs 4h9dKdKh 9sJc7s2c 8c8hTsQs=QcTcJd3s",
      Solver.process("omaha-holdem 4c8sQhTdTh 4h9dKdKh Ac9c4s5h 8c8hTsQs 6d7cJsAh 9sJc7s2c 5s8dAdKs QcTcJd3s"));
  }

  @Test
  public void test_omaha_holdem_5008_2c7d7h9dAd_TcAhTd8h_KhJs6c9s_4h6s4c3c() {
    assertEquals(
      "4h6s4c3c KhJs6c9s TcAhTd8h",
      Solver.process("omaha-holdem 2c7d7h9dAd TcAhTd8h KhJs6c9s 4h6s4c3c"));
  }

  @Test
  public void test_omaha_holdem_5009_6h6s8h9hTc_Ts9d9s7d_4c2dAh4d_TdAc3sTh_7h5sAd8s_4h4s2sJs() {
    assertEquals(
      "4c2dAh4d=4h4s2sJs 7h5sAd8s Ts9d9s7d TdAc3sTh",
      Solver.process("omaha-holdem 6h6s8h9hTc Ts9d9s7d 4c2dAh4d TdAc3sTh 7h5sAd8s 4h4s2sJs"));
  }

  @Test
  public void test_omaha_holdem_5010_2h4d5dAcQs_3s8dKs6s_3c7hTd6c_9c2cQhAh_TsJcQcJh() {
    assertEquals(
      "TsJcQcJh 9c2cQhAh 3c7hTd6c=3s8dKs6s",
      Solver.process("omaha-holdem 2h4d5dAcQs 3s8dKs6s 3c7hTd6c 9c2cQhAh TsJcQcJh"));
  }

  @Test
  public void test_omaha_holdem_5011_4s7sAhJsKs_2c9cTcQh_9s7d8s5s_7h9hKh7c_6sQs4c3c_2dKdAs8c_8d6cAd4d_Jd5d2s3s_Qc9dJcAc_6d8hTh5c() {
    assertEquals(
      "6d8hTh5c 8d6cAd4d Qc9dJcAc 2dKdAs8c 7h9hKh7c 2c9cTcQh Jd5d2s3s 9s7d8s5s 6sQs4c3c",
      Solver.process("omaha-holdem 4s7sAhJsKs 2c9cTcQh 9s7d8s5s 7h9hKh7c 6sQs4c3c 2dKdAs8c 8d6cAd4d Jd5d2s3s Qc9dJcAc 6d8hTh5c"));
  }

  @Test
  public void test_omaha_holdem_5012_5s7h9h9sTd_8sAc7sTh_JcQc8hKs_3h2dKdAh_6s4sJh3c_QsJs5cQd_2h3sTs4h_8dTc5dJd() {
    assertEquals(
      "6s4sJh3c 3h2dKdAh 2h3sTs4h 8sAc7sTh QsJs5cQd 8dTc5dJd=JcQc8hKs",
      Solver.process("omaha-holdem 5s7h9h9sTd 8sAc7sTh JcQc8hKs 3h2dKdAh 6s4sJh3c QsJs5cQd 2h3sTs4h 8dTc5dJd"));
  }

  @Test
  public void test_omaha_holdem_5013_3d5c8d9dKh_9s2cAs8h_Ah4s3s7h_2h7d4h5d_Qc7sQh7c_4dJs6h2d_Jd3c6cAd_8cTs6d9h() {
    assertEquals(
      "Ah4s3s7h Qc7sQh7c 8cTs6d9h=9s2cAs8h 4dJs6h2d 2h7d4h5d Jd3c6cAd",
      Solver.process("omaha-holdem 3d5c8d9dKh 9s2cAs8h Ah4s3s7h 2h7d4h5d Qc7sQh7c 4dJs6h2d Jd3c6cAd 8cTs6d9h"));
  }

  @Test
  public void test_omaha_holdem_5014_2d7s8hJdQd_As9cQhTs_5c7c9h8d_5s6h4dTh_JhAcAhJc_8s2cTd3h_4s8c4h3c_Js3s5h4c_9s2sKc7d_TcQcKsKh() {
    assertEquals(
      "5s6h4dTh 4s8c4h3c Js3s5h4c TcQcKsKh 9s2sKc7d 8s2cTd3h 5c7c9h8d JhAcAhJc As9cQhTs",
      Solver.process("omaha-holdem 2d7s8hJdQd As9cQhTs 5c7c9h8d 5s6h4dTh JhAcAhJc 8s2cTd3h 4s8c4h3c Js3s5h4c 9s2sKc7d TcQcKsKh"));
  }

  @Test
  public void test_omaha_holdem_5015_2d5d7sAcKs_JdJsAhTs_Ad4cQd9s_6dTdKc3c() {
    assertEquals(
      "6dTdKc3c JdJsAhTs Ad4cQd9s",
      Solver.process("omaha-holdem 2d5d7sAcKs JdJsAhTs Ad4cQd9s 6dTdKc3c"));
  }

  @Test
  public void test_omaha_holdem_5016_3c5c6d9sAc_9h8d7cQc_6cJsAs4s_Qd4dAd8s_3d8hJh3h() {
    assertEquals(
      "Qd4dAd8s 6cJsAs4s 3d8hJh3h 9h8d7cQc",
      Solver.process("omaha-holdem 3c5c6d9sAc 9h8d7cQc 6cJsAs4s Qd4dAd8s 3d8hJh3h"));
  }

  @Test
  public void test_omaha_holdem_5017_2d3s5sJdTs_2cAcQc8c_TdQsTcKd_4h4cQdAs_7dJcAd9s_3d9h5c2s_3c9d8s6d() {
    assertEquals(
      "2cAcQc8c 3c9d8s6d 7dJcAd9s 3d9h5c2s TdQsTcKd 4h4cQdAs",
      Solver.process("omaha-holdem 2d3s5sJdTs 2cAcQc8c TdQsTcKd 4h4cQdAs 7dJcAd9s 3d9h5c2s 3c9d8s6d"));
  }

  @Test
  public void test_omaha_holdem_5018_2d3c4d5sJc_TcAdQs6h_Ac2c7hJh() {
    assertEquals(
      "TcAdQs6h Ac2c7hJh",
      Solver.process("omaha-holdem 2d3c4d5sJc TcAdQs6h Ac2c7hJh"));
  }

  @Test
  public void test_omaha_holdem_5019_2c6s7d8c8s_4h8hJdQd_6h7s7cJs_2h2sAs5d_3c9s5hAd_4cKcAh8d() {
    assertEquals(
      "4h8hJdQd 4cKcAh8d 3c9s5hAd 2h2sAs5d 6h7s7cJs",
      Solver.process("omaha-holdem 2c6s7d8c8s 4h8hJdQd 6h7s7cJs 2h2sAs5d 3c9s5hAd 4cKcAh8d"));
  }

  @Test
  public void test_omaha_holdem_5020_2c5cAdJsTs_4dJh8s9s_2sKd3s4h_6cJcTcTd_Qs6hKc7d_5s5h9dAh() {
    assertEquals(
      "4dJh8s9s 5s5h9dAh 6cJcTcTd 2sKd3s4h Qs6hKc7d",
      Solver.process("omaha-holdem 2c5cAdJsTs 4dJh8s9s 2sKd3s4h 6cJcTcTd Qs6hKc7d 5s5h9dAh"));
  }

  @Test
  public void test_omaha_holdem_5021_4d4s8dQdTs_6c5s9c5h_4cTh3sJs_7cQc3c2h_QsAhJc7d_AsKcTc3h_2dJh6sKh_7sQh4h5d_5c8c6hJd_3d2s9dTd() {
    assertEquals(
      "2dJh6sKh 6c5s9c5h 5c8c6hJd AsKcTc3h 7cQc3c2h QsAhJc7d 3d2s9dTd 4cTh3sJs 7sQh4h5d",
      Solver.process("omaha-holdem 4d4s8dQdTs 6c5s9c5h 4cTh3sJs 7cQc3c2h QsAhJc7d AsKcTc3h 2dJh6sKh 7sQh4h5d 5c8c6hJd 3d2s9dTd"));
  }

  @Test
  public void test_omaha_holdem_5022_2h7hJcJdKd_Td8d9sAc_3c5s4dTh_7c4cTc9c_9h2dQd3d_5c8s8hKh() {
    assertEquals(
      "3c5s4dTh Td8d9sAc 9h2dQd3d 7c4cTc9c 5c8s8hKh",
      Solver.process("omaha-holdem 2h7hJcJdKd Td8d9sAc 3c5s4dTh 7c4cTc9c 9h2dQd3d 5c8s8hKh"));
  }

  @Test
  public void test_omaha_holdem_5023_6hAhJsKhQs_Td4cAc8d_9d6d3c5d_KcTh8cKd_Ad2c3d2s() {
    assertEquals(
      "9d6d3c5d Ad2c3d2s KcTh8cKd=Td4cAc8d",
      Solver.process("omaha-holdem 6hAhJsKhQs Td4cAc8d 9d6d3c5d KcTh8cKd Ad2c3d2s"));
  }

  @Test
  public void test_omaha_holdem_5024_2d5c5s8hKh_9dTcQc3c_9cKs7c2s_Jd4c6dKc_6s3hQs4h_Jh8s7sTs() {
    assertEquals(
      "6s3hQs4h 9dTcQc3c Jh8s7sTs 9cKs7c2s Jd4c6dKc",
      Solver.process("omaha-holdem 2d5c5s8hKh 9dTcQc3c 9cKs7c2s Jd4c6dKc 6s3hQs4h Jh8s7sTs"));
  }

  @Test
  public void test_omaha_holdem_5025_5c6h7s8dJd_9cTh6cKd_Kh9hKcTd_QdJh4s2c_5h9d6s4d_3h5d2s5s_7h8s8cTc_Qh3d3s6d_Jc9s2dAc_KsAdQcJs() {
    assertEquals(
      "Qh3d3s6d QdJh4s2c Jc9s2dAc=KsAdQcJs 3h5d2s5s 7h8s8cTc 5h9d6s4d 9cTh6cKd=Kh9hKcTd",
      Solver.process("omaha-holdem 5c6h7s8dJd 9cTh6cKd Kh9hKcTd QdJh4s2c 5h9d6s4d 3h5d2s5s 7h8s8cTc Qh3d3s6d Jc9s2dAc KsAdQcJs"));
  }

  @Test
  public void test_omaha_holdem_5026_6c8h9dKcTh_3hAsKs9c_TsJd4sQd_7cAh7s6s() {
    assertEquals(
      "3hAsKs9c 7cAh7s6s TsJd4sQd",
      Solver.process("omaha-holdem 6c8h9dKcTh 3hAsKs9c TsJd4sQd 7cAh7s6s"));
  }

  @Test
  public void test_omaha_holdem_5027_3d3s8c9dAs_2dThKs4d_Jh4h2s5h_5dJd6h8d_7h9hTcQc_Kc8sQd6s() {
    assertEquals(
      "Jh4h2s5h 2dThKs4d 5dJd6h8d Kc8sQd6s 7h9hTcQc",
      Solver.process("omaha-holdem 3d3s8c9dAs 2dThKs4d Jh4h2s5h 5dJd6h8d 7h9hTcQc Kc8sQd6s"));
  }

  @Test
  public void test_omaha_holdem_5028_3h7c9dKhTc_7hJdTh2c_4d2sQs3d() {
    assertEquals(
      "4d2sQs3d 7hJdTh2c",
      Solver.process("omaha-holdem 3h7c9dKhTc 7hJdTh2c 4d2sQs3d"));
  }

  @Test
  public void test_omaha_holdem_5029_3h9sAhAsJs_4d6h8c7c_2s6d2c3c_9d2h5d8d_Ac5c5sJc_9cKhQdTs() {
    assertEquals(
      "4d6h8c7c 2s6d2c3c 9d2h5d8d 9cKhQdTs Ac5c5sJc",
      Solver.process("omaha-holdem 3h9sAhAsJs 4d6h8c7c 2s6d2c3c 9d2h5d8d Ac5c5sJc 9cKhQdTs"));
  }

  @Test
  public void test_omaha_holdem_5030_6c6h9cQcTh_Jd5dTs9s_3c3d8s5s_Jc4d2sQs_Kh9hQd7s() {
    assertEquals(
      "3c3d8s5s Jd5dTs9s Jc4d2sQs Kh9hQd7s",
      Solver.process("omaha-holdem 6c6h9cQcTh Jd5dTs9s 3c3d8s5s Jc4d2sQs Kh9hQd7s"));
  }

  @Test
  public void test_omaha_holdem_5031_2c2h4d5sKd_6sJsKhTc_Ts2dAs7h() {
    assertEquals(
      "6sJsKhTc Ts2dAs7h",
      Solver.process("omaha-holdem 2c2h4d5sKd 6sJsKhTc Ts2dAs7h"));
  }

  @Test
  public void test_omaha_holdem_5032_2d4sAcAsTd_Qs8s7s3c_JcKh6c3s_Jd9h8h5d() {
    assertEquals(
      "Jd9h8h5d Qs8s7s3c JcKh6c3s",
      Solver.process("omaha-holdem 2d4sAcAsTd Qs8s7s3c JcKh6c3s Jd9h8h5d"));
  }

  @Test
  public void test_omaha_holdem_5033_2c4s6s7dTh_9sQsAs6c_TcJd8d8s_KhKsTs3c_3sQd5s9c_Qc4h4c6h_2s6d8h7s() {
    assertEquals(
      "9sQsAs6c TcJd8d8s KhKsTs3c 2s6d8h7s Qc4h4c6h 3sQd5s9c",
      Solver.process("omaha-holdem 2c4s6s7dTh 9sQsAs6c TcJd8d8s KhKsTs3c 3sQd5s9c Qc4h4c6h 2s6d8h7s"));
  }

  @Test
  public void test_omaha_holdem_5034_3h4d9dKdKs_QcTcJc4c_7h2h5c9h_5d2c9c3d_Qh4h9sTh_8c7c2d8s() {
    assertEquals(
      "QcTcJc4c 8c7c2d8s 7h2h5c9h Qh4h9sTh 5d2c9c3d",
      Solver.process("omaha-holdem 3h4d9dKdKs QcTcJc4c 7h2h5c9h 5d2c9c3d Qh4h9sTh 8c7c2d8s"));
  }

  @Test
  public void test_omaha_holdem_5035_6c7d7s9hQh_6hTs2dKs_8h7cAcTd_2s4s5s7h_KhAhKc3s_Qd9s3d2c_4d5d2hAd() {
    assertEquals(
      "4d5d2hAd 6hTs2dKs Qd9s3d2c KhAhKc3s 2s4s5s7h 8h7cAcTd",
      Solver.process("omaha-holdem 6c7d7s9hQh 6hTs2dKs 8h7cAcTd 2s4s5s7h KhAhKc3s Qd9s3d2c 4d5d2hAd"));
  }

  @Test
  public void test_omaha_holdem_5036_2c3h6cQdQh_Kh5dKc3c_Ad9c2hJh() {
    assertEquals(
      "Ad9c2hJh Kh5dKc3c",
      Solver.process("omaha-holdem 2c3h6cQdQh Kh5dKc3c Ad9c2hJh"));
  }

  @Test
  public void test_omaha_holdem_5037_2h5d7sAdKh_8hQsTcTh_2c8s3s3d_4c3h9c2d_5c8dTsAs() {
    assertEquals(
      "2c8s3s3d 8hQsTcTh 5c8dTsAs 4c3h9c2d",
      Solver.process("omaha-holdem 2h5d7sAdKh 8hQsTcTh 2c8s3s3d 4c3h9c2d 5c8dTsAs"));
  }

  @Test
  public void test_omaha_holdem_5038_6hAcAhJsQs_9s3dKcAd_As2d5d9d_5sKs6dQd_5cTs3cKh_2s9c7c2h_Jd4sTc7d_7h4c3sQh_4h8s9h8h() {
    assertEquals(
      "2s9c7c2h 4h8s9h8h Jd4sTc7d 7h4c3sQh 5sKs6dQd As2d5d9d 9s3dKcAd 5cTs3cKh",
      Solver.process("omaha-holdem 6hAcAhJsQs 9s3dKcAd As2d5d9d 5sKs6dQd 5cTs3cKh 2s9c7c2h Jd4sTc7d 7h4c3sQh 4h8s9h8h"));
  }

  @Test
  public void test_omaha_holdem_5039_4h6c7hKdTh_8c2dJcTc_5d6d7c3d_4d3hQd9c_JsJh3c7s() {
    assertEquals(
      "4d3hQd9c 8c2dJcTc JsJh3c7s 5d6d7c3d",
      Solver.process("omaha-holdem 4h6c7hKdTh 8c2dJcTc 5d6d7c3d 4d3hQd9c JsJh3c7s"));
  }

  @Test
  public void test_omaha_holdem_5040_3c4h4sKsQs_7c7dAc6c_2hQdAs5c_2c7s3h9s_QhKd5h8d_3d4dJsTc_Th9h3s5d_2s6s9dKh_8s9cAh6h_8cQc4cJd() {
    assertEquals(
      "8s9cAh6h Th9h3s5d 7c7dAc6c 2hQdAs5c QhKd5h8d 2s6s9dKh 2c7s3h9s 3d4dJsTc 8cQc4cJd",
      Solver.process("omaha-holdem 3c4h4sKsQs 7c7dAc6c 2hQdAs5c 2c7s3h9s QhKd5h8d 3d4dJsTc Th9h3s5d 2s6s9dKh 8s9cAh6h 8cQc4cJd"));
  }

  @Test
  public void test_omaha_holdem_5041_4s5cAcJhTd_2s4d6s4h_7hQdTh7c_8dKhAd3d_7sAh6cJs_3sTc8c9s() {
    assertEquals(
      "3sTc8c9s 7hQdTh7c 8dKhAd3d 7sAh6cJs 2s4d6s4h",
      Solver.process("omaha-holdem 4s5cAcJhTd 2s4d6s4h 7hQdTh7c 8dKhAd3d 7sAh6cJs 3sTc8c9s"));
  }

  @Test
  public void test_omaha_holdem_5042_3d5d6s9dTd_6hQcJd6c_3c9hKs7d_Tc7h7cJc() {
    assertEquals(
      "Tc7h7cJc 3c9hKs7d 6hQcJd6c",
      Solver.process("omaha-holdem 3d5d6s9dTd 6hQcJd6c 3c9hKs7d Tc7h7cJc"));
  }

  @Test
  public void test_omaha_holdem_5043_3s7s8h9hJc_7h5s3d4h_9dKs2s9s_6dAc4cQd_Js5cQh6h_4s9cTd6c_Th7cQsQc_8s5dAsTc() {
    assertEquals(
      "6dAc4cQd 7h5s3d4h 9dKs2s9s Js5cQh6h 4s9cTd6c=8s5dAsTc Th7cQsQc",
      Solver.process("omaha-holdem 3s7s8h9hJc 7h5s3d4h 9dKs2s9s 6dAc4cQd Js5cQh6h 4s9cTd6c Th7cQsQc 8s5dAsTc"));
  }

  @Test
  public void test_omaha_holdem_5044_3d6d8cJdTd_9c7hJs8s_3h4c5h6c_KsAh7d5s_2c8hQh9d_6hAs7c2h_2dTcJcJh_5d3cKc8d_QcKd9s4d_Qs4s6sKh() {
    assertEquals(
      "KsAh7d5s Qs4s6sKh 6hAs7c2h 3h4c5h6c 2dTcJcJh 9c7hJs8s 2c8hQh9d 5d3cKc8d QcKd9s4d",
      Solver.process("omaha-holdem 3d6d8cJdTd 9c7hJs8s 3h4c5h6c KsAh7d5s 2c8hQh9d 6hAs7c2h 2dTcJcJh 5d3cKc8d QcKd9s4d Qs4s6sKh"));
  }

  @Test
  public void test_omaha_holdem_5045_6h8h9sQcTd_2sTs2c7h_QdJh3cKh() {
    assertEquals(
      "2sTs2c7h QdJh3cKh",
      Solver.process("omaha-holdem 6h8h9sQcTd 2sTs2c7h QdJh3cKh"));
  }

  @Test
  public void test_omaha_holdem_5046_4d4h6s9cKh_QcKs4c7h_Jc2h8s4s_JhTd7sQd_Qs5c6dQh_5sTc3s2d() {
    assertEquals(
      "5sTc3s2d JhTd7sQd Qs5c6dQh Jc2h8s4s QcKs4c7h",
      Solver.process("omaha-holdem 4d4h6s9cKh QcKs4c7h Jc2h8s4s JhTd7sQd Qs5c6dQh 5sTc3s2d"));
  }

  @Test
  public void test_omaha_holdem_5047_3h6cAsKdTc_6h2dAh4d_9dAc5d2h_8d8sQh8c_JsJdQsKh_8h7s6sJh_4s4c6d4h() {
    assertEquals(
      "4s4c6d4h 8h7s6sJh 8d8sQh8c 9dAc5d2h 6h2dAh4d JsJdQsKh",
      Solver.process("omaha-holdem 3h6cAsKdTc 6h2dAh4d 9dAc5d2h 8d8sQh8c JsJdQsKh 8h7s6sJh 4s4c6d4h"));
  }

  @Test
  public void test_omaha_holdem_5048_2c9cKsThTs_Ad5s3c7d_3d5d5cQc_JdKhQs9h_Kd8d9d4h_8c3sTc4s() {
    assertEquals(
      "Ad5s3c7d 3d5d5cQc Kd8d9d4h 8c3sTc4s JdKhQs9h",
      Solver.process("omaha-holdem 2c9cKsThTs Ad5s3c7d 3d5d5cQc JdKhQs9h Kd8d9d4h 8c3sTc4s"));
  }

  @Test
  public void test_omaha_holdem_5049_5d5s7h9cAc_3h2h7cKc_Kd4c5h4d_3s5cQc4s() {
    assertEquals(
      "3h2h7cKc 3s5cQc4s Kd4c5h4d",
      Solver.process("omaha-holdem 5d5s7h9cAc 3h2h7cKc Kd4c5h4d 3s5cQc4s"));
  }

  @Test
  public void test_omaha_holdem_5050_2h3c3s5hAd_6h7dTc9s_QcTh8c6c_Ts9h9c4s_Qd4c3d2c_8sAhKhKd() {
    assertEquals(
      "6h7dTc9s QcTh8c6c Ts9h9c4s 8sAhKhKd Qd4c3d2c",
      Solver.process("omaha-holdem 2h3c3s5hAd 6h7dTc9s QcTh8c6c Ts9h9c4s Qd4c3d2c 8sAhKhKd"));
  }

  @Test
  public void test_omaha_holdem_5051_4d4s5c5hAc_2cJhAs7s_KcQcQsQh() {
    assertEquals(
      "KcQcQsQh 2cJhAs7s",
      Solver.process("omaha-holdem 4d4s5c5hAc 2cJhAs7s KcQcQsQh"));
  }

  @Test
  public void test_omaha_holdem_5052_5c5h7c7hKd_5dThAd9h_Jd6hKsQc_2hQs6c8h_3d4cJh9c_Qd3hAhKh_Tc8s2d9s_4d4h7d2c_4s2sAc3s_Ts6s8c7s() {
    assertEquals(
      "Tc8s2d9s 3d4cJh9c 2hQs6c8h 4s2sAc3s Jd6hKsQc Qd3hAhKh 5dThAd9h 4d4h7d2c Ts6s8c7s",
      Solver.process("omaha-holdem 5c5h7c7hKd 5dThAd9h Jd6hKsQc 2hQs6c8h 3d4cJh9c Qd3hAhKh Tc8s2d9s 4d4h7d2c 4s2sAc3s Ts6s8c7s"));
  }

  @Test
  public void test_omaha_holdem_5053_4h5d6d7d8d_QcAcTc3c_Jc3s2hKh_Kc3dTd8c_Qd4cKdQs_9h8hAd3h_5h4d5s8s_7s5cTs6h_Ks7c4s2c_9c9s6sJs() {
    assertEquals(
      "QcAcTc3c Jc3s2hKh 5h4d5s8s=7s5cTs6h=Ks7c4s2c 9c9s6sJs=9h8hAd3h Kc3dTd8c Qd4cKdQs",
      Solver.process("omaha-holdem 4h5d6d7d8d QcAcTc3c Jc3s2hKh Kc3dTd8c Qd4cKdQs 9h8hAd3h 5h4d5s8s 7s5cTs6h Ks7c4s2c 9c9s6sJs"));
  }

  @Test
  public void test_omaha_holdem_5054_3d5dAhKcTc_4sKh8c9h_Ts7c2sQh_QdKs4h6h_2hAc5c9c_2d4cQcAs_3s6c9dJc_8s9s5h8h_Jh8d3h7h_7s7d6s3c() {
    assertEquals(
      "3s6c9dJc=Jh8d3h7h 7s7d6s3c 8s9s5h8h Ts7c2sQh 4sKh8c9h QdKs4h6h 2hAc5c9c 2d4cQcAs",
      Solver.process("omaha-holdem 3d5dAhKcTc 4sKh8c9h Ts7c2sQh QdKs4h6h 2hAc5c9c 2d4cQcAs 3s6c9dJc 8s9s5h8h Jh8d3h7h 7s7d6s3c"));
  }

  @Test
  public void test_omaha_holdem_5055_AcAsJdTcTd_8h9dQd8c_5c2hKhQh_9sJh7d3c_8sJs4c2c_6hKd5s3s() {
    assertEquals(
      "6hKd5s3s 8h9dQd8c 8sJs4c2c 9sJh7d3c 5c2hKhQh",
      Solver.process("omaha-holdem AcAsJdTcTd 8h9dQd8c 5c2hKhQh 9sJh7d3c 8sJs4c2c 6hKd5s3s"));
  }

  @Test
  public void test_omaha_holdem_5056_3c4h5s7d7s_3dJsTc8d_Kc9cTdQc_8sQhKhQd_3h2s6dJh_AcAdJd2d_Jc6cTs6s_4d9d8c4c_7h5c3sAs() {
    assertEquals(
      "Kc9cTdQc 3dJsTc8d Jc6cTs6s 8sQhKhQd AcAdJd2d 3h2s6dJh 4d9d8c4c 7h5c3sAs",
      Solver.process("omaha-holdem 3c4h5s7d7s 3dJsTc8d Kc9cTdQc 8sQhKhQd 3h2s6dJh AcAdJd2d Jc6cTs6s 4d9d8c4c 7h5c3sAs"));
  }

  @Test
  public void test_omaha_holdem_5057_7sJhKdKhTc_3h8c4c9d_Ac3d4s8d_7h9c3sQd() {
    assertEquals(
      "Ac3d4s8d 3h8c4c9d 7h9c3sQd",
      Solver.process("omaha-holdem 7sJhKdKhTc 3h8c4c9d Ac3d4s8d 7h9c3sQd"));
  }

  @Test
  public void test_omaha_holdem_5058_3c5d9c9sQc_6dKs7sAc_4c4h6hJd_7h6cJcQh_JhJs8h4s_3d6s4d2d_Ad7dKcQs_5cQdAsKd_8c9dTcTd() {
    assertEquals(
      "6dKs7sAc 3d6s4d2d 4c4h6hJd JhJs8h4s 5cQdAsKd=Ad7dKcQs 8c9dTcTd 7h6cJcQh",
      Solver.process("omaha-holdem 3c5d9c9sQc 6dKs7sAc 4c4h6hJd 7h6cJcQh JhJs8h4s 3d6s4d2d Ad7dKcQs 5cQdAsKd 8c9dTcTd"));
  }

  @Test
  public void test_omaha_holdem_5059_2c4h5cQcQh_3d3c4dTh_3h2d3s9d_AcKsJc7c_5s5d9hQd_Td6d7h5h_JhKcTs8s_8d2sKd9c() {
    assertEquals(
      "JhKcTs8s 8d2sKd9c 3h2d3s9d 3d3c4dTh Td6d7h5h AcKsJc7c 5s5d9hQd",
      Solver.process("omaha-holdem 2c4h5cQcQh 3d3c4dTh 3h2d3s9d AcKsJc7c 5s5d9hQd Td6d7h5h JhKcTs8s 8d2sKd9c"));
  }

  @Test
  public void test_omaha_holdem_5060_2h3d7dKdTh_JdJc8h2s_6sAd7h6d_5dAhJhQs_5h6h4d6c_5s9h3s9s_Ac4cQhQc() {
    assertEquals(
      "5dAhJhQs 5h6h4d6c 5s9h3s9s JdJc8h2s Ac4cQhQc 6sAd7h6d",
      Solver.process("omaha-holdem 2h3d7dKdTh JdJc8h2s 6sAd7h6d 5dAhJhQs 5h6h4d6c 5s9h3s9s Ac4cQhQc"));
  }

  @Test
  public void test_omaha_holdem_5061_9d9hJsKsTs_2cAcQd2s_AsKh5c4h_Qh2dJh4s_7h3c5hQc_7d4dKd9s_JcAh5d9c() {
    assertEquals(
      "7h3c5hQc AsKh5c4h Qh2dJh4s 2cAcQd2s JcAh5d9c 7d4dKd9s",
      Solver.process("omaha-holdem 9d9hJsKsTs 2cAcQd2s AsKh5c4h Qh2dJh4s 7h3c5hQc 7d4dKd9s JcAh5d9c"));
  }

  @Test
  public void test_omaha_holdem_5062_2d7h9dQcTc_4s3d4cJs_7s5cJhAc_8cKh2h6d_2cJcQhTh() {
    assertEquals(
      "4s3d4cJs 7s5cJhAc 2cJcQhTh 8cKh2h6d",
      Solver.process("omaha-holdem 2d7h9dQcTc 4s3d4cJs 7s5cJhAc 8cKh2h6d 2cJcQhTh"));
  }

  @Test
  public void test_omaha_holdem_5063_3h9c9sJsKs_8cQs6dKh_Td9d3s6s_9h5h4sJh_4h2hTs3c_2s6h6cAh_Qc7c5d7h_Th5cJd4d_Kd5s4c2c_KcQdQh8d() {
    assertEquals(
      "4h2hTs3c 2s6h6cAh Qc7c5d7h Th5cJd4d Kd5s4c2c 8cQs6dKh=KcQdQh8d Td9d3s6s 9h5h4sJh",
      Solver.process("omaha-holdem 3h9c9sJsKs 8cQs6dKh Td9d3s6s 9h5h4sJh 4h2hTs3c 2s6h6cAh Qc7c5d7h Th5cJd4d Kd5s4c2c KcQdQh8d"));
  }

  @Test
  public void test_omaha_holdem_5064_2c2d5cAdTh_8s3sKh7h_6h7sQhTc_Ac8d8c7c_TsKs5sQs() {
    assertEquals(
      "8s3sKh7h 6h7sQhTc TsKs5sQs Ac8d8c7c",
      Solver.process("omaha-holdem 2c2d5cAdTh 8s3sKh7h 6h7sQhTc Ac8d8c7c TsKs5sQs"));
  }

  @Test
  public void test_omaha_holdem_5065_4d6c9sAhQc_3dJh3sQd_2s8dKs8h_4s5sQh6h_5h5d6sAs() {
    assertEquals(
      "2s8dKs8h 3dJh3sQd 4s5sQh6h 5h5d6sAs",
      Solver.process("omaha-holdem 4d6c9sAhQc 3dJh3sQd 2s8dKs8h 4s5sQh6h 5h5d6sAs"));
  }

  @Test
  public void test_omaha_holdem_5066_AdJcJdQdTd_7s8d5sQh_6d9dThJs_2d4h5dKs_6s3h3s9s_Kh8c8hAh_JhKc2h9c_Kd6c7d5h_Qs4dQc2s_AcTc9hTs() {
    assertEquals(
      "6s3h3s9s 7s8d5sQh JhKc2h9c=Kh8c8hAh 2d4h5dKs Kd6c7d5h AcTc9hTs 6d9dThJs Qs4dQc2s",
      Solver.process("omaha-holdem AdJcJdQdTd 7s8d5sQh 6d9dThJs 2d4h5dKs 6s3h3s9s Kh8c8hAh JhKc2h9c Kd6c7d5h Qs4dQc2s AcTc9hTs"));
  }

  @Test
  public void test_omaha_holdem_5067_2d5d6c8h9s_3d4c4s3c_TdKcJdKd_Qc3hJc7d() {
    assertEquals(
      "Qc3hJc7d TdKcJdKd 3d4c4s3c",
      Solver.process("omaha-holdem 2d5d6c8h9s 3d4c4s3c TdKcJdKd Qc3hJc7d"));
  }

  @Test
  public void test_omaha_holdem_5068_5h8h8s9sJc_4cTsJsTd_AhQcQsTc_4h2dQh6s_6c8c2hJh() {
    assertEquals(
      "4h2dQh6s 4cTsJsTd AhQcQsTc 6c8c2hJh",
      Solver.process("omaha-holdem 5h8h8s9sJc 4cTsJsTd AhQcQsTc 4h2dQh6s 6c8c2hJh"));
  }

  @Test
  public void test_omaha_holdem_5069_8c9dAsJsQc_9sJc2c3s_AcTh2d7s() {
    assertEquals(
      "9sJc2c3s AcTh2d7s",
      Solver.process("omaha-holdem 8c9dAsJsQc 9sJc2c3s AcTh2d7s"));
  }

  @Test
  public void test_omaha_holdem_5070_3c4s5dJdKd_8s8d9dQh_Kc8c9s3s_7hThAsTs_9cKh7d5h_4d7c4hJs_6sKsTd6h_2s9hQc3d_TcJc6dAc() {
    assertEquals(
      "2s9hQc3d 7hThAsTs TcJc6dAc 6sKsTd6h Kc8c9s3s 9cKh7d5h 4d7c4hJs 8s8d9dQh",
      Solver.process("omaha-holdem 3c4s5dJdKd 8s8d9dQh Kc8c9s3s 7hThAsTs 9cKh7d5h 4d7c4hJs 6sKsTd6h 2s9hQc3d TcJc6dAc"));
  }

  @Test
  public void test_omaha_holdem_5071_5cJsKdQdTd_7c6c8dTs_9h5s4hQc_Kc9d2d8h_8c6hTh3c_Ah5hAc3d_Kh3sJcKs() {
    assertEquals(
      "7c6c8dTs=8c6hTh3c Ah5hAc3d Kh3sJcKs 9h5s4hQc Kc9d2d8h",
      Solver.process("omaha-holdem 5cJsKdQdTd 7c6c8dTs 9h5s4hQc Kc9d2d8h 8c6hTh3c Ah5hAc3d Kh3sJcKs"));
  }

  @Test
  public void test_omaha_holdem_5072_6h7c7h8cKc_4cTd8dJd_9c5sAs6s_3s3d7sAc_KhJcQd5c_9h7d4d2d() {
    assertEquals(
      "4cTd8dJd 9h7d4d2d 3s3d7sAc 9c5sAs6s KhJcQd5c",
      Solver.process("omaha-holdem 6h7c7h8cKc 4cTd8dJd 9c5sAs6s 3s3d7sAc KhJcQd5c 9h7d4d2d"));
  }

  @Test
  public void test_omaha_holdem_5073_5c9dAcJdQd_5hJhAs4d_8d7c2cQs_Qc2s8sJs() {
    assertEquals(
      "8d7c2cQs Qc2s8sJs 5hJhAs4d",
      Solver.process("omaha-holdem 5c9dAcJdQd 5hJhAs4d 8d7c2cQs Qc2s8sJs"));
  }

  @Test
  public void test_omaha_holdem_5074_2c6s7c9d9h_TdKdQd8h_4d5cKh6d_KsQsQhTs_8c3h9c7d_8d2hAh2d_6cTh3dJd_5h4c7s5d_4h3sJh5s_6h8s7h2s() {
    assertEquals(
      "4h3sJh5s 6cTh3dJd 4d5cKh6d 5h4c7s5d 6h8s7h2s KsQsQhTs TdKdQd8h 8d2hAh2d 8c3h9c7d",
      Solver.process("omaha-holdem 2c6s7c9d9h TdKdQd8h 4d5cKh6d KsQsQhTs 8c3h9c7d 8d2hAh2d 6cTh3dJd 5h4c7s5d 4h3sJh5s 6h8s7h2s"));
  }

  @Test
  public void test_omaha_holdem_5075_5h9cJsKsTd_2s8hAdTc_Jd4s3h2h_6h6sTs9h_Th4h6c5s() {
    assertEquals(
      "2s8hAdTc Jd4s3h2h Th4h6c5s 6h6sTs9h",
      Solver.process("omaha-holdem 5h9cJsKsTd 2s8hAdTc Jd4s3h2h 6h6sTs9h Th4h6c5s"));
  }

  @Test
  public void test_omaha_holdem_5076_6d7c8hKdQc_TcTd7h3h_9dAs2d9s_7d6c7sJh_Qd9cJcQs_5d4hTh2c() {
    assertEquals(
      "9dAs2d9s TcTd7h3h 7d6c7sJh Qd9cJcQs 5d4hTh2c",
      Solver.process("omaha-holdem 6d7c8hKdQc TcTd7h3h 9dAs2d9s 7d6c7sJh Qd9cJcQs 5d4hTh2c"));
  }

  @Test
  public void test_omaha_holdem_5077_3h5d7d8cQc_Td4h4s2c_Jc2hAd5c_9d6c6hQh_Ah8h6sTc_QdJhAs9s_KhQsKc3d_Th4c6d2d_3s2s7h9c() {
    assertEquals(
      "Td4h4s2c Jc2hAd5c Ah8h6sTc QdJhAs9s 3s2s7h9c KhQsKc3d Th4c6d2d 9d6c6hQh",
      Solver.process("omaha-holdem 3h5d7d8cQc Td4h4s2c Jc2hAd5c 9d6c6hQh Ah8h6sTc QdJhAs9s KhQsKc3d Th4c6d2d 3s2s7h9c"));
  }

  @Test
  public void test_omaha_holdem_5078_4c4h6d9hTc_7h3cAc3s_TdQcAd6h() {
    assertEquals(
      "7h3cAc3s TdQcAd6h",
      Solver.process("omaha-holdem 4c4h6d9hTc 7h3cAc3s TdQcAd6h"));
  }

  @Test
  public void test_omaha_holdem_5079_2c4h5c6cTd_QsKs5hJd_2d2h3sTc_KcQh2s4s_8h7h4d8d_As4c6h5d_3c9cAdTh() {
    assertEquals(
      "QsKs5hJd KcQh2s4s As4c6h5d 2d2h3sTc 8h7h4d8d 3c9cAdTh",
      Solver.process("omaha-holdem 2c4h5c6cTd QsKs5hJd 2d2h3sTc KcQh2s4s 8h7h4d8d As4c6h5d 3c9cAdTh"));
  }

  @Test
  public void test_omaha_holdem_5080_2d8s9sKhQd_6d7s2c4s_6sQhTd5s_Ks6h8dJh_9dJc7cJs_9h4h6cAd_2sTsAc9c() {
    assertEquals(
      "6d7s2c4s 9h4h6cAd 9dJc7cJs 6sQhTd5s 2sTsAc9c Ks6h8dJh",
      Solver.process("omaha-holdem 2d8s9sKhQd 6d7s2c4s 6sQhTd5s Ks6h8dJh 9dJc7cJs 9h4h6cAd 2sTsAc9c"));
  }

  @Test
  public void test_omaha_holdem_5081_3d5s7dAdKh_8sKs2s3c_8cAcQd5d_KdJs5cTd_5h7sJd6h_4d6dQh2c_7c6s9c9d_AsAhJc2h_4h4sQs8h() {
    assertEquals(
      "4h4sQs8h 7c6s9c9d 5h7sJd6h 8sKs2s3c AsAhJc2h 4d6dQh2c 8cAcQd5d KdJs5cTd",
      Solver.process("omaha-holdem 3d5s7dAdKh 8sKs2s3c 8cAcQd5d KdJs5cTd 5h7sJd6h 4d6dQh2c 7c6s9c9d AsAhJc2h 4h4sQs8h"));
  }

  @Test
  public void test_omaha_holdem_5082_3s4h5d6sAh_7h8dTcJh_7dQs5h2d_TsQcAc3d_Kc9c2s7s_2h4sJs8s_5sJdTd3h_Jc4d6cKs_Th8c9s2c_5c7c6d9d() {
    assertEquals(
      "Th8c9s2c Kc9c2s7s 5sJdTd3h Jc4d6cKs TsQcAc3d 2h4sJs8s 5c7c6d9d=7dQs5h2d 7h8dTcJh",
      Solver.process("omaha-holdem 3s4h5d6sAh 7h8dTcJh 7dQs5h2d TsQcAc3d Kc9c2s7s 2h4sJs8s 5sJdTd3h Jc4d6cKs Th8c9s2c 5c7c6d9d"));
  }

  @Test
  public void test_omaha_holdem_5083_5h5sAsJhQs_Jc7cTsKc_5d3cTh4h_KdKs8h4s_2hTd4dTc_8c6c9s2s_4c3d2c6s_Qc6h6dAh_3hQh8d2d_AdJd7dQd() {
    assertEquals(
      "4c3d2c6s 2hTd4dTc 3hQh8d2d AdJd7dQd=Qc6h6dAh 5d3cTh4h Jc7cTsKc 8c6c9s2s KdKs8h4s",
      Solver.process("omaha-holdem 5h5sAsJhQs Jc7cTsKc 5d3cTh4h KdKs8h4s 2hTd4dTc 8c6c9s2s 4c3d2c6s Qc6h6dAh 3hQh8d2d AdJd7dQd"));
  }

  @Test
  public void test_omaha_holdem_5084_3d7d8dJhQh_AcJsTd9h_Ks5c4s2d_2sTc3sTh_6h5sAs3h() {
    assertEquals(
      "Ks5c4s2d 6h5sAs3h 2sTc3sTh AcJsTd9h",
      Solver.process("omaha-holdem 3d7d8dJhQh AcJsTd9h Ks5c4s2d 2sTc3sTh 6h5sAs3h"));
  }

  @Test
  public void test_omaha_holdem_5085_2d3c5c6dTd_Jc9d4hKs_3dKd3s8h_TcJh9hKh_8dQh7sJd() {
    assertEquals(
      "Jc9d4hKs TcJh9hKh 8dQh7sJd 3dKd3s8h",
      Solver.process("omaha-holdem 2d3c5c6dTd Jc9d4hKs 3dKd3s8h TcJh9hKh 8dQh7sJd"));
  }

  @Test
  public void test_omaha_holdem_5086_3s7s9hKcTd_Kh5c6d3h_AhQd2s8s_9c5h6s2d_Tc4s5sTs_Qh4dKsQc_8hAd2h8d_Qs8cKd6c() {
    assertEquals(
      "AhQd2s8s 8hAd2h8d 9c5h6s2d Qh4dKsQc Kh5c6d3h Tc4s5sTs Qs8cKd6c",
      Solver.process("omaha-holdem 3s7s9hKcTd Kh5c6d3h AhQd2s8s 9c5h6s2d Tc4s5sTs Qh4dKsQc 8hAd2h8d Qs8cKd6c"));
  }

  @Test
  public void test_omaha_holdem_5087_2h5s8sKdQd_8h6c8d7h_3hTd9sJc_6d7sJh3s() {
    assertEquals(
      "6d7sJh3s 3hTd9sJc 8h6c8d7h",
      Solver.process("omaha-holdem 2h5s8sKdQd 8h6c8d7h 3hTd9sJc 6d7sJh3s"));
  }

  @Test
  public void test_omaha_holdem_5088_2d3d5hTcTh_KdQs9c8c_4d2cQdAs_3h6cJh4c_5s5dQh6h_4s6sKhKs_AcQc7dJd() {
    assertEquals(
      "KdQs9c8c AcQc7dJd 4d2cQdAs 3h6cJh4c=4s6sKhKs 5s5dQh6h",
      Solver.process("omaha-holdem 2d3d5hTcTh KdQs9c8c 4d2cQdAs 3h6cJh4c 5s5dQh6h 4s6sKhKs AcQc7dJd"));
  }

  @Test
  public void test_omaha_holdem_5089_2d5cAdJcQd_4h3sAc9d_8c6h2cKs_7sTs7h6d_4c6sAh2h_KdJh4d3d() {
    assertEquals(
      "8c6h2cKs 7sTs7h6d 4c6sAh2h 4h3sAc9d KdJh4d3d",
      Solver.process("omaha-holdem 2d5cAdJcQd 4h3sAc9d 8c6h2cKs 7sTs7h6d 4c6sAh2h KdJh4d3d"));
  }

  @Test
  public void test_omaha_holdem_5090_4s5s8h9dQs_7s8s5d6s_Kc8d3dKs_Qd4h9h9c_Ah7c6h5h_6c3hKd7d_Qc2d2s4d() {
    assertEquals(
      "Kc8d3dKs Qc2d2s4d Qd4h9h9c 6c3hKd7d=Ah7c6h5h 7s8s5d6s",
      Solver.process("omaha-holdem 4s5s8h9dQs 7s8s5d6s Kc8d3dKs Qd4h9h9c Ah7c6h5h 6c3hKd7d Qc2d2s4d"));
  }

  @Test
  public void test_omaha_holdem_5091_4h5h8cAdQh_6cJhAc5d_9cAs7dQd_4dTs9hQs() {
    assertEquals(
      "4dTs9hQs 6cJhAc5d 9cAs7dQd",
      Solver.process("omaha-holdem 4h5h8cAdQh 6cJhAc5d 9cAs7dQd 4dTs9hQs"));
  }

  @Test
  public void test_omaha_holdem_5092_2c3s4hJhKh_6dTh4d2s_7hTc3dQc_9d9sKd5h_6c6s8dQd() {
    assertEquals(
      "7hTc3dQc 6c6s8dQd 9d9sKd5h 6dTh4d2s",
      Solver.process("omaha-holdem 2c3s4hJhKh 6dTh4d2s 7hTc3dQc 9d9sKd5h 6c6s8dQd"));
  }

  @Test
  public void test_omaha_holdem_5093_4d6cKhQcTh_8d2dKsQh_TdAcTs3d_Kc2h4s7h_4h6sKdQs_7s5d3sJh_5h4c5c6h_Tc7d3h5s() {
    assertEquals(
      "7s5d3sJh Tc7d3h5s 5h4c5c6h Kc2h4s7h 4h6sKdQs=8d2dKsQh TdAcTs3d",
      Solver.process("omaha-holdem 4d6cKhQcTh 8d2dKsQh TdAcTs3d Kc2h4s7h 4h6sKdQs 7s5d3sJh 5h4c5c6h Tc7d3h5s"));
  }

  @Test
  public void test_omaha_holdem_5094_3hKdKsQcTs_2dQs9dAd_Qd3cTdTh_As8c6sAh() {
    assertEquals(
      "2dQs9dAd As8c6sAh Qd3cTdTh",
      Solver.process("omaha-holdem 3hKdKsQcTs 2dQs9dAd Qd3cTdTh As8c6sAh"));
  }

  @Test
  public void test_omaha_holdem_5095_5h7d9sJcKs_7sKd5cKh_6dQhTcQc_5s3d8hAh_8d3c3h2d_AdQs9c7h_JdAs2c3s() {
    assertEquals(
      "8d3c3h2d 5s3d8hAh JdAs2c3s AdQs9c7h 7sKd5cKh 6dQhTcQc",
      Solver.process("omaha-holdem 5h7d9sJcKs 7sKd5cKh 6dQhTcQc 5s3d8hAh 8d3c3h2d AdQs9c7h JdAs2c3s"));
  }

  @Test
  public void test_omaha_holdem_5096_5dJcQhQsTd_3h9d4sJh_5s2hAdAc_9h6cKc9s_4hKs8dAs_Kh9c7c4d_4c6d6hQc() {
    assertEquals(
      "3h9d4sJh 5s2hAdAc 4c6d6hQc 9h6cKc9s=Kh9c7c4d 4hKs8dAs",
      Solver.process("omaha-holdem 5dJcQhQsTd 3h9d4sJh 5s2hAdAc 9h6cKc9s 4hKs8dAs Kh9c7c4d 4c6d6hQc"));
  }

  @Test
  public void test_omaha_holdem_5097_6s7hJdKcKh_QdQc9s7c_4sTc2c5h_9dAs7s6h_Ks8d9c8c() {
    assertEquals(
      "4sTc2c5h 9dAs7s6h QdQc9s7c Ks8d9c8c",
      Solver.process("omaha-holdem 6s7hJdKcKh QdQc9s7c 4sTc2c5h 9dAs7s6h Ks8d9c8c"));
  }

  @Test
  public void test_omaha_holdem_5098_7d9hKcKsTd_Ad5h9sJc_6s3hQdQh_3cKh4s6d_ThJd6h5d() {
    assertEquals(
      "Ad5h9sJc ThJd6h5d 6s3hQdQh 3cKh4s6d",
      Solver.process("omaha-holdem 7d9hKcKsTd Ad5h9sJc 6s3hQdQh 3cKh4s6d ThJd6h5d"));
  }

  @Test
  public void test_omaha_holdem_5099_3d5h7h9sQs_4s2c3h6d_8hAs9h8s() {
    assertEquals(
      "8hAs9h8s 4s2c3h6d",
      Solver.process("omaha-holdem 3d5h7h9sQs 4s2c3h6d 8hAs9h8s"));
  }

  @Test
  public void test_omaha_holdem_5100_8c8sKsQcQs_Js2sKd2d_3s6d3h9d_Ts8h4dTc() {
    assertEquals(
      "3s6d3h9d Ts8h4dTc Js2sKd2d",
      Solver.process("omaha-holdem 8c8sKsQcQs Js2sKd2d 3s6d3h9d Ts8h4dTc"));
  }

  @Test
  public void test_omaha_holdem_5101_3h4d4sAhJd_Th8d8s3s_Kh2s5s9s() {
    assertEquals(
      "Th8d8s3s Kh2s5s9s",
      Solver.process("omaha-holdem 3h4d4sAhJd Th8d8s3s Kh2s5s9s"));
  }

  @Test
  public void test_omaha_holdem_5102_3h6h7h9hTh_KcJs2h4s_TdTs8sKs_3s9c4c6d_4dAhKdJd_5s5d9d7d_8d6cQd5c_QsAcJh5h_AsKh3cJc_6sTc8h3d() {
    assertEquals(
      "KcJs2h4s 4dAhKdJd AsKh3cJc 3s9c4c6d 5s5d9d7d 6sTc8h3d=8d6cQd5c=TdTs8sKs QsAcJh5h",
      Solver.process("omaha-holdem 3h6h7h9hTh KcJs2h4s TdTs8sKs 3s9c4c6d 4dAhKdJd 5s5d9d7d 8d6cQd5c QsAcJh5h AsKh3cJc 6sTc8h3d"));
  }

  @Test
  public void test_omaha_holdem_5103_5h6s8sJhKs_3c8c7hJd_9hKh4s9s_4h5s7dTh_3sTc4dAd_JsTs7c2c_6d8dQd6h_QsAs5dKd_2dQc7s9c_AcKc2sJc() {
    assertEquals(
      "3sTc4dAd 3c8c7hJd AcKc2sJc 6d8dQd6h 4h5s7dTh 2dQc7s9c 9hKh4s9s JsTs7c2c QsAs5dKd",
      Solver.process("omaha-holdem 5h6s8sJhKs 3c8c7hJd 9hKh4s9s 4h5s7dTh 3sTc4dAd JsTs7c2c 6d8dQd6h QsAs5dKd 2dQc7s9c AcKc2sJc"));
  }

  @Test
  public void test_omaha_holdem_5104_2s3dKsQcTc_7c8cJsQs_6c8sAs3s_8d7sAdKd_5h4hAhKh_4c3h9dTd() {
    assertEquals(
      "6c8sAs3s 7c8cJsQs 5h4hAhKh=8d7sAdKd 4c3h9dTd",
      Solver.process("omaha-holdem 2s3dKsQcTc 7c8cJsQs 6c8sAs3s 8d7sAdKd 5h4hAhKh 4c3h9dTd"));
  }

  @Test
  public void test_omaha_holdem_5105_3s7c9cAcKh_6h4d7sJh_3h6d5s2c_Th8cQs3c_9s4sQcJs_4h2s8dJd_4c2hTcTd_Qd6s7h2d_9d5c8sJc() {
    assertEquals(
      "4h2s8dJd 3h6d5s2c 6h4d7sJh Qd6s7h2d 9s4sQcJs Th8cQs3c 4c2hTcTd 9d5c8sJc",
      Solver.process("omaha-holdem 3s7c9cAcKh 6h4d7sJh 3h6d5s2c Th8cQs3c 9s4sQcJs 4h2s8dJd 4c2hTcTd Qd6s7h2d 9d5c8sJc"));
  }

  @Test
  public void test_omaha_holdem_5106_3hAhKcQsTs_6d2s5h7d_2c4s6c6s_9sJh4dQc_6h3cQh5c_KhTcJd7c_3sTd2h9h() {
    assertEquals(
      "6d2s5h7d 2c4s6c6s 3sTd2h9h 6h3cQh5c 9sJh4dQc=KhTcJd7c",
      Solver.process("omaha-holdem 3hAhKcQsTs 6d2s5h7d 2c4s6c6s 9sJh4dQc 6h3cQh5c KhTcJd7c 3sTd2h9h"));
  }

  @Test
  public void test_omaha_holdem_5107_4d6c7h8dAc_5hTd7dTs_Jd3c4c8h_3dKs7c6h_9sTh9c4h_2cKc5dAh_3h3s6sTc_JcQhKhAs_JhKdJs2s() {
    assertEquals(
      "3h3s6sTc JhKdJs2s 2cKc5dAh=JcQhKhAs 3dKs7c6h Jd3c4c8h 5hTd7dTs 9sTh9c4h",
      Solver.process("omaha-holdem 4d6c7h8dAc 5hTd7dTs Jd3c4c8h 3dKs7c6h 9sTh9c4h 2cKc5dAh 3h3s6sTc JcQhKhAs JhKdJs2s"));
  }

  @Test
  public void test_omaha_holdem_5108_6c9sAdKdQd_3c7s3hJs_9cQh2hTd_8d9d8h7d_6dTh3d4h_Tc2dKh3s_JdAc4c5d_4s6hQcJh() {
    assertEquals(
      "3c7s3hJs Tc2dKh3s 4s6hQcJh 9cQh2hTd 6dTh3d4h 8d9d8h7d JdAc4c5d",
      Solver.process("omaha-holdem 6c9sAdKdQd 3c7s3hJs 9cQh2hTd 8d9d8h7d 6dTh3d4h Tc2dKh3s JdAc4c5d 4s6hQcJh"));
  }

  @Test
  public void test_omaha_holdem_5109_2c2h6h8h9c_9h8sTdJc_Jh3d5cQs_Js7c3hTh_6dQd4s9s_Qc2dQhAh_KsKc5h3s_4c6sAd7h_7dKh2s8d_As5s5d8c() {
    assertEquals(
      "Jh3d5cQs 4c6sAd7h As5s5d8c 6dQd4s9s 9h8sTdJc KsKc5h3s Js7c3hTh Qc2dQhAh 7dKh2s8d",
      Solver.process("omaha-holdem 2c2h6h8h9c 9h8sTdJc Jh3d5cQs Js7c3hTh 6dQd4s9s Qc2dQhAh KsKc5h3s 4c6sAd7h 7dKh2s8d As5s5d8c"));
  }

  @Test
  public void test_omaha_holdem_5110_4c8d8sJhQh_9cAh9h5d_5h5sKcQd_TsTc6d6s_Js2d7h9d_4h3d3c6c_JcQc2c7s_7cTh2h5c() {
    assertEquals(
      "7cTh2h5c 4h3d3c6c 9cAh9h5d TsTc6d6s Js2d7h9d 5h5sKcQd JcQc2c7s",
      Solver.process("omaha-holdem 4c8d8sJhQh 9cAh9h5d 5h5sKcQd TsTc6d6s Js2d7h9d 4h3d3c6c JcQc2c7s 7cTh2h5c"));
  }

  @Test
  public void test_omaha_holdem_5111_3h5s8s9dJd_8dTsKs4c_9h7cQs2c_4s5d2s3d() {
    assertEquals(
      "8dTsKs4c 9h7cQs2c 4s5d2s3d",
      Solver.process("omaha-holdem 3h5s8s9dJd 8dTsKs4c 9h7cQs2c 4s5d2s3d"));
  }

  @Test
  public void test_omaha_holdem_5112_3h5h8s9hAc_Tc7hTh6s_Qs4c5c9s() {
    assertEquals(
      "Qs4c5c9s Tc7hTh6s",
      Solver.process("omaha-holdem 3h5h8s9hAc Tc7hTh6s Qs4c5c9s"));
  }

  @Test
  public void test_omaha_holdem_5113_6cAdAsKsTc_9s3s8sJh_Ac9d4hQd_Td6s6hAh_Kd7c4d3c_Kc5d5sQh_5h8d7s2d_2h9c6d5c_ThQs9hKh() {
    assertEquals(
      "5h8d7s2d 9s3s8sJh 2h9c6d5c Kd7c4d3c Kc5d5sQh=ThQs9hKh Ac9d4hQd Td6s6hAh",
      Solver.process("omaha-holdem 6cAdAsKsTc 9s3s8sJh Ac9d4hQd Td6s6hAh Kd7c4d3c Kc5d5sQh 5h8d7s2d 2h9c6d5c ThQs9hKh"));
  }

  @Test
  public void test_omaha_holdem_5114_4h8d9sQcQh_As3c2s7d_7cJc8h6c() {
    assertEquals(
      "As3c2s7d 7cJc8h6c",
      Solver.process("omaha-holdem 4h8d9sQcQh As3c2s7d 7cJc8h6c"));
  }

  @Test
  public void test_omaha_holdem_5115_3d8c8sKhQh_9s7dJc3s_4c9hTc2s_TsQs4s7c_6sAs5d5c_Js3cAcTd_Qc8hTh5s() {
    assertEquals(
      "4c9hTc2s 9s7dJc3s Js3cAcTd 6sAs5d5c TsQs4s7c Qc8hTh5s",
      Solver.process("omaha-holdem 3d8c8sKhQh 9s7dJc3s 4c9hTc2s TsQs4s7c 6sAs5d5c Js3cAcTd Qc8hTh5s"));
  }

  @Test
  public void test_omaha_holdem_5116_4s6hAcJdTc_5h5s2hJc_QsKcKd9d_Qd6d5c7d_9c4c9sKs() {
    assertEquals(
      "Qd6d5c7d 9c4c9sKs 5h5s2hJc QsKcKd9d",
      Solver.process("omaha-holdem 4s6hAcJdTc 5h5s2hJc QsKcKd9d Qd6d5c7d 9c4c9sKs"));
  }

  @Test
  public void test_omaha_holdem_5117_5c8c9sKdQc_Td7hAd5d_7dKs5s7c_3dTcTh3c_6d9cAc5h_2d4hAsTs() {
    assertEquals(
      "2d4hAsTs Td7hAd5d 7dKs5s7c 3dTcTh3c 6d9cAc5h",
      Solver.process("omaha-holdem 5c8c9sKdQc Td7hAd5d 7dKs5s7c 3dTcTh3c 6d9cAc5h 2d4hAsTs"));
  }

  @Test
  public void test_omaha_holdem_5118_3c7h8s9cKd_9sAh6dQh_QdAsTcJc_Ac6s9hJh_2d2c7d4s() {
    assertEquals(
      "2d2c7d4s 9sAh6dQh=Ac6s9hJh QdAsTcJc",
      Solver.process("omaha-holdem 3c7h8s9cKd 9sAh6dQh QdAsTcJc Ac6s9hJh 2d2c7d4s"));
  }

  @Test
  public void test_omaha_holdem_5119_4d6dAdKsQh_3h8h3d5c_3c8s6c2h_6h5dTs9c_7sAhKdKh_7hJd9d8c_9s3sAc6s_9h4hQsKc_JcTd2sTc_Qd7cJsAs() {
    assertEquals(
      "3h8h3d5c 3c8s6c2h 6h5dTs9c 9h4hQsKc 9s3sAc6s Qd7cJsAs 7sAhKdKh JcTd2sTc 7hJd9d8c",
      Solver.process("omaha-holdem 4d6dAdKsQh 3h8h3d5c 3c8s6c2h 6h5dTs9c 7sAhKdKh 7hJd9d8c 9s3sAc6s 9h4hQsKc JcTd2sTc Qd7cJsAs"));
  }

  @Test
  public void test_omaha_holdem_5120_2s6sAdJhKs_5sQdTsTd_5hTc7c2c_3d4dKdAh_7s7d9d6d_Kh5d7h9c_JdAs3s8h() {
    assertEquals(
      "5hTc7c2c 7s7d9d6d Kh5d7h9c 3d4dKdAh 5sQdTsTd JdAs3s8h",
      Solver.process("omaha-holdem 2s6sAdJhKs 5sQdTsTd 5hTc7c2c 3d4dKdAh 7s7d9d6d Kh5d7h9c JdAs3s8h"));
  }

  @Test
  public void test_omaha_holdem_5121_2d6c8cTdTh_6s4hQs5d_3h9c9h8d_6hKd5sQh_4dAd7s2s() {
    assertEquals(
      "4dAd7s2s 6s4hQs5d 6hKd5sQh 3h9c9h8d",
      Solver.process("omaha-holdem 2d6c8cTdTh 6s4hQs5d 3h9c9h8d 6hKd5sQh 4dAd7s2s"));
  }

  @Test
  public void test_omaha_holdem_5122_8h9hAcAhJh_5s6hTc2s_AsKc9c3c_7h2cKd9d_5c6d7s5h_AdQhThJd_QsKh4hTd_2d8dJc4d() {
    assertEquals(
      "5s6hTc2s 5c6d7s5h 7h2cKd9d 2d8dJc4d QsKh4hTd AsKc9c3c AdQhThJd",
      Solver.process("omaha-holdem 8h9hAcAhJh 5s6hTc2s AsKc9c3c 7h2cKd9d 5c6d7s5h AdQhThJd QsKh4hTd 2d8dJc4d"));
  }

  @Test
  public void test_omaha_holdem_5123_6h8cJhKcKd_AdTh9s6d_As3d4dQh_Qs5c6cJs_4sAh9d7c_Jd6s5dKh() {
    assertEquals(
      "4sAh9d7c As3d4dQh AdTh9s6d Qs5c6cJs Jd6s5dKh",
      Solver.process("omaha-holdem 6h8cJhKcKd AdTh9s6d As3d4dQh Qs5c6cJs 4sAh9d7c Jd6s5dKh"));
  }

  @Test
  public void test_omaha_holdem_5124_5d6c7sJsTc_8dKd3d5c_TdQs4s9d_6d3h3c3s_4d6hAs8s_TsJdKs5h_Kc9sKh2c_6s2hJh4h_5s7cQcTh_4cAcAhQh() {
    assertEquals(
      "8dKd3d5c 6d3h3c3s TdQs4s9d Kc9sKh2c 4cAcAhQh 5s7cQcTh 6s2hJh4h TsJdKs5h 4d6hAs8s",
      Solver.process("omaha-holdem 5d6c7sJsTc 8dKd3d5c TdQs4s9d 6d3h3c3s 4d6hAs8s TsJdKs5h Kc9sKh2c 6s2hJh4h 5s7cQcTh 4cAcAhQh"));
  }

  @Test
  public void test_omaha_holdem_5125_2d9hJcTcTh_Ad3dQdQc_JhKd2sQs_6c8c9s6d_4sKhJd4d_Ah8h7s5d_4h5c2c3c_7h3hQhTd_8d8s2h6s() {
    assertEquals(
      "4h5c2c3c 8d8s2h6s 6c8c9s6d 4sKhJd4d Ad3dQdQc 7h3hQhTd Ah8h7s5d JhKd2sQs",
      Solver.process("omaha-holdem 2d9hJcTcTh Ad3dQdQc JhKd2sQs 6c8c9s6d 4sKhJd4d Ah8h7s5d 4h5c2c3c 7h3hQhTd 8d8s2h6s"));
  }

  @Test
  public void test_omaha_holdem_5126_5dAhAsKsQh_8cTdQdJs_9sKdAc6h_4d3s4cJd_4s2s7dJc_9d5h8hJh_7sQc3c7h_9c8d8s4h() {
    assertEquals(
      "4s2s7dJc 4d3s4cJd 9d5h8hJh 9c8d8s4h 7sQc3c7h 8cTdQdJs 9sKdAc6h",
      Solver.process("omaha-holdem 5dAhAsKsQh 8cTdQdJs 9sKdAc6h 4d3s4cJd 4s2s7dJc 9d5h8hJh 7sQc3c7h 9c8d8s4h"));
  }

  @Test
  public void test_omaha_holdem_5127_2c7c7dAsTd_8hKs7h4h_6cKcJh3h_Ac3cQc9h_5hQh3d7s_3s4dKd2s_KhAh6h5s_Jc4s2d8s_JsJd8c9s_8dAd5d9c() {
    assertEquals(
      "6cKcJh3h Jc4s2d8s 3s4dKd2s JsJd8c9s 8dAd5d9c Ac3cQc9h KhAh6h5s 5hQh3d7s 8hKs7h4h",
      Solver.process("omaha-holdem 2c7c7dAsTd 8hKs7h4h 6cKcJh3h Ac3cQc9h 5hQh3d7s 3s4dKd2s KhAh6h5s Jc4s2d8s JsJd8c9s 8dAd5d9c"));
  }

  @Test
  public void test_omaha_holdem_5128_9hAsJcQdQh_Kc2dKh8d_5hKs7hTs_Qs8s7s8h_4s5cAc5s_6d5d7d2c_AdAh3hTh_3dJs6c4c_6sJhJdTc_2h7c4d3s() {
    assertEquals(
      "2h7c4d3s 6d5d7d2c 3dJs6c4c Kc2dKh8d 4s5cAc5s Qs8s7s8h 5hKs7hTs 6sJhJdTc AdAh3hTh",
      Solver.process("omaha-holdem 9hAsJcQdQh Kc2dKh8d 5hKs7hTs Qs8s7s8h 4s5cAc5s 6d5d7d2c AdAh3hTh 3dJs6c4c 6sJhJdTc 2h7c4d3s"));
  }

  @Test
  public void test_omaha_holdem_5129_4d5hKhQdQs_5dAs4c2h_Qh9h9c8c_3hAdAc4h() {
    assertEquals(
      "5dAs4c2h 3hAdAc4h Qh9h9c8c",
      Solver.process("omaha-holdem 4d5hKhQdQs 5dAs4c2h Qh9h9c8c 3hAdAc4h"));
  }

  @Test
  public void test_omaha_holdem_5130_5c5d8sAcTd_Ah9h6hJh_7sJsKd4s_Ks7dKhTh_6c8h3s9s_6s7cJd7h_Jc2s4h2c_4d3cQc2h() {
    assertEquals(
      "4d3cQc2h 7sJsKd4s Jc2s4h2c 6s7cJd7h 6c8h3s9s Ks7dKhTh Ah9h6hJh",
      Solver.process("omaha-holdem 5c5d8sAcTd Ah9h6hJh 7sJsKd4s Ks7dKhTh 6c8h3s9s 6s7cJd7h Jc2s4h2c 4d3cQc2h"));
  }

  @Test
  public void test_omaha_holdem_5131_2h5c6c8c9h_3h7sTcJs_7dTsKsKh_Jd4hKc6s_Ah8s9cAc_AsQd3sQs_3d9dJc2d_Th2c3c4c_7h2sTd5d() {
    assertEquals(
      "Jd4hKc6s AsQd3sQs 3d9dJc2d 3h7sTcJs=7dTsKsKh=7h2sTd5d Th2c3c4c Ah8s9cAc",
      Solver.process("omaha-holdem 2h5c6c8c9h 3h7sTcJs 7dTsKsKh Jd4hKc6s Ah8s9cAc AsQd3sQs 3d9dJc2d Th2c3c4c 7h2sTd5d"));
  }

  @Test
  public void test_omaha_holdem_5132_3h4c4h8dQh_Jc3cAdJh_Td9sKhTc_7c9h7d5s_3d8hAhTs() {
    assertEquals(
      "7c9h7d5s Td9sKhTc Jc3cAdJh 3d8hAhTs",
      Solver.process("omaha-holdem 3h4c4h8dQh Jc3cAdJh Td9sKhTc 7c9h7d5s 3d8hAhTs"));
  }

  @Test
  public void test_omaha_holdem_5133_5c7sJhKsTh_3sAsQcTd_3h6sQsTs_8h5s7hKc_4s8d4c4d_Qh6h4h2d_9s7d8c2s() {
    assertEquals(
      "Qh6h4h2d 4s8d4c4d 3h6sQsTs 8h5s7hKc 9s7d8c2s 3sAsQcTd",
      Solver.process("omaha-holdem 5c7sJhKsTh 3sAsQcTd 3h6sQsTs 8h5s7hKc 4s8d4c4d Qh6h4h2d 9s7d8c2s"));
  }

  @Test
  public void test_omaha_holdem_5134_3c3s9dAcKh_Qs5cKs8d_TcJc5sKd_9sThTdQh_8hTs2sKc_8cAd7sQd_7c7d3hJs_5h6s5d4d_Qc2d3d4s() {
    assertEquals(
      "5h6s5d4d 9sThTdQh 8hTs2sKc TcJc5sKd Qs5cKs8d 8cAd7sQd 7c7d3hJs Qc2d3d4s",
      Solver.process("omaha-holdem 3c3s9dAcKh Qs5cKs8d TcJc5sKd 9sThTdQh 8hTs2sKc 8cAd7sQd 7c7d3hJs 5h6s5d4d Qc2d3d4s"));
  }

  @Test
  public void test_omaha_holdem_5135_7d8c8dAsQs_Ks3d5s6c_9d9h2sAd_8sTdKc4d_7sJd4cQh() {
    assertEquals(
      "Ks3d5s6c 7sJd4cQh 9d9h2sAd 8sTdKc4d",
      Solver.process("omaha-holdem 7d8c8dAsQs Ks3d5s6c 9d9h2sAd 8sTdKc4d 7sJd4cQh"));
  }

  @Test
  public void test_omaha_holdem_5136_4cAcAsKdKh_8d3h2c7d_6h4dQs7h_Jc9d6cQc_JdQd3dJs_6d6s7c5h_3s5dTc4s() {
    assertEquals(
      "8d3h2c7d Jc9d6cQc 3s5dTc4s 6h4dQs7h 6d6s7c5h JdQd3dJs",
      Solver.process("omaha-holdem 4cAcAsKdKh 8d3h2c7d 6h4dQs7h Jc9d6cQc JdQd3dJs 6d6s7c5h 3s5dTc4s"));
  }

  @Test
  public void test_omaha_holdem_5137_2d5h7hAsJh_4dAd7s2s_5dKd7d3d_9s8s9h3c_6h5s3hTs_Ks7c8d6s_8cTdQsKh() {
    assertEquals(
      "8cTdQsKh Ks7c8d6s 9s8s9h3c 5dKd7d3d 4dAd7s2s 6h5s3hTs",
      Solver.process("omaha-holdem 2d5h7hAsJh 4dAd7s2s 5dKd7d3d 9s8s9h3c 6h5s3hTs Ks7c8d6s 8cTdQsKh"));
  }

  @Test
  public void test_omaha_holdem_5138_3c7cJcJdQc_2s4d8dAs_3hQh4cAc() {
    assertEquals(
      "2s4d8dAs 3hQh4cAc",
      Solver.process("omaha-holdem 3c7cJcJdQc 2s4d8dAs 3hQh4cAc"));
  }

  @Test
  public void test_omaha_holdem_5139_2s8hJdQcQh_2cAs8c5s_6c4s7s3h_6d7d9s8d_5d9h8s4h_KsKhTs3c_2hTd4cAd() {
    assertEquals(
      "6c4s7s3h 2hTd4cAd 5d9h8s4h=6d7d9s8d 2cAs8c5s KsKhTs3c",
      Solver.process("omaha-holdem 2s8hJdQcQh 2cAs8c5s 6c4s7s3h 6d7d9s8d 5d9h8s4h KsKhTs3c 2hTd4cAd"));
  }

  @Test
  public void test_omaha_holdem_5140_3c6dAsJhTd_Qs8s6s3d_9cAh8c2h_4h5cKh8h_7cJsTcKc() {
    assertEquals(
      "4h5cKh8h 9cAh8c2h Qs8s6s3d 7cJsTcKc",
      Solver.process("omaha-holdem 3c6dAsJhTd Qs8s6s3d 9cAh8c2h 4h5cKh8h 7cJsTcKc"));
  }

  @Test
  public void test_omaha_holdem_5141_2h9c9hQcTd_6hKd3sKs_3c4d7c3h_Jd7s4cKh() {
    assertEquals(
      "3c4d7c3h 6hKd3sKs Jd7s4cKh",
      Solver.process("omaha-holdem 2h9c9hQcTd 6hKd3sKs 3c4d7c3h Jd7s4cKh"));
  }

  @Test
  public void test_omaha_holdem_5142_4c7h8c8hJd_7d6dQsAh_8d9dTsJc_Tc8s4hTh_6cQhTd7c_2d9h3hQc_6s5cAdKh_4d5s9cJh() {
    assertEquals(
      "2d9h3hQc 6cQhTd7c 7d6dQsAh 4d5s9cJh 6s5cAdKh Tc8s4hTh 8d9dTsJc",
      Solver.process("omaha-holdem 4c7h8c8hJd 7d6dQsAh 8d9dTsJc Tc8s4hTh 6cQhTd7c 2d9h3hQc 6s5cAdKh 4d5s9cJh"));
  }

  @Test
  public void test_omaha_holdem_5143_3d5d7s9dQd_5s6s7dTc_4dKdQh3h_9sJs9c6c_Ad6hAc2c() {
    assertEquals(
      "Ad6hAc2c 5s6s7dTc 9sJs9c6c 4dKdQh3h",
      Solver.process("omaha-holdem 3d5d7s9dQd 5s6s7dTc 4dKdQh3h 9sJs9c6c Ad6hAc2c"));
  }

  @Test
  public void test_omaha_holdem_5144_2d5s6d7cJd_5d2c2hKh_Kd8h5hQh_6h9hKcTd_8c4sQc9d_Js3h6sAh_AcThTc3d_8d4cAsQd() {
    assertEquals(
      "Kd8h5hQh 6h9hKcTd AcThTc3d Js3h6sAh 5d2c2hKh 8c4sQc9d 8d4cAsQd",
      Solver.process("omaha-holdem 2d5s6d7cJd 5d2c2hKh Kd8h5hQh 6h9hKcTd 8c4sQc9d Js3h6sAh AcThTc3d 8d4cAsQd"));
  }

  @Test
  public void test_omaha_holdem_5145_2d3d4hKdTd_4c7sJh3h_5c2sQcTh_5d9cKsQs_AsAcQd4d_Tc6hQh2c_6c7d8sAh_Kh5hTs3s() {
    assertEquals(
      "6c7d8sAh 5d9cKsQs 4c7sJh3h 5c2sQcTh=Tc6hQh2c Kh5hTs3s AsAcQd4d",
      Solver.process("omaha-holdem 2d3d4hKdTd 4c7sJh3h 5c2sQcTh 5d9cKsQs AsAcQd4d Tc6hQh2c 6c7d8sAh Kh5hTs3s"));
  }

  @Test
  public void test_omaha_holdem_5146_2s3h4sTcTs_5s7cJd8d_2dTd6c5h_6h4d3s9c_9h7hTh6s_8h2h7d3c_4hJsKd2c_Qh8sAd4c_KsAsQs9d() {
    assertEquals(
      "5s7cJd8d 8h2h7d3c 6h4d3s9c 4hJsKd2c Qh8sAd4c 9h7hTh6s KsAsQs9d 2dTd6c5h",
      Solver.process("omaha-holdem 2s3h4sTcTs 5s7cJd8d 2dTd6c5h 6h4d3s9c 9h7hTh6s 8h2h7d3c 4hJsKd2c Qh8sAd4c KsAsQs9d"));
  }

  @Test
  public void test_omaha_holdem_5147_2d2s3d4s9c_Ah9h3h2c_Ts3cTc6s_3s7h8c7c_5cTdJdKd_8s4d7dQc() {
    assertEquals(
      "5cTdJdKd 8s4d7dQc 3s7h8c7c Ts3cTc6s Ah9h3h2c",
      Solver.process("omaha-holdem 2d2s3d4s9c Ah9h3h2c Ts3cTc6s 3s7h8c7c 5cTdJdKd 8s4d7dQc"));
  }

  @Test
  public void test_omaha_holdem_5148_2h5h8h9sJs_3cAs5dQc_4d9dTsKc_8d6dJh7s() {
    assertEquals(
      "3cAs5dQc 4d9dTsKc 8d6dJh7s",
      Solver.process("omaha-holdem 2h5h8h9sJs 3cAs5dQc 4d9dTsKc 8d6dJh7s"));
  }

  @Test
  public void test_omaha_holdem_5149_4c5h7hJsQh_8sQd6h6c_8d4h4d3s_3hQsTdKc_2s9dTs3c_6sJdJh5s_AhKs6d8c_Ad9s7c7d() {
    assertEquals(
      "2s9dTs3c 3hQsTdKc 8d4h4d3s Ad9s7c7d 6sJdJh5s 8sQd6h6c=AhKs6d8c",
      Solver.process("omaha-holdem 4c5h7hJsQh 8sQd6h6c 8d4h4d3s 3hQsTdKc 2s9dTs3c 6sJdJh5s AhKs6d8c Ad9s7c7d"));
  }

  @Test
  public void test_omaha_holdem_5150_2c4d6hQcQs_Td5c3c3h_7cAdJh3s_Kh9h9sQd_8hAsKc4c_5d2s5h3d() {
    assertEquals(
      "7cAdJh3s 8hAsKc4c Kh9h9sQd 5d2s5h3d=Td5c3c3h",
      Solver.process("omaha-holdem 2c4d6hQcQs Td5c3c3h 7cAdJh3s Kh9h9sQd 8hAsKc4c 5d2s5h3d"));
  }

  @Test
  public void test_omaha_holdem_5151_2s6h9dAhQh_ThQd9sKh_7d8c8h3s_4sTdKc5s_KdTcTsJs_2cAcJc9h_9c8d8sJh_3dJd5h6c_Ad6s7h2h_Ks5d2d7c() {
    assertEquals(
      "4sTdKc5s Ks5d2d7c 3dJd5h6c 7d8c8h3s 9c8d8sJh KdTcTsJs 2cAcJc9h Ad6s7h2h ThQd9sKh",
      Solver.process("omaha-holdem 2s6h9dAhQh ThQd9sKh 7d8c8h3s 4sTdKc5s KdTcTsJs 2cAcJc9h 9c8d8sJh 3dJd5h6c Ad6s7h2h Ks5d2d7c"));
  }

  @Test
  public void test_omaha_holdem_5152_4s7c8hQdTd_3d2d4c6h_Kd5hQhAd_5cKc3sQc_2c3hTs9s_Js9hJcKs() {
    assertEquals(
      "3d2d4c6h 2c3hTs9s 5cKc3sQc Kd5hQhAd Js9hJcKs",
      Solver.process("omaha-holdem 4s7c8hQdTd 3d2d4c6h Kd5hQhAd 5cKc3sQc 2c3hTs9s Js9hJcKs"));
  }

  @Test
  public void test_omaha_holdem_5153_2c7c8d9hAc_Qh6s5s7d_9c6h3c4d_JhQcThKs_8sAdJc2h_KdJd2s8h_AhTs5d2d_4s4c6dKc() {
    assertEquals(
      "KdJd2s8h AhTs5d2d 8sAdJc2h Qh6s5s7d JhQcThKs 9c6h3c4d 4s4c6dKc",
      Solver.process("omaha-holdem 2c7c8d9hAc Qh6s5s7d 9c6h3c4d JhQcThKs 8sAdJc2h KdJd2s8h AhTs5d2d 4s4c6dKc"));
  }

  @Test
  public void test_omaha_holdem_5154_3s5sKcKdTd_5h2d9cAd_Ks6d2s7h_8s7d6sQs_3d7c2cQc() {
    assertEquals(
      "8s7d6sQs 3d7c2cQc 5h2d9cAd Ks6d2s7h",
      Solver.process("omaha-holdem 3s5sKcKdTd 5h2d9cAd Ks6d2s7h 8s7d6sQs 3d7c2cQc"));
  }

  @Test
  public void test_omaha_holdem_5155_2c4h4s5s8c_8h3dJc4d_2d7d6d7s_3h5d6h2s_9cJdQhTd_Qs6cTcKs_7c3cAdJh_AhKd3s9s() {
    assertEquals(
      "9cJdQhTd Qs6cTcKs 7c3cAdJh=AhKd3s9s 3h5d6h2s 2d7d6d7s 8h3dJc4d",
      Solver.process("omaha-holdem 2c4h4s5s8c 8h3dJc4d 2d7d6d7s 3h5d6h2s 9cJdQhTd Qs6cTcKs 7c3cAdJh AhKd3s9s"));
  }

  @Test
  public void test_omaha_holdem_5156_5c5d5hAsQh_Jd2sKs9s_9c4c7c5s_8hKcJh6c_3c3h4h2h_6d2c7hJc_TsAcAh2d() {
    assertEquals(
      "6d2c7hJc 8hKcJh6c=Jd2sKs9s 3c3h4h2h TsAcAh2d 9c4c7c5s",
      Solver.process("omaha-holdem 5c5d5hAsQh Jd2sKs9s 9c4c7c5s 8hKcJh6c 3c3h4h2h 6d2c7hJc TsAcAh2d"));
  }

  @Test
  public void test_omaha_holdem_5157_5d6cJhQhTs_6dTc6h7d_8h4cKc9s_7cTdKs8d_3cJd7s5c() {
    assertEquals(
      "7cTdKs8d 3cJd7s5c 6dTc6h7d 8h4cKc9s",
      Solver.process("omaha-holdem 5d6cJhQhTs 6dTc6h7d 8h4cKc9s 7cTdKs8d 3cJd7s5c"));
  }

  @Test
  public void test_omaha_holdem_5158_6d7c9sQcTs_9d2h8h8d_3c2d4cTh_As5cJd5s_5hKhQhAh_KcTc3dAd() {
    assertEquals(
      "As5cJd5s 3c2d4cTh KcTc3dAd 5hKhQhAh 9d2h8h8d",
      Solver.process("omaha-holdem 6d7c9sQcTs 9d2h8h8d 3c2d4cTh As5cJd5s 5hKhQhAh KcTc3dAd"));
  }

  @Test
  public void test_omaha_holdem_5159_4s5h7s8cTc_2hTd2sAs_8s2d6h4h_QhJs7d6d_5s3s2c5d_3c7hTh9c_JhJd3d3h() {
    assertEquals(
      "2hTd2sAs JhJd3d3h 3c7hTh9c 5s3s2c5d 8s2d6h4h=QhJs7d6d",
      Solver.process("omaha-holdem 4s5h7s8cTc 2hTd2sAs 8s2d6h4h QhJs7d6d 5s3s2c5d 3c7hTh9c JhJd3d3h"));
  }

  @Test
  public void test_omaha_holdem_5160_5h6d8h8sQs_Qc3s5s2h_7cAh3dJc_9sAs7s4c_2sAcKc8d_JsTc6s8c_2c4s2dJh_Kh6c7h9h_5c7dQh9d() {
    assertEquals(
      "7cAh3dJc 2c4s2dJh Qc3s5s2h 2sAcKc8d 5c7dQh9d=9sAs7s4c=Kh6c7h9h JsTc6s8c",
      Solver.process("omaha-holdem 5h6d8h8sQs Qc3s5s2h 7cAh3dJc 9sAs7s4c 2sAcKc8d JsTc6s8c 2c4s2dJh Kh6c7h9h 5c7dQh9d"));
  }

  @Test
  public void test_omaha_holdem_5161_5s7cAsJdKc_Ad6cKs8d_Qd7d5h3d_4d2h9hQs_Ah6sKdTh_2sTc8s8c() {
    assertEquals(
      "4d2h9hQs 2sTc8s8c Qd7d5h3d Ad6cKs8d=Ah6sKdTh",
      Solver.process("omaha-holdem 5s7cAsJdKc Ad6cKs8d Qd7d5h3d 4d2h9hQs Ah6sKdTh 2sTc8s8c"));
  }

  @Test
  public void test_omaha_holdem_5162_9dJdQdQsTd_5h3cKdAd_Ts4s3s6d_Js9h2c6s_Qh7s5c7c_ThAh8hKs_3h8c3d8d_5s4h9s2h() {
    assertEquals(
      "5s4h9s2h Ts4s3s6d Js9h2c6s Qh7s5c7c ThAh8hKs 3h8c3d8d 5h3cKdAd",
      Solver.process("omaha-holdem 9dJdQdQsTd 5h3cKdAd Ts4s3s6d Js9h2c6s Qh7s5c7c ThAh8hKs 3h8c3d8d 5s4h9s2h"));
  }

  @Test
  public void test_omaha_holdem_5163_3d3h7c9hKs_Td4sJc9s_Qd5h7d2s_5sKhQsTh_Ah4c4hAc() {
    assertEquals(
      "Qd5h7d2s Td4sJc9s 5sKhQsTh Ah4c4hAc",
      Solver.process("omaha-holdem 3d3h7c9hKs Td4sJc9s Qd5h7d2s 5sKhQsTh Ah4c4hAc"));
  }

  @Test
  public void test_omaha_holdem_5164_2s4s6d9dJs_5h9h6cTs_Td7c6sQh_3c9c8d7s() {
    assertEquals(
      "Td7c6sQh 3c9c8d7s 5h9h6cTs",
      Solver.process("omaha-holdem 2s4s6d9dJs 5h9h6cTs Td7c6sQh 3c9c8d7s"));
  }

  @Test
  public void test_omaha_holdem_5165_6h7d7s8c8s_4s2hJsAc_9h5c2dTc_3c6sKd3s_KsQsKc3h_4dQd5s6c() {
    assertEquals(
      "4s2hJsAc 3c6sKd3s KsQsKc3h 4dQd5s6c 9h5c2dTc",
      Solver.process("omaha-holdem 6h7d7s8c8s 4s2hJsAc 9h5c2dTc 3c6sKd3s KsQsKc3h 4dQd5s6c"));
  }

  @Test
  public void test_omaha_holdem_5166_4h8cAcJdKh_Ah5cQdKs_2cTs6s9d_6cQs6d7h_As4c4d5h_TcQc6h9c_7dTh9s7s_8h3c7c2d_KdKc3d8s() {
    assertEquals(
      "2cTs6s9d 6cQs6d7h 7dTh9s7s 8h3c7c2d Ah5cQdKs As4c4d5h KdKc3d8s TcQc6h9c",
      Solver.process("omaha-holdem 4h8cAcJdKh Ah5cQdKs 2cTs6s9d 6cQs6d7h As4c4d5h TcQc6h9c 7dTh9s7s 8h3c7c2d KdKc3d8s"));
  }

  @Test
  public void test_omaha_holdem_5167_4h6d9cJcQc_Ac8sTs5h_8h5s2c9s_6h9h4dAh_KsKc3s7d_TdTh6sAd() {
    assertEquals(
      "8h5s2c9s TdTh6sAd KsKc3s7d 6h9h4dAh Ac8sTs5h",
      Solver.process("omaha-holdem 4h6d9cJcQc Ac8sTs5h 8h5s2c9s 6h9h4dAh KsKc3s7d TdTh6sAd"));
  }

  @Test
  public void test_omaha_holdem_5168_3sAcAhKhQs_As5s7sTs_8c8s3dTd_JcQh9hTh_JdAd7c4c() {
    assertEquals(
      "8c8s3dTd As5s7sTs JdAd7c4c JcQh9hTh",
      Solver.process("omaha-holdem 3sAcAhKhQs As5s7sTs 8c8s3dTd JcQh9hTh JdAd7c4c"));
  }

  @Test
  public void test_omaha_holdem_5169_2d4c5h5s7c_2h3cAhKs_5c9hQsKd_6h7h9dTs_6c7s8c3s() {
    assertEquals(
      "6h7h9dTs 5c9hQsKd 2h3cAhKs 6c7s8c3s",
      Solver.process("omaha-holdem 2d4c5h5s7c 2h3cAhKs 5c9hQsKd 6h7h9dTs 6c7s8c3s"));
  }

  @Test
  public void test_omaha_holdem_5170_5d7d7h8hTh_4d2dJs8d_2cQsQdJc() {
    assertEquals(
      "4d2dJs8d 2cQsQdJc",
      Solver.process("omaha-holdem 5d7d7h8hTh 4d2dJs8d 2cQsQdJc"));
  }

  @Test
  public void test_omaha_holdem_5171_2s6d8dJcQd_5s9hKhQc_Td8hQhAh_4sQs3cJs_Kc6c3h5h_8cKdAs4d() {
    assertEquals(
      "Kc6c3h5h 5s9hKhQc Td8hQhAh 4sQs3cJs 8cKdAs4d",
      Solver.process("omaha-holdem 2s6d8dJcQd 5s9hKhQc Td8hQhAh 4sQs3cJs Kc6c3h5h 8cKdAs4d"));
  }

  @Test
  public void test_omaha_holdem_5172_2c8c9dKhQc_4d6h5s2s_Ts9cAsJh() {
    assertEquals(
      "4d6h5s2s Ts9cAsJh",
      Solver.process("omaha-holdem 2c8c9dKhQc 4d6h5s2s Ts9cAsJh"));
  }

  @Test
  public void test_omaha_holdem_5173_3h3s4d7cKh_4sQd5hQs_AcAh9sQh_5d8h7hTs_6hJc2s5c_3c4c8d8c_9dJs5s9h_TcKcKs2c_Td6s7dQc_9c2d6c2h() {
    assertEquals(
      "9c2d6c2h 5d8h7hTs Td6s7dQc 9dJs5s9h 4sQd5hQs AcAh9sQh 6hJc2s5c 3c4c8d8c TcKcKs2c",
      Solver.process("omaha-holdem 3h3s4d7cKh 4sQd5hQs AcAh9sQh 5d8h7hTs 6hJc2s5c 3c4c8d8c 9dJs5s9h TcKcKs2c Td6s7dQc 9c2d6c2h"));
  }

  @Test
  public void test_omaha_holdem_5174_3h4c8c9dQh_3s2c8dJh_Ah6cAs6s_JdKhKdTc() {
    assertEquals(
      "Ah6cAs6s 3s2c8dJh JdKhKdTc",
      Solver.process("omaha-holdem 3h4c8c9dQh 3s2c8dJh Ah6cAs6s JdKhKdTc"));
  }

  @Test
  public void test_omaha_holdem_5175_4c4hKdKsQc_6hAs6s4s_Js6c3h7c_Th5cAh2d_5h8s9h7s_Jh9d5s6d_Ad2cJc2h_4dKcTd5d_8dAc9s8c() {
    assertEquals(
      "5h8s9h7s Js6c3h7c Jh9d5s6d Th5cAh2d Ad2cJc2h 8dAc9s8c 6hAs6s4s 4dKcTd5d",
      Solver.process("omaha-holdem 4c4hKdKsQc 6hAs6s4s Js6c3h7c Th5cAh2d 5h8s9h7s Jh9d5s6d Ad2cJc2h 4dKcTd5d 8dAc9s8c"));
  }

  @Test
  public void test_omaha_holdem_5176_4d7d8cAdQh_9c3c9d9s_2d3sJhJc_2s7cKhTh_As3d6h2h_5h5s5dTd_4cQsJd7s_9h6c8s7h_6s2c8dKd_Qd4s8hJs() {
    assertEquals(
      "2s7cKhTh 9c3c9d9s 2d3sJhJc As3d6h2h 9h6c8s7h 4cQsJd7s Qd4s8hJs 5h5s5dTd 6s2c8dKd",
      Solver.process("omaha-holdem 4d7d8cAdQh 9c3c9d9s 2d3sJhJc 2s7cKhTh As3d6h2h 5h5s5dTd 4cQsJd7s 9h6c8s7h 6s2c8dKd Qd4s8hJs"));
  }

  @Test
  public void test_omaha_holdem_5177_2c5s7sKcQd_6s7d5d6d_Ah5h4dJd_Jh2h3c6h_KdAsKs4h_Td9s4c5c_JsJc8dTh_8h6c8s3s_8c4s2s3d() {
    assertEquals(
      "8c4s2s3d Jh2h3c6h Td9s4c5c Ah5h4dJd 8h6c8s3s JsJc8dTh 6s7d5d6d KdAsKs4h",
      Solver.process("omaha-holdem 2c5s7sKcQd 6s7d5d6d Ah5h4dJd Jh2h3c6h KdAsKs4h Td9s4c5c JsJc8dTh 8h6c8s3s 8c4s2s3d"));
  }

  @Test
  public void test_omaha_holdem_5178_3c4h7c7sJd_Kc4dAhKd_5h5cQc8d_Ad3sAs9h_Tc6hKhAc() {
    assertEquals(
      "Tc6hKhAc 5h5cQc8d Kc4dAhKd Ad3sAs9h",
      Solver.process("omaha-holdem 3c4h7c7sJd Kc4dAhKd 5h5cQc8d Ad3sAs9h Tc6hKhAc"));
  }

  @Test
  public void test_omaha_holdem_5179_4d5d6sAcJd_Ks4c2hAs_3cTs7d4h_7c9s6d8c_Kc5hKh9d_8sJs5s5c_7sQh4s7h_9h8hQdQs() {
    assertEquals(
      "7sQh4s7h 9h8hQdQs Kc5hKh9d Ks4c2hAs 8sJs5s5c 3cTs7d4h 7c9s6d8c",
      Solver.process("omaha-holdem 4d5d6sAcJd Ks4c2hAs 3cTs7d4h 7c9s6d8c Kc5hKh9d 8sJs5s5c 7sQh4s7h 9h8hQdQs"));
  }

  @Test
  public void test_omaha_holdem_5180_4c4s6s8cJs_3d2d7c2s_5c8d4dAc_9s8s5sQd_6h7dKh8h_KcQhAdQc_Jc2hJd9h_As6d5hQs() {
    assertEquals(
      "3d2d7c2s 6h7dKh8h KcQhAdQc 9s8s5sQd As6d5hQs 5c8d4dAc Jc2hJd9h",
      Solver.process("omaha-holdem 4c4s6s8cJs 3d2d7c2s 5c8d4dAc 9s8s5sQd 6h7dKh8h KcQhAdQc Jc2hJd9h As6d5hQs"));
  }

  @Test
  public void test_omaha_holdem_5181_4h6s7cJcKh_9c3cTh3h_7sJd7dTc_8h4s6h6d_8cKd9dJh_Ah6cJsAs_Qc2hTs8d_9s2dQh9h_5c2sQd5s() {
    assertEquals(
      "Qc2hTs8d 9c3cTh3h 5c2sQd5s 9s2dQh9h Ah6cJsAs 8cKd9dJh 8h4s6h6d 7sJd7dTc",
      Solver.process("omaha-holdem 4h6s7cJcKh 9c3cTh3h 7sJd7dTc 8h4s6h6d 8cKd9dJh Ah6cJsAs Qc2hTs8d 9s2dQh9h 5c2sQd5s"));
  }

  @Test
  public void test_omaha_holdem_5182_4d8s9cKcTc_7d4hQh4c_3hAd8cAs_Kd6hJc6c() {
    assertEquals(
      "3hAd8cAs 7d4hQh4c Kd6hJc6c",
      Solver.process("omaha-holdem 4d8s9cKcTc 7d4hQh4c 3hAd8cAs Kd6hJc6c"));
  }

  @Test
  public void test_omaha_holdem_5183_5c6s7h8c8s_Ad4s2dTc_JdTs3dQs_4cQcJcTh() {
    assertEquals(
      "4cQcJcTh=JdTs3dQs Ad4s2dTc",
      Solver.process("omaha-holdem 5c6s7h8c8s Ad4s2dTc JdTs3dQs 4cQcJcTh"));
  }

  @Test
  public void test_omaha_holdem_5184_3c4s9cQdTh_Ts6sJsAd_Qc9h3h6d() {
    assertEquals(
      "Ts6sJsAd Qc9h3h6d",
      Solver.process("omaha-holdem 3c4s9cQdTh Ts6sJsAd Qc9h3h6d"));
  }

  @Test
  public void test_omaha_holdem_5185_4s6h8cAcAh_2s5h2dKc_7h6sJsJc() {
    assertEquals(
      "2s5h2dKc 7h6sJsJc",
      Solver.process("omaha-holdem 4s6h8cAcAh 2s5h2dKc 7h6sJsJc"));
  }

  @Test
  public void test_omaha_holdem_5186_5c5d8dJcKh_4h9s9h7h_8c2s3h8h_2cTcQhQs_Ks5hTsAd_Th6h9c9d_4sJsKcTd_AsKd2d8s_2h7d5s3c() {
    assertEquals(
      "4h9s9h7h=Th6h9c9d 2cTcQhQs AsKd2d8s 4sJsKcTd 2h7d5s3c Ks5hTsAd 8c2s3h8h",
      Solver.process("omaha-holdem 5c5d8dJcKh 4h9s9h7h 8c2s3h8h 2cTcQhQs Ks5hTsAd Th6h9c9d 4sJsKcTd AsKd2d8s 2h7d5s3c"));
  }

  @Test
  public void test_omaha_holdem_5187_3s5h6h8sAh_Qs7dKd4h_8cJc7s4s_Jd9cAs6s_5cKh3cKs() {
    assertEquals(
      "5cKh3cKs Jd9cAs6s 8cJc7s4s=Qs7dKd4h",
      Solver.process("omaha-holdem 3s5h6h8sAh Qs7dKd4h 8cJc7s4s Jd9cAs6s 5cKh3cKs"));
  }

  @Test
  public void test_omaha_holdem_5188_3c7c7h8dTd_9d3d2h3h_2sAs9s4h_5h8cQs2c_Tc6hQc7d_6dJsKcKs_4sTsJhAc_5c5dAh8h_8s2d4cKh() {
    assertEquals(
      "2sAs9s4h 5h8cQs2c 8s2d4cKh 5c5dAh8h 4sTsJhAc 6dJsKcKs 9d3d2h3h Tc6hQc7d",
      Solver.process("omaha-holdem 3c7c7h8dTd 9d3d2h3h 2sAs9s4h 5h8cQs2c Tc6hQc7d 6dJsKcKs 4sTsJhAc 5c5dAh8h 8s2d4cKh"));
  }

  @Test
  public void test_omaha_holdem_5189_2c6s7c7dAc_Th9dTsQh_AsJc4cQs_2h9s9hKc_5h8s3dTd_Kd6d5c8c_4s9cAhJs() {
    assertEquals(
      "5h8s3dTd 2h9s9hKc Th9dTsQh 4s9cAhJs Kd6d5c8c AsJc4cQs",
      Solver.process("omaha-holdem 2c6s7c7dAc Th9dTsQh AsJc4cQs 2h9s9hKc 5h8s3dTd Kd6d5c8c 4s9cAhJs"));
  }

  @Test
  public void test_omaha_holdem_5190_4c6h7d7sJs_5hAd2s9d_9h3sAc4d_Th2hJh5d_8cQd3d9c_3cJdAh6c_6s2dJc9s_8hTsAsTc() {
    assertEquals(
      "8cQd3d9c 5hAd2s9d 9h3sAc4d 8hTsAsTc 6s2dJc9s Th2hJh5d 3cJdAh6c",
      Solver.process("omaha-holdem 4c6h7d7sJs 5hAd2s9d 9h3sAc4d Th2hJh5d 8cQd3d9c 3cJdAh6c 6s2dJc9s 8hTsAsTc"));
  }

  @Test
  public void test_omaha_holdem_5191_3c3d7s9sQs_8s4h9hKh_8c5dAhQd_6cJdTc5c_Ts4c2c5h_4dJcJsKc_2dQcTh7h_3sJhAs2s_Ks5s6d4s() {
    assertEquals(
      "Ts4c2c5h 6cJdTc5c 8s4h9hKh 4dJcJsKc 8c5dAhQd 2dQcTh7h Ks5s6d4s 3sJhAs2s",
      Solver.process("omaha-holdem 3c3d7s9sQs 8s4h9hKh 8c5dAhQd 6cJdTc5c Ts4c2c5h 4dJcJsKc 2dQcTh7h 3sJhAs2s Ks5s6d4s"));
  }

  @Test
  public void test_omaha_holdem_5192_3c3d4c9sTc_8h7sTs4d_JcJd6d2d_9hQc7h5d_5s3sKd6s_QsJsJhQh() {
    assertEquals(
      "9hQc7h5d 8h7sTs4d JcJd6d2d QsJsJhQh 5s3sKd6s",
      Solver.process("omaha-holdem 3c3d4c9sTc 8h7sTs4d JcJd6d2d 9hQc7h5d 5s3sKd6s QsJsJhQh"));
  }

  @Test
  public void test_omaha_holdem_5193_2s5h6c7h8c_9c3sTd4h_4c3c8hJc_3h2hJhTc() {
    assertEquals(
      "3h2hJhTc 4c3c8hJc 9c3sTd4h",
      Solver.process("omaha-holdem 2s5h6c7h8c 9c3sTd4h 4c3c8hJc 3h2hJhTc"));
  }

  @Test
  public void test_omaha_holdem_5194_3h4hAsKdQh_9d9h8sJs_AhAdJc6d_8c6cKhTh_4dKcQsQd() {
    assertEquals(
      "9d9h8sJs 4dKcQsQd AhAdJc6d 8c6cKhTh",
      Solver.process("omaha-holdem 3h4hAsKdQh 9d9h8sJs AhAdJc6d 8c6cKhTh 4dKcQsQd"));
  }

  @Test
  public void test_omaha_holdem_5195_3s5d8dJcKh_Ks9sJh9h_AdAhQcAs_5hQsJsJd_7hTh7s4c_4s9c5sKc() {
    assertEquals(
      "7hTh7s4c AdAhQcAs 4s9c5sKc Ks9sJh9h 5hQsJsJd",
      Solver.process("omaha-holdem 3s5d8dJcKh Ks9sJh9h AdAhQcAs 5hQsJsJd 7hTh7s4c 4s9c5sKc"));
  }

  @Test
  public void test_omaha_holdem_5196_5c5d6h7cJd_Ac4d2d7h_Kc5h3s2c_2h8cQs3d_8h3c2sTc_Th4cQh9s_4s9cAh3h_As6dJs4h_Qd7sQc6s() {
    assertEquals(
      "8h3c2sTc 2h8cQs3d Th4cQh9s Ac4d2d7h As6dJs4h Qd7sQc6s Kc5h3s2c 4s9cAh3h",
      Solver.process("omaha-holdem 5c5d6h7cJd Ac4d2d7h Kc5h3s2c 2h8cQs3d 8h3c2sTc Th4cQh9s 4s9cAh3h As6dJs4h Qd7sQc6s"));
  }

  @Test
  public void test_omaha_holdem_5197_8cAdAsJcJh_2s2c4s4h_5s6cTc7c() {
    assertEquals(
      "5s6cTc7c 2s2c4s4h",
      Solver.process("omaha-holdem 8cAdAsJcJh 2s2c4s4h 5s6cTc7c"));
  }

  @Test
  public void test_omaha_holdem_5198_6h7s9cJsKs_Qh4dJdQc_2dKc6c7d_8cAh8hTc() {
    assertEquals(
      "Qh4dJdQc 2dKc6c7d 8cAh8hTc",
      Solver.process("omaha-holdem 6h7s9cJsKs Qh4dJdQc 2dKc6c7d 8cAh8hTc"));
  }

  @Test
  public void test_omaha_holdem_5199_2h7c9hAsTd_AcJhAh3d_7d8d2sJc_5s7s9d9c() {
    assertEquals(
      "5s7s9d9c AcJhAh3d 7d8d2sJc",
      Solver.process("omaha-holdem 2h7c9hAsTd AcJhAh3d 7d8d2sJc 5s7s9d9c"));
  }

  @Test
  public void test_omaha_holdem_5200_2s4sJhKhQs_3h5h7hQh_Kd5s7c5c_As6d6cAd_Jc9c2h4d() {
    assertEquals(
      "3h5h7hQh Kd5s7c5c As6d6cAd Jc9c2h4d",
      Solver.process("omaha-holdem 2s4sJhKhQs 3h5h7hQh Kd5s7c5c As6d6cAd Jc9c2h4d"));
  }

  @Test
  public void test_omaha_holdem_5201_2s3c6hKhQh_5c3d4cTs_AhJs8dKd_5d5s3hAd_9c8s2d6c_4d2hAcJd() {
    assertEquals(
      "4d2hAcJd 5d5s3hAd AhJs8dKd 9c8s2d6c 5c3d4cTs",
      Solver.process("omaha-holdem 2s3c6hKhQh 5c3d4cTs AhJs8dKd 5d5s3hAd 9c8s2d6c 4d2hAcJd"));
  }

  @Test
  public void test_omaha_holdem_5202_4hKsQhTdTh_JdKc3h7c_9c8s7s7h_Kd9h8dAd_AcJh6hQc_2d5s6cTc() {
    assertEquals(
      "9c8s7s7h JdKc3h7c Kd9h8dAd 2d5s6cTc AcJh6hQc",
      Solver.process("omaha-holdem 4hKsQhTdTh JdKc3h7c 9c8s7s7h Kd9h8dAd AcJh6hQc 2d5s6cTc"));
  }

  @Test
  public void test_omaha_holdem_5203_2d3d4hJhTs_Jc3h4d7c_6c6d6h9d_9c7s6sTd_5d9s7dKs_3c2sThAs_8c3s9hTc_2c4sKcKd_AhQd5c5s() {
    assertEquals(
      "5d9s7dKs 6c6d6h9d 9c7s6sTd 2c4sKcKd 3c2sThAs=8c3s9hTc Jc3h4d7c AhQd5c5s",
      Solver.process("omaha-holdem 2d3d4hJhTs Jc3h4d7c 6c6d6h9d 9c7s6sTd 5d9s7dKs 3c2sThAs 8c3s9hTc 2c4sKcKd AhQd5c5s"));
  }

  @Test
  public void test_omaha_holdem_5204_7s8dKhKsQd_4d3dQc2h_Qh2c9sKc_9c6c7d8c_7c4c6sAd_2s8hAcKd_3s3h5sAs_JcJd9d5d_4h3cJs6h() {
    assertEquals(
      "4h3cJs6h 3s3h5sAs 7c4c6sAd 9c6c7d8c JcJd9d5d 4d3dQc2h 2s8hAcKd Qh2c9sKc",
      Solver.process("omaha-holdem 7s8dKhKsQd 4d3dQc2h Qh2c9sKc 9c6c7d8c 7c4c6sAd 2s8hAcKd 3s3h5sAs JcJd9d5d 4h3cJs6h"));
  }

  @Test
  public void test_omaha_holdem_5205_3c4s5c6h7s_9sTsJc3d_Qd6dQc5d_Qh8cTc5s() {
    assertEquals(
      "9sTsJc3d Qd6dQc5d Qh8cTc5s",
      Solver.process("omaha-holdem 3c4s5c6h7s 9sTsJc3d Qd6dQc5d Qh8cTc5s"));
  }

  @Test
  public void test_omaha_holdem_5206_4d7d8hAsKd_Ad7s6h6c_5s8s3h5h_3cTh9d4c_6sTsQs8c_9s5d9c2d_2hTdJh7h_KcQd4sAh_QhKs9h7c_Kh4hTcQc() {
    assertEquals(
      "3cTh9d4c 2hTdJh7h 5s8s3h5h 6sTsQs8c Kh4hTcQc QhKs9h7c Ad7s6h6c KcQd4sAh 9s5d9c2d",
      Solver.process("omaha-holdem 4d7d8hAsKd Ad7s6h6c 5s8s3h5h 3cTh9d4c 6sTsQs8c 9s5d9c2d 2hTdJh7h KcQd4sAh QhKs9h7c Kh4hTcQc"));
  }

  @Test
  public void test_omaha_holdem_5207_2s3d3h8d8s_6hKs6s3c_5c2cQc4d_4cJc8c7c_QhTcTsJh_Qd9sKc2h_5s8h7dAc_6c4s5h6d_Ah3sJsKd_9cTh7s9d() {
    assertEquals(
      "5c2cQc4d Qd9sKc2h 6c4s5h6d 9cTh7s9d QhTcTsJh 6hKs6s3c Ah3sJsKd 4cJc8c7c 5s8h7dAc",
      Solver.process("omaha-holdem 2s3d3h8d8s 6hKs6s3c 5c2cQc4d 4cJc8c7c QhTcTsJh Qd9sKc2h 5s8h7dAc 6c4s5h6d Ah3sJsKd 9cTh7s9d"));
  }

  @Test
  public void test_omaha_holdem_5208_2s4d5hJcKs_AdQdQh5d_Kh6h7d8d_Td7c4c8c_6c9c3hTc_5s4h8sTh_9s6sJd8h_QcTs6dJs_3c2c9h5c() {
    assertEquals(
      "Td7c4c8c 9s6sJd8h QcTs6dJs AdQdQh5d Kh6h7d8d 3c2c9h5c 5s4h8sTh 6c9c3hTc",
      Solver.process("omaha-holdem 2s4d5hJcKs AdQdQh5d Kh6h7d8d Td7c4c8c 6c9c3hTc 5s4h8sTh 9s6sJd8h QcTs6dJs 3c2c9h5c"));
  }

  @Test
  public void test_omaha_holdem_5209_6sJcJhQsTs_Tc2c5d8s_6c6hKc2s_5c3dAd8h() {
    assertEquals(
      "5c3dAd8h Tc2c5d8s 6c6hKc2s",
      Solver.process("omaha-holdem 6sJcJhQsTs Tc2c5d8s 6c6hKc2s 5c3dAd8h"));
  }

  @Test
  public void test_omaha_holdem_5210_2s3c5c8sAd_Tc7sJh4c_Ah3dQs4h() {
    assertEquals(
      "Tc7sJh4c Ah3dQs4h",
      Solver.process("omaha-holdem 2s3c5c8sAd Tc7sJh4c Ah3dQs4h"));
  }

  @Test
  public void test_omaha_holdem_5211_3s5d8dKdTs_5h7sAhTh_2c7c3cJs_As8s2sJd_AdTcTdAc() {
    assertEquals(
      "2c7c3cJs As8s2sJd 5h7sAhTh AdTcTdAc",
      Solver.process("omaha-holdem 3s5d8dKdTs 5h7sAhTh 2c7c3cJs As8s2sJd AdTcTdAc"));
  }

  @Test
  public void test_omaha_holdem_5212_3h5d5s6c6d_4c4d9sKc_7c8sJd5h_Qh8d7sJc_9hTd8h2d_2s9cAh3c_6hKh7dAc() {
    assertEquals(
      "9hTd8h2d Qh8d7sJc 2s9cAh3c 4c4d9sKc 7c8sJd5h 6hKh7dAc",
      Solver.process("omaha-holdem 3h5d5s6c6d 4c4d9sKc 7c8sJd5h Qh8d7sJc 9hTd8h2d 2s9cAh3c 6hKh7dAc"));
  }

  @Test
  public void test_omaha_holdem_5213_5s8cAdJhQd_3c6d7h4d_4s6h6sKc_KdTsTcTh() {
    assertEquals(
      "3c6d7h4d 4s6h6sKc KdTsTcTh",
      Solver.process("omaha-holdem 5s8cAdJhQd 3c6d7h4d 4s6h6sKc KdTsTcTh"));
  }

  @Test
  public void test_omaha_holdem_5214_3h4h9sKhQh_Td6d2c6c_Qd8h6hKs_9hKd5s2s_4c2dAhAs_TcTh3dAd() {
    assertEquals(
      "Td6d2c6c TcTh3dAd 4c2dAhAs 9hKd5s2s Qd8h6hKs",
      Solver.process("omaha-holdem 3h4h9sKhQh Td6d2c6c Qd8h6hKs 9hKd5s2s 4c2dAhAs TcTh3dAd"));
  }

  @Test
  public void test_omaha_holdem_5215_3h5c6c8h9c_Qh9s7d2s_Kh8s7cJh_6d4cKd3c_5h3sJsKs_ThTcQc2h_Ac2dAs2c() {
    assertEquals(
      "5h3sJsKs Kh8s7cJh=Qh9s7d2s 6d4cKd3c ThTcQc2h Ac2dAs2c",
      Solver.process("omaha-holdem 3h5c6c8h9c Qh9s7d2s Kh8s7cJh 6d4cKd3c 5h3sJsKs ThTcQc2h Ac2dAs2c"));
  }

  @Test
  public void test_omaha_holdem_5216_4d5h7dJdQc_3h8h5s4c_Jc8d9cAd_2d3sQs8s_Ah7s7hKh_Kc6cAc9h_Tc6d4s2c_Ks5cTdKd() {
    assertEquals(
      "Kc6cAc9h Tc6d4s2c 2d3sQs8s 3h8h5s4c Ah7s7hKh Ks5cTdKd Jc8d9cAd",
      Solver.process("omaha-holdem 4d5h7dJdQc 3h8h5s4c Jc8d9cAd 2d3sQs8s Ah7s7hKh Kc6cAc9h Tc6d4s2c Ks5cTdKd"));
  }

  @Test
  public void test_omaha_holdem_5217_8hAcAhThTs_KsQc8s5d_3h6dJc3s_8dAd6h7d_4h2d5h3d_JdTc9d9c_6c8c3cQh_7c4c6s4d() {
    assertEquals(
      "3h6dJc3s 7c4c6s4d 6c8c3cQh KsQc8s5d JdTc9d9c 4h2d5h3d 8dAd6h7d",
      Solver.process("omaha-holdem 8hAcAhThTs KsQc8s5d 3h6dJc3s 8dAd6h7d 4h2d5h3d JdTc9d9c 6c8c3cQh 7c4c6s4d"));
  }

  @Test
  public void test_omaha_holdem_5218_4c5d5s8hAd_6hThTc2h_QcAc5hKs_9d8cAsAh_6sQsTdKh_8s6d6c4d_JcJdQh7c() {
    assertEquals(
      "6sQsTdKh 8s6d6c4d 6hThTc2h JcJdQh7c QcAc5hKs 9d8cAsAh",
      Solver.process("omaha-holdem 4c5d5s8hAd 6hThTc2h QcAc5hKs 9d8cAsAh 6sQsTdKh 8s6d6c4d JcJdQh7c"));
  }

  @Test
  public void test_omaha_holdem_5219_4d8d9c9sAh_7hTd6d2s_Js2h6h6c_8s5c3cTh_TcKh4s9h_5hJc8cJd_7dKs7sAc_4hAdQsKc() {
    assertEquals(
      "7hTd6d2s Js2h6h6c 8s5c3cTh 5hJc8cJd 4hAdQsKc=7dKs7sAc TcKh4s9h",
      Solver.process("omaha-holdem 4d8d9c9sAh 7hTd6d2s Js2h6h6c 8s5c3cTh TcKh4s9h 5hJc8cJd 7dKs7sAc 4hAdQsKc"));
  }

  @Test
  public void test_omaha_holdem_5220_2s4s7sQdTh_5d9c8d8c_3s6d5h8s_6hAs4dJh_5c4h7cQc_Qs2c9d7d() {
    assertEquals(
      "6hAs4dJh 5d9c8d8c 5c4h7cQc=Qs2c9d7d 3s6d5h8s",
      Solver.process("omaha-holdem 2s4s7sQdTh 5d9c8d8c 3s6d5h8s 6hAs4dJh 5c4h7cQc Qs2c9d7d"));
  }

  @Test
  public void test_omaha_holdem_5221_3h6h7hAcTs_4hJs2cJd_8h6dKd3c_9cQcKcAd_7cQs4c9h_2hAhJc3d() {
    assertEquals(
      "7cQs4c9h 4hJs2cJd 9cQcKcAd 8h6dKd3c 2hAhJc3d",
      Solver.process("omaha-holdem 3h6h7hAcTs 4hJs2cJd 8h6dKd3c 9cQcKcAd 7cQs4c9h 2hAhJc3d"));
  }

  @Test
  public void test_omaha_holdem_5222_AdAhJdJhQs_4sQd8s9h_2dAcAs7s_8hQcJc6c_3s8c3h5h_4dQh5s3c_2c6s4h7c_6d7h7dKs_9s5d2hTc() {
    assertEquals(
      "2c6s4h7c 9s5d2hTc 3s8c3h5h 6d7h7dKs 4dQh5s3c 4sQd8s9h 8hQcJc6c 2dAcAs7s",
      Solver.process("omaha-holdem AdAhJdJhQs 4sQd8s9h 2dAcAs7s 8hQcJc6c 3s8c3h5h 4dQh5s3c 2c6s4h7c 6d7h7dKs 9s5d2hTc"));
  }

  @Test
  public void test_omaha_holdem_5223_8s9sAdKhQd_Tc9d6s6d_Jd5dAh4d_8h4c3d4s() {
    assertEquals(
      "8h4c3d4s Tc9d6s6d Jd5dAh4d",
      Solver.process("omaha-holdem 8s9sAdKhQd Tc9d6s6d Jd5dAh4d 8h4c3d4s"));
  }

  @Test
  public void test_omaha_holdem_5224_5d5h5sAhQs_2d8dKhTc_9h4s5c8h_4h4dQcJh_7d6cTh6h_AsTs2h9d_Jd7c6d9c_Kd8cQh3h() {
    assertEquals(
      "Jd7c6d9c 2d8dKhTc Kd8cQh3h AsTs2h9d 4h4dQcJh 7d6cTh6h 9h4s5c8h",
      Solver.process("omaha-holdem 5d5h5sAhQs 2d8dKhTc 9h4s5c8h 4h4dQcJh 7d6cTh6h AsTs2h9d Jd7c6d9c Kd8cQh3h"));
  }

  @Test
  public void test_omaha_holdem_5225_6d8sAdKcKd_8dJc4d3h_2d9h3d2h_9cThKs9s_Ah4h8cQd_2s5dTd6s_As9d5hAc_7s8hTs6h_Tc7h6cKh_4cQs3s5c() {
    assertEquals(
      "4cQs3s5c 7s8hTs6h Ah4h8cQd 9cThKs9s 2d9h3d2h 8dJc4d3h 2s5dTd6s Tc7h6cKh As9d5hAc",
      Solver.process("omaha-holdem 6d8sAdKcKd 8dJc4d3h 2d9h3d2h 9cThKs9s Ah4h8cQd 2s5dTd6s As9d5hAc 7s8hTs6h Tc7h6cKh 4cQs3s5c"));
  }

  @Test
  public void test_omaha_holdem_5226_2d6sJsKdQc_Ac5sTs2c_7cAs9hQd_JcJhTd3d_7d3hTh8h_5c3c5d2h_Ks7s8c4d_Jd6d9s4s() {
    assertEquals(
      "7d3hTh8h 5c3c5d2h 7cAs9hQd Ks7s8c4d Jd6d9s4s JcJhTd3d Ac5sTs2c",
      Solver.process("omaha-holdem 2d6sJsKdQc Ac5sTs2c 7cAs9hQd JcJhTd3d 7d3hTh8h 5c3c5d2h Ks7s8c4d Jd6d9s4s"));
  }

  @Test
  public void test_omaha_holdem_5227_3c3d5hJcJd_5c7h9s6c_KcQcTsQd_8c9dAhQh_9cJhQs7d_Kd4h2dTh_3h4d8h4s() {
    assertEquals(
      "Kd4h2dTh 8c9dAhQh 5c7h9s6c KcQcTsQd 3h4d8h4s 9cJhQs7d",
      Solver.process("omaha-holdem 3c3d5hJcJd 5c7h9s6c KcQcTsQd 8c9dAhQh 9cJhQs7d Kd4h2dTh 3h4d8h4s"));
  }

  @Test
  public void test_omaha_holdem_5228_4s6d7hKsTh_JdJh9h5d_5s3dTs8d_9cKhTdAs_4dKcJc4c_5cJs7sTc_9s8cKdQh_Ac9d2c3s_Qs8s2h6s_Qd2s2d7c() {
    assertEquals(
      "Ac9d2c3s Qs8s2h6s Qd2s2d7c JdJh9h5d 5cJs7sTc 9cKhTdAs 4dKcJc4c 5s3dTs8d 9s8cKdQh",
      Solver.process("omaha-holdem 4s6d7hKsTh JdJh9h5d 5s3dTs8d 9cKhTdAs 4dKcJc4c 5cJs7sTc 9s8cKdQh Ac9d2c3s Qs8s2h6s Qd2s2d7c"));
  }

  @Test
  public void test_omaha_holdem_5229_2c4s5c6hAd_9s2h9h7s_4cTsTd9d_4dKh8sAs_Ac7cTh3c_6s2dQc6c() {
    assertEquals(
      "9s2h9h7s 4cTsTd9d 4dKh8sAs 6s2dQc6c Ac7cTh3c",
      Solver.process("omaha-holdem 2c4s5c6hAd 9s2h9h7s 4cTsTd9d 4dKh8sAs Ac7cTh3c 6s2dQc6c"));
  }

  @Test
  public void test_omaha_holdem_5230_6c7s9sKdTh_2cKc4h3s_Kh7d3d9c() {
    assertEquals(
      "2cKc4h3s Kh7d3d9c",
      Solver.process("omaha-holdem 6c7s9sKdTh 2cKc4h3s Kh7d3d9c"));
  }

  @Test
  public void test_omaha_holdem_5231_2s4c9cQcTc_4dAdKd2h_Kc9h8s5h_Jc7d3d5s_3s8cJhJd_3h8h6h2d() {
    assertEquals(
      "Jc7d3d5s 3h8h6h2d Kc9h8s5h 4dAdKd2h 3s8cJhJd",
      Solver.process("omaha-holdem 2s4c9cQcTc 4dAdKd2h Kc9h8s5h Jc7d3d5s 3s8cJhJd 3h8h6h2d"));
  }

  @Test
  public void test_omaha_holdem_5232_3s6hKcQcTc_Qh6c2c7c_As2hJh4s_8cKd9hTh_KhAh3c6d_8d8hTd3h_Ac5dJs5c_Ks7d8sAd_3dQs5h7h_Ts9c9dJc() {
    assertEquals(
      "Ks7d8sAd 8d8hTd3h 3dQs5h7h KhAh3c6d 8cKd9hTh As2hJh4s Qh6c2c7c Ac5dJs5c Ts9c9dJc",
      Solver.process("omaha-holdem 3s6hKcQcTc Qh6c2c7c As2hJh4s 8cKd9hTh KhAh3c6d 8d8hTd3h Ac5dJs5c Ks7d8sAd 3dQs5h7h Ts9c9dJc"));
  }

  @Test
  public void test_omaha_holdem_5233_4hAdJcQhTc_8hKc7c8s_5d4d8c5h_Qs9c7d5c_AhAcTd4s_7hKs6d6c() {
    assertEquals(
      "5d4d8c5h 7hKs6d6c 8hKc7c8s Qs9c7d5c AhAcTd4s",
      Solver.process("omaha-holdem 4hAdJcQhTc 8hKc7c8s 5d4d8c5h Qs9c7d5c AhAcTd4s 7hKs6d6c"));
  }

  @Test
  public void test_omaha_holdem_5234_3c4s5c8c8d_QsKhAsKc_7cAc7s3s_Qh5s2c2s() {
    assertEquals(
      "Qh5s2c2s QsKhAsKc 7cAc7s3s",
      Solver.process("omaha-holdem 3c4s5c8c8d QsKhAsKc 7cAc7s3s Qh5s2c2s"));
  }

  @Test
  public void test_omaha_holdem_5235_5d9cJcKhTd_As4s2d2c_8hAd4dTc_Qs9h3h6s_5cThQc6c_6h7cTs9d_8dKs6d3s() {
    assertEquals(
      "As4s2d2c 8hAd4dTc 8dKs6d3s 6h7cTs9d 5cThQc6c=Qs9h3h6s",
      Solver.process("omaha-holdem 5d9cJcKhTd As4s2d2c 8hAd4dTc Qs9h3h6s 5cThQc6c 6h7cTs9d 8dKs6d3s"));
  }

  @Test
  public void test_omaha_holdem_5236_6s7h9sJhKc_Ad9h6cAs_Ac2cTs7c_8d2dTh9d() {
    assertEquals(
      "Ac2cTs7c Ad9h6cAs 8d2dTh9d",
      Solver.process("omaha-holdem 6s7h9sJhKc Ad9h6cAs Ac2cTs7c 8d2dTh9d"));
  }

  @Test
  public void test_omaha_holdem_5237_3s4h5c5s6s_7h9dQdKs_8hKc9cAd_8dJs3d8s_6d9sTd4d_2c9hQc4c_Kh5hKd5d_3hJd2hJc() {
    assertEquals(
      "7h9dQdKs 8hKc9cAd 6d9sTd4d 2c9hQc4c=3hJd2hJc 8dJs3d8s Kh5hKd5d",
      Solver.process("omaha-holdem 3s4h5c5s6s 7h9dQdKs 8hKc9cAd 8dJs3d8s 6d9sTd4d 2c9hQc4c Kh5hKd5d 3hJd2hJc"));
  }

  @Test
  public void test_omaha_holdem_5238_5hAdAhJcQh_7hJd7s4c_5s3dKd4h_9hQs4sTc() {
    assertEquals(
      "5s3dKd4h 7hJd7s4c 9hQs4sTc",
      Solver.process("omaha-holdem 5hAdAhJcQh 7hJd7s4c 5s3dKd4h 9hQs4sTc"));
  }

  @Test
  public void test_omaha_holdem_5239_4h5c5d8d9h_Qd3d6dTc_9cAc6s6h_8sQc7d3s() {
    assertEquals(
      "Qd3d6dTc 8sQc7d3s 9cAc6s6h",
      Solver.process("omaha-holdem 4h5c5d8d9h Qd3d6dTc 9cAc6s6h 8sQc7d3s"));
  }

  @Test
  public void test_omaha_holdem_5240_4c4s8dAcAd_Qh6d7h9s_Qs8sQc3c() {
    assertEquals(
      "Qh6d7h9s Qs8sQc3c",
      Solver.process("omaha-holdem 4c4s8dAcAd Qh6d7h9s Qs8sQc3c"));
  }

  @Test
  public void test_omaha_holdem_5241_5c9hAdJdQh_5d9d7h3s_6sTsThAs_8s3d3h2h_Td9s6c5h_Qc2sTcKh_6hAhJc8c() {
    assertEquals(
      "8s3d3h2h 6sTsThAs 5d9d7h3s=Td9s6c5h 6hAhJc8c Qc2sTcKh",
      Solver.process("omaha-holdem 5c9hAdJdQh 5d9d7h3s 6sTsThAs 8s3d3h2h Td9s6c5h Qc2sTcKh 6hAhJc8c"));
  }

  @Test
  public void test_omaha_holdem_5242_5c5h6s7s9d_3dKs9h9s_7dQdThTs_4dTcAh4h_KcJhJcTd_6c2c3c2h_3h8s8d6d_Ad7h3s7c_8hQhAcKh_Kd2dJd5s() {
    assertEquals(
      "8hQhAcKh 4dTcAh4h 6c2c3c2h 7dQdThTs KcJhJcTd Kd2dJd5s 3h8s8d6d Ad7h3s7c 3dKs9h9s",
      Solver.process("omaha-holdem 5c5h6s7s9d 3dKs9h9s 7dQdThTs 4dTcAh4h KcJhJcTd 6c2c3c2h 3h8s8d6d Ad7h3s7c 8hQhAcKh Kd2dJd5s"));
  }

  @Test
  public void test_omaha_holdem_5243_2d3d6d8hAh_2hKh3s9h_Tc7d3h9s() {
    assertEquals(
      "Tc7d3h9s 2hKh3s9h",
      Solver.process("omaha-holdem 2d3d6d8hAh 2hKh3s9h Tc7d3h9s"));
  }

  @Test
  public void test_omaha_holdem_5244_2c4h7hJhTd_4s5cAcQh_4cJdKs3c() {
    assertEquals(
      "4s5cAcQh 4cJdKs3c",
      Solver.process("omaha-holdem 2c4h7hJhTd 4s5cAcQh 4cJdKs3c"));
  }

  @Test
  public void test_omaha_holdem_5245_2h6s9c9dAh_TdTs6hJs_7hQh8hKd_5h6d7cJh_4hQs2s9s_Qc3cJdKc_4cAs9h5d_6c4d5cKs_7s7dQd8s() {
    assertEquals(
      "7hQh8hKd=Qc3cJdKc 5h6d7cJh 6c4d5cKs 7s7dQd8s TdTs6hJs 4hQs2s9s 4cAs9h5d",
      Solver.process("omaha-holdem 2h6s9c9dAh TdTs6hJs 7hQh8hKd 5h6d7cJh 4hQs2s9s Qc3cJdKc 4cAs9h5d 6c4d5cKs 7s7dQd8s"));
  }

  @Test
  public void test_omaha_holdem_5246_5sAdJdQdQs_5c9h9dTh_5h6s9cJh() {
    assertEquals(
      "5c9h9dTh 5h6s9cJh",
      Solver.process("omaha-holdem 5sAdJdQdQs 5c9h9dTh 5h6s9cJh"));
  }

  @Test
  public void test_omaha_holdem_5247_3c7d9hTcTh_7cJh5h2c_Qd6s7hTd_5d9c3h8c_9s6d5sQc_AcKd9dKc_4h5cJcAs() {
    assertEquals(
      "4h5cJcAs 7cJh5h2c 5d9c3h8c 9s6d5sQc AcKd9dKc Qd6s7hTd",
      Solver.process("omaha-holdem 3c7d9hTcTh 7cJh5h2c Qd6s7hTd 5d9c3h8c 9s6d5sQc AcKd9dKc 4h5cJcAs"));
  }

  @Test
  public void test_omaha_holdem_5248_3h5d6h7h8s_2sTc3cJc_KcJh4s9d_Ks4hKdAd_6s5c4d9c_Qh3dJdTd() {
    assertEquals(
      "KcJh4s9d 2sTc3cJc Qh3dJdTd Ks4hKdAd 6s5c4d9c",
      Solver.process("omaha-holdem 3h5d6h7h8s 2sTc3cJc KcJh4s9d Ks4hKdAd 6s5c4d9c Qh3dJdTd"));
  }

  @Test
  public void test_omaha_holdem_5249_7c8sQcQdTd_3c2d2hJc_2sJd2cJh_6cAdAc5s_6s8d3d8h_9hQh5d7d() {
    assertEquals(
      "3c2d2hJc 2sJd2cJh 6cAdAc5s 6s8d3d8h 9hQh5d7d",
      Solver.process("omaha-holdem 7c8sQcQdTd 3c2d2hJc 2sJd2cJh 6cAdAc5s 6s8d3d8h 9hQh5d7d"));
  }

}
