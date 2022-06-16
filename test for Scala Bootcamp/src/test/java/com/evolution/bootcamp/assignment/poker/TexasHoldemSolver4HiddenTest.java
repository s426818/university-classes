
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver4HiddenTest {


  @Test
  public void test_texas_holdem_1000_3hAdAhKsQc_9c4c_3c9s_QhJd_Td5c() {
    assertEquals(
      "9c4c Td5c 3c9s QhJd",
      Solver.process("texas-holdem 3hAdAhKsQc 9c4c 3c9s QhJd Td5c"));
  }

  @Test
  public void test_texas_holdem_1001_2d3d4cJcKs_5s3c_6s9c_Js5c_Jh2h() {
    assertEquals(
      "6s9c 5s3c Js5c Jh2h",
      Solver.process("texas-holdem 2d3d4cJcKs 5s3c 6s9c Js5c Jh2h"));
  }

  @Test
  public void test_texas_holdem_1002_3c5c7h9hJh_3h2s_4hTh_AhKs_KhAs_6s4d_4s5d() {
    assertEquals(
      "AhKs=KhAs 3h2s 4s5d 6s4d 4hTh",
      Solver.process("texas-holdem 3c5c7h9hJh 3h2s 4hTh AhKs KhAs 6s4d 4s5d"));
  }

  @Test
  public void test_texas_holdem_1003_3s4h6h8hKh_AsQs_8sTc_4s4c_5sAc_8c5c_7c9s_3cQh_JhTd() {
    assertEquals(
      "7c9s 5sAc AsQs 8c5c 8sTc 4s4c JhTd 3cQh",
      Solver.process("texas-holdem 3s4h6h8hKh AsQs 8sTc 4s4c 5sAc 8c5c 7c9s 3cQh JhTd"));
  }

  @Test
  public void test_texas_holdem_1004_3h4h5hQhTs_8d2h_Jh9s() {
    assertEquals(
      "8d2h Jh9s",
      Solver.process("texas-holdem 3h4h5hQhTs 8d2h Jh9s"));
  }

  @Test
  public void test_texas_holdem_1005_2d7s9hJcQh_8h4s_2c8d_7hQd_5cJh_Js6c_6s5d() {
    assertEquals(
      "6s5d 8h4s 2c8d 5cJh=Js6c 7hQd",
      Solver.process("texas-holdem 2d7s9hJcQh 8h4s 2c8d 7hQd 5cJh Js6c 6s5d"));
  }

  @Test
  public void test_texas_holdem_1006_3d4c5d9cAs_8d2h_Kc8c_Qs7h_4dTc_Th3c_5h5s_7sKs_2d9d() {
    assertEquals(
      "Qs7h 7sKs Kc8c Th3c 4dTc 5h5s 2d9d=8d2h",
      Solver.process("texas-holdem 3d4c5d9cAs 8d2h Kc8c Qs7h 4dTc Th3c 5h5s 7sKs 2d9d"));
  }

  @Test
  public void test_texas_holdem_1007_3d4c7sKcQs_QhTc_TsKd_Jh2s_As6c_6sQd_8hJs_5h4s() {
    assertEquals(
      "Jh2s 8hJs As6c 5h4s 6sQd QhTc TsKd",
      Solver.process("texas-holdem 3d4c7sKcQs QhTc TsKd Jh2s As6c 6sQd 8hJs 5h4s"));
  }

  @Test
  public void test_texas_holdem_1008_4d6dAcJdJh_Td6c_4c5d_TcKh_7cJs_Kd3s_3hQc_5hQh_2c9c() {
    assertEquals(
      "2c9c 3hQc=5hQh Kd3s TcKh 4c5d Td6c 7cJs",
      Solver.process("texas-holdem 4d6dAcJdJh Td6c 4c5d TcKh 7cJs Kd3s 3hQc 5hQh 2c9c"));
  }

  @Test
  public void test_texas_holdem_1009_4c9dKdQcTs_Js6c_4h5s_5h6s_3dAc_Tc2d() {
    assertEquals(
      "5h6s 3dAc 4h5s Tc2d Js6c",
      Solver.process("texas-holdem 4c9dKdQcTs Js6c 4h5s 5h6s 3dAc Tc2d"));
  }

  @Test
  public void test_texas_holdem_1010_5d6sJcJdTc_2sAd_KdKs_8c5c_Ah3s_2dTs_9d9c_3d9h() {
    assertEquals(
      "3d9h 2sAd=Ah3s 8c5c 9d9c 2dTs KdKs",
      Solver.process("texas-holdem 5d6sJcJdTc 2sAd KdKs 8c5c Ah3s 2dTs 9d9c 3d9h"));
  }

  @Test
  public void test_texas_holdem_1011_3h7d7sJcJs_9c3s_AsQs_9dAd_8d4h_Kh7c_Kc9s_5sAc() {
    assertEquals(
      "8d4h 9c3s Kc9s 5sAc=9dAd=AsQs Kh7c",
      Solver.process("texas-holdem 3h7d7sJcJs 9c3s AsQs 9dAd 8d4h Kh7c Kc9s 5sAc"));
  }

  @Test
  public void test_texas_holdem_1012_5d5sQdTcTh_Kd8d_9cQh_6s9d_4h3h_5cKs_Qc3c_Ts2d_Ah8s() {
    assertEquals(
      "4h3h=6s9d Kd8d Ah8s Qc3c 9cQh 5cKs Ts2d",
      Solver.process("texas-holdem 5d5sQdTcTh Kd8d 9cQh 6s9d 4h3h 5cKs Qc3c Ts2d Ah8s"));
  }

  @Test
  public void test_texas_holdem_1013_3h3s4sAsQs_6hJc_5s2d_Tc5h_KsKd() {
    assertEquals(
      "Tc5h 6hJc 5s2d KsKd",
      Solver.process("texas-holdem 3h3s4sAsQs 6hJc 5s2d Tc5h KsKd"));
  }

  @Test
  public void test_texas_holdem_1014_5h6dJhKcKh_Ks7h_3d6s_4c4d_QhTh_2dQd_Td7d_9d7c_8s9c_9h3s() {
    assertEquals(
      "9h3s 9d7c 8s9c Td7d 2dQd 4c4d 3d6s Ks7h QhTh",
      Solver.process("texas-holdem 5h6dJhKcKh Ks7h 3d6s 4c4d QhTh 2dQd Td7d 9d7c 8s9c 9h3s"));
  }

  @Test
  public void test_texas_holdem_1015_3h6s9sJsQs_Jd9d_4cKc() {
    assertEquals(
      "4cKc Jd9d",
      Solver.process("texas-holdem 3h6s9sJsQs Jd9d 4cKc"));
  }

  @Test
  public void test_texas_holdem_1016_4c7hJcKhTd_8h8d_2h3s_Qd9c_QcKc_Kd6d_AsTh_7s4d() {
    assertEquals(
      "2h3s 8h8d AsTh Kd6d QcKc 7s4d Qd9c",
      Solver.process("texas-holdem 4c7hJcKhTd 8h8d 2h3s Qd9c QcKc Kd6d AsTh 7s4d"));
  }

  @Test
  public void test_texas_holdem_1017_2s3c6c6s7s_4s7d_Qd3s_Ks8c_Qs8d_9h5s_9d6h_Kh6d_5hJs_Qc7c() {
    assertEquals(
      "9h5s 5hJs Qs8d Ks8c Qd3s 4s7d Qc7c 9d6h Kh6d",
      Solver.process("texas-holdem 2s3c6c6s7s 4s7d Qd3s Ks8c Qs8d 9h5s 9d6h Kh6d 5hJs Qc7c"));
  }

  @Test
  public void test_texas_holdem_1018_3h4d7dJhTd_5c4h_3sAh_9c8s_3dKs_2d2h_9s2s_8d3c_JcKh_4c8c() {
    assertEquals(
      "9s2s 2d2h 8d3c 3dKs 3sAh 5c4h 4c8c JcKh 9c8s",
      Solver.process("texas-holdem 3h4d7dJhTd 5c4h 3sAh 9c8s 3dKs 2d2h 9s2s 8d3c JcKh 4c8c"));
  }

  @Test
  public void test_texas_holdem_1019_2c5s8cAsKd_TcQs_QhQd_9sJh_KcTh_6hKs_Ad3s_6d9c_3d7c() {
    assertEquals(
      "3d7c 6d9c 9sJh TcQs QhQd 6hKs KcTh Ad3s",
      Solver.process("texas-holdem 2c5s8cAsKd TcQs QhQd 9sJh KcTh 6hKs Ad3s 6d9c 3d7c"));
  }

  @Test
  public void test_texas_holdem_1020_3h6d7h8dKs_4c5c_Qs8s_6h3s_Td2s() {
    assertEquals(
      "Td2s Qs8s 6h3s 4c5c",
      Solver.process("texas-holdem 3h6d7h8dKs 4c5c Qs8s 6h3s Td2s"));
  }

  @Test
  public void test_texas_holdem_1021_5c5s6c6d7d_8h6h_9h3h_QsJh_2h4s() {
    assertEquals(
      "2h4s 9h3h QsJh 8h6h",
      Solver.process("texas-holdem 5c5s6c6d7d 8h6h 9h3h QsJh 2h4s"));
  }

  @Test
  public void test_texas_holdem_1022_4c4s6h9dAc_6s5h_Ts3h_8s2c_3c7s_QdTd() {
    assertEquals(
      "3c7s 8s2c Ts3h QdTd 6s5h",
      Solver.process("texas-holdem 4c4s6h9dAc 6s5h Ts3h 8s2c 3c7s QdTd"));
  }

  @Test
  public void test_texas_holdem_1023_3c4s5h9cTs_QsKc_9d8s_Kd7s_Js5s_6s6c_Jd9h() {
    assertEquals(
      "Kd7s QsKc Js5s 6s6c 9d8s Jd9h",
      Solver.process("texas-holdem 3c4s5h9cTs QsKc 9d8s Kd7s Js5s 6s6c Jd9h"));
  }

  @Test
  public void test_texas_holdem_1024_3h5c5s6h9h_2hJh_4h7c_Th5h_6d3d_Kc7d_6cKh_4s6s() {
    assertEquals(
      "Kc7d 4s6s=6d3d 6cKh 4h7c Th5h 2hJh",
      Solver.process("texas-holdem 3h5c5s6h9h 2hJh 4h7c Th5h 6d3d Kc7d 6cKh 4s6s"));
  }

  @Test
  public void test_texas_holdem_1025_2c5s7d8h9d_TsJc_4cKc_7c3s_JhAh_As7s() {
    assertEquals(
      "4cKc JhAh 7c3s As7s TsJc",
      Solver.process("texas-holdem 2c5s7d8h9d TsJc 4cKc 7c3s JhAh As7s"));
  }

  @Test
  public void test_texas_holdem_1026_9sAsKsQcQs_3cAh_JsTd_5d6s_JcTh_2s7c_Kh9h_8c8d_5s2h() {
    assertEquals(
      "8c8d Kh9h 3cAh JcTh 2s7c 5s2h 5d6s JsTd",
      Solver.process("texas-holdem 9sAsKsQcQs 3cAh JsTd 5d6s JcTh 2s7c Kh9h 8c8d 5s2h"));
  }

  @Test
  public void test_texas_holdem_1027_3d3h8s9cJh_6d7h_4s4h_Tc6c_As8d_2c7d() {
    assertEquals(
      "2c7d=6d7h Tc6c 4s4h As8d",
      Solver.process("texas-holdem 3d3h8s9cJh 6d7h 4s4h Tc6c As8d 2c7d"));
  }

  @Test
  public void test_texas_holdem_1028_3h4s6hAdAh_4hQs_2hJc_Ac7d_4dQh_Kc8d_Ks9d_3c2d_Qc7h() {
    assertEquals(
      "2hJc Qc7h Kc8d Ks9d 3c2d 4dQh=4hQs Ac7d",
      Solver.process("texas-holdem 3h4s6hAdAh 4hQs 2hJc Ac7d 4dQh Kc8d Ks9d 3c2d Qc7h"));
  }

  @Test
  public void test_texas_holdem_1029_2s3c9dJcKd_Qs2d_5s9c() {
    assertEquals(
      "Qs2d 5s9c",
      Solver.process("texas-holdem 2s3c9dJcKd Qs2d 5s9c"));
  }

  @Test
  public void test_texas_holdem_1030_3d7c8h9c9s_5cKd_6sQd_7d6h_Th2h_4c6c_KhTs() {
    assertEquals(
      "4c6c Th2h 6sQd 5cKd KhTs 7d6h",
      Solver.process("texas-holdem 3d7c8h9c9s 5cKd 6sQd 7d6h Th2h 4c6c KhTs"));
  }

  @Test
  public void test_texas_holdem_1031_2h4s9h9sTs_6h7d_4hKs_5h7h() {
    assertEquals(
      "5h7h 6h7d 4hKs",
      Solver.process("texas-holdem 2h4s9h9sTs 6h7d 4hKs 5h7h"));
  }

  @Test
  public void test_texas_holdem_1032_3s8hJcKdKh_Ac7d_4hAs_3hQs_5dTs() {
    assertEquals(
      "5dTs 4hAs=Ac7d 3hQs",
      Solver.process("texas-holdem 3s8hJcKdKh Ac7d 4hAs 3hQs 5dTs"));
  }

  @Test
  public void test_texas_holdem_1033_3h4d5d7c7d_Td6s_Qs3d_7sTs_2c9s_2sQd_2d4c_8s9h() {
    assertEquals(
      "2c9s 8s9h 2sQd Qs3d 2d4c 7sTs Td6s",
      Solver.process("texas-holdem 3h4d5d7c7d Td6s Qs3d 7sTs 2c9s 2sQd 2d4c 8s9h"));
  }

  @Test
  public void test_texas_holdem_1034_2c2d5h6cQc_Kc6d_7dKh_3s2h_9h7s_Jc5s_8d7c_8hTd_AdQh_4sAs() {
    assertEquals(
      "8d7c 9h7s 8hTd 7dKh 4sAs Jc5s Kc6d AdQh 3s2h",
      Solver.process("texas-holdem 2c2d5h6cQc Kc6d 7dKh 3s2h 9h7s Jc5s 8d7c 8hTd AdQh 4sAs"));
  }

  @Test
  public void test_texas_holdem_1035_2s3hKsTcTd_Kc8h_4h8c_3c4c_9hJc_5s3d_9dQh_4d2h_6s9s_AhAs() {
    assertEquals(
      "4h8c 6s9s 9hJc 9dQh 4d2h 3c4c=5s3d Kc8h AhAs",
      Solver.process("texas-holdem 2s3hKsTcTd Kc8h 4h8c 3c4c 9hJc 5s3d 9dQh 4d2h 6s9s AhAs"));
  }

  @Test
  public void test_texas_holdem_1036_3s8h9cQcQs_9h7c_5c3c_Ts4s_2c7s_3d5d() {
    assertEquals(
      "2c7s Ts4s 3d5d=5c3c 9h7c",
      Solver.process("texas-holdem 3s8h9cQcQs 9h7c 5c3c Ts4s 2c7s 3d5d"));
  }

  @Test
  public void test_texas_holdem_1037_4s6sAdAsKs_5s7s_Jc6d() {
    assertEquals(
      "Jc6d 5s7s",
      Solver.process("texas-holdem 4s6sAdAsKs 5s7s Jc6d"));
  }

  @Test
  public void test_texas_holdem_1038_5h6cAdAhKc_2d5s_9hJh_Js6h_9dJc_6dQc_QsAc() {
    assertEquals(
      "9dJc=9hJh 2d5s 6dQc=Js6h QsAc",
      Solver.process("texas-holdem 5h6cAdAhKc 2d5s 9hJh Js6h 9dJc 6dQc QsAc"));
  }

  @Test
  public void test_texas_holdem_1039_3s4s8sTcTd_8c9h_Jc4h() {
    assertEquals(
      "Jc4h 8c9h",
      Solver.process("texas-holdem 3s4s8sTcTd 8c9h Jc4h"));
  }

  @Test
  public void test_texas_holdem_1040_2d6h7c8sAh_JcTh_9cJd_3s8d_Ts2s() {
    assertEquals(
      "9cJd JcTh Ts2s 3s8d",
      Solver.process("texas-holdem 2d6h7c8sAh JcTh 9cJd 3s8d Ts2s"));
  }

  @Test
  public void test_texas_holdem_1041_2h3h4c4sTh_5sKc_3s5h_2sJs_Jc6h_5cQs_Ks6d_4h6c() {
    assertEquals(
      "Jc6h 5cQs 5sKc Ks6d 2sJs 3s5h 4h6c",
      Solver.process("texas-holdem 2h3h4c4sTh 5sKc 3s5h 2sJs Jc6h 5cQs Ks6d 4h6c"));
  }

  @Test
  public void test_texas_holdem_1042_2c2s7s8cKh_JdQd_6cTs() {
    assertEquals(
      "6cTs JdQd",
      Solver.process("texas-holdem 2c2s7s8cKh JdQd 6cTs"));
  }

  @Test
  public void test_texas_holdem_1043_2d3c4c9sAs_8cTh_JcKc_6cAd_Ah7h_9h6s() {
    assertEquals(
      "8cTh JcKc 9h6s 6cAd Ah7h",
      Solver.process("texas-holdem 2d3c4c9sAs 8cTh JcKc 6cAd Ah7h 9h6s"));
  }

  @Test
  public void test_texas_holdem_1044_4s5c6d8dQh_Ts9h_AdJc_Ks8c_Qd9s_3d6s_7d6c() {
    assertEquals(
      "Ts9h AdJc 3d6s Ks8c Qd9s 7d6c",
      Solver.process("texas-holdem 4s5c6d8dQh Ts9h AdJc Ks8c Qd9s 3d6s 7d6c"));
  }

  @Test
  public void test_texas_holdem_1045_5d8h9c9sTd_4d7c_QcTh_KhQh_Jc3d_3hKc() {
    assertEquals(
      "4d7c Jc3d 3hKc KhQh QcTh",
      Solver.process("texas-holdem 5d8h9c9sTd 4d7c QcTh KhQh Jc3d 3hKc"));
  }

  @Test
  public void test_texas_holdem_1046_4d5c8s9sQd_2sAd_Qc2c_Ah7d_7cAc_JhKd_6c4c_2d4h_7s2h() {
    assertEquals(
      "7s2h JhKd 2sAd 7cAc=Ah7d 2d4h=6c4c Qc2c",
      Solver.process("texas-holdem 4d5c8s9sQd 2sAd Qc2c Ah7d 7cAc JhKd 6c4c 2d4h 7s2h"));
  }

  @Test
  public void test_texas_holdem_1047_2d2s3hQcTh_9cTs_5h3d_Ac6h_TdKc_Js3c_Ks8s_Jc8h() {
    assertEquals(
      "Jc8h Ks8s Ac6h 5h3d=Js3c 9cTs TdKc",
      Solver.process("texas-holdem 2d2s3hQcTh 9cTs 5h3d Ac6h TdKc Js3c Ks8s Jc8h"));
  }

  @Test
  public void test_texas_holdem_1048_6d8hKsQdTh_Jh7c_4d5d_7h4c_3sJs_3h2d_8c3d_2c4s_2h4h_3c9h() {
    assertEquals(
      "2c4s=2h4h=3h2d=4d5d 7h4c 3c9h 3sJs=Jh7c 8c3d",
      Solver.process("texas-holdem 6d8hKsQdTh Jh7c 4d5d 7h4c 3sJs 3h2d 8c3d 2c4s 2h4h 3c9h"));
  }

  @Test
  public void test_texas_holdem_1049_5c5h6d8hTh_KdTc_3h7s_2d9s_TdKc() {
    assertEquals(
      "3h7s 2d9s KdTc=TdKc",
      Solver.process("texas-holdem 5c5h6d8hTh KdTc 3h7s 2d9s TdKc"));
  }

  @Test
  public void test_texas_holdem_1050_2h7h8c8hTs_Kc2d_5sQh_TcAc_4cKh_TdKs_3s7c_Qd6s_4s5h_7s9h() {
    assertEquals(
      "4s5h 5sQh=Qd6s 4cKh Kc2d 3s7c=7s9h TdKs TcAc",
      Solver.process("texas-holdem 2h7h8c8hTs Kc2d 5sQh TcAc 4cKh TdKs 3s7c Qd6s 4s5h 7s9h"));
  }

  @Test
  public void test_texas_holdem_1051_2c3c3s4sKc_7d2d_Ah4h_QdAd_8hKs_Ac6c_3hKh_5hAs() {
    assertEquals(
      "QdAd 7d2d Ah4h 8hKs 5hAs Ac6c 3hKh",
      Solver.process("texas-holdem 2c3c3s4sKc 7d2d Ah4h QdAd 8hKs Ac6c 3hKh 5hAs"));
  }

  @Test
  public void test_texas_holdem_1052_3s6d6s7sTs_9h7c_7hKs_5hAc() {
    assertEquals(
      "5hAc 9h7c 7hKs",
      Solver.process("texas-holdem 3s6d6s7sTs 9h7c 7hKs 5hAc"));
  }

  @Test
  public void test_texas_holdem_1053_3s5c7h8dAh_6s6c_Qs9h() {
    assertEquals(
      "Qs9h 6s6c",
      Solver.process("texas-holdem 3s5c7h8dAh 6s6c Qs9h"));
  }

  @Test
  public void test_texas_holdem_1054_7h8sKdQdTd_3dQc_4d6h_7s5s_KcJd_3c8d_6d5h_4sJc() {
    assertEquals(
      "4d6h=6d5h 4sJc 7s5s 3c8d 3dQc KcJd",
      Solver.process("texas-holdem 7h8sKdQdTd 3dQc 4d6h 7s5s KcJd 3c8d 6d5h 4sJc"));
  }

  @Test
  public void test_texas_holdem_1055_3c4c6d8cKs_Jh7h_5sTs_KdAh_2d6c_7s9d_5d3d_6sTd_5c3h() {
    assertEquals(
      "7s9d 5sTs Jh7h 5c3h=5d3d 2d6c 6sTd KdAh",
      Solver.process("texas-holdem 3c4c6d8cKs Jh7h 5sTs KdAh 2d6c 7s9d 5d3d 6sTd 5c3h"));
  }

  @Test
  public void test_texas_holdem_1056_2s4s9sKcKd_QsJc_TdQd_6s6d_Js9c_Jd4h() {
    assertEquals(
      "TdQd QsJc Jd4h 6s6d Js9c",
      Solver.process("texas-holdem 2s4s9sKcKd QsJc TdQd 6s6d Js9c Jd4h"));
  }

  @Test
  public void test_texas_holdem_1057_2s3c8d9dAs_QdKh_Qs2c_8s3d_8h4c_KcTs_Js9s_JcTd_6cKs_6s5d() {
    assertEquals(
      "6s5d JcTd 6cKs KcTs QdKh Qs2c 8h4c Js9s 8s3d",
      Solver.process("texas-holdem 2s3c8d9dAs QdKh Qs2c 8s3d 8h4c KcTs Js9s JcTd 6cKs 6s5d"));
  }

  @Test
  public void test_texas_holdem_1058_3s4cAdJhTs_Th5d_3hAs_JsAc_6h8d_8sKd() {
    assertEquals(
      "6h8d 8sKd Th5d 3hAs JsAc",
      Solver.process("texas-holdem 3s4cAdJhTs Th5d 3hAs JsAc 6h8d 8sKd"));
  }

  @Test
  public void test_texas_holdem_1059_7c7h7sTcTd_5d9c_6dQc_JcTh_3h4d_2cKd_5h3d() {
    assertEquals(
      "2cKd=3h4d=5d9c=5h3d=6dQc JcTh",
      Solver.process("texas-holdem 7c7h7sTcTd 5d9c 6dQc JcTh 3h4d 2cKd 5h3d"));
  }

  @Test
  public void test_texas_holdem_1060_4c7h8dTdTh_6sJd_2hJc() {
    assertEquals(
      "2hJc=6sJd",
      Solver.process("texas-holdem 4c7h8dTdTh 6sJd 2hJc"));
  }

  @Test
  public void test_texas_holdem_1061_2h5c5dKdTc_Jc9h_JsAc_Jd3d_Kh4d_Qh2s_4cAs_3c7h_Ah9c() {
    assertEquals(
      "3c7h Jc9h=Jd3d 4cAs=Ah9c JsAc Qh2s Kh4d",
      Solver.process("texas-holdem 2h5c5dKdTc Jc9h JsAc Jd3d Kh4d Qh2s 4cAs 3c7h Ah9c"));
  }

  @Test
  public void test_texas_holdem_1062_5d7c8hKdQh_Ad7d_KcQs_9hJh_3hKh_As2d_8dTh() {
    assertEquals(
      "9hJh As2d Ad7d 8dTh 3hKh KcQs",
      Solver.process("texas-holdem 5d7c8hKdQh Ad7d KcQs 9hJh 3hKh As2d 8dTh"));
  }

  @Test
  public void test_texas_holdem_1063_3c6dKdQsTd_5s3h_2s5d_Kh6s_4d8c_TcAc_7s4h() {
    assertEquals(
      "2s5d 7s4h 4d8c 5s3h TcAc Kh6s",
      Solver.process("texas-holdem 3c6dKdQsTd 5s3h 2s5d Kh6s 4d8c TcAc 7s4h"));
  }

  @Test
  public void test_texas_holdem_1064_4d4s5h6hTc_2c4h_8hQs_6sKh_Ks9h_9cQh_KdTd_Kc7d() {
    assertEquals(
      "8hQs 9cQh Kc7d Ks9h 6sKh KdTd 2c4h",
      Solver.process("texas-holdem 4d4s5h6hTc 2c4h 8hQs 6sKh Ks9h 9cQh KdTd Kc7d"));
  }

  @Test
  public void test_texas_holdem_1065_2c6s7dJsQh_5c3h_JhKd_Qs8c_Tc7s() {
    assertEquals(
      "5c3h Tc7s JhKd Qs8c",
      Solver.process("texas-holdem 2c6s7dJsQh 5c3h JhKd Qs8c Tc7s"));
  }

  @Test
  public void test_texas_holdem_1066_6sAsKsQcTh_Ad3d_Jc8c_2d5h_Qd6d_5sQs_Kc4d_Js4h() {
    assertEquals(
      "2d5h Kc4d Ad3d Qd6d Jc8c=Js4h 5sQs",
      Solver.process("texas-holdem 6sAsKsQcTh Ad3d Jc8c 2d5h Qd6d 5sQs Kc4d Js4h"));
  }

  @Test
  public void test_texas_holdem_1067_2s9cKcKhQc_Tc5c_Ks3d_Ac9s_7h6d_4hKd_5h9d_7s6h() {
    assertEquals(
      "7h6d=7s6h 5h9d Ac9s 4hKd=Ks3d Tc5c",
      Solver.process("texas-holdem 2s9cKcKhQc Tc5c Ks3d Ac9s 7h6d 4hKd 5h9d 7s6h"));
  }

  @Test
  public void test_texas_holdem_1068_4d8h9h9sJc_2c6d_Kh9d_4hTd() {
    assertEquals(
      "2c6d 4hTd Kh9d",
      Solver.process("texas-holdem 4d8h9h9sJc 2c6d Kh9d 4hTd"));
  }

  @Test
  public void test_texas_holdem_1069_5h9dJhKhKs_Ah6c_4c3h_9h8c_7sKc_Kd8d() {
    assertEquals(
      "4c3h Ah6c 9h8c 7sKc=Kd8d",
      Solver.process("texas-holdem 5h9dJhKhKs Ah6c 4c3h 9h8c 7sKc Kd8d"));
  }

  @Test
  public void test_texas_holdem_1070_4s7hJcQdQh_9c5s_3hTs_8h6s_KdKh_Tc5h_Ah8s_7s5c_5d7c_4h3c() {
    assertEquals(
      "8h6s 9c5s 3hTs=Tc5h Ah8s 4h3c 5d7c=7s5c KdKh",
      Solver.process("texas-holdem 4s7hJcQdQh 9c5s 3hTs 8h6s KdKh Tc5h Ah8s 7s5c 5d7c 4h3c"));
  }

  @Test
  public void test_texas_holdem_1071_4d9cQcQsTs_5d8h_Ad6c_7hTc_5sAc_2s3h_Jh7s_QhKs() {
    assertEquals(
      "2s3h 5d8h Jh7s 5sAc=Ad6c 7hTc QhKs",
      Solver.process("texas-holdem 4d9cQcQsTs 5d8h Ad6c 7hTc 5sAc 2s3h Jh7s QhKs"));
  }

  @Test
  public void test_texas_holdem_1072_2hAdJdQdTd_7dTs_Qh4c_5hQc_Jc8s_7s3d_4sJh_9d3s_2s2c() {
    assertEquals(
      "4sJh=Jc8s 5hQc=Qh4c 2s2c 7s3d 7dTs 9d3s",
      Solver.process("texas-holdem 2hAdJdQdTd 7dTs Qh4c 5hQc Jc8s 7s3d 4sJh 9d3s 2s2c"));
  }

  @Test
  public void test_texas_holdem_1073_9hAhKdQhTd_3s8s_JsJc_9cJh() {
    assertEquals(
      "3s8s 9cJh=JsJc",
      Solver.process("texas-holdem 9hAhKdQhTd 3s8s JsJc 9cJh"));
  }

  @Test
  public void test_texas_holdem_1074_4h5cAdJsKs_8hTc_4cTh_2h2c() {
    assertEquals(
      "8hTc 2h2c 4cTh",
      Solver.process("texas-holdem 4h5cAdJsKs 8hTc 4cTh 2h2c"));
  }

  @Test
  public void test_texas_holdem_1075_2d4s7hAcKc_2cKd_7sQc_8sKh_5h7c_JdAs_9s3h_AhQs_5s3s_9h2s() {
    assertEquals(
      "9s3h 9h2s 5h7c 7sQc 8sKh JdAs AhQs 2cKd 5s3s",
      Solver.process("texas-holdem 2d4s7hAcKc 2cKd 7sQc 8sKh 5h7c JdAs 9s3h AhQs 5s3s 9h2s"));
  }

  @Test
  public void test_texas_holdem_1076_2h3c6s7hQs_Jh6h_AsJs_Jd9d_JcQc_Qd9h_8h3h_Kc5h_7d8s() {
    assertEquals(
      "Jd9d Kc5h AsJs 8h3h Jh6h 7d8s Qd9h JcQc",
      Solver.process("texas-holdem 2h3c6s7hQs Jh6h AsJs Jd9d JcQc Qd9h 8h3h Kc5h 7d8s"));
  }

  @Test
  public void test_texas_holdem_1077_6d6s7d9sJh_2sJd_TdKd_8c2c_5s5h_3d6h() {
    assertEquals(
      "8c2c TdKd 5s5h 2sJd 3d6h",
      Solver.process("texas-holdem 6d6s7d9sJh 2sJd TdKd 8c2c 5s5h 3d6h"));
  }

  @Test
  public void test_texas_holdem_1078_4d4h5d9hQh_Kh5c_6s9d_ThAh_8cKd() {
    assertEquals(
      "8cKd Kh5c 6s9d ThAh",
      Solver.process("texas-holdem 4d4h5d9hQh Kh5c 6s9d ThAh 8cKd"));
  }

  @Test
  public void test_texas_holdem_1079_2c2s4h9dKh_QsKc_7c5s_3cAc_4c4d_Kd9c_5dQd() {
    assertEquals(
      "7c5s 5dQd 3cAc QsKc Kd9c 4c4d",
      Solver.process("texas-holdem 2c2s4h9dKh QsKc 7c5s 3cAc 4c4d Kd9c 5dQd"));
  }

  @Test
  public void test_texas_holdem_1080_7cAsJdKsTs_6s8s_TcKh_QdJh() {
    assertEquals(
      "TcKh QdJh 6s8s",
      Solver.process("texas-holdem 7cAsJdKsTs 6s8s TcKh QdJh"));
  }

  @Test
  public void test_texas_holdem_1081_2c7d8dAsQd_Td3s_Th7h() {
    assertEquals(
      "Td3s Th7h",
      Solver.process("texas-holdem 2c7d8dAsQd Td3s Th7h"));
  }

  @Test
  public void test_texas_holdem_1082_2d4c4s5sTs_7hQs_AdTc_6hAs_2s3s_5d2h() {
    assertEquals(
      "7hQs 6hAs 5d2h AdTc 2s3s",
      Solver.process("texas-holdem 2d4c4s5sTs 7hQs AdTc 6hAs 2s3s 5d2h"));
  }

  @Test
  public void test_texas_holdem_1083_6c9hJhKdTs_7hQc_9s9c() {
    assertEquals(
      "9s9c 7hQc",
      Solver.process("texas-holdem 6c9hJhKdTs 7hQc 9s9c"));
  }

  @Test
  public void test_texas_holdem_1084_5d6hJsQhTc_3s4h_7cAc() {
    assertEquals(
      "3s4h 7cAc",
      Solver.process("texas-holdem 5d6hJsQhTc 3s4h 7cAc"));
  }

  @Test
  public void test_texas_holdem_1085_6d8h8s9cJs_QhTs_7sTh_9dTd_2h8c_3hQs() {
    assertEquals(
      "3hQs 9dTd 2h8c 7sTh QhTs",
      Solver.process("texas-holdem 6d8h8s9cJs QhTs 7sTh 9dTd 2h8c 3hQs"));
  }

  @Test
  public void test_texas_holdem_1086_3c4c8d9hQh_4s5s_As7d_AhAc_3s4h_Qc9d_6hJc_2c4d() {
    assertEquals(
      "6hJc As7d 2c4d=4s5s AhAc 3s4h Qc9d",
      Solver.process("texas-holdem 3c4c8d9hQh 4s5s As7d AhAc 3s4h Qc9d 6hJc 2c4d"));
  }

  @Test
  public void test_texas_holdem_1087_6h6s7s9sTc_6dJh_Ad8c_8d9c_7d3s_JcQh_Qd8s_KsQs() {
    assertEquals(
      "JcQh 7d3s 6dJh 8d9c=Ad8c=Qd8s KsQs",
      Solver.process("texas-holdem 6h6s7s9sTc 6dJh Ad8c 8d9c 7d3s JcQh Qd8s KsQs"));
  }

  @Test
  public void test_texas_holdem_1088_2s5s6s8sKc_9h5h_Kh3h_3dQs_KsJs_3c7d_Tc4c_9sJd_6h9d() {
    assertEquals(
      "3c7d Tc4c 9h5h 6h9d Kh3h 9sJd 3dQs KsJs",
      Solver.process("texas-holdem 2s5s6s8sKc 9h5h Kh3h 3dQs KsJs 3c7d Tc4c 9sJd 6h9d"));
  }

  @Test
  public void test_texas_holdem_1089_3s5d7dKsTh_9cAs_JdQh_4cKc_6d5h_QcTd_2c8h() {
    assertEquals(
      "2c8h JdQh 9cAs 6d5h QcTd 4cKc",
      Solver.process("texas-holdem 3s5d7dKsTh 9cAs JdQh 4cKc 6d5h QcTd 2c8h"));
  }

  @Test
  public void test_texas_holdem_1090_6h8c8dAsQh_Th7c_2h4d_QdJs_6dJc() {
    assertEquals(
      "2h4d Th7c 6dJc QdJs",
      Solver.process("texas-holdem 6h8c8dAsQh Th7c 2h4d QdJs 6dJc"));
  }

  @Test
  public void test_texas_holdem_1091_2c6c7hAsJc_3c5h_3hAh_3d8h_Qh6d_6s7s_Ad8s_2dQs_2sTc_9hJh() {
    assertEquals(
      "3c5h 3d8h 2sTc 2dQs Qh6d 9hJh 3hAh Ad8s 6s7s",
      Solver.process("texas-holdem 2c6c7hAsJc 3c5h 3hAh 3d8h Qh6d 6s7s Ad8s 2dQs 2sTc 9hJh"));
  }

  @Test
  public void test_texas_holdem_1092_2s6s8hKcQs_7hQh_Ah5s_4c4s_2d4d() {
    assertEquals(
      "Ah5s 2d4d 4c4s 7hQh",
      Solver.process("texas-holdem 2s6s8hKcQs 7hQh Ah5s 4c4s 2d4d"));
  }

  @Test
  public void test_texas_holdem_1093_4h8c8sKdTs_3h9s_7cAs_Jh6c_4cKs_3d7s() {
    assertEquals(
      "3d7s 3h9s Jh6c 7cAs 4cKs",
      Solver.process("texas-holdem 4h8c8sKdTs 3h9s 7cAs Jh6c 4cKs 3d7s"));
  }

  @Test
  public void test_texas_holdem_1094_2c3c7d9cJh_4d5s_KhJd() {
    assertEquals(
      "4d5s KhJd",
      Solver.process("texas-holdem 2c3c7d9cJh 4d5s KhJd"));
  }

  @Test
  public void test_texas_holdem_1095_3h5h8c9cAs_5cAc_9hJc_Ah7d_7sTc_2hQd_Qs8s() {
    assertEquals(
      "7sTc 2hQd Qs8s 9hJc Ah7d 5cAc",
      Solver.process("texas-holdem 3h5h8c9cAs 5cAc 9hJc Ah7d 7sTc 2hQd Qs8s"));
  }

  @Test
  public void test_texas_holdem_1096_3s6sAsJdKh_Ac5s_2hAh_5cQc_3cKs_Js4s_Kc6h_5h7d_8sKd() {
    assertEquals(
      "5h7d 5cQc 8sKd 2hAh=Ac5s 3cKs Kc6h Js4s",
      Solver.process("texas-holdem 3s6sAsJdKh Ac5s 2hAh 5cQc 3cKs Js4s Kc6h 5h7d 8sKd"));
  }

  @Test
  public void test_texas_holdem_1097_3d4c6sThTs_6d5d_JhTd_7s4d_3h2h_5hQs_2c2d_Ah8h_9hAd() {
    assertEquals(
      "5hQs Ah8h 9hAd 2c2d 3h2h 7s4d 6d5d JhTd",
      Solver.process("texas-holdem 3d4c6sThTs 6d5d JhTd 7s4d 3h2h 5hQs 2c2d Ah8h 9hAd"));
  }

  @Test
  public void test_texas_holdem_1098_3c5c8sKdKh_6cTd_Ah8c_QsAc() {
    assertEquals(
      "6cTd QsAc Ah8c",
      Solver.process("texas-holdem 3c5c8sKdKh 6cTd Ah8c QsAc"));
  }

  @Test
  public void test_texas_holdem_1099_6s7c8dAcTc_7dJd_4h2s_Qd2h_JhKc() {
    assertEquals(
      "4h2s Qd2h JhKc 7dJd",
      Solver.process("texas-holdem 6s7c8dAcTc 7dJd 4h2s Qd2h JhKc"));
  }

  @Test
  public void test_texas_holdem_1100_2d5c5s6dQh_5d8d_AcJc() {
    assertEquals(
      "AcJc 5d8d",
      Solver.process("texas-holdem 2d5c5s6dQh 5d8d AcJc"));
  }

  @Test
  public void test_texas_holdem_1101_3d4h7hAhKd_5dTc_7cJc_Td9c() {
    assertEquals(
      "5dTc Td9c 7cJc",
      Solver.process("texas-holdem 3d4h7hAhKd 5dTc 7cJc Td9c"));
  }

  @Test
  public void test_texas_holdem_1102_2c5d9dAsQh_8s2s_QdAh_8cJs_2h9s() {
    assertEquals(
      "8cJs 8s2s 2h9s QdAh",
      Solver.process("texas-holdem 2c5d9dAsQh 8s2s QdAh 8cJs 2h9s"));
  }

  @Test
  public void test_texas_holdem_1103_4c6c7cQhTh_8hKs_Kc8d_5cQd() {
    assertEquals(
      "8hKs=Kc8d 5cQd",
      Solver.process("texas-holdem 4c6c7cQhTh 8hKs Kc8d 5cQd"));
  }

  @Test
  public void test_texas_holdem_1104_3s4cAdJdJs_JhTc_Qc8d_2h8h_KhKc_Ah8s() {
    assertEquals(
      "2h8h Qc8d KhKc Ah8s JhTc",
      Solver.process("texas-holdem 3s4cAdJdJs JhTc Qc8d 2h8h KhKc Ah8s"));
  }

  @Test
  public void test_texas_holdem_1105_3h5c5d8c8d_7s2s_KhQs_Qc2h_6h7d_4s8h_6sKc() {
    assertEquals(
      "6h7d=7s2s Qc2h 6sKc=KhQs 4s8h",
      Solver.process("texas-holdem 3h5c5d8c8d 7s2s KhQs Qc2h 6h7d 4s8h 6sKc"));
  }

  @Test
  public void test_texas_holdem_1106_3c8c8hJhTs_Kc3d_5dQh_6hTc_6c2s_4s7s_9dJd_Ac5h_AsTh() {
    assertEquals(
      "6c2s 4s7s 5dQh Ac5h Kc3d 6hTc AsTh 9dJd",
      Solver.process("texas-holdem 3c8c8hJhTs Kc3d 5dQh 6hTc 6c2s 4s7s 9dJd Ac5h AsTh"));
  }

  @Test
  public void test_texas_holdem_1107_9dAdAsJcQd_Qs6d_4d9h_KcKh_7d5s_7c6h_Ks6s() {
    assertEquals(
      "7c6h=7d5s Ks6s 4d9h Qs6d KcKh",
      Solver.process("texas-holdem 9dAdAsJcQd Qs6d 4d9h KcKh 7d5s 7c6h Ks6s"));
  }

  @Test
  public void test_texas_holdem_1108_5s7s8s9dJs_Th2h_Kh5d_JdQc_Ah4c_Qd8d() {
    assertEquals(
      "Ah4c Kh5d Qd8d JdQc Th2h",
      Solver.process("texas-holdem 5s7s8s9dJs Th2h Kh5d JdQc Ah4c Qd8d"));
  }

  @Test
  public void test_texas_holdem_1109_2c6h7cAhJd_As8c_Qc6d_Kc8s_2s3s_Ad9h_3cTd_Jh3h_8dQh_Tc5h() {
    assertEquals(
      "3cTd=Tc5h 8dQh Kc8s 2s3s Qc6d Jh3h As8c Ad9h",
      Solver.process("texas-holdem 2c6h7cAhJd As8c Qc6d Kc8s 2s3s Ad9h 3cTd Jh3h 8dQh Tc5h"));
  }

  @Test
  public void test_texas_holdem_1110_4d6sJhKhQd_Ad9s_Js3s_9cKc_4sKs_7hTd() {
    assertEquals(
      "7hTd Ad9s Js3s 9cKc 4sKs",
      Solver.process("texas-holdem 4d6sJhKhQd Ad9s Js3s 9cKc 4sKs 7hTd"));
  }

  @Test
  public void test_texas_holdem_1111_6d7c7sAhJd_6cAs_Jh4c_TcTh_5c8d_3sQs() {
    assertEquals(
      "5c8d 3sQs TcTh Jh4c 6cAs",
      Solver.process("texas-holdem 6d7c7sAhJd 6cAs Jh4c TcTh 5c8d 3sQs"));
  }

  @Test
  public void test_texas_holdem_1112_3d6dAsJhKh_7hKs_8d8h_Qh5h_3hJd_6h7s_TcKc() {
    assertEquals(
      "Qh5h 6h7s 8d8h 7hKs TcKc 3hJd",
      Solver.process("texas-holdem 3d6dAsJhKh 7hKs 8d8h Qh5h 3hJd 6h7s TcKc"));
  }

  @Test
  public void test_texas_holdem_1113_2c4d4hQcQs_8d9c_4c5s_8c7s_9dJh_Jd3s_Jc7c_Ah3h_6cJs_5cAc() {
    assertEquals(
      "8c7s 8d9c 6cJs=9dJh=Jc7c=Jd3s 5cAc=Ah3h 4c5s",
      Solver.process("texas-holdem 2c4d4hQcQs 8d9c 4c5s 8c7s 9dJh Jd3s Jc7c Ah3h 6cJs 5cAc"));
  }

  @Test
  public void test_texas_holdem_1114_2s5s6hJcTs_3h7c_Js2h_5dTd_9c4c() {
    assertEquals(
      "3h7c 9c4c 5dTd Js2h",
      Solver.process("texas-holdem 2s5s6hJcTs 3h7c Js2h 5dTd 9c4c"));
  }

  @Test
  public void test_texas_holdem_1115_5c6c6h7cQh_8c9c_Jd5d_2s8h_9h6d_Ks9s_2cJc_4dAh() {
    assertEquals(
      "2s8h Ks9s 4dAh Jd5d 9h6d 2cJc 8c9c",
      Solver.process("texas-holdem 5c6c6h7cQh 8c9c Jd5d 2s8h 9h6d Ks9s 2cJc 4dAh"));
  }

  @Test
  public void test_texas_holdem_1116_2c5hJcKdTh_Kc7d_2d2s_QsTd_Qh4s_Jd4h_Ah9c_4c6s_JsAc() {
    assertEquals(
      "4c6s Qh4s Ah9c QsTd Jd4h JsAc Kc7d 2d2s",
      Solver.process("texas-holdem 2c5hJcKdTh Kc7d 2d2s QsTd Qh4s Jd4h Ah9c 4c6s JsAc"));
  }

  @Test
  public void test_texas_holdem_1117_5s7dJdJhQc_3h3s_8hKs() {
    assertEquals(
      "8hKs 3h3s",
      Solver.process("texas-holdem 5s7dJdJhQc 3h3s 8hKs"));
  }

  @Test
  public void test_texas_holdem_1118_5c8s9cAsTd_2d5s_2c3c_6sJd() {
    assertEquals(
      "2c3c 6sJd 2d5s",
      Solver.process("texas-holdem 5c8s9cAsTd 2d5s 2c3c 6sJd"));
  }

  @Test
  public void test_texas_holdem_1119_4c5c7d7hQc_4hKc_6d5h_8sAh_TsKd_2d7s_2s8c_2c5s() {
    assertEquals(
      "2s8c TsKd 8sAh 4hKc 2c5s=6d5h 2d7s",
      Solver.process("texas-holdem 4c5c7d7hQc 4hKc 6d5h 8sAh TsKd 2d7s 2s8c 2c5s"));
  }

  @Test
  public void test_texas_holdem_1120_6s8sQcTdTs_3sAs_3c2h_Jh4d() {
    assertEquals(
      "3c2h Jh4d 3sAs",
      Solver.process("texas-holdem 6s8sQcTdTs 3sAs 3c2h Jh4d"));
  }

  @Test
  public void test_texas_holdem_1121_2s4d5c6c8c_Kc7c_9h4c_TsAd_4s6d_Ks7s_9s6s() {
    assertEquals(
      "TsAd 9h4c 9s6s 4s6d Ks7s Kc7c",
      Solver.process("texas-holdem 2s4d5c6c8c Kc7c 9h4c TsAd 4s6d Ks7s 9s6s"));
  }

  @Test
  public void test_texas_holdem_1122_4c9sAcJsKs_2sQh_5s3h_TdKc() {
    assertEquals(
      "5s3h 2sQh TdKc",
      Solver.process("texas-holdem 4c9sAcJsKs 2sQh 5s3h TdKc"));
  }

  @Test
  public void test_texas_holdem_1123_3c4c6c6h9h_Qc9c_9s2d_7sAd_5sJh_KsKc_3sAh_Kh4s() {
    assertEquals(
      "5sJh 7sAd 3sAh Kh4s 9s2d KsKc Qc9c",
      Solver.process("texas-holdem 3c4c6c6h9h Qc9c 9s2d 7sAd 5sJh KsKc 3sAh Kh4s"));
  }

  @Test
  public void test_texas_holdem_1124_8c8hAdJdJs_9hJh_4hQd_6sAc_8s4s() {
    assertEquals(
      "4hQd 6sAc 8s4s 9hJh",
      Solver.process("texas-holdem 8c8hAdJdJs 9hJh 4hQd 6sAc 8s4s"));
  }

  @Test
  public void test_texas_holdem_1125_4s7h8c9cTh_Ah5d_6d4c_3cAd_9s7d() {
    assertEquals(
      "3cAd=Ah5d 9s7d 6d4c",
      Solver.process("texas-holdem 4s7h8c9cTh Ah5d 6d4c 3cAd 9s7d"));
  }

  @Test
  public void test_texas_holdem_1126_7s8h9cQcTd_8c6c_AcKs_Jc2d_2cAd_3cAs_8dQd_Qs6d_5d7d() {
    assertEquals(
      "2cAd=3cAs AcKs 5d7d 8dQd 8c6c=Qs6d Jc2d",
      Solver.process("texas-holdem 7s8h9cQcTd 8c6c AcKs Jc2d 2cAd 3cAs 8dQd Qs6d 5d7d"));
  }

  @Test
  public void test_texas_holdem_1127_7c8dJcQdQh_4hAd_4c3c_Ah2s_6hQs_Jd4d_Tc7s_7d9c_QcKd_As6d() {
    assertEquals(
      "4c3c 4hAd=Ah2s=As6d 7d9c=Tc7s Jd4d 6hQs QcKd",
      Solver.process("texas-holdem 7c8dJcQdQh 4hAd 4c3c Ah2s 6hQs Jd4d Tc7s 7d9c QcKd As6d"));
  }

  @Test
  public void test_texas_holdem_1128_3c5c8c9hAh_3d2h_Th7s_6d5h() {
    assertEquals(
      "Th7s 3d2h 6d5h",
      Solver.process("texas-holdem 3c5c8c9hAh 3d2h Th7s 6d5h"));
  }

  @Test
  public void test_texas_holdem_1129_2h6d9dThTs_AcAd_4dJh_3hTd_9c4c_Js3c() {
    assertEquals(
      "4dJh=Js3c 9c4c AcAd 3hTd",
      Solver.process("texas-holdem 2h6d9dThTs AcAd 4dJh 3hTd 9c4c Js3c"));
  }

  @Test
  public void test_texas_holdem_1130_3c5cAsKhTd_5d4d_4h4c_Ad6c_JcTc() {
    assertEquals(
      "4h4c 5d4d JcTc Ad6c",
      Solver.process("texas-holdem 3c5cAsKhTd 5d4d 4h4c Ad6c JcTc"));
  }

  @Test
  public void test_texas_holdem_1131_2c3c4c5sKc_8dJd_4hQh_Kd9s_Ad7c_8s5h_6d7s_8c9h_Ah3h() {
    assertEquals(
      "8dJd 4hQh 8s5h Kd9s Ah3h 6d7s Ad7c 8c9h",
      Solver.process("texas-holdem 2c3c4c5sKc 8dJd 4hQh Kd9s Ad7c 8s5h 6d7s 8c9h Ah3h"));
  }

  @Test
  public void test_texas_holdem_1132_2c2s4c7hAd_JsAs_5d2d_5h3d_Qh8h_Ac4d() {
    assertEquals(
      "Qh8h JsAs Ac4d 5d2d 5h3d",
      Solver.process("texas-holdem 2c2s4c7hAd JsAs 5d2d 5h3d Qh8h Ac4d"));
  }

  @Test
  public void test_texas_holdem_1133_4h7hJcKhTd_9d5d_2dQs_As5s_4dKs_Kc3h_8h4s_9s6s_9c7d() {
    assertEquals(
      "9d5d=9s6s 2dQs As5s 8h4s 9c7d Kc3h 4dKs",
      Solver.process("texas-holdem 4h7hJcKhTd 9d5d 2dQs As5s 4dKs Kc3h 8h4s 9s6s 9c7d"));
  }

  @Test
  public void test_texas_holdem_1134_2c5cJhJsKs_9h5d_9sTc_Jc6s_Ad8c_9c5s_Qd6h_4s5h_2d8s_Jd3h() {
    assertEquals(
      "9sTc Qd6h Ad8c 2d8s 4s5h=9c5s=9h5d Jd3h Jc6s",
      Solver.process("texas-holdem 2c5cJhJsKs 9h5d 9sTc Jc6s Ad8c 9c5s Qd6h 4s5h 2d8s Jd3h"));
  }

  @Test
  public void test_texas_holdem_1135_3s9dKsTdTh_Qs8d_6s4h_7h8s_3h3d() {
    assertEquals(
      "6s4h 7h8s Qs8d 3h3d",
      Solver.process("texas-holdem 3s9dKsTdTh Qs8d 6s4h 7h8s 3h3d"));
  }

  @Test
  public void test_texas_holdem_1136_4h6c7hJdQh_Th2d_2h2s_4d4s_Td3s() {
    assertEquals(
      "Td3s=Th2d 2h2s 4d4s",
      Solver.process("texas-holdem 4h6c7hJdQh Th2d 2h2s 4d4s Td3s"));
  }

  @Test
  public void test_texas_holdem_1137_2d6c7hAsQc_9dJc_Qs5s_Ks3c_8h2h_2c8s_4sTd_4h9h_TsAd_4d4c() {
    assertEquals(
      "4h9h 4sTd 9dJc Ks3c 2c8s=8h2h 4d4c Qs5s TsAd",
      Solver.process("texas-holdem 2d6c7hAsQc 9dJc Qs5s Ks3c 8h2h 2c8s 4sTd 4h9h TsAd 4d4c"));
  }

  @Test
  public void test_texas_holdem_1138_5s9dJsKcQd_Ks5d_3d5c_9h2h_8d3c_7c3h() {
    assertEquals(
      "7c3h 8d3c 3d5c 9h2h Ks5d",
      Solver.process("texas-holdem 5s9dJsKcQd Ks5d 3d5c 9h2h 8d3c 7c3h"));
  }

  @Test
  public void test_texas_holdem_1139_4d5c6s9sAs_KdJs_TcAh_2c8s_Jc3d_Qc9d_3s7d() {
    assertEquals(
      "2c8s Jc3d KdJs Qc9d TcAh 3s7d",
      Solver.process("texas-holdem 4d5c6s9sAs KdJs TcAh 2c8s Jc3d Qc9d 3s7d"));
  }

  @Test
  public void test_texas_holdem_1140_2d3h9sJhKh_7cKs_2cAs_5s7s_3s9d_Ad3d_6c4d_8c6h_Qh8d_5c2s() {
    assertEquals(
      "6c4d 5s7s 8c6h Qh8d 5c2s 2cAs Ad3d 7cKs 3s9d",
      Solver.process("texas-holdem 2d3h9sJhKh 7cKs 2cAs 5s7s 3s9d Ad3d 6c4d 8c6h Qh8d 5c2s"));
  }

  @Test
  public void test_texas_holdem_1141_5d5h5s9hJs_Jh3d_6dQd_9s6c() {
    assertEquals(
      "6dQd 9s6c Jh3d",
      Solver.process("texas-holdem 5d5h5s9hJs Jh3d 6dQd 9s6c"));
  }

  @Test
  public void test_texas_holdem_1142_3s5c6c9dTh_8h2h_9hQh_2cKc_8dQs_Jh7c_5s7h() {
    assertEquals(
      "8h2h Jh7c 8dQs 2cKc 5s7h 9hQh",
      Solver.process("texas-holdem 3s5c6c9dTh 8h2h 9hQh 2cKc 8dQs Jh7c 5s7h"));
  }

  @Test
  public void test_texas_holdem_1143_9c9dAhAsJd_2c2s_TdQd_AcTh_3s5s_4h3h() {
    assertEquals(
      "2c2s=3s5s=4h3h TdQd AcTh",
      Solver.process("texas-holdem 9c9dAhAsJd 2c2s TdQd AcTh 3s5s 4h3h"));
  }

  @Test
  public void test_texas_holdem_1144_6s7c7hQcTc_3h3d_6d4d_5s9d_4hQs_5h6h_8sQh() {
    assertEquals(
      "5s9d 3h3d 5h6h=6d4d 4hQs=8sQh",
      Solver.process("texas-holdem 6s7c7hQcTc 3h3d 6d4d 5s9d 4hQs 5h6h 8sQh"));
  }

  @Test
  public void test_texas_holdem_1145_3d6c9cThTs_2dTd_3s7c() {
    assertEquals(
      "3s7c 2dTd",
      Solver.process("texas-holdem 3d6c9cThTs 2dTd 3s7c"));
  }

  @Test
  public void test_texas_holdem_1146_4c5c9cQhTd_Ah4s_6sJh_2c8h_3dTs_QdAc() {
    assertEquals(
      "2c8h 6sJh Ah4s 3dTs QdAc",
      Solver.process("texas-holdem 4c5c9cQhTd Ah4s 6sJh 2c8h 3dTs QdAc"));
  }

  @Test
  public void test_texas_holdem_1147_9c9dJcKsTd_Ts6s_Ah3c_2h5h_8dQc_8s7d_3hKh_5dTc_4sAc_Js9s() {
    assertEquals(
      "2h5h 4sAc=Ah3c 5dTc=Ts6s 3hKh 8s7d 8dQc Js9s",
      Solver.process("texas-holdem 9c9dJcKsTd Ts6s Ah3c 2h5h 8dQc 8s7d 3hKh 5dTc 4sAc Js9s"));
  }

  @Test
  public void test_texas_holdem_1148_5d8d9dKsQc_5s3d_KcJh() {
    assertEquals(
      "5s3d KcJh",
      Solver.process("texas-holdem 5d8d9dKsQc 5s3d KcJh"));
  }

  @Test
  public void test_texas_holdem_1149_4d7d8c8hTc_9h2s_6c7s_3c2c() {
    assertEquals(
      "3c2c 9h2s 6c7s",
      Solver.process("texas-holdem 4d7d8c8hTc 9h2s 6c7s 3c2c"));
  }

  @Test
  public void test_texas_holdem_1150_3s4h5hJcKs_4sQh_6c6s_7s8c_2s4d_6dKh_Jd8h_3dTd() {
    assertEquals(
      "7s8c 3dTd 2s4d 4sQh 6c6s Jd8h 6dKh",
      Solver.process("texas-holdem 3s4h5hJcKs 4sQh 6c6s 7s8c 2s4d 6dKh Jd8h 3dTd"));
  }

  @Test
  public void test_texas_holdem_1151_5d6c7c8d8h_4h6d_7hTh_QdJs_Ac2c() {
    assertEquals(
      "QdJs Ac2c 7hTh 4h6d",
      Solver.process("texas-holdem 5d6c7c8d8h 4h6d 7hTh QdJs Ac2c"));
  }

  @Test
  public void test_texas_holdem_1152_3c3h5d9sAh_5cQd_4cAc_Qc7d() {
    assertEquals(
      "Qc7d 5cQd 4cAc",
      Solver.process("texas-holdem 3c3h5d9sAh 5cQd 4cAc Qc7d"));
  }

  @Test
  public void test_texas_holdem_1153_6c7hKhQdTc_Jc7s_Kc2s_As7d_5dAc_QhKs_6h9h_4s6s_4c5c() {
    assertEquals(
      "4c5c 5dAc 4s6s=6h9h Jc7s As7d Kc2s QhKs",
      Solver.process("texas-holdem 6c7hKhQdTc Jc7s Kc2s As7d 5dAc QhKs 6h9h 4s6s 4c5c"));
  }

  @Test
  public void test_texas_holdem_1154_5h5s8d9sAc_Tc4d_4s7s_4c6c_Qh9d() {
    assertEquals(
      "4c6c=4s7s Tc4d Qh9d",
      Solver.process("texas-holdem 5h5s8d9sAc Tc4d 4s7s 4c6c Qh9d"));
  }

  @Test
  public void test_texas_holdem_1155_3h6h8c9dKd_5hKc_2dKh_Qc4d_7dQd_5s2c() {
    assertEquals(
      "5s2c Qc4d 7dQd 2dKh=5hKc",
      Solver.process("texas-holdem 3h6h8c9dKd 5hKc 2dKh Qc4d 7dQd 5s2c"));
  }

  @Test
  public void test_texas_holdem_1156_5s6dAhJhKh_Qd9c_JcJs_4cTh_7c9s_Qh4d_2hTs() {
    assertEquals(
      "7c9s 2hTs=4cTh Qh4d Qd9c JcJs",
      Solver.process("texas-holdem 5s6dAhJhKh Qd9c JcJs 4cTh 7c9s Qh4d 2hTs"));
  }

  @Test
  public void test_texas_holdem_1157_7c8hJhKhQd_2c7d_Ac7s_3sKd_2dKc_5s6c_Jd4s_2sAd_QsAh() {
    assertEquals(
      "5s6c 2sAd 2c7d Ac7s Jd4s QsAh 2dKc=3sKd",
      Solver.process("texas-holdem 7c8hJhKhQd 2c7d Ac7s 3sKd 2dKc 5s6c Jd4s 2sAd QsAh"));
  }

  @Test
  public void test_texas_holdem_1158_9dAdKdTdTs_7dKc_6dAh_9s2s_7c5c_4sJh_Qs5h() {
    assertEquals(
      "7c5c 4sJh Qs5h 9s2s 6dAh 7dKc",
      Solver.process("texas-holdem 9dAdKdTdTs 7dKc 6dAh 9s2s 7c5c 4sJh Qs5h"));
  }

  @Test
  public void test_texas_holdem_1159_4d5h9sJdTs_5sAc_7h5d_6h8s_Kd2d_6s4c_QcTh() {
    assertEquals(
      "6h8s Kd2d 6s4c 7h5d 5sAc QcTh",
      Solver.process("texas-holdem 4d5h9sJdTs 5sAc 7h5d 6h8s Kd2d 6s4c QcTh"));
  }

  @Test
  public void test_texas_holdem_1160_4d8dJcJhJs_Ad8c_9s7c_7sKh_5d6s_3cTh() {
    assertEquals(
      "5d6s 9s7c 3cTh 7sKh Ad8c",
      Solver.process("texas-holdem 4d8dJcJhJs Ad8c 9s7c 7sKh 5d6s 3cTh"));
  }

  @Test
  public void test_texas_holdem_1161_6c7hQhQsTd_TcKc_Th5c_9sAh_8cAs_3d2h_7d7s_5s4c_2s3c() {
    assertEquals(
      "2s3c=3d2h=5s4c 8cAs 9sAh Th5c TcKc 7d7s",
      Solver.process("texas-holdem 6c7hQhQsTd TcKc Th5c 9sAh 8cAs 3d2h 7d7s 5s4c 2s3c"));
  }

  @Test
  public void test_texas_holdem_1162_5h9sAhKsTc_ThAd_8dKd_Jh6c_8s5s() {
    assertEquals(
      "Jh6c 8s5s 8dKd ThAd",
      Solver.process("texas-holdem 5h9sAhKsTc ThAd 8dKd Jh6c 8s5s"));
  }

  @Test
  public void test_texas_holdem_1163_2d3c4c8s9h_6d3d_QdAd_4s2c_Ts6c_6s5s_5c7h_9d7s_QhKs_6hKd() {
    assertEquals(
      "5c7h Ts6c 6hKd QhKs QdAd 6d3d 9d7s 4s2c 6s5s",
      Solver.process("texas-holdem 2d3c4c8s9h 6d3d QdAd 4s2c Ts6c 6s5s 5c7h 9d7s QhKs 6hKd"));
  }

  @Test
  public void test_texas_holdem_1164_4c5c5dJhTd_AhQs_7d2s() {
    assertEquals(
      "7d2s AhQs",
      Solver.process("texas-holdem 4c5c5dJhTd AhQs 7d2s"));
  }

  @Test
  public void test_texas_holdem_1165_3h4d4s9hJs_QhAh_Th2c_7hJc_Kd7d_9d5h_5s6d_Td9s_Tc2s_7sAd() {
    assertEquals(
      "5s6d Tc2s=Th2c Kd7d 7sAd QhAh 9d5h=Td9s 7hJc",
      Solver.process("texas-holdem 3h4d4s9hJs QhAh Th2c 7hJc Kd7d 9d5h 5s6d Td9s Tc2s 7sAd"));
  }

  @Test
  public void test_texas_holdem_1166_3c4d6d7cJc_5s2h_8h2s_Kc4h_9s7s_3h8s_Qc2c_6h8d() {
    assertEquals(
      "8h2s 3h8s Kc4h 6h8d 9s7s 5s2h Qc2c",
      Solver.process("texas-holdem 3c4d6d7cJc 5s2h 8h2s Kc4h 9s7s 3h8s Qc2c 6h8d"));
  }

  @Test
  public void test_texas_holdem_1167_3d5s7dJhQh_4hAs_Td8h_9dKc_Jc2d_KdJs_3c6h_5h3s_2hKs() {
    assertEquals(
      "Td8h 2hKs 9dKc 4hAs 3c6h Jc2d KdJs 5h3s",
      Solver.process("texas-holdem 3d5s7dJhQh 4hAs Td8h 9dKc Jc2d KdJs 3c6h 5h3s 2hKs"));
  }

  @Test
  public void test_texas_holdem_1168_2s3d4s8h8s_4c4d_3cAh_9s5d_6sQh_KhKc() {
    assertEquals(
      "9s5d 6sQh 3cAh KhKc 4c4d",
      Solver.process("texas-holdem 2s3d4s8h8s 4c4d 3cAh 9s5d 6sQh KhKc"));
  }

  @Test
  public void test_texas_holdem_1169_6s9sKsQhTd_As7d_3dKh_8c6d() {
    assertEquals(
      "As7d 8c6d 3dKh",
      Solver.process("texas-holdem 6s9sKsQhTd As7d 3dKh 8c6d"));
  }

  @Test
  public void test_texas_holdem_1170_7d9c9sQsTc_7c6d_ThTs_9dJc_Kh7h_9hJh_Qh4d_2h4s() {
    assertEquals(
      "2h4s 7c6d Kh7h Qh4d 9dJc=9hJh ThTs",
      Solver.process("texas-holdem 7d9c9sQsTc 7c6d ThTs 9dJc Kh7h 9hJh Qh4d 2h4s"));
  }

  @Test
  public void test_texas_holdem_1171_3s4s7c9cKh_3dJh_7h3c_AsTs_8sTc_5sTd_Jd5c_Th2d_9h6c() {
    assertEquals(
      "Th2d 5sTd 8sTc Jd5c AsTs 3dJh 9h6c 7h3c",
      Solver.process("texas-holdem 3s4s7c9cKh 3dJh 7h3c AsTs 8sTc 5sTd Jd5c Th2d 9h6c"));
  }

  @Test
  public void test_texas_holdem_1172_3h4h5d9dQs_ThQc_9h5s_JcTc() {
    assertEquals(
      "JcTc ThQc 9h5s",
      Solver.process("texas-holdem 3h4h5d9dQs ThQc 9h5s JcTc"));
  }

  @Test
  public void test_texas_holdem_1173_6h7hKsQcQd_Ah9d_Jh9h() {
    assertEquals(
      "Jh9h Ah9d",
      Solver.process("texas-holdem 6h7hKsQcQd Ah9d Jh9h"));
  }

  @Test
  public void test_texas_holdem_1174_3c8h9sJcKh_6sQh_4h2s_8d6c_7cJh() {
    assertEquals(
      "4h2s 6sQh 8d6c 7cJh",
      Solver.process("texas-holdem 3c8h9sJcKh 6sQh 4h2s 8d6c 7cJh"));
  }

  @Test
  public void test_texas_holdem_1175_4hJdKdQhTd_Jc7c_3h9d_Js3d_2dAc_8d4d_7hJh() {
    assertEquals(
      "7hJh=Jc7c=Js3d 3h9d 2dAc 8d4d",
      Solver.process("texas-holdem 4hJdKdQhTd Jc7c 3h9d Js3d 2dAc 8d4d 7hJh"));
  }

  @Test
  public void test_texas_holdem_1176_5sAdJcKdQc_5h9c_2s9h() {
    assertEquals(
      "2s9h 5h9c",
      Solver.process("texas-holdem 5sAdJcKdQc 5h9c 2s9h"));
  }

  @Test
  public void test_texas_holdem_1177_4h6dJdJsQc_9c2c_9d6h_7d9h_7cAc_5c5s_QsJh_9sQd() {
    assertEquals(
      "9c2c 7d9h 7cAc 5c5s 9d6h 9sQd QsJh",
      Solver.process("texas-holdem 4h6dJdJsQc 9c2c 9d6h 7d9h 7cAc 5c5s QsJh 9sQd"));
  }

  @Test
  public void test_texas_holdem_1178_2d8c8dJcJs_5d9h_AhJd() {
    assertEquals(
      "5d9h AhJd",
      Solver.process("texas-holdem 2d8c8dJcJs 5d9h AhJd"));
  }

  @Test
  public void test_texas_holdem_1179_2c7s9hTcTh_5s4h_Ah5c_AdKd_7d9s_5dJd_As7h() {
    assertEquals(
      "5s4h 5dJd Ah5c AdKd As7h 7d9s",
      Solver.process("texas-holdem 2c7s9hTcTh 5s4h Ah5c AdKd 7d9s 5dJd As7h"));
  }

  @Test
  public void test_texas_holdem_1180_2d5hQcQhTc_9dTd_JdQd_2s9s_7s6c_JhKs_5sAh_7d5c_2h3s_5d8d() {
    assertEquals(
      "7s6c JhKs 2h3s=2s9s 5d8d=7d5c 5sAh 9dTd JdQd",
      Solver.process("texas-holdem 2d5hQcQhTc 9dTd JdQd 2s9s 7s6c JhKs 5sAh 7d5c 2h3s 5d8d"));
  }

  @Test
  public void test_texas_holdem_1181_4cAdKsQcTd_Th2h_Kh4s_Qs5h_2c6d_2d3d() {
    assertEquals(
      "2d3d 2c6d Th2h Qs5h Kh4s",
      Solver.process("texas-holdem 4cAdKsQcTd Th2h Kh4s Qs5h 2c6d 2d3d"));
  }

  @Test
  public void test_texas_holdem_1182_2h5h6c6hQh_2d6d_4c3d_TdJd_4d5d_TsTc_8c9d_5c7c_KsAh_4hJs() {
    assertEquals(
      "8c9d TdJd 4d5d=5c7c TsTc 4c3d 4hJs KsAh 2d6d",
      Solver.process("texas-holdem 2h5h6c6hQh 2d6d 4c3d TdJd 4d5d TsTc 8c9d 5c7c KsAh 4hJs"));
  }

  @Test
  public void test_texas_holdem_1183_2s5h9dJcQd_3h4s_6hJd_5sKh_3d6c_7sTd() {
    assertEquals(
      "3h4s 3d6c 7sTd 5sKh 6hJd",
      Solver.process("texas-holdem 2s5h9dJcQd 3h4s 6hJd 5sKh 3d6c 7sTd"));
  }

  @Test
  public void test_texas_holdem_1184_2c4d6d8hAd_KcJc_Ts4h() {
    assertEquals(
      "KcJc Ts4h",
      Solver.process("texas-holdem 2c4d6d8hAd KcJc Ts4h"));
  }

  @Test
  public void test_texas_holdem_1185_3s4s8sJhTh_9h9d_5c3h_8dKh_7c8h_5sAh_Ts2s_7dKs_8c9c() {
    assertEquals(
      "7dKs 5sAh 5c3h 7c8h 8c9c 8dKh 9h9d Ts2s",
      Solver.process("texas-holdem 3s4s8sJhTh 9h9d 5c3h 8dKh 7c8h 5sAh Ts2s 7dKs 8c9c"));
  }

  @Test
  public void test_texas_holdem_1186_6s8s9dJsQc_7h2h_AhKc_Kd7s_Th8h_2s9h_5hJh_3dAd() {
    assertEquals(
      "7h2h Kd7s 3dAd AhKc 2s9h 5hJh Th8h",
      Solver.process("texas-holdem 6s8s9dJsQc 7h2h AhKc Kd7s Th8h 2s9h 5hJh 3dAd"));
  }

  @Test
  public void test_texas_holdem_1187_2d3s7s9dQh_8dAd_Qs4h_5cKd() {
    assertEquals(
      "5cKd 8dAd Qs4h",
      Solver.process("texas-holdem 2d3s7s9dQh 8dAd Qs4h 5cKd"));
  }

  @Test
  public void test_texas_holdem_1188_3c3s5d7c9s_9dJs_3hQd_5s6d_4h8d() {
    assertEquals(
      "4h8d 5s6d 9dJs 3hQd",
      Solver.process("texas-holdem 3c3s5d7c9s 9dJs 3hQd 5s6d 4h8d"));
  }

  @Test
  public void test_texas_holdem_1189_7s8s9dAcJd_7d4h_3sTh_KcQh() {
    assertEquals(
      "KcQh 7d4h 3sTh",
      Solver.process("texas-holdem 7s8s9dAcJd 7d4h 3sTh KcQh"));
  }

  @Test
  public void test_texas_holdem_1190_4c6cAhQsTh_5hTd_7h5s() {
    assertEquals(
      "7h5s 5hTd",
      Solver.process("texas-holdem 4c6cAhQsTh 5hTd 7h5s"));
  }

  @Test
  public void test_texas_holdem_1191_3c4c6s7cJs_8s8h_9c9h_3dTh_Qc2d_5hAc_8d7s_Qd5c_JcKh_Tc2s() {
    assertEquals(
      "Tc2s Qc2d 3dTh 8d7s 8s8h 9c9h JcKh 5hAc=Qd5c",
      Solver.process("texas-holdem 3c4c6s7cJs 8s8h 9c9h 3dTh Qc2d 5hAc 8d7s Qd5c JcKh Tc2s"));
  }

  @Test
  public void test_texas_holdem_1192_2d3c6d9sQs_7dAd_2h3d_Kd8d_6hQc_Kc8c_2sTh_Ks5d_5h7c() {
    assertEquals(
      "5h7c Ks5d Kc8c=Kd8d 7dAd 2sTh 2h3d 6hQc",
      Solver.process("texas-holdem 2d3c6d9sQs 7dAd 2h3d Kd8d 6hQc Kc8c 2sTh Ks5d 5h7c"));
  }

  @Test
  public void test_texas_holdem_1193_2h2s4d6sAd_6c8c_2d9c_7h3d_AsAc_6d8s_9s5c_QdTh() {
    assertEquals(
      "7h3d 9s5c QdTh 6c8c=6d8s 2d9c AsAc",
      Solver.process("texas-holdem 2h2s4d6sAd 6c8c 2d9c 7h3d AsAc 6d8s 9s5c QdTh"));
  }

  @Test
  public void test_texas_holdem_1194_2s4hJdJhTh_6s9c_2cQd_8h4s_9hTd_AhAs_7dTc() {
    assertEquals(
      "6s9c 2cQd 8h4s 7dTc 9hTd AhAs",
      Solver.process("texas-holdem 2s4hJdJhTh 6s9c 2cQd 8h4s 9hTd AhAs 7dTc"));
  }

  @Test
  public void test_texas_holdem_1195_4h6c6s8c9c_Ks3d_Td2h() {
    assertEquals(
      "Td2h Ks3d",
      Solver.process("texas-holdem 4h6c6s8c9c Ks3d Td2h"));
  }

  @Test
  public void test_texas_holdem_1196_3s8hKhThTs_6h7h_Qc9s_Qd4s_Jd2c() {
    assertEquals(
      "Jd2c Qd4s Qc9s 6h7h",
      Solver.process("texas-holdem 3s8hKhThTs 6h7h Qc9s Qd4s Jd2c"));
  }

  @Test
  public void test_texas_holdem_1197_3h6d7hAhKc_4h5d_2d5h_4s7d_Ac8s_2c5s_Tc3s() {
    assertEquals(
      "2c5s=2d5h Tc3s 4s7d Ac8s 4h5d",
      Solver.process("texas-holdem 3h6d7hAhKc 4h5d 2d5h 4s7d Ac8s 2c5s Tc3s"));
  }

  @Test
  public void test_texas_holdem_1198_2s6c7h8dKs_3c7c_Ad5h_JcAs_2d3s_4hTs_6d5s_Kc7d_4s9h() {
    assertEquals(
      "4s9h 4hTs Ad5h JcAs 2d3s 6d5s 3c7c Kc7d",
      Solver.process("texas-holdem 2s6c7h8dKs 3c7c Ad5h JcAs 2d3s 4hTs 6d5s Kc7d 4s9h"));
  }

  @Test
  public void test_texas_holdem_1199_2d7h9dJsKh_3dJd_Kc3s_3h5h_2s9h_Jc6d_QcAs_7dJh() {
    assertEquals(
      "3h5h QcAs 3dJd=Jc6d Kc3s 2s9h 7dJh",
      Solver.process("texas-holdem 2d7h9dJsKh 3dJd Kc3s 3h5h 2s9h Jc6d QcAs 7dJh"));
  }

  @Test
  public void test_texas_holdem_1200_3d6s8hAhJh_Jc2c_Th6h_5s5h_5c9d_6c3h_8dJd_Js9h_8s7s() {
    assertEquals(
      "5c9d 5s5h 8s7s Jc2c Js9h 6c3h 8dJd Th6h",
      Solver.process("texas-holdem 3d6s8hAhJh Jc2c Th6h 5s5h 5c9d 6c3h 8dJd Js9h 8s7s"));
  }

  @Test
  public void test_texas_holdem_1201_2s5s6s8c8d_AhJd_Jh8s_9dKd_2dTc_3d4c_9hJc() {
    assertEquals(
      "9hJc 9dKd AhJd 2dTc Jh8s 3d4c",
      Solver.process("texas-holdem 2s5s6s8c8d AhJd Jh8s 9dKd 2dTc 3d4c 9hJc"));
  }

  @Test
  public void test_texas_holdem_1202_2d5d6dQhTh_As4c_3sTd_2cJh_Js8s_4sAh_8cKc() {
    assertEquals(
      "Js8s 8cKc 4sAh=As4c 2cJh 3sTd",
      Solver.process("texas-holdem 2d5d6dQhTh As4c 3sTd 2cJh Js8s 4sAh 8cKc"));
  }

  @Test
  public void test_texas_holdem_1203_3c7hJcJhTd_3dJs_6dQc_2hKd_Qd9h_8d5c_7dQh_JdTs() {
    assertEquals(
      "8d5c 6dQc Qd9h 2hKd 7dQh 3dJs JdTs",
      Solver.process("texas-holdem 3c7hJcJhTd 3dJs 6dQc 2hKd Qd9h 8d5c 7dQh JdTs"));
  }

  @Test
  public void test_texas_holdem_1204_4d5d6d8hKc_9sKd_3h5s_8cAc_2sAh_4hJh() {
    assertEquals(
      "2sAh 4hJh 3h5s 8cAc 9sKd",
      Solver.process("texas-holdem 4d5d6d8hKc 9sKd 3h5s 8cAc 2sAh 4hJh"));
  }

  @Test
  public void test_texas_holdem_1205_3c5hJsKhQs_Ts7s_6c3d_3sTd_AcTc_6hQh() {
    assertEquals(
      "Ts7s 3sTd=6c3d 6hQh AcTc",
      Solver.process("texas-holdem 3c5hJsKhQs Ts7s 6c3d 3sTd AcTc 6hQh"));
  }

  @Test
  public void test_texas_holdem_1206_4c9sAhKdKh_Ad6d_3cTd_Jh5d_4hJc_7h5c_2s6c() {
    assertEquals(
      "2s6c 7h5c 3cTd Jh5d 4hJc Ad6d",
      Solver.process("texas-holdem 4c9sAhKdKh Ad6d 3cTd Jh5d 4hJc 7h5c 2s6c"));
  }

  @Test
  public void test_texas_holdem_1207_2c5c6d8dTs_QcJs_Qs9h_5d5h() {
    assertEquals(
      "Qs9h QcJs 5d5h",
      Solver.process("texas-holdem 2c5c6d8dTs QcJs Qs9h 5d5h"));
  }

  @Test
  public void test_texas_holdem_1208_7h8hAdKsQh_7s5h_QdJh() {
    assertEquals(
      "7s5h QdJh",
      Solver.process("texas-holdem 7h8hAdKsQh 7s5h QdJh"));
  }

  @Test
  public void test_texas_holdem_1209_6s7cAcKhQc_Kc8h_4c4d_8sQs_TcJh_6dJd_Th9c_TdAh_Ad5d() {
    assertEquals(
      "Th9c 4c4d 6dJd 8sQs Kc8h Ad5d TdAh TcJh",
      Solver.process("texas-holdem 6s7cAcKhQc Kc8h 4c4d 8sQs TcJh 6dJd Th9c TdAh Ad5d"));
  }

  @Test
  public void test_texas_holdem_1210_2d8h9cAhJh_7dJc_AdQs_Kc5h_Ks6c_6hTc_5d7h() {
    assertEquals(
      "5d7h 6hTc Kc5h=Ks6c 7dJc AdQs",
      Solver.process("texas-holdem 2d8h9cAhJh 7dJc AdQs Kc5h Ks6c 6hTc 5d7h"));
  }

  @Test
  public void test_texas_holdem_1211_4s5h5s6d7h_ThJs_QcTs_Qd3s_5d8c_Ks6s_9d3d_5c7s_KcAc_6h2c() {
    assertEquals(
      "ThJs QcTs KcAc 6h2c Ks6s 9d3d=Qd3s 5d8c 5c7s",
      Solver.process("texas-holdem 4s5h5s6d7h ThJs QcTs Qd3s 5d8c Ks6s 9d3d 5c7s KcAc 6h2c"));
  }

  @Test
  public void test_texas_holdem_1212_2c7s9hAdJs_QsQd_9d5h_3s9c_Ts3d_AcQh() {
    assertEquals(
      "Ts3d 3s9c=9d5h QsQd AcQh",
      Solver.process("texas-holdem 2c7s9hAdJs QsQd 9d5h 3s9c Ts3d AcQh"));
  }

  @Test
  public void test_texas_holdem_1213_5d6d9sAdTd_Jh8h_5c5s_Qs7c_8cQd_Jc3c_3d6h_9c3h_3sJd_2cAh() {
    assertEquals(
      "Jc3c Jh8h Qs7c 9c3h 2cAh 5c5s 3d6h 3sJd 8cQd",
      Solver.process("texas-holdem 5d6d9sAdTd Jh8h 5c5s Qs7c 8cQd Jc3c 3d6h 9c3h 3sJd 2cAh"));
  }

  @Test
  public void test_texas_holdem_1214_2c4s7sAcQd_Jc9s_3h2s_ThKc_QhTs_JhKs_As7c_9d7d() {
    assertEquals(
      "Jc9s ThKc JhKs 3h2s 9d7d QhTs As7c",
      Solver.process("texas-holdem 2c4s7sAcQd Jc9s 3h2s ThKc QhTs JhKs As7c 9d7d"));
  }

  @Test
  public void test_texas_holdem_1215_3s4c9d9hKd_7sJc_3dJs_6cKc_7cAc_3hTs_5dQs_Td8h_ThTc() {
    assertEquals(
      "Td8h 7sJc 5dQs 7cAc 3dJs=3hTs ThTc 6cKc",
      Solver.process("texas-holdem 3s4c9d9hKd 7sJc 3dJs 6cKc 7cAc 3hTs 5dQs Td8h ThTc"));
  }

  @Test
  public void test_texas_holdem_1216_2h6hAsQcTc_Th8h_Ac4c_QhJh_3cAd_4sQd_7s8c() {
    assertEquals(
      "7s8c Th8h 4sQd QhJh 3cAd=Ac4c",
      Solver.process("texas-holdem 2h6hAsQcTc Th8h Ac4c QhJh 3cAd 4sQd 7s8c"));
  }

  @Test
  public void test_texas_holdem_1217_9c9hJhKdKh_5s7d_QhAd_6sTh_2cAs_2dTd_4s4h_Ah4d_7sJd() {
    assertEquals(
      "2dTd=4s4h=5s7d=6sTh 2cAs=Ah4d=QhAd 7sJd",
      Solver.process("texas-holdem 9c9hJhKdKh 5s7d QhAd 6sTh 2cAs 2dTd 4s4h Ah4d 7sJd"));
  }

  @Test
  public void test_texas_holdem_1218_2d3d7sAdAs_9sKs_8h9c_5cKd_Ac4c_6s8s_2cTh_JcQh_JhJd() {
    assertEquals(
      "6s8s 8h9c JcQh 5cKd 9sKs 2cTh JhJd Ac4c",
      Solver.process("texas-holdem 2d3d7sAdAs 9sKs 8h9c 5cKd Ac4c 6s8s 2cTh JcQh JhJd"));
  }

  @Test
  public void test_texas_holdem_1219_3s5c8hKdTd_JsAc_2h3c_5dQd_4sJd_JcKs_3h8c_Qh9c_7dAd_2sAs() {
    assertEquals(
      "4sJd Qh9c 2sAs 7dAd JsAc 2h3c 5dQd JcKs 3h8c",
      Solver.process("texas-holdem 3s5c8hKdTd JsAc 2h3c 5dQd 4sJd JcKs 3h8c Qh9c 7dAd 2sAs"));
  }

  @Test
  public void test_texas_holdem_1220_4h7h7s8sTh_4d5c_5h2d_TsKc_6dTc_KdJd_As9d_JhQd_JsJc() {
    assertEquals(
      "5h2d JhQd KdJd As9d 4d5c 6dTc TsKc JsJc",
      Solver.process("texas-holdem 4h7h7s8sTh 4d5c 5h2d TsKc 6dTc KdJd As9d JhQd JsJc"));
  }

  @Test
  public void test_texas_holdem_1221_2d2s4h5h7s_Kd8c_Jc3h_Ac4c_2c9h() {
    assertEquals(
      "Jc3h Kd8c Ac4c 2c9h",
      Solver.process("texas-holdem 2d2s4h5h7s Kd8c Jc3h Ac4c 2c9h"));
  }

  @Test
  public void test_texas_holdem_1222_2c2h4s8h9c_3s9h_6cQh_9s7c_Js7d_9dAc_8s3c_JcKd_6dTd_3dTh() {
    assertEquals(
      "3dTh=6dTd Js7d 6cQh JcKd 8s3c 3s9h=9s7c 9dAc",
      Solver.process("texas-holdem 2c2h4s8h9c 3s9h 6cQh 9s7c Js7d 9dAc 8s3c JcKd 6dTd 3dTh"));
  }

  @Test
  public void test_texas_holdem_1223_5d5h6h9hTd_Qh4c_ThJc() {
    assertEquals(
      "Qh4c ThJc",
      Solver.process("texas-holdem 5d5h6h9hTd Qh4c ThJc"));
  }

  @Test
  public void test_texas_holdem_1224_5d6hAcJcKh_4sTd_QhQc_JdJs_7hQs_9c8c_Qd3s() {
    assertEquals(
      "9c8c 4sTd Qd3s 7hQs QhQc JdJs",
      Solver.process("texas-holdem 5d6hAcJcKh 4sTd QhQc JdJs 7hQs 9c8c Qd3s"));
  }

  @Test
  public void test_texas_holdem_1225_3c4d9h9sJd_5s5d_TcKs_6dAs() {
    assertEquals(
      "TcKs 6dAs 5s5d",
      Solver.process("texas-holdem 3c4d9h9sJd 5s5d TcKs 6dAs"));
  }

  @Test
  public void test_texas_holdem_1226_2d7h9cQdTd_AsTc_Ks5d_3cKc_7c5c_4d6d_Jc9s_8d3s() {
    assertEquals(
      "8d3s 3cKc=Ks5d 7c5c Jc9s AsTc 4d6d",
      Solver.process("texas-holdem 2d7h9cQdTd AsTc Ks5d 3cKc 7c5c 4d6d Jc9s 8d3s"));
  }

  @Test
  public void test_texas_holdem_1227_2s5sAdQhTh_2hTc_7s4d_Ks6d_Kc7c_TsKd_Qc5c_3s7h() {
    assertEquals(
      "3s7h=7s4d Ks6d Kc7c TsKd 2hTc Qc5c",
      Solver.process("texas-holdem 2s5sAdQhTh 2hTc 7s4d Ks6d Kc7c TsKd Qc5c 3s7h"));
  }

  @Test
  public void test_texas_holdem_1228_4d4h7cKhQh_TdAc_3s6h_Kd8c_2dJh_AhJc_7d6c_9d2s() {
    assertEquals(
      "3s6h 9d2s 2dJh AhJc=TdAc 7d6c Kd8c",
      Solver.process("texas-holdem 4d4h7cKhQh TdAc 3s6h Kd8c 2dJh AhJc 7d6c 9d2s"));
  }

  @Test
  public void test_texas_holdem_1229_5s6h7cJcJs_4d9c_5d2d_9d5c_4hTs_Qd9s() {
    assertEquals(
      "4d9c 4hTs Qd9s 5d2d 9d5c",
      Solver.process("texas-holdem 5s6h7cJcJs 4d9c 5d2d 9d5c 4hTs Qd9s"));
  }

  @Test
  public void test_texas_holdem_1230_4d7cAdJdQc_2sTd_4sKs_2hAc_Jh4h_ThAh_7s7d() {
    assertEquals(
      "2sTd 4sKs 2hAc ThAh Jh4h 7s7d",
      Solver.process("texas-holdem 4d7cAdJdQc 2sTd 4sKs 2hAc Jh4h ThAh 7s7d"));
  }

  @Test
  public void test_texas_holdem_1231_2c4c4s6cJs_AcQc_QsTc() {
    assertEquals(
      "QsTc AcQc",
      Solver.process("texas-holdem 2c4c4s6cJs AcQc QsTc"));
  }

  @Test
  public void test_texas_holdem_1232_2d3d8hKhQc_7sJs_9d2c_5cTd_Qs7d_9cJh_KsTc_AcAd_7h2s() {
    assertEquals(
      "5cTd 7sJs 9cJh 7h2s 9d2c Qs7d KsTc AcAd",
      Solver.process("texas-holdem 2d3d8hKhQc 7sJs 9d2c 5cTd Qs7d 9cJh KsTc AcAd 7h2s"));
  }

  @Test
  public void test_texas_holdem_1233_2d6cAhAsKd_4c7d_6hTc_4h9h_2c9c_8d5h_9s3d_8c8s() {
    assertEquals(
      "4c7d 8d5h 4h9h=9s3d 2c9c 6hTc 8c8s",
      Solver.process("texas-holdem 2d6cAhAsKd 4c7d 6hTc 4h9h 2c9c 8d5h 9s3d 8c8s"));
  }

  @Test
  public void test_texas_holdem_1234_7dJdJhJsTh_4s7h_5h6s_QsTs_6h3d_8s4d_TdQc_8c9h() {
    assertEquals(
      "5h6s=6h3d 8s4d 8c9h 4s7h QsTs=TdQc",
      Solver.process("texas-holdem 7dJdJhJsTh 4s7h 5h6s QsTs 6h3d 8s4d TdQc 8c9h"));
  }

  @Test
  public void test_texas_holdem_1235_2s3hJdJhKd_5h3d_4hQd_5cTh_Ac2d_8hTs_5d6c() {
    assertEquals(
      "5d6c 5cTh 8hTs 4hQd Ac2d 5h3d",
      Solver.process("texas-holdem 2s3hJdJhKd 5h3d 4hQd 5cTh Ac2d 8hTs 5d6c"));
  }

  @Test
  public void test_texas_holdem_1236_2c2h4s5s6c_Kc7d_TsKs_6dQh_Kd9s_8c5c_Jd9d_7cTd_QsJs() {
    assertEquals(
      "7cTd Jd9d QsJs Kc7d Kd9s TsKs 8c5c 6dQh",
      Solver.process("texas-holdem 2c2h4s5s6c Kc7d TsKs 6dQh Kd9s 8c5c Jd9d 7cTd QsJs"));
  }

  @Test
  public void test_texas_holdem_1237_5cAhAsKdTc_Jh4h_6s2h() {
    assertEquals(
      "6s2h Jh4h",
      Solver.process("texas-holdem 5cAhAsKdTc Jh4h 6s2h"));
  }

  @Test
  public void test_texas_holdem_1238_3d4c6h9hQh_Kd9d_JdTc_8sJs_QdAs() {
    assertEquals(
      "8sJs JdTc Kd9d QdAs",
      Solver.process("texas-holdem 3d4c6h9hQh Kd9d JdTc 8sJs QdAs"));
  }

  @Test
  public void test_texas_holdem_1239_4c6s7c7hJh_AdJc_2sKh_7s4s_4hJs() {
    assertEquals(
      "2sKh 4hJs AdJc 7s4s",
      Solver.process("texas-holdem 4c6s7c7hJh AdJc 2sKh 7s4s 4hJs"));
  }

  @Test
  public void test_texas_holdem_1240_3h4d4s8dTc_QdTd_Qc8c_8s3s_Jd9s_AsKd() {
    assertEquals(
      "Jd9s AsKd 8s3s Qc8c QdTd",
      Solver.process("texas-holdem 3h4d4s8dTc QdTd Qc8c 8s3s Jd9s AsKd"));
  }

  @Test
  public void test_texas_holdem_1241_4d5hAcJcKs_2cAh_Td2h_ThAs_2s9h_6hQc_3c3h_JsQh_3s5c() {
    assertEquals(
      "2s9h Td2h 6hQc 3c3h 3s5c JsQh 2cAh ThAs",
      Solver.process("texas-holdem 4d5hAcJcKs 2cAh Td2h ThAs 2s9h 6hQc 3c3h JsQh 3s5c"));
  }

  @Test
  public void test_texas_holdem_1242_2s4s6c9sQs_2dAs_4h5s_9d4c_3hKd_TsJd() {
    assertEquals(
      "3hKd 9d4c 4h5s TsJd 2dAs",
      Solver.process("texas-holdem 2s4s6c9sQs 2dAs 4h5s 9d4c 3hKd TsJd"));
  }

  @Test
  public void test_texas_holdem_1243_2d6dAdAsKh_Jc5h_9s2s_Td5s_3cQd() {
    assertEquals(
      "Td5s Jc5h 3cQd 9s2s",
      Solver.process("texas-holdem 2d6dAdAsKh Jc5h 9s2s Td5s 3cQd"));
  }

  @Test
  public void test_texas_holdem_1244_3d8c9cAcKc_QcTh_Qd8d_9hTc_9d4h_4c7d_2d5c_7s8s_2hAs_TdQh() {
    assertEquals(
      "TdQh 7s8s Qd8d 9d4h 2hAs 4c7d 2d5c 9hTc QcTh",
      Solver.process("texas-holdem 3d8c9cAcKc QcTh Qd8d 9hTc 9d4h 4c7d 2d5c 7s8s 2hAs TdQh"));
  }

  @Test
  public void test_texas_holdem_1245_2d3h4c7cAs_7s5h_3d9s() {
    assertEquals(
      "3d9s 7s5h",
      Solver.process("texas-holdem 2d3h4c7cAs 7s5h 3d9s"));
  }

  @Test
  public void test_texas_holdem_1246_3s9h9sJcTd_8c2c_2d4h_JdKh_QsJs_7h4d_3d9c() {
    assertEquals(
      "2d4h 7h4d 8c2c QsJs JdKh 3d9c",
      Solver.process("texas-holdem 3s9h9sJcTd 8c2c 2d4h JdKh QsJs 7h4d 3d9c"));
  }

  @Test
  public void test_texas_holdem_1247_3h7hJsQcQd_Tc3d_7dTh_9s8c_Kc2s() {
    assertEquals(
      "9s8c Kc2s Tc3d 7dTh",
      Solver.process("texas-holdem 3h7hJsQcQd Tc3d 7dTh 9s8c Kc2s"));
  }

  @Test
  public void test_texas_holdem_1248_6dAsKcKsQs_Ad2s_Js8c_3c3h_5hTh_3sTc() {
    assertEquals(
      "3sTc=5hTh Js8c 3c3h Ad2s",
      Solver.process("texas-holdem 6dAsKcKsQs Ad2s Js8c 3c3h 5hTh 3sTc"));
  }

  @Test
  public void test_texas_holdem_1249_2c3s4c4s5h_3h7h_8sAc_4dTs_TcKh_Td7d_9h8d_2hJd_3d6c_Jc8c() {
    assertEquals(
      "9h8d Td7d Jc8c TcKh 2hJd 3h7h 4dTs 8sAc 3d6c",
      Solver.process("texas-holdem 2c3s4c4s5h 3h7h 8sAc 4dTs TcKh Td7d 9h8d 2hJd 3d6c Jc8c"));
  }

}
